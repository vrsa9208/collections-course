/**
 * 
 */
package com.walmart.development.collections.course.units.four;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author vvo0002
 *
 */
public class Unit4
{
  public static void main(String[] args)
  {
    Unit4 self = new Unit4();
    self.compareWithTreeSet();
  }
  
  public void compareWithHashSet(){
    Persona p1 = new Persona("Victor", 20);
    Persona p2 = new Persona("Orlando", 20);
    Persona p3 = new Persona("Santiago", 20);
    Persona p4 = new Persona("Omar", 20);
    Persona p5 = new Persona("Ociel", 20);
    Persona p6 = new Persona("Victor", 20);
    Persona p7 = new Persona("Victor", 20);
   
    Set<Persona> personas = new HashSet<>();
    personas.add(p1);
    personas.add(p2);
    personas.add(p3);
    personas.add(p4);
    personas.add(p5);
    personas.add(p6);
    personas.add(p7);
    
    for(Persona persona : personas) {
      System.out.println(persona);
    }
  }
  
  public void compareWithTreeSet(){
    Persona p1 = new Persona("Victor", 20);
    Persona p2 = new Persona("Orlando", 20);
    Persona p3 = new Persona("Santiago", 20);
    Persona p4 = new Persona("Omar", 20);
    Persona p5 = new Persona("Ociel", 20);
    Persona p6 = new Persona("Victor", 20);
    Persona p7 = new Persona("Victor", 20);
   
    Set<Persona> personas = new TreeSet<>(new Comparator<Persona>() {

      @Override
      public int compare(Persona o1, Persona o2)
      {
        return o1.getNombre().compareTo(o2.getNombre());
      }
    
    });
    personas.add(p1);
    personas.add(p2);
    personas.add(p3);
    personas.add(p4);
    personas.add(p5);
    personas.add(p6);
    personas.add(p7);
    
    for(Persona persona : personas) {
      System.out.println(persona);
    }
  }
  
  


  public Set<String> getHashSet()
  {
    Set<String> hashSet = new HashSet<>();
    hashSet.add("something");
    hashSet.add(new String("something"));
    hashSet.add("more");
    return hashSet;
  }



  public Set<String> getHashSet(List<String> list)
  {
    return new HashSet<>(list);
  }
}
