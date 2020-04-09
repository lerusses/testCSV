/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.helsine.testCSV.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.helsine.testCSV.entitiesCVS.ArticleCSV1;

/**
 *
 * @author helsine
 */
@Repository
public interface ArticleRepository extends JpaRepository<ArticleCSV1, Long>{
    
    /**
     * Selectionner les articles en fonction de langue 
     * @param lang
     * @return 
     */
    List<ArticleCSV1> findByLang(String lang);
    /**
     * selctionner tous les articles qui ont un score null
     * @return List<ArticleCSV1>
     */
    List<ArticleCSV1> findByScoreNull();
    /**
     * selctionner tous les articles qui ont un score null
     * @return List<ArticleCSV1>
     */
    List<ArticleCSV1> findByScoreNotNull();
    /**
     * selectionner tous les articles qui ont un status non null
     * @return @return List<ArticleCSV1>
     */
    List<ArticleCSV1> findBySelectStatusNotNull();
    /**
     * selectionner tous les articles qui ont un status null
     * @return @return List<ArticleCSV1>
     */
    List<ArticleCSV1> findBySelectStatusNull();
    /**
     * Selectionner  tous les articles compris entre min et max
     * @param min valeur minimale du score
     * @param max valeur maximale du score
     * @return List<ArticleCSV1>
     */
    List<ArticleCSV1> findByScoreBetween(Long min, Long max);
    /**
     * Selectionner tous les articles inférieur à une valeur 
     * @param less
     * @return List<ArticleCSV1>
     */
    List<ArticleCSV1> findByScoreLessThan(Long less);
    
    /**
     * Selectionner tous les articles supérieur ou égal à une valeur
     * @param greater
     * @return List<ArticleCSV1>
     */
    List<ArticleCSV1> findByScoreGreaterThanEqual(Long greater);
}
