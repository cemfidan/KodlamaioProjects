package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguagesController {

	private LanguageService languageService;

	@PostMapping("/add")
	public void add(Language language) {
		languageService.add(language);
	}

	@PostMapping("/delete")
	public void delete(Language language) {
		languageService.delete(language);
	}

	@PostMapping("/update")
	public void update(Language language) {
		languageService.update(language);
	}

	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageService.getAll();
	}

	@GetMapping("/getallbyid")
	public Language getAllById(int id) {
		return languageService.getAllById(id);
	}

}
