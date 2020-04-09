/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.helsine.testCSV.entitiesCVS;

import com.opencsv.bean.CsvBindByName;
import java.util.Date;

/**
 *
 * @author helsine
 */
public class ArticleCSV {
    @CsvBindByName(column = "article_id")
    private Long id;
    @CsvBindByName(column = "article_raw_id")
    private Long articleRaw;
    @CsvBindByName(column = "specification_id")
    private Long specificationId;
    @CsvBindByName(column = "specification_number")
    private String specificationNumber;
    @CsvBindByName
    private String type;
    @CsvBindByName
    private String supplier;
    @CsvBindByName(column = "supplier_referer")
    private Long supplierReference;
    @CsvBindByName(column = "source_name")
    private String sourceName;
    @CsvBindByName
    private String url;
    @CsvBindByName
    private String title;
    @CsvBindByName(column = "clean_content")
    private String cleanContent;
    @CsvBindByName(column = "abstract")
    private String abstrac;
    @CsvBindByName(column = "aricle_date")
    private String articleDate;
    @CsvBindByName
    private String lang;
    @CsvBindByName(column = "auto_abstract")
    private String autoAbstract;
    @CsvBindByName
    private Long score;
    @CsvBindByName(column = "selection_status")
    private Long selectStatus;
    @CsvBindByName(column = "created_at")
    private String dateCreate;

    public ArticleCSV() {
    }

    public ArticleCSV(Long id, Long articleRaw, Long specificationId, String specificationNumber, String type, String supplier, Long supplierReference, String sourceName, String url, String title, String cleanContent, String abstrac, String articleDate, String lang, String autoAbstract, Long score, Long selectStatus, String dateCreate) {
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

    public String getArticleDate() {
        return articleDate;
    }

    public void setArticleDate(String articleDate) {
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
        return "id= "+id+" articleDate=" + articleDate + ", lang=" + lang + ", score=" + score + ", selectStatus=" + selectStatus ;
    }
    
    
}
