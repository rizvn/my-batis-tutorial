package com.rizvn.app.dao;

import com.rizvn.app.domain.Customer;
import com.rizvn.app.Config;
import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Created by Riz
 */
public class CustomerDaoTest
{
  Config conf = new Config();

  @Test
  public void getCustomerTest(){
    try(SqlSession session = conf.getSqlSessionFactory().openSession())
    {
      CustomerDao customerDao = session.getMapper(CustomerDao.class);      // get Dao class
      Customer customer = customerDao.findByRef("001");                    // call mapped query passing arguments
      System.out.println(customer);
      Assert.assertNotNull(customer);
    }
  }
  

  @Test
  public void getTop3Test(){
    try(SqlSession session = conf.getSqlSessionFactory().openSession())
    {
      CustomerDao welcomePackDao = session.getMapper(CustomerDao.class);     // get Dao class
      List<Customer> customers = welcomePackDao.selectTop3();                // call mapped query passing arguments
      System.out.println(customers);

      Assert.assertEquals("Expected 3 customers", 3, customers.size());
    }
  }
}
