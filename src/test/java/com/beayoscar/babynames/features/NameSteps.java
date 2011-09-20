package com.beayoscar.babynames.features;

import static org.junit.Assert.assertEquals;

import com.beayoscar.babynames.domain.Gender;
import com.beayoscar.babynames.domain.Name;

import cuke4duke.annotation.I18n.EN.And;
import cuke4duke.annotation.I18n.EN.Given;
import cuke4duke.annotation.I18n.EN.Then;
import cuke4duke.annotation.Transform;
import cuke4duke.spring.StepDefinitions;

@StepDefinitions
public class NameSteps {
	
	@Transform
	public Gender transformStringToGender(String gender) {
	    return Gender.valueOf(gender);
	}
	
	private String name;
	private Gender gender;
	private Name nameObj;

	@Given("^the Name ([A-z]*)$")
	public void theNameIs(String name) {
		this.name = name;
	}

	@And("^the Gender ([A-z]*)$")
	public void theGenderIs(Gender gender) {
		this.gender = gender;
	}

	@Then("^we have (\\d+) name$")
	public void weHaveCount(String number) {
		nameObj = new Name();
		nameObj.setName(name);
		nameObj.setGender(gender);
		nameObj.persist();
		
		assertEquals(Integer.valueOf(number).intValue(), Name.findNamesByGender(gender).getResultList().size());
	}
	
	@And("^existing name has (\\d+) votes\\.$")
	public void existingNameHasVote(String number) {
		assertEquals(0, nameObj.getVote().longValue());
	}

}
