package org.apache.ibatis.other;

import java.lang.reflect.Method;

/**
 * @author chenheng
 * @time 2019/11/17 17:43
 */
public class Person {

  private String name;

  private int age;

  public Person(int age) {
    this.age = age;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args) {
    Method[] methods = Student.class.getDeclaredMethods();
    for (Method method : methods) {
      if (method.isBridge()){
        System.out.println(method.getName()+": "+method.getDeclaringClass());
      }
    }
  }
}

interface Base<T> {
  T method(T param);
}

class Student implements Base<String> {

  @Override
  public String method(String param) {
    return param;
  }
}


