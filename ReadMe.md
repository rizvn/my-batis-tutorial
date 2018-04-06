## Create MyBatis DAO 
We will use CustomerDao as example for this 

1. Create Interface under see **src/main/java**: 

        com.rizvn.app.dao.CustomerDao   
    
2. Create mapper xml for dao under **src/main/resources**. The mapper file contains 
   the query which will be run a method in the dao method is called.
    
        src/main/resources/com/rizvn/app/dao/CustomerDao.xml
        
3. Running the query. See **CustomerDaoTest**. 
    
        @Test
         public void getCustomerTest(){
           try(SqlSession session = conf.sqlSessionFactory.openSession())
           {
             CustomerDao customerDao = session.getMapper(CustomerDao.class);   // get Dao class
             CustomerDao customer = customerDao.findByRef("001");              // call mapped query passing arguments
             System.out.println(customer);
             Assert.assertNotNull(customer);
           }
         }
           
   The above will get the `CustomerDao` then call  `customerDap.findByRef` passing `ref`
   as the first argument. MyBatis will call `findByRef` query defined in 
   `CustomerDao.xml`. The first argument to is name **ref** in the `CustomerDao` interface so will 
   be associated to `#{ref}` in the xml. The resultType will map the result to Customer Object where the 
   property names match. 
      