package placement.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import placement.entities.Placement;
import placement.entities.Student;

public class StudentRepoImpl implements StudentRepo {
	EntityManager en;
	
	public StudentRepoImpl() {
		en=configuration.getEntityManager();
	}

	@Override
	public Student addStudent(Student student) {
		en.persist(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		en.merge(student);
		return student;
	}

	@Override
	public Student searchStudentById(long id) {
		Student stud=en.find(Student.class,id);
		return stud;
	}

	@Override
	public Student searchStudentByHallTicket(long ticketNo) {
		String query = "Select student from Student student where student.hallTicketNo like :ticketNo";
		TypedQuery<Student> s=en.createQuery(query,Student.class);
		s.setParameter("ticketNo",ticketNo);
		return s.getSingleResult();
	}

	@Override
	public boolean deleteStudent(long id) {
		Student s=getStudent(id);
		en.remove(s);
		return true;
		
	}
	
	public Student getStudent(long id) {
		Student s=en.find(Student.class,id);
		return s;
	}

	@Override
	public void startTransaction() {
		en.getTransaction().begin();
		
	}

	@Override
	public void endTransaction() {
		en.getTransaction().commit();
		
		
	}

}
