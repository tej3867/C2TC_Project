package placement.service;

import placement.dao.StudentRepo;
import placement.dao.StudentRepoImpl;
import placement.entities.Certificate;
import placement.entities.Student;

public class StudentServiceImpl implements StudentService {
	StudentRepo sd;
	
	public StudentServiceImpl(){
		sd=new StudentRepoImpl();
	}

	@Override
	public Student addStudent(Student student) {
		sd.startTransaction();
		sd.addStudent(student);
		sd.endTransaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		sd.startTransaction();
		sd.updateStudent(student);
		sd.endTransaction();
		return student;
	
	}

	@Override
	public Student searchStudentById(long id) {
		return sd.searchStudentById(id);
	}

	@Override
	public Student searchStudentByHallTicket(long id) {
		return sd.searchStudentByHallTicket(id);
	}



	@Override
	public boolean deleteStudent(long id) {
		sd.startTransaction();
		sd.deleteStudent(id);
		sd.endTransaction();
		return true;
		
	}

}
