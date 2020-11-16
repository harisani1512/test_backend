/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backEndTest.repo;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import test.backEndTest.model.User;

/**
 *
 * @author dev
 */
public interface UserRepo extends PagingAndSortingRepository<User, Serializable> {
    User findByEmailAndPassword(String email,String password);
    
}
