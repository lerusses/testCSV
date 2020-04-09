/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.helsine.testCSV.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author helsine
 */
@Entity
public class Article {
   
    @Column(name ="article_id" )
    @Id
    private Long id;
    @Column(name ="article_raw_id" )
    private Long articleRaw;
    @Column(name = "specification_id")
    private Long specificationId;
    @Column(name = "specification_number")
    private String specificationNumber;
    private String type;
    private String supplier;
    @Column(name ="supplier_refer" )
    private Long supplierReference;
    @Column(name ="source_name" )
    private String sourceName;
    private String url;
    private String title;
    @Column(name = "clean_content")
    private String cleanContent;
    @Column(name ="abstract" )
    private String abstrac;
    @Column(name ="aricle_date" )
    private Date articleDate;
    private String lang;
    @Column(name ="auto_abstract" )
    private String autoAbstract;
    private Long score;
    @Column(name ="select_status" )
    private Long selectStatus;
    @Column(name = "created_at")
    private String dateCreate;

    public Article() {
    }

    public Article(Long id, Long articleRaw, Long specificationId, String specificationNumber, String type, String supplier, Long supplierReference, String sourceName, String url, String title, String cleanContent, String abstrac, Date articleDate, String lang, String autoAbstract, Long score, Long selectStatus, String dateCreate) {
        this.id = id;
        this.articleRaw = articleRaw;
        this.specificationId = specificationId;
        this.specificationNumber = specificationNumber;
        this.type = type;
        this.supplier = supplier;
        this.supplierReference = supplierReference;
        this.sourceName = sourceName;
        this.url = url;
        this.title = title;
        this.cleanContent = cleanContent;
        this.abstrac = abstrac;
        this.articleDate = articleDate;
        this.lang = lang;
        this.autoAbstract = autoAbstract;
        this.score = score;
        this.selectStatus = selectStatus;
        this.dateCreate = dateCreate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleRaw() {
        return articleRaw;
    }

    public void setArticleRaw(Long articleRaw) {
        this.articleRaw = articleRaw;
    }

    public Long getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(Long specificationId) {
        this.specificationId = specificationId;
    }

    public String getSpecificationNumber() {
        return specificationNumber;
    }

    public void setSpecificationNumber(String specificationNumber) {
        this.specificationNumber = specificationNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Long getSupplierReference() {
        return supplierReference;
    }

    public void setSupplierReference(Long supplierReference) {
        this.supplierReference = supplierReference;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCleanContent() {
        return cleanContent;
    }

    public void setCleanContent(String cleanContent) {
        this.cleanContent = cleanContent;
    }

    public String getAbstrac() {
        return abstrac;
    }

    public void setAbstrac(String abstrac) {
        this.abstrac = abstrac;
    }

    public Date getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(Date articleDate) {
        this.articleDate = articleDate;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getAutoAbstract() {
        return autoAbstract;
    }

    public void setAutoAbstract(String autoAbstract) {
        this.autoAbstract = autoAbstract;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getSelectStatus() {
        return selectStatus;
    }

    public void setSelectStatus(Long selectStatus) {
        this.selectStatus = selectStatus;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", articleRaw=" + articleRaw + ", specificationId=" + specificationId + ", specificationNumber=" + specificationNumber + ", type=" + type + ", supplier=" + supplier + ", supplierReference=" + supplierReference + ", title=" + title + ", articleDate=" + articleDate + ", lang=" + lang + ", score=" + score + ", selectStatus=" + selectStatus + ", dateCreate=" + dateCreate + '}';
    }
    
    
    
}
