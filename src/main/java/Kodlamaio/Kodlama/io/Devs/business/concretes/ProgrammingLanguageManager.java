package Kodlamaio.Kodlama.io.Devs.business.concretes;

import java.util.List;
import org.springframework.stereotype.Service;
import Kodlamaio.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlamaio.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlamaio.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	
	ProgrammingLanguageRepository programmingLanguageRepository;
	
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
			
		this.programmingLanguageRepository = programmingLanguageRepository;
	}


	@Override
	public List<ProgrammingLanguage> getAll() {
		
        return programmingLanguageRepository.getAll();	}


	@Override
	public ProgrammingLanguage getById(int id) {
			
        return programmingLanguageRepository.getById(id);	
        }


	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
			
		 if(programmingLanguage.getName() == null){
	            throw new Exception("Course section cannot be left blank");
	        }
	        for(ProgrammingLanguage currentProgrammmingLanguage : programmingLanguageRepository.getAll()){
	            if(currentProgrammmingLanguage.equals(programmingLanguage)){
	                throw new Exception("You got this course");
	            }
	       }
	        programmingLanguageRepository.add(programmingLanguage);
	}

	@Override	
	public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.update(programmingLanguage);	
		
	}

	@Override
	public void delete(int id) {
        programmingLanguageRepository.delete(id);
		
	}
	
}	
