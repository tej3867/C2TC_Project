package placement.dao;

import placement.entities.Student;

public interface StudentRepo {
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public Student searchStudentById(long id);
	public Student searchStudentByHallTicket(long hallTicketNo);
	public boolean deleteStudent(long id);
	public void startTransaction();
	public void endTransaction();
	

}
