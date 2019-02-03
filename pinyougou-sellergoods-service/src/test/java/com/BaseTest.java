package com;

import com.pinyougou.mapper.TbBrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.impl.BrandServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author Smile
 * Created at 2019/2/1
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ComponentScan("com.pinyougou")
@ContextConfiguration("classpath*:spring/applicationContext*.xml")
//@ImportResource("classpath*:spring/applicationContext*.xml")
public class BaseTest {

    @Autowired
    private DataSource dataSource;
    @Autowired
    BrandServiceImpl brandService;

    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Test
    public void test1() throws Exception{
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

        List<TbBrand> tbBrands = tbBrandMapper.selectByExample(null);
        System.out.println(tbBrands);
//        PreparedStatement statement = connection.prepareStatement("select * from tb_address");
//        ResultSet resultSet = statement.executeQuery();
//        System.out.println(resultSet);
//        TbBrand tbBrand =
//                this.tbBrandMapper.selectByPrimaryKey(1L);
//        System.out.println(tbBrand);
    }
}
