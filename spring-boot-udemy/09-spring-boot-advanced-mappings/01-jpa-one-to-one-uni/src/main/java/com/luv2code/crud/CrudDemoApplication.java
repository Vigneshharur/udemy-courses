package com.luv2code.crud;

import com.luv2code.crud.dao.AppDAO;
import com.luv2code.crud.entity.Instructor;
import com.luv2code.crud.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO){
		return runner ->{
			//createInstructor(appDAO);
			//findInstructorById(appDAO);
			//deleteInstructorById(appDAO);
		};
	}

	private void deleteInstructorById(AppDAO appDAO) {
		int id = 2;
		System.out.println("Deleting Instructor for id: "+id);

		appDAO.deleteById(id);

		System.out.println("Deleted!!!");
	}

	private void findInstructorById(AppDAO appDAO) {
		int id = 2;
		System.out.println("Finding Instructor for id: "+id);
		Instructor instructor = appDAO.findByInstructorId(id);

		System.out.println("Instructor: "+instructor);
		System.out.println("Instructor Detail: "+instructor.getInstructorDetail());
	}

	private void createInstructor(AppDAO appDAO) {

		InstructorDetail instructorDetail = InstructorDetail.builder()
				.youtubeChannel("http://www.kamal/youtube")
				.hobby("Guitar")
				.build();

		Instructor instructor = Instructor.builder()
				.firstName("Kamal")
				.lastName("K")
				.email("kamal@gmail.com")
				.instructorDetail(instructorDetail)
				.build();

		System.out.println("Saving Instructor: "+instructor);
		appDAO.save(instructor);
		System.out.println("Done!!!");
	}

}
