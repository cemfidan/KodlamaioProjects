package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageService {
	
	void add(Language language);
	
	void delete(Language language);
	
	void update(Language language);
	
	List<Language> getAll();
	
	Language getAllById(int id);

}
