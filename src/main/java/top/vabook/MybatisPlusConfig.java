package top.vabook;

import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Author: vabook
 * @Date: 2019/7/8 16:52
 */

@Configuration
@MapperScan("top.vabook.mapper*")
public class MybatisPlusConfig {

    @Bean
    public PerformanceInterceptor performanceInterceptor(){
        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
        performanceInterceptor.setMaxTime(1000);
        performanceInterceptor.setFormat(true);
        return performanceInterceptor;
    }

    /**
     * 分页插件
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

    //数据源
    @Bean(name = "DataSource")
    public DataSource dataSource(){
        return new DruidDataSource();
    }

    public DataSourceTransactionManager dataSourceTransactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }
}
