package com.rizvn.app.dao;
import com.rizvn.app.domain.Customer;
import java.util.List;

/**
 * Created by Riz
 */
public interface CustomerDao
{

  Customer findByRef(String ref);

  List<Customer> selectTop3();
}
