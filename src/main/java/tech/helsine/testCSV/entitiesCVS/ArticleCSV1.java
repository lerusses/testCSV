/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tech.helsine.testCSV.entitiesCVS;


import com.opencsv.bean.CsvBindByPosition;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author helsine
 */
@Entity
public class ArticleCSV1 implements Serializable {
    
    @CsvBindByPosition(position = 0)
    @Id 
    private String id;
    @CsvBindByPosition(position = 1)
    private String articleRaw;
    @CsvBindByPosition(position = 2)
    private String specificationId;
    @CsvBindByPosition(position = 3)
    private String specificationNumber;
    @CsvBindByPosition(position = 4)
    private String type;
    @CsvBindByPosition(position = 5)
    private String supplier;
    @CsvBindByPosition(position = 6)
    private Long supplierReference;
    @CsvBindByPosition(position = 7)
    private String sourceName;
    @CsvBindByPosition(position = 8)
    @Column(length = 100000)
    private String url;
    @CsvBindByPosition(position = 9)
    @Column(length = 100000)
    private String title;
    @CsvBindByPosition(position = 10)
    @Column(length = 100000)
    private String cleanContent;
    @CsvBindByPosition(position = 11)
    private String abstrac;
    @CsvBindByPosition(position = 12)
    private String articleDate;
    @CsvBindByPosition(position = 13)
    private String lang;
    @CsvBindByPosition(position = 14)
    private String autoAbstract;
    @CsvBindByPosition(position = 15)
    private Long score;
    @CsvBindByPosition(position = 16)
    private Long selectStatus;
    @CsvBindByPosition(position = 17)
    private String dateCreate;

    public ArticleCSV1() {
    }

    public ArticleCSV1(String id, String articleRaw, String specificationId, String specificationNumber, String type, String supplier, Long supplierReference, String sourceName, String url, String title, String cleanContent, String abstrac, String articleDate, String lang, String autoAbstract, Long score, Long selectStatus, String dateCreate) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArticleRaw() {
        return articleRaw;
    }

    public void setArticleRaw(String articleRaw) {
        this.articleRaw = articleRaw;
    }

    public String getSpecificationId() {
        return specificationId;
    }

    public void setSpecificationId(String specificationId) {
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
        return "id=" + id + ", articleRaw=" + articleRaw +   ", type=" + type + ", articleDate=" + articleDate + " score=" + score + ", selectStatus=" + selectStatus + ", dateCreate=" + dateCreate + '}';
    }

   
}
