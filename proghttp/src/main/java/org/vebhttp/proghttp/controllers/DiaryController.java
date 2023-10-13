package org.vebhttp.proghttp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class DiaryController {
	@GetMapping("/diary")
	public String diaryPage(@RequestParam(value = "name", required = false) String name, 
			@RequestParam(value = "surname", required = false) String surname, Model model,
			@RequestParam(value = "patronymic", required = false) String patronymic) {
		model.addAttribute("message", "Hello " + name + " " + surname + patronymic + ", my name is Tom Riddle");
		return "diary/hello";
	}
}
