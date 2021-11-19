package com.onlineCourse.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Student;
import com.onlineCourse.exceptions.CourseNotFoundException;
import com.onlineCourse.exceptions.StudentNotFoundException;
import com.onlineCourse.repositories.CourseDao;
import com.onlineCourse.repositories.StudentDao;

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	private StudentDao studentdao;
	
	@Autowired
	private CourseDao  coursedao;
	
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentdao.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentdao.findAll();
	}

	@Override
	public Student getStudentById(Integer studentId)throws StudentNotFoundException {
		
		return studentdao.findById(studentId).orElseThrow(() ->new StudentNotFoundException("Student not found with Id "+studentId) );
	}

	@Override
	public Student updateStudent(Student student) {
		return studentdao.save(student);
		
	}

    @Override
	public void insertCourseIdwithStudent(Integer studentId, Integer courseId) {
		
        CourseBean ct=coursedao.findById(courseId).get();
        
        ct.setcId(ct.getcId());
        ct.setcName(ct.getcName());
        ct.setcDuration(ct.getcDuration());
        ct.setcFees(ct.getcCapacity());
        ct.setcSeats(ct.getcSeats());
        
        Student st=studentdao.findById(studentId).get();
        
        st.setStudid(st.getStudid());
        st.setStudname(st.getStudname());
        st.setStudemail(st.getStudemail());
        st.setGender(st.getGender());
        st.setStudaddress(st.getStudaddress());
        st.setStudmobile(st.getStudmobile());
        st.setStudDOB(st.getStudDOB());
        st.setStudpass(st.getStudpass());
        st.setStudcpass(st.getStudcpass());
        
       
        st.getCourses().add(ct);
        ct.getStudent().add(st);


		studentdao.save(st);	
	}

	@Override
	public Student getMyCourses(Integer studentId) {
	
		return studentdao.findById(studentId).get();
	}

	
	

}
