package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;
import com.luv2code.aopdemo.model.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MembershipDAO membershipDAO){
//		return runner -> {
//			demoTheBeforeAdvice(accountDAO, membershipDAO);
//		};
//	}
//
//	private void demoTheBeforeAdvice(AccountDAO accountDAO, MembershipDAO membershipDAO) {
//		accountDAO.addAccount(new Account(),true);
//		accountDAO.doWork();
//		membershipDAO.goToSleep();
//		membershipDAO.addAccount();
//	}

}
