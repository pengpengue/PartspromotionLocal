package com.pp.springbootmitsql.service;

import com.pp.springbootmitsql.dao.PartsPromotionArticleDao;
import com.pp.springbootmitsql.dao.PartsPromotionDao;
import com.pp.springbootmitsql.entities.PartsPromotion;
import com.pp.springbootmitsql.entities.PartsPromotionArticle;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PromotionService {

    private final PartsPromotionDao partsPromotionDao;
    private final PartsPromotionArticleDao partsPromotionArticleDao;

    public PromotionService(PartsPromotionDao partsPromotionDao, PartsPromotionArticleDao partsPromotionArticleDao) {
        this.partsPromotionDao = partsPromotionDao;
        this.partsPromotionArticleDao = partsPromotionArticleDao;
    }

    public List<PartsPromotion> showPromotionsWithAccount(Long accountId){
        return partsPromotionDao.getPartsPromotionWithAccountId(accountId);
    }

    public List<PartsPromotionArticle> showArticleWithPromotionId(Long promotionId){
        return partsPromotionArticleDao.getArticleWithPromotionId(promotionId);
    }

    @Transactional
    public PartsPromotionArticle addNewArticle(PartsPromotionArticle partsPromotionArticle){
        return partsPromotionArticleDao.saveArticle(partsPromotionArticle);
    }

    @Transactional
    public PartsPromotion addNewPromotion(PartsPromotion partsPromotion){
        return partsPromotionDao.savePartsPromotion(partsPromotion);
    }
}
