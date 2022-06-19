package com.pp.springbootmitsql.web;

import com.pp.springbootmitsql.entities.PartsPromotion;
import com.pp.springbootmitsql.entities.PartsPromotionArticle;
import com.pp.springbootmitsql.service.PromotionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloMySQLEndpoint {
    PromotionService promotionService;

    public HelloMySQLEndpoint(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @GetMapping("hellosql/{accountid}")
    public ResponseEntity<List<PartsPromotion>> getPromotionByAccountId(@PathVariable("accountid") Long accountid){
        List<PartsPromotion> result=promotionService.showPromotionsWithAccount(accountid);
        return ResponseEntity.ok(result);
    }

    @PostMapping("hellosql")
    public ResponseEntity<PartsPromotion> addNewPromotion(@RequestBody PartsPromotion partsPromotion){
        PartsPromotion result= promotionService.addNewPromotion(partsPromotion);
        return ResponseEntity.ok(result);
    }

    @GetMapping("helloteil/{promotionId}")
    public ResponseEntity<List<PartsPromotionArticle>> getArticleByPromotionId(@PathVariable("promotionId") Long promotionId){
        List<PartsPromotionArticle> result=promotionService.showArticleWithPromotionId(promotionId);
        return ResponseEntity.ok(result);
    }

    @PostMapping("helloteil")
    public ResponseEntity<PartsPromotionArticle> addNewArticle(@RequestBody PartsPromotionArticle partsPromotionArticle){
        PartsPromotionArticle result= promotionService.addNewArticle(partsPromotionArticle);
        return ResponseEntity.ok(result);
    }
}
