package Kodlamaio.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;
import org.springframework.stereotype.Repository;
import Kodlamaio.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlamaio.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;


@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	
	 List<ProgrammingLanguage> languages;
	 
	public InMemoryProgrammingLanguageRepository() {
		
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1,"C#"));
		languages.add(new ProgrammingLanguage(1,"Python"));
		languages.add(new ProgrammingLanguage(1,"Java"));
		languages.add(new ProgrammingLanguage(1,"Kotlin"));
		languages.add(new ProgrammingLanguage(1,"C++"));

		
	}
	
	public List<ProgrammingLanguage> getAll() {
		
		return languages;
	}



	@Override
    public ProgrammingLanguage getById(int id) {
        for(ProgrammingLanguage programmingLanguage : languages){
            if(programmingLanguage.getId() == id){
                return programmingLanguage;
            }
        }
        return null;
    }


	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
		languages.add(programmingLanguage);
		
	}



	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage currentprogrammingLanguage = getById(programmingLanguage.getId());	
        if(currentprogrammingLanguage != null){
            currentprogrammingLanguage.setName(programmingLanguage.getName());
        }
	}

	@Override
	public void delete(int id) {
		 ProgrammingLanguage toRemoveProgrammingLanguage = getById(id);
	        if (toRemoveProgrammingLanguage != null) {
	            languages.remove(toRemoveProgrammingLanguage);
	    }	
	}
}
