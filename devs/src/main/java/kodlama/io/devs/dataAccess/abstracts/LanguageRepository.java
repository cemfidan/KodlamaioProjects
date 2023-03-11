package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageRepository {

	void add(Language language);

	void delete(Language language);

	void update(Language language);

	List<Language> getAll();

	Language getAllById(int id);

}
