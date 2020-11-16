/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backEndTest.service;

import java.util.Map;
import org.springframework.stereotype.Service;

/**
 *
 * @author dev
 */
@Service
public interface UserService {

    Map addUser(Map user);
    Map getUser(Map user);
    void getAllUser();
}
