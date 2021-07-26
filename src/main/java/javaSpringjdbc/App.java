package javaSpringjdbc;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javaSpringjdbc.Entity.User;

public class App {
        public static void main(String args[]) {
        	ApplicationContext context= new ClassPathXmlApplicationContext("javaSpringjdbc/config.xml");
        	JdbcTemplate jdbcTemplate=context.getBean("jdbcTemplate",JdbcTemplate.class);
        	UserService userService=new UserService(jdbcTemplate);
        	Scanner s=new Scanner(System.in);
        	while(true) {
        		System.out.println("\n1: Insert \n2: Update \n3: GetUser \n4: List User");
        		int opt=s.nextInt();
        		User user=new User();
        		switch(opt){
        		case 1:
        			    System.out.println("Id:\n");
        			    String id=s.next();
        				user.setId(Integer.parseInt(id));
        				System.out.println("Name:\n");
        				String fname=s.next();
        				user.setFirstName(fname);
        				System.out.println("Surname:\n");
        				String surName=s.next();
        			    user.setSurName(surName);
        			    System.out.println("DOB:\n");
        			    String dob=s.next();
        			    user.setDOB(dob);
        			    System.out.println("Title:\n");
        			    String title=s.next();
        			    user.setTile(title);
        			    userService.insert(user);
        			    System.out.print("Value inserted...\n");
        				break;
        		case 2:
    			        System.out.println("Id:\n");
    			        id=s.next();
    				    user.setId(Integer.parseInt(id));
    				    System.out.println("Name:\n");
    				    fname=s.next();
    				    user.setFirstName(fname);
    				    System.out.println("Surname:\n");
    				    surName=s.next();
    			        user.setSurName(surName);
    			        System.out.println("DOB:\n");
    			        dob=s.next();
    			        user.setDOB(dob);
    			        System.out.println("Title:\n");
    			        title=s.next();
    			        user.setTile(title);
    			        userService.update(user);
    			        System.out.print("Value updated...\n");  
        				break;
        		case 3:
        			    System.out.println("Id:\n");
 			            id=s.next();
 			            User user1=userService.getUser(Integer.parseInt(id));
 			            System.out.print(user1);
        				break;
        		case 4: 
        			    ArrayList<User> userList=(ArrayList<User>) userService.listUser();
        			    for(User user2:userList) {
        			    	System.out.print(user2+"\n");
        			    }
        				break;
        			default:
        				System.out.print("Incorect input\n");
        				
        		}       		
        	}
        }
}
