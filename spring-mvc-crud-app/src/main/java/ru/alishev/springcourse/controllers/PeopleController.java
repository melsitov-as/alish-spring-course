package ru.alishev.springcourse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.alishev.springcourse.dao.PersonDAO;
import ru.alishev.springcourse.models.Person;

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
	
//	@GetMapping("/new")
//	public String newPerson(Model model) {
//		// если мы используем thymeleaf-формы, мы должны передавать в шаблон тот объект,
//		// для которого эта форма нужна
//		
//		model.addAttribute("person", new Person());
//		return "people/new";
//	}
	
	@GetMapping("/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "people/new";
	}
	
	// здесь мы должны:
	// получить данные из формы, создать нового человека,
	// положить в этого человека данные, которые пришли из формы
	// этого человека добавить в бд
	@PostMapping()
	public String create(@ModelAttribute("person") Person person) {
		personDAO.save(person);
		return "redirect:/people"; 
	}
}
