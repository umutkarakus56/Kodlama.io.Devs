package Kodlamaio.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;
import Kodlamaio.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getById(int id);

		void add(ProgrammingLanguage programmingLanguage);

	void update(ProgrammingLanguage programmingLanguage);

	void delete(int id);

		
}
