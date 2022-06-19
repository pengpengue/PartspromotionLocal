package com.pp.springbootmitsql.dao;

import com.pp.springbootmitsql.entities.PartsPromotionArticle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartsPromotionArticleRepository extends JpaRepository<PartsPromotionArticle,Long> {
    List<PartsPromotionArticle> findPartsPromotionArticleByPromotionId(Long promotionId);
}
