package cn.edu.hqu.cst.kubang.exhibition.MapperTests;

import cn.edu.hqu.cst.kubang.exhibition.ExhibitionApplication;
import cn.edu.hqu.cst.kubang.exhibition.dao.UserInformationMapper;
import cn.edu.hqu.cst.kubang.exhibition.entity.UserInformation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = ExhibitionApplication.class)
public class userInformationTests  {
    @Autowired
    private UserInformationMapper userInformationMapper;
    @Test
    public void testSelectUser(){
        UserInformation user = userInformationMapper.selectById(888);
        System.out.println(user);
    }



}
