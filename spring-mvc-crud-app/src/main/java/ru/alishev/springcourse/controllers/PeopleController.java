package ru.alishev.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.alishev.springcourse.dao.PersonDAO;

@Controller
@RequestMapping("/people")
public class PeopleController {
	
	// таким образом Spring внедрит объект класса PersonDAO в контроллер
	@Autowired
	private PersonDAO personDAO;
	
	public PeopleController(PersonDAO personDAO) {
		super();
		this.personDAO = personDAO;
	}

	@GetMapping()
	public String index(Model model) {
		// Получим всех людей из DAO и передадим на отображение этих людей в представление
		model.addAttribute("people", personDAO.index());
		return "people/index";
	}
	
	@GetMapping("/{id}")
	public String show(@PathVariable("id") int id, Model model) {
		// Получаем одного человека из DAO и передадим на отображение в представление
		model.addAttribute("person", personDAO.show(id));
		return "people/show";
	}
}
