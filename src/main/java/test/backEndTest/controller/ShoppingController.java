/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backEndTest.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.backEndTest.model.Shopping;
import test.backEndTest.model.User;
import test.backEndTest.service.Impl.ShopingImpl;
import test.backEndTest.service.ShoppingService;
import test.backEndTest.service.UserService;

/**
 *
 * @author dev
 */
@RestController
@RequestMapping("/api/shopping")
public class ShoppingController {
    
    @Autowired
    ShopingImpl shoping;
    
    @PostMapping(path = "/shoping", produces = "application/json")
    public Map add(@RequestBody Map user) {
        
        return shoping.createdShoping(user);
        
    }
    @PostMapping(path = "/shoping/{id}", produces = "application/json")
    public Map add(@RequestBody Map user,@PathVariable Integer Id) {
        
        return shoping.updateShopingById(user,Id);
        
    }
    @PostMapping(path = "/getAll", produces = "application/json")
   public List<Shopping>  getAll() {
        List<Shopping> list = shoping.getAllShopping();
        return list;
        
    }

}
