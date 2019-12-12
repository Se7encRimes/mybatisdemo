package com.yzey.mybatisdemo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Title Dictionary
 * @Description //TODO
 * @Author yuanzy
 * @Date 2019/11/11 16:51
 **/
@Data
public class Dictionary implements Serializable {

  private Integer id;
  private String type;
  private String code;

}
