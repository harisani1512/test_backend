/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backEndTest.controller;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.backEndTest.model.User;
import test.backEndTest.service.Impl.UserImpl;
import test.backEndTest.service.UserService;

/**
 *
 * @author dev
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    
    @Autowired
    UserImpl userService;
    
    @PostMapping(path = "/signup", produces = "application/json")
    public Map signUp(@RequestBody Map user) {
        
        return userService.addUser(user);
        
    }
    @PostMapping(path = "/signin", produces = "application/json")
    public Map signIn(@RequestBody Map user) {
        
        return userService.getUser(user);
        
    }
}
