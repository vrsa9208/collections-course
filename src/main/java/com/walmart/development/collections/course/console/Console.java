package com.walmart.development.collections.course.console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.walmart.development.collections.course.units.three.Product;

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
    Product door = new Product("Wooden door", 35);
    Product floorPanel = new Product("Floor panel", 25);
    Product window = new Product("Glass window", 10);
    
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
