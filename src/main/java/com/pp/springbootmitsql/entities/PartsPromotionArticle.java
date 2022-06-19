package com.pp.springbootmitsql.entities;

import javax.persistence.*;

@Entity(name= PartsPromotionArticle.ENTITY)
@Table(name = PartsPromotionArticle.TABLE, schema = "db1")
public class PartsPromotionArticle {
    public static final String ENTITY="PartsPromotionArticle";
    public static final String TABLE="parts_promotion_articles";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "PARTS_PROMOTION", nullable = false)
    private Long promotionId;

    @Column(name = "PART_NO", nullable = false, length = 64)
    private String partName;

    public Long getId() {
        return id;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }
}
