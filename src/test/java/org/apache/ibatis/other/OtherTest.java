package org.apache.ibatis.other;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author chenheng
 * @time 2019/11/17 16:43
 */
public class OtherTest {

  public static void main(String[] args) {
    Map<String, Object> map = new HashMap<>();
//    final Object value = map.get("key");
//    if (value == null) {
//      map.put("key", new Object());
//    }
//
//    System.out.println(map);

    Object va = map.computeIfAbsent("key", k -> new Object());
//    System.out.println(va);
//    System.out.println(map);



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
