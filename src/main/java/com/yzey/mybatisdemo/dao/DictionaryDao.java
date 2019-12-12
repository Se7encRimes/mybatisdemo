package com.yzey.mybatisdemo.dao;

import com.yzey.mybatisdemo.dto.DictionaryTestDto;
import com.yzey.mybatisdemo.enums.TestEnum;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Title DictionaryDao
 * @Description //TODO
 * @Author yuanzy
 * @Date 2019/11/11 16:54
 **/
@Mapper
public interface DictionaryDao {


  List<DictionaryTestDto> selectTest();

  List<Integer> selectEnum();

}
