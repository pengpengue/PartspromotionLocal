package com.pp.springbootmitsql.dao;

import com.pp.springbootmitsql.entities.PartsPromotionArticle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PartsPromotionArticleDao {
    PartsPromotionArticleRepository partsPromotionArticleRepository;

    public PartsPromotionArticleDao(PartsPromotionArticleRepository partsPromotionArticleRepository) {
        this.partsPromotionArticleRepository = partsPromotionArticleRepository;
    }

    public List<PartsPromotionArticle> getArticleWithPromotionId(Long promotionId){
        return partsPromotionArticleRepository.findPartsPromotionArticleByPromotionId(promotionId);
    }

    public PartsPromotionArticle saveArticle(PartsPromotionArticle partsPromotionArticle){
        return partsPromotionArticleRepository.save(partsPromotionArticle);
    }
}
