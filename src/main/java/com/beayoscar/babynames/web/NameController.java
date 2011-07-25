package com.beayoscar.babynames.web;

import com.beayoscar.babynames.domain.Name;
import org.springframework.roo.addon.web.mvc.controller.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RooWebScaffold(path = "names", formBackingObject = Name.class)
@RequestMapping("/names")
@Controller
public class NameController {
}
