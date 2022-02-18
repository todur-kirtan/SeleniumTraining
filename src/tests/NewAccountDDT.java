package tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class)
public class NewAccountDDT {
	String name;
	String Email;
	String phone;
	
	//This is our test method
	@Test
	public void newAccountTest() {
		System.out.println("NEW RECORD: " + name + " " + Email + " " + phone + "  ");
		if(phone.equals("7894561230")) {
			Assert.fail();
		}
		
	}
	
	//This annotated method is designed to pass parameters into the class via constructor
	@Parameters
	public static List<String[]> getData() {
		return utilities.CSV.get("C:\\SDETuniversity\\Files\\UserAccounts.csv");
		
	}
	
	//Constructor that passes parameters to the test method
	public NewAccountDDT(String name, String email, String Phone, String password, String gender, String country, String weeklyEmail,
			String monthlyEmail, String occationalEmail) {
		this.name = name;
		this.Email = email;
		this.phone = Phone;
	}
}
