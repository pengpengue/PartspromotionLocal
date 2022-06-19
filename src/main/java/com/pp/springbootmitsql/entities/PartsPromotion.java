package com.pp.springbootmitsql.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name= PartsPromotion.ENTITY)
@Table(name = PartsPromotion.TABLE, schema = "db1")
public class PartsPromotion {
    public static final String ENTITY="PartsPromotion";
    public static final String TABLE="parts_promotions";
    @Id
    //@SequenceGenerator(name = ENTITY+"-sequence", sequenceName = "SEQ_" + TABLE, allocationSize = 1, initialValue = 10000)
    @GeneratedValue(/*generator = ENTITY+"-sequence", */strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ACCOUNT", nullable = false)
    private Long accountId;

    @Column(name = "NAME", nullable = false, length = 128)
    private String name;

    @Column(name = "DESCRIPTION", length = 512)
    private String description;

    @Column(name = "TYPE", columnDefinition = "INTEGER NOT NULL DEFAULT 1")
    private Integer type;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JoinColumn(name = "PARTS_PROMOTION", referencedColumnName = "ID")
    private List<PartsPromotionArticle> articles=new ArrayList<PartsPromotionArticle>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<PartsPromotionArticle> getArticles() {
        return articles;
    }

    public void setArticles(List<PartsPromotionArticle> articles) {
        this.articles = articles;
    }
}
