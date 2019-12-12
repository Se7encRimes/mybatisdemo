package com.yzey.mybatisdemo;

import com.yzey.mybatisdemo.dao.DictionaryDao;
import com.yzey.mybatisdemo.dto.DictionaryTestDto;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Title MybatisTest
 * @Description //TODO
 * @Author yuanzy
 * @Date 2019/11/11 16:53
 **/
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MybatisTest {

  @Autowired
  private DictionaryDao dictionaryDao;

  @Test
  public void test1(){
    List<DictionaryTestDto> dictionaryTestDtos = dictionaryDao.selectTest();
    System.out.println(dictionaryTestDtos);
  }

  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    System.out.println(a>0?b>1?3:4:5);

    Date date = new Date();
    System.out.println(date);
    Date round = DateUtils.round(date, Calendar.HOUR);// 2017-06-04 01:00:00
    Date ceiling = DateUtils.ceiling(date, Calendar.HOUR);
    System.out.println(ceiling);
    System.out.println(round);
//printA(3);
  }

  private static void printA(int a) {
    switch (a){
      case 1:
        a = 2;
        break;
      case 2:
        a =1;
        break;
        default:
          throw new RuntimeException("错误");
    }
    System.out.println(a);

  }
}
