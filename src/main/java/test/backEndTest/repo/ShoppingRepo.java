/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.backEndTest.repo;

import java.io.Serializable;
import java.util.Map;
import org.springframework.data.repository.PagingAndSortingRepository;
import test.backEndTest.model.Shopping;

/**
 *
 * @author dev
 */
public interface ShoppingRepo extends PagingAndSortingRepository<Shopping, Serializable> {

    Shopping findAllById(Integer id);

     void deleteById(Integer id);


}
