package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<>();
		languages.add(new Language(1, "Java"));
		languages.add(new Language(2, "Python"));
		languages.add(new Language(3, "C#"));
		languages.add(new Language(4, "Go"));
	}

	@Override
	public void add(Language language) {
		languages.add(language);
	}

	@Override
	public void delete(Language language) {
		languages.remove(language.getId());
	}

	@Override
	public void update(Language language) {
		languages.set(language.getId(), language);
	}

	@Override
	public List<Language> getAll() {
		return languages;
	}

	@Override
	public Language getAllById(int id) {
		return languages.get(id);
	}

}
