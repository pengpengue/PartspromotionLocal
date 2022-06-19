package com.pp.springbootmitsql.dao;

import com.pp.springbootmitsql.entities.PartsPromotion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PartsPromotionDao {

    PartsPromotionRepository repository;
    public PartsPromotionDao(PartsPromotionRepository repository){
        this.repository=repository;
    }

    public List<PartsPromotion> getPartsPromotionWithAccountId(Long accountId){
        return repository.findPartsPromotionByAccountId(accountId);
    }

    public PartsPromotion savePartsPromotion(PartsPromotion partsPromotion){
        return repository.save(partsPromotion);
    }

}
