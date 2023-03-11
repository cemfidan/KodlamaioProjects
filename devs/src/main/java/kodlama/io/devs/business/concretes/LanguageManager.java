package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class LanguageManager implements LanguageService {

	private Language lang = new Language();
	private LanguageRepository languageRepository;

	@Override
	public void add(Language language) {
		try {
			if (!language.getName().isEmpty()) {
				if (!language.getName().equals(lang.getName())) {
					languageRepository.add(language);
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid value: Related field is empty or already exists");
		}
	}

	@Override
	public void delete(Language language) {
		try {
			if ((0 < language.getId()) && (language.getId() <= language.getId())) {
				languageRepository.delete(language);
			}

		} catch (Exception e) {
			System.out.println("Invalid value");
		}
	}

	@Override
	public void update(Language language) {
		try {
			if ((0 < language.getId()) && (language.getId() <= language.getId())) {
				languageRepository.update(language);
			}

		} catch (Exception e) {
			System.out.println("Invalid value");
		}
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public Language getAllById(int id) {
		return languageRepository.getAllById(id);
	}

}
