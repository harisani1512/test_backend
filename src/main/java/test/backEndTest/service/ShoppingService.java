/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backEndTest.service;

import java.util.List;
import java.util.Map;
import test.backEndTest.model.Shopping;

/**
 *
 * @author dev
 */
public interface ShoppingService {

    Map createdShoping(Map shop);

    Map updateShopingById(Map shop,Integer id);

    Map getById(Integer id);

    void deleteById(Integer id);

    List<Shopping> getAllShopping();

}
