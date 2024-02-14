package Kodlamaio.Kodlama.io.Devs.webApi.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Kodlamaio.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlamaio.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/ProgrammingLanguage")
public class ProgrammingLanguagesController {
	
	

    private ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }
    @DeleteMapping("/delete")
    public void delete(int id) {
        programmingLanguageService.delete(id);
    }
}
