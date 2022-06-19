package com.pp.springbootmitsql.dao;

import com.pp.springbootmitsql.entities.PartsPromotion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartsPromotionRepository extends JpaRepository<PartsPromotion, Long> {
    List<PartsPromotion> findPartsPromotionByAccountId(Long id);
}
