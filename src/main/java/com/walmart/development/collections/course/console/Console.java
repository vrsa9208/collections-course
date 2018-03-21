package com.walmart.development.collections.course.console;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.walmart.development.collections.course.units.four.Unit4;

/**
 * @author vvo0002
 *
 */
public class Console
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    System.out.println("Java Collections");
    Unit4 unit4 = new Unit4();
    for(String string : unit4.getHashSet()) {
      System.out.println(string);
    }
    
    List<String> repeatedList = new LinkedList<>();
    repeatedList.add("uno");
    repeatedList.add("uno");
    repeatedList.add("dos");
    repeatedList.add("dos");
    repeatedList.add("tres");
    repeatedList.add("tres");
    
    Object o;
    
    for(String string : unit4.getHashSet(repeatedList)) {
      System.out.println(string);
    }
  }



  private static void sublist()
  {
    List<String> listaSimple = new ArrayList();
    listaSimple.add("A");
    listaSimple.add("B");
    listaSimple.add("C");
    listaSimple.add("D");
    listaSimple.add("E");
    listaSimple.add("F");
    listaSimple.add("G");
    List<String> sublistaSimple = listaSimple.subList(1, 3);
    sublistaSimple.add("C1");
    System.out.println(listaSimple);
    System.out.println(sublistaSimple);
  }

}
