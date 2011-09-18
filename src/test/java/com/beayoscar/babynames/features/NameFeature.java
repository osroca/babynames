package com.beayoscar.babynames.features;

import static org.junit.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;

import com.beayoscar.babynames.domain.Gender;
import com.beayoscar.babynames.domain.Name;

import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.spring.StepDefinitions;

@StepDefinitions
public class NameFeature {
	@Autowired
	private Name domainNname;
	
	private String name;
	private Gender gender;
	
	@Given("I have a name")
	public void iHaveAName() {
		assertNotNull(domainNname);
	}

//	@Given("^The Name is ([A-z]*)$")
//	public void theNameIs(String name) {
//		this.name = name;
//	}
//
//	@When("^The Gender is ([A-z]*)$")
//	public void theGenderIs(Gender gender) {
//		this.gender = gender;
//	}

//	@Then("^we have (\\d+) name\\.$")
//	public void theGreetingIs(String greeting) {
//		Name nameObj = new Name();
//		nameObj.setName(name);
//		nameObj.setGender(gender);
//		nameObj.persist();
//		
//		assertEquals(1, Name.findNamesByGender(gender).getResultList().size());
//	}

}
