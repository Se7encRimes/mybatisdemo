package com.yzey.mybatisdemo.enums;

/**
 * @Title TestEnum
 * @Description //
 * @Author yuanzy
 * @Date 2019/11/11 16:57
 **/
public enum  TestEnum {
  A(1,"A"),
  B(2,"B"),
  C(3,"B"),
  D(4,"D")
  ;
  private Integer code;
  private String name;
  TestEnum(Integer code, String name){
    this.code = code;
    this.name = name;
  }

  public TestEnum get(Integer code){
    for(TestEnum testEnum :values()){
      if(testEnum.code.equals(code)){
        return testEnum;
      }
    }
    return null;
  }
}
