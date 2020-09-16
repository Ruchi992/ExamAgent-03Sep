/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ruchi.examagent;

import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ruchi Devi
 */
@Service
public class ProdectService {
	
	@Autowired
	ProdectService Service;
	
      public static List<Products> getAllProducts(){
		EntityManager em = DBUtil.getEMF().createEntityManager();
        
        String query = "SELECT b FROM Products p";

        TypedQuery<Products> typedQuery = em.createQuery(query, Products.class);

        List<Products> list = null;

        try {
            list = typedQuery.getResultList();
            for (Products products : list) {
                System.out.println(products);

            }

            if (list == null || list.isEmpty()) {
                return null;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            em.close();
        }
        System.out.println("end");
        return list;
	  }
	  
	  public  static void insertProductsById(int id){
       EntityManager em = DBUtil.getEMF().createEntityManager();
       try{
       EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        em.persist(id);
        
        tx.commit();

       }catch (Exception ex) {
           ex.printStackTrace();
            System.out.println(ex);
        } finally {
            em.close();
        }
       
    }
	  
	   public  static void updateProducts(Products p){
       EntityManager em = DBUtil.getEMF().createEntityManager();
       try{
       EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        em.merge(p);
        
        tx.commit();

       }catch (Exception ex) {
           ex.printStackTrace();
            System.out.println(ex);
        } finally {
            em.close();
        }
       
    }
}
	
		
   

	
