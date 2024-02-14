package Kodlamaio.Kodlama.io.Devs.business.abstracts;

import java.util.List;
import Kodlamaio.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();

    ProgrammingLanguage getById(int id);

    void add(ProgrammingLanguage programmingLanguage) throws Exception;

    void update(ProgrammingLanguage programmingLanguage);

    void delete(int id);

}
