package com.xiteo.tjtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiteo.tjtest.controller.models.ModelIn;
import com.xiteo.tjtest.controller.models.ModelOut;

@Controller
@RequestMapping("/api/test")
public class TJAPIController {

	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public ModelOut testApi(@RequestBody ModelIn modelIn) {
		System.out.println("Conroler!");
		return ModelOut.builder().from(modelIn.getFrom()).to(modelIn.getTo()).build();
	}
}
