package com.rizvn.app;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.h2.jdbcx.JdbcDataSource;

import javax.sql.DataSource;

/**
 * Created by Riz
 */
public class Config
{
  private SqlSessionFactory sqlSessionFactory;

  public Config(){
    TransactionFactory transactionFactory = new JdbcTransactionFactory();
    Environment environment = new Environment("development", transactionFactory, dataSource());
    Configuration configuration = new Configuration(environment);
    configuration.addMappers("com.rizvn.app.dao");                             //Tell my batis where mappers (dao's) are
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
  }

  public SqlSessionFactory getSqlSessionFactory()
  {
    return sqlSessionFactory;
  }

  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
  {
    this.sqlSessionFactory = sqlSessionFactory;
  }

  private DataSource dataSource(){
    JdbcDataSource ds = new JdbcDataSource();
    ds.setURL("jdbc:h2:mem:test_db;INIT=RUNSCRIPT FROM './src/test/resources/create.sql'");
    ds.setUser("sa");
    ds.setPassword("sa");
    return ds;
  }
}
