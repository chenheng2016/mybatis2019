package org.apache.ibatis.other;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenheng
 * @time 2019/11/17 16:43
 */
public class OtherTest {

  public static void main(String[] args) {
    String s="s";
    String a="a";
    String b="b";
    String c=a+b+s;
  }

  private ConcurrentHashMap<Integer,Object> concurrentHashMap=new ConcurrentHashMap();

  private boolean isCache=true;

  public Object get(int age){
    if (isCache){
      return  concurrentHashMap.computeIfAbsent(age,Person::new);
    }else{
      return new Person(age);
    }
  }
}
