package Services;

import java.io.IOException;
import java.io.InputStream;

import com.CRM.CRM;
import com.CRM.Contact;
import com.Complex5Ecommerce.EcommercePlatform;
import com.Complex5Ecommerce.User;
import com.EmployeeManagement.Company;
import com.InsurancePolicy.Policy;
import com.OnlineShoppingCart.Cart;
import com.ResearchProject.ResearchProject;
import com.SmartCity.Initiative;
import com.SmartCity.SmartCity;
import com.SportsTournament.Team;
import com.SportsTournament.Tournament;
import com.StoreEcommerce.Category;
import com.StoreEcommerce.StoreWrapper;
import com.StudentInformationSystem.Student;
import com.SupplyChain.Product;
import com.SupplyChain.SupplyChain;
import com.TravelAgency.Tour;
import com.TravelAgency.TravelAgency;
import com.TravelBooking.Flight;
import com.TravelBooking.TravelBooking;
import com.University.Course;
import com.University.Department;
import com.University.University;
import com.UniversityWrapper.Faculty;
import com.UniversityWrapper.UniversityWrapper;
import com.conversiondemo.ConvertionDemo.App;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Services {
	ObjectMapper mapper = new ObjectMapper();
	
	//EmployeeManagement
	public void EmployeeManagement() throws StreamReadException, DatabindException, IOException {
		// Json to java obj
    	
    	System.out.println("EMPLOYEE MANAGEMENT - JSON to JAVA OBJECT");
    	
    	InputStream is = App.class.getClassLoader()
    	        .getResourceAsStream("Employee Management.json");
//
//    	if (is == null) {
//    	    throw new RuntimeException("File not found in resources!");
//    	}

    	Company company = mapper.readValue(is, Company.class);

    	System.out.println("Company Name: " + company.getCompany());

    	company.getEmployees().forEach(emp ->
    	        System.out.println("Employee: " + emp.getName())
    	);
    	
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("EMPLOYEE MANAGEMENT - JAVA OBJECT to JSON");
    	//java object to json
    	Company ccompany = new Company();
        ccompany.setCompany("TechNova");
        ccompany.setEmployees(company.getEmployees());
        
        // assume employees list is set

        String json= mapper.writerWithDefaultPrettyPrinter()
              .writeValueAsString(ccompany);

        System.out.println("JSON created successfully!");
        
        System.out.println(json);
	}
	
	//OnlineShoppingCart
	public void OnlineShoppingCart() throws StreamReadException, DatabindException, IOException {
		// Json to java obj
    	
    	System.out.println("ONLINE SHOPPING CART - JSON to JAVA OBJECT");
    	//ObjectMapper mapper = new ObjectMapper();
    	
    	InputStream is = App.class.getClassLoader()
    	        .getResourceAsStream("OnlineShoppingCart.json");

        Cart cart = mapper.readValue(is,Cart.class);

        System.out.println("Cart ID: " + cart.getCartId());
        System.out.println("User Name: " + cart.getUser().getName());
        System.out.println("City: " + cart.getUser().getAddress().getCity());
        System.out.println("First Item: " + cart.getItems().get(0).getName());
        
        System.out.println("--------------------------------------------------------------");
    	System.out.println("ONLINE SHOPPING CART - JAVA OBJECT to JSON");
    	//java object to json
    	
        String json = mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(cart);

        System.out.println(json);
	}

	//UniversityStudents
	public void UniversityStudents() throws StreamReadException, DatabindException, IOException {
		//json to java obj
		System.out.println("UNIVERSITY OF STuDENTS - JSON TO JAVAOBJ");
		//ObjectMapper mapper = new ObjectMapper();

		University university = mapper.readValue(
		        App.class.getClassLoader().getResourceAsStream("UniversityStudents.json"),
		        University.class
		);

		System.out.println("University: " + university.getUniversity());
		System.out.println();
		for (Department dept : university.getDepartments()) {
		    System.out.println("Department: " + dept.getName());
		    
		    for (Course course : dept.getCourses()) {
		        System.out.println("Course: " + course.getTitle());
		        System.out.println("Instructor: " + course.getInstructor().getName());
		    }
		}
		System.out.println("--------------------------------------------------------------");
    	System.out.println("UNIVERSITYSTUDENTS - JAVA OBJECT to JSON");
    	//java object to json
		String json = mapper.writerWithDefaultPrettyPrinter()
		        .writeValueAsString(university);

		System.out.println(json);
	}
	
	//Complex4University
	public void Complex4University() throws IOException {
		
    System.out.println("COMPLEX4 UNIVERSITY OF STUDENTS - JSON TO JAVAOBJ");

    InputStream is = App.class.getClassLoader()
            .getResourceAsStream("Complex4.json");

    if (is == null) {
        throw new RuntimeException("Complex4.json not found in resources folder");
    }

    com.Complex4University.University university = mapper.readValue(is, com.Complex4University.University.class);

    System.out.println("University: " + university.getUniversity());
    System.out.println("City: " + university.getLocation().getCity());
    for (com.Complex4University.Department dept : university.getDepartments()) {
        System.out.println("Department: " + dept.getName());
        System.out.println("Head: " + dept.getHead().getName());
        System.out.println("--------------------------------");
    }

    System.out.println("--------------------------------------------------------------");
    System.out.println("COMPLEX4 UNIVERSITY STUDENTS - JAVA OBJECT TO JSON");

    String json = mapper.writerWithDefaultPrettyPrinter()
            .writeValueAsString(university);

    System.out.println(json);
	}
	
	//Complex5Ecommerce
	public void Complex5Ecommerce() throws IOException {
			
	    System.out.println("COMPLEX5 ECOMMERCE - JSON TO JAVAOBJ");

	    InputStream is = App.class.getClassLoader()
	            .getResourceAsStream("Complex5.json");
	    EcommercePlatform  EC=mapper.readValue(is, EcommercePlatform.class);
	    
	    System.out.println(EC.getEcommercePlatform());

	    for (User user : EC.getUsers()) {
	        System.out.println("User: " + user.getName());
	    }
	    
	    System.out.println("--------------------------------------------------------------");
	    System.out.println("COMPLEX5 ECOMMERCE - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(EC);

	    System.out.println(json);
	    
		}
		
	//CRM
	public void CRM() throws IOException{
			 System.out.println("CRM - JSON TO JAVAOBJ");

			    InputStream is = App.class.getClassLoader()
			            .getResourceAsStream("CrmSystem.json");
			    CRM  crm=mapper.readValue(is, CRM.class);
			    System.out.println("Organization: " + crm.getOrganization());

			    for (Contact contact : crm.getContacts()) {
			        System.out.println("Contact: " + contact.getName());
			    }
			    
			    System.out.println("--------------------------------------------------------------");
			    System.out.println("CRM - JAVA OBJECT TO JSON");

			    String json = mapper.writerWithDefaultPrettyPrinter()
			            .writeValueAsString(crm);

			    System.out.println(json);
		}
		
	//StoreEcommerce
	public void StoreEcommerce() throws StreamReadException, DatabindException, IOException {
			 System.out.println("STOREECOMMERCE - JSON TO JAVAOBJ");

			    InputStream is = App.class.getClassLoader()
			            .getResourceAsStream("Ecommerce.json");
			    StoreWrapper  store=mapper.readValue(is, StoreWrapper.class);
			    System.out.println("Store: " + store.getStore().getName());

			    for (Category c : store.getStore().getCategories()) {
			        System.out.println("Category: " + c.getName());
			    }
			    
			    System.out.println("--------------------------------------------------------------");
			    System.out.println("STOREECOMMERCE - JAVA OBJECT TO JSON");

			    String json = mapper.writerWithDefaultPrettyPrinter()
			            .writeValueAsString(store);

			    System.out.println(json);
		}
		
	//platformshopease
	public void PlatformShopease() throws StreamReadException, DatabindException, IOException {
		 System.out.println("PLATFORMSHOPEASE - JSON TO JAVAOBJ");

		    InputStream is = App.class.getClassLoader()
		            .getResourceAsStream("EcommercePlatform.json");
		    com.PlatformShopease.Platform  shopease=mapper.readValue(is, com.PlatformShopease.Platform.class);
		    System.out.println("Platform: " + shopease.getPlatformName());

		    for (com.PlatformShopease.Category c : shopease.getCategories()) {
		        System.out.println("Category: " + c.getName());
		    }
		    System.out.println("--------------------------------------------------------------");
		    System.out.println("PLAFORMSHOPEASE - JAVA OBJECT TO JSON");

		    String json = mapper.writerWithDefaultPrettyPrinter()
		            .writeValueAsString(shopease);

		    System.out.println(json);
	}
	
	//InsurancePolicy
	public void InsurancePolicy() throws StreamReadException, DatabindException, IOException {
		System.out.println("INSURANCEPOLICY - JSON TO JAVAOBJ");

		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("Insurancepolicy.json");

		Policy policy = mapper.readValue(is, Policy.class);

		System.out.println("Policy ID: " + policy.getPolicyId());
		System.out.println("Policy Holder: " + policy.getPolicyHolder().getName());
		System.out.println("City: " + policy.getPolicyHolder().getAddress().getCity());
		
		System.out.println("--------------------------------------------------------------");
	    System.out.println("INSURANCEPOLICY - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(policy);

	    System.out.println(json);
	}
	
	//Onlinelearningplatform
	public void onlineLearningPlatform() throws StreamReadException, DatabindException, IOException {
		System.out.println("ONLINELEARNINGPLATFORM - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("Onlinelearningplatform.json");

		com.Onlinelearningplatform.Platform platform = mapper.readValue(is, com.Onlinelearningplatform.Platform.class);

		System.out.println("Platform: " + platform.getPlatform());

		for (com.Onlinelearningplatform.Category c : platform.getCategories()) {
		    System.out.println("Category: " + c.getName());
		}
		System.out.println("--------------------------------------------------------------");
	    System.out.println("ONLINELEARNINGPLATFORM - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(platform);

	    System.out.println(json);
	}
	
	//Ordersystem
	public void orderSystem() throws StreamReadException, DatabindException, IOException {
		System.out.println("ORDERSYSTEM - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("Ordersystem.json");

		com.OrderSystem.Order order = mapper.readValue(is, com.OrderSystem.Order.class);

		System.out.println("Order ID: " + order.getOrderId());
		System.out.println("Customer: " + order.getCustomer().getName());
		System.out.println("City: " + order.getCustomer().getAddress().getCity());
		
		System.out.println("--------------------------------------------------------------");
	    System.out.println("ORDERSYSTEM - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(order);

	    System.out.println(json);
	}
	
	//Realestate
	public void realEstate() throws StreamReadException, DatabindException, IOException {
		System.out.println("REALESTATE - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("Realestatelistings.json");

		com.Realestate.PropertyPlatform property = mapper.readValue(is, com.Realestate.PropertyPlatform.class);

		System.out.println("City: " + property.getCity());

		for (com.Realestate.Listing l : property.getListings()) {
		    System.out.println("Property Type: " + l.getType());
		    System.out.println("Area: " + l.getLocation().getArea());
		}
		System.out.println("--------------------------------------------------------------");
	    System.out.println("REALESTATE - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(property);

	    System.out.println(json);
	}
	
	//ResearchProject
	public void researchProject() throws IOException {
		System.out.println("RESEARCHPROJECT - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("Researchproject.json");

		ResearchProject project = mapper.readValue(is, ResearchProject.class);

		System.out.println("Project Title: " + project.getTitle());
		System.out.println("Principal Investigator: " + project.getPrincipalInvestigator().getName());
		System.out.println("Funding Agency: " + project.getFunding().getAgency());
		
		System.out.println("--------------------------------------------------------------");
	    System.out.println("RESEARCHPROJECT - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(project);

	    System.out.println(json);
	    
	}
	
	//SmartCity
	public void smartCity() throws StreamReadException, DatabindException, IOException {
		System.out.println("SMARTCITY - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("SmartCity.json");

		SmartCity smartCity = mapper.readValue(is, SmartCity.class);

		System.out.println("City: " + smartCity.getCity());

		for (Initiative i : smartCity.getInitiatives()) {
		    System.out.println("Project: " + i.getProject());
		    System.out.println("Status: " + i.getStatus());
		}
		System.out.println("--------------------------------------------------------------");
	    System.out.println("SMARTCITY - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(smartCity);

	    System.out.println(json);
	}
	
	//sportstournament
	public void sportsTournamet() throws StreamReadException, DatabindException, IOException {
		System.out.println("SPORTSTOURNAMENT - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("Sportstournament.json");

		Tournament tournament = mapper.readValue(is, Tournament.class);

		System.out.println("Tournament: " + tournament.getName());
		System.out.println("Host Country: " + tournament.getHostCountry());

		for (Team team : tournament.getTeams()) {
		    System.out.println("Team: " + team.getName());
		}
		System.out.println("--------------------------------------------------------------");
	    System.out.println("SPORTSTOURNAMENT - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(tournament);

	    System.out.println(json);
	}
	
	//StudentInfoSystem
	public void studentInfoSystem() throws StreamReadException, DatabindException, IOException {
		System.out.println("STUDENTINFO - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("Studentsinformationsystem.json");

		Student student = mapper.readValue(is, Student.class);

		System.out.println("Student: " + student.getPersonalInfo().getFirstName());
		System.out.println("Program: " + student.getAcademicDetails().getEnrolledProgram());
		System.out.println("Attendance: " + student.getAcademicDetails().getAttendance().getPercentage());
		System.out.println("--------------------------------------------------------------");
	    System.out.println("STUDENTINFO - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(student);

	    System.out.println(json);
	}
	
	//supplychain
	public void supplyChain() throws StreamReadException, DatabindException, IOException {
		System.out.println("SUPPLYCHAIN - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("Supplychain.json");

		SupplyChain scm = mapper.readValue(is, SupplyChain.class);

		System.out.println("Company: " + scm.getCompany());

		for (Product p : scm.getProducts()) {
		    System.out.println("Product: " + p.getName());
		}
		System.out.println("--------------------------------------------------------------");
	    System.out.println("SUPPLYCHAIN - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(scm);

	    System.out.println(json);
	}
	
	//Travelagency
	public void travelAgency() throws StreamReadException, DatabindException, IOException {
		System.out.println("TRAVELAGENCY - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("Travelagency.json");

		TravelAgency travelAgency = mapper.readValue(is, TravelAgency.class);

		System.out.println("Agency: " + travelAgency.getAgency().getName());

		for (Tour t : travelAgency.getAgency().getTours()) {
		    System.out.println("Destination: " + t.getDestination());
		}
		System.out.println("--------------------------------------------------------------");
	    System.out.println("TRAVELAGENCY - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(travelAgency);

	    System.out.println(json);
	}
	
	//travelbooking
	public void travelBooking() throws StreamReadException, DatabindException, IOException {
		System.out.println("TRAVELBOOKING - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("Travelbooking.json");

		TravelBooking booking = mapper.readValue(is, TravelBooking.class);

		System.out.println("Booking ID: " + booking.getBookingId());
		System.out.println("Traveler: " + booking.getTraveler().getFirstName());

		for (Flight f : booking.getItinerary().getFlights()) {
		    System.out.println("Flight: " + f.getFlightNumber());
		}
		System.out.println("--------------------------------------------------------------");
	    System.out.println("TRAVELBOOKING - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(booking);

	    System.out.println(json);
	}
	
	//UniversityWrapper
	public void universityWrapper() throws StreamReadException, DatabindException, IOException {
		System.out.println("UNIVERSITYMODEL - JSON TO JAVAOBJ");
		InputStream is = App.class.getClassLoader()
		        .getResourceAsStream("UniversityModel.json");

		UniversityWrapper wrapper =
		        mapper.readValue(is, UniversityWrapper.class);

		System.out.println("University: " +
		        wrapper.getUniversity().getName());

		for (Faculty f : wrapper.getUniversity().getFaculties()) {
		    System.out.println("Faculty: " + f.getName());
		}
		System.out.println("--------------------------------------------------------------");
	    System.out.println("UNIVERSITYMODEL - JAVA OBJECT TO JSON");

	    String json = mapper.writerWithDefaultPrettyPrinter()
	            .writeValueAsString(wrapper);

	    System.out.println(json);
	}
}
