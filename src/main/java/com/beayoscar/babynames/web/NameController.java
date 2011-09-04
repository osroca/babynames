package com.beayoscar.babynames.web;

import java.util.Collection;

import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.beayoscar.babynames.domain.Name;

@RooWebScaffold(path = "names", formBackingObject = Name.class)
@RequestMapping("/names")
@Controller
public class NameController {

	@ModelAttribute("names")
    public Collection<Name> populateNames() {
        //return Name.findAllNames();
		return null;
    }
	
//	@ModelAttribute("male_names")
//	public Collection<Name> populateMaleNames() {
//		return Name.findNamesByGender(Gender.MALE).getResultList();
//	}
//	@ModelAttribute("female_names")
//	public Collection<Name> populateFemaleNames() {
//		return Name.findNamesByGender(Gender.FEMALE).getResultList();
//	}
	
    @RequestMapping(value = "/listgenders", method = RequestMethod.GET)
    public String list(Model uiModel) {
        return "names/listbygender";
    }
}
