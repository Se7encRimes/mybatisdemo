package com.yzey.mybatisdemo.dto;

import com.yzey.mybatisdemo.enums.TestEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * @Title DictionaryTestDto
 * @Description //TODO
 * @Author yuanzy
 * @Date 2019/11/11 16:55
 **/
@Data
@ToString
@NoArgsConstructor
public class DictionaryTestDto {
  private Integer id;
  private String type;
  private String code;

  private List<TestEnum> testEnums;
}
