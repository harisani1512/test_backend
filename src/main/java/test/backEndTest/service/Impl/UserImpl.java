/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backEndTest.service.Impl;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.backEndTest.model.User;
import test.backEndTest.repo.UserRepo;
import test.backEndTest.service.UserService;

/**
 *
 * @author dev
 */
@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public Map addUser(Map user) {
        Map userList = (Map) user.get("user");
        User userModel = new User();
        userModel.setAddress(userList.get("address").toString());
        userModel.setCity(userList.get("city").toString());
        userModel.setCountry(userList.get("country").toString());
        userModel.setEmail(userList.get("email").toString());
        userModel.setName(userList.get("name").toString());
        userModel.setPassword(userList.get("encrypted_password").toString());
        userModel.setPhone(userList.get("phone").toString());
        userModel.setPostCode(userList.get("postcode").toString());
        userModel.setUsername(userList.get("username").toString());
        userRepo.save(userModel);
        Map returnMap = new HashMap();
        byte[] array = new byte[12]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        returnMap.put("email", userList.get("email").toString());
        returnMap.put("token", generatedString);
        returnMap.put("username", userList.get("username").toString());
        return returnMap;

    }

    @Override
    public Map getUser(Map user) {
//        User resultUser = userRepo.findUserByEmailAndPassword(user.get("email").toString(), user.get("password").toString());
        Map result = new HashMap();
        byte[] array = new byte[12]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
//        result.put("email", resultUser.getEmail());
        result.put("token", generatedString);
//        result.put("username", resultUser.getUsername());

        return result;

    }

    @Override
    public void getAllUser() {
        userRepo.findAll();

    }

}
