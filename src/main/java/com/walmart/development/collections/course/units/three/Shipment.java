/**
 * 
 */
package com.walmart.development.collections.course.units.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author vvo0002
 *
 */
public class Shipment implements Iterable<Product>
{
  /**
   * 
   */
  private static final int PRODUCT_NOT_PRESET = -1;

  private static final int LIGHT_VAN_MAX_HEIGHT = 20;

  private final List<Product> products = new ArrayList<>();
  
  private List<Product> lightVanProducts;
  private List<Product> heavyVanProducts;



  public void add(Product product)
  {
    products.add(product);
  }
  
  public void replace(Product oldProduct, Product newProduct)
  {
    final int index = products.indexOf(oldProduct);
    
    if(index != PRODUCT_NOT_PRESET) products.set(index, newProduct);
  }
  
  public void prepare()
  {
    //sort our list of produts by weight
    //products.sort(); in Java 8
    Collections.sort(products,new Comparator<Product>() {

      @Override
      public int compare(Product o1, Product o2)
      {
        if(o1.getValue() == o2.getValue()) return 0;
        if(o1.getValue() < o2.getValue()) return -1;
        else return 1;
      }
    });
    
    //find the product index that needs the heavy van
    int splitPoint = findSplitPoint();
    
    //assign views of the product list for heavy and light vans
    lightVanProducts = products.subList(0, splitPoint);
    heavyVanProducts = products.subList(splitPoint, products.size());
  }
  
  private int findSplitPoint()
  {
    for(int i = 0; i < products.size(); i++ ) 
    {
      final Product product = products.get(i);
      if(product.getValue() > LIGHT_VAN_MAX_HEIGHT) {
        return i;
      }
    }
    
    return 0;
  }

  public List<Product> getHeavyVanProducts() { return heavyVanProducts; }
  
  public List<Product> getLightVanProducts() { return lightVanProducts; }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Iterable#iterator()
   */
  @Override
  public Iterator<Product> iterator()
  {
    return products.iterator();
  }

}
