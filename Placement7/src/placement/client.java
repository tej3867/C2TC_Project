package placement;

import java.time.LocalDate;

import placement.entities.Admin;
import placement.entities.Certificate;
import placement.entities.College;
import placement.entities.Placement;
import placement.entities.Student;
import placement.entities.User;
import placement.service.CertificateService;
import placement.service.CertificateServiceImpl;
import placement.service.CollegeService;
import placement.service.CollegeServiceImpl;
import placement.service.PlacementService;
import placement.service.PlacementServiceImpl;
import placement.service.StudentService;
import placement.service.StudentServiceImpl;
import placement.service.UserService;
import placement.service.UserServiceImpl;

public class client {
	public static void main(String[] args) {
		
		
		User u = new User();
		User u1 = new User();
		UserService us = new UserServiceImpl();
		u.setId(11);
		u.setName("Tech");
		u.setType("staff");
		u.setPassword("123456");
		us.addUser(u);
		u1.setId(12);
		u1.setName("Exp");
		u1.setType("Admin");
		u1.setPassword("234567");
		us.addUser(u1);
		us.addUser(u);
		System.out.println("Added users");
		
		College c = new College();
		CollegeService cs= new CollegeServiceImpl();
		c.setId(1000);
		c.setLocation("Bangalore");
		c.setCollegeName("IIT");
		c.setCollegeAdmin(u1);
		cs.addCollege(c);
		System.out.println("college added");
		
		Certificate cc = new Certificate();
		CertificateService ccs = new CertificateServiceImpl();
		cc.setId(300);
		cc.setYear(2020);
		cc.setCollege(c);
		Certificate cc1 = new Certificate();
		cc1.setId(301);
		cc1.setYear(2021);
		cc1.setCollege(c);
		ccs.addCertificate(cc);
		ccs.addCertificate(cc1);
		System.out.println("certificate added");
		
		Placement p = new Placement();
		PlacementService ps = new PlacementServiceImpl();
		p.setId(200);
		p.setName("Infosys");
		p.setQualification("BE");
		p.setYear(2021);
		p.setDate(LocalDate.now().plusDays(2));
		p.setCollege(c);
		ps.addPlacement(p);
		Placement p1 = new Placement();
		p1.setId(201);
		p1.setName("Accenture");
		p1.setQualification("BE");
		p1.setYear(2021);
		p1.setDate(LocalDate.now().plusDays(4));
		p1.setCollege(c);
		ps.addPlacement(p1);
		System.out.println("placement scheduled");
		
		
		
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		StudentService ss= new StudentServiceImpl();
		s.setId(90004);
		s.setName("John");
		s.setRoll(40009);
		s.setQualification("BE");
		s.setCourse("CSE");
		s.setYear(2021);
		s.setHallTicketNo(126);
		s.setCollege(c);
		s.setCertificate(cc1);
		s1.setId(90003);
		s1.setName("Mark");
		s1.setRoll(30009);
		s1.setQualification("BE");
		s1.setCourse("ISE");
		s1.setYear(2020);
		s1.setHallTicketNo(125);
		s1.setCollege(c);
		s1.setCertificate(cc);
		s2.setId(90002);
		s2.setName("Rock");
		s2.setRoll(20009);
		s2.setQualification("BE");
		s2.setCourse("EC");
		s2.setYear(2021);
		s2.setHallTicketNo(124);
		s2.setCollege(c);
		s2.setCertificate(cc1);
		s3.setId(90001);
		s3.setName("Sandy");
		s3.setRoll(10009);
		s3.setQualification("BE");
		s3.setCourse("CSE");
		s3.setYear(2021);
		s3.setHallTicketNo(123);
		s3.setCollege(c);
		s3.setCertificate(cc1);
		ss.addStudent(s);
		ss.addStudent(s1);
		ss.addStudent(s2);
		ss.addStudent(s3);
		System.out.println("successfully added students");
		
		
		Student s4=ss.searchStudentById(90002);
		s4.setName("Rocky");
		ss.updateStudent(s);
		System.out.println("updtaed done to Id: "+s4.getId());
		
		System.out.println(ss.searchStudentById(90002));
		
		System.out.println(ss.searchStudentByHallTicket(126));
		
		System.out.println(ccs.searchCertificate(301));
		
		System.out.println(cs.searchCollege(1000));
		
		System.out.println(ps.searchPlacement(200));
		
	}

}
