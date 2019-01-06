package com.jim.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by jim on 2018/12/27.
 */
@Configuration
@MapperScan(basePackages = "com.jim.test.dao",sqlSessionFactoryRef = "testSqlSessionFactory")
public class DataSourceConfig {

    /**
     * 配置数据源
     * @return
     */
    @Bean("testDataSource")
@ConfigurationProperties("spring.datasource.test")
public DataSource testDataSource(){
   return DataSourceBuilder.create().build();
}

    /**
     * 创建sql回话工厂
     * @param dataSource
     * @return
     * @throws Exception
     */
@Bean("testSqlSessionFactory")
@Primary
public SqlSessionFactory sqlSessionFactory(@Qualifier("testDataSource") DataSource dataSource) throws Exception {
    SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
    bean.setDataSource(dataSource);
    return bean.getObject();
}

    /**
     *创建事物管理器
     * @param dataSource
     * @return
     */
    @Bean("testDataSourceTransactionManager")
public DataSourceTransactionManager dataSourceTransactionManager(@Qualifier("testDataSource")DataSource dataSource){
    return new DataSourceTransactionManager(dataSource);
}

@Bean(name = "test1SqlSessionTemplate")
public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("testSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
    return new SqlSessionTemplate(sqlSessionFactory);
}
}
