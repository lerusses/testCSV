/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.helsine.testCSV.controllers;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import tech.helsine.testCSV.entitiesCVS.ArticleCSV;
import tech.helsine.testCSV.entitiesCVS.ArticleCSV1;
import tech.helsine.testCSV.repository.ArticleRepository;

/**
 *
 * @author helsine
 */
@Controller
public class articleController {
    
    @Autowired
    ArticleRepository articleRepository;
    
    private Set<String> listLang;

    public Set<String> getListLang() {
        return listLang;
    }

    public void setListLang(Set<String> listLang) {
        this.listLang = listLang;
    }
    
    
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    @PostMapping("/upload-csv-file")
    public String uploadCSVFile(@RequestParam("file")MultipartFile file, Model model){
        
        //valdate file
        if (file.isEmpty()) {
            model.addAttribute("message", "Please select a cvs file to upload");
            model.addAttribute("status", false);
        } else {
            //parse CSV file to create a list of "AticleCSV" Object
            try(Reader reader =new  BufferedReader(new InputStreamReader(file.getInputStream()))) {
                // create csv bean reader 
                CsvToBean<ArticleCSV1> csvToBean= new CsvToBeanBuilder(reader)
                        .withSeparator(';')
                        .withType(ArticleCSV1.class)
                        .withSkipLines(1)
                        .withIgnoreLeadingWhiteSpace(true)
                        .build();
                
                //convert 'csvToBean' object to List of ArticleCSV
                List<ArticleCSV1> articleCSVs=csvToBean.parse();
                
                listLang=new HashSet<>();
                //vider la base de donnée embarquée H2 au démarage 
                articleRepository.deleteAll();
                
                //remplissage de a base de donnée embarquée H2 au démarage
                articleCSVs.forEach((articleCSV) -> {
                    articleRepository.save(articleCSV);
                    listLang.add(articleCSV.getLang());
                    
                   // System.out.println(articleCSV.toString());
                });
                
         
                        
                //save ArticleCSV on model
                model.addAttribute("articleCSVs", articleRepository.findAll());
                model.addAttribute("status", true);
                model.addAttribute("langs",listLang);
            } catch (Exception e) {       
                model.addAttribute("message", "An error occurred while processing the CSV file.");
                model.addAttribute("status", false);
            }
        } return "file-upload-status";
    }
    
    @GetMapping("/betweenscore")
    public String searchScoreBetween(@RequestParam("score1")String score1,@RequestParam("score2")String score2, Model model){
       Long less=Long.parseLong(score1);
       Long great=Long.parseLong(score2);
        model.addAttribute("articleCSVs", articleRepository.findByScoreBetween(less, great));
        model.addAttribute("status", true);
        model.addAttribute("langs",listLang);
        return "file-upload-status";
    }
    
    @GetMapping("/lessscore")
    public String searchScoreLessThan(@RequestParam("score")String score, Model model){
        Long less=Long.parseLong(score);
        model.addAttribute("articleCSVs",articleRepository.findByScoreLessThan(less));
        model.addAttribute("status", true);
        model.addAttribute("langs",listLang);
        return "file-upload-status";
    }
    
    @GetMapping("/greaterscore")
    public String searchScoreGreaterThan(@RequestParam("score")String score, Model model){
        Long greater=Long.parseLong(score);
        model.addAttribute("articleCSVs",articleRepository.findByScoreGreaterThanEqual(greater));
        model.addAttribute("status", true);
        model.addAttribute("langs",listLang);
        return "file-upload-status";
    }
    
     @GetMapping("/lang")
    public String searchLang(@RequestParam("lang")String lang, Model model){
        model.addAttribute("articleCSVs",articleRepository.findByLang(lang));
        model.addAttribute("status", true);
        model.addAttribute("langs",listLang);
        return "file-upload-status";
    }
    
    @GetMapping("/status-null")
    public String searchStatusNull( Model model){
        model.addAttribute("articleCSVs",articleRepository.findBySelectStatusNull());
        model.addAttribute("status", true);
        model.addAttribute("langs",listLang);
        return "file-upload-status";
    }
    
    @GetMapping("/status")
    public String searchStatusNoNull( Model model){
        model.addAttribute("articleCSVs",articleRepository.findBySelectStatusNotNull());
        model.addAttribute("status", true);
        model.addAttribute("langs",listLang);
        return "file-upload-status";
    }
}
