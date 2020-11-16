/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backEndTest.service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.backEndTest.model.Shopping;
import test.backEndTest.repo.ShoppingRepo;
import test.backEndTest.service.ShoppingService;

/**
 *
 * @author dev
 */
@Service
public class ShopingImpl implements ShoppingService {

    @Autowired
    private ShoppingRepo shopingRepo;

    @Override
    public Map createdShoping(Map shop) {
        Map listShop = (Map) shop.get("shopping");
        Shopping modelShoping = new Shopping();
        modelShoping.setCreatedName(listShop.get("name").toString());
        modelShoping.setCreatedName(listShop.get("createddate").toString());
        shopingRepo.save(modelShoping);
        Map resultMap = new HashMap();
        Map dataMap = new HashMap();
        dataMap.put("id", modelShoping.getId());
        dataMap.put("name", listShop.get("name").toString());
        dataMap.put("createddate", listShop.get("createddate").toString());
        resultMap.put("data", dataMap);
        return resultMap;
    }

    @Override
    public Map updateShopingById(Map shop, Integer id) {
        Map listShop = (Map) shop.get("shopping");
        Shopping modelShoping = new Shopping();
        modelShoping.setId(id);
        modelShoping.setCreatedName(listShop.get("name").toString());
        modelShoping.setCreatedName(listShop.get("createddate").toString());
        shopingRepo.save(modelShoping);
        Map resultMap = new HashMap();
        Map dataMap = new HashMap();
        dataMap.put("id", modelShoping.getId());
        dataMap.put("name", listShop.get("name").toString());
        dataMap.put("createddate", listShop.get("createddate").toString());
        resultMap.put("data", dataMap);
        return resultMap;

    }

    @Override
    public Map getById(Integer id) {
        Shopping data = shopingRepo.findAllById(id);
        return (Map) data;
    }

    @Override
    public void deleteById(Integer id) {
        shopingRepo.deleteById(id);
    }

    @Override
    public List<Shopping> getAllShopping() {
        List<Shopping> list = (List<Shopping>) shopingRepo.findAll();
        return list;
    }

}
