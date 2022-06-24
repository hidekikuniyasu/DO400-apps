package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    // @todo: add tests
    ShippingCalculator calculator = new ShippingCalculator();
    
    assertEquals(0, calculator.costForRegion("A Region"));

package com.redhat.shipping;

public class ShippingCalculator {

   public int costForRegion(String name) {
      return 0;

      }

public void onNARegionTheCostIs100() {
    assertEquals(100, (new ShippingCalculator()).costForRegion("NA"));
}

public int costForRegion(String name) {
    if (name.equals("NA")) {
        return 100;
    }

    return 0;

}

public void onNARegionTheCostIs100() {
    // Given a shipping calcultor
    ShippingCalculator calculator = new ShippingCalculator();

    // When NA is the country region
    int calculatedCost = calculator.costForRegion("NA");

    // Then the shipping cost is 100
    assertEquals(100, calculatedCost);

}

public void onLATAMRegionTheCostIs200() {
   // Given a shipping calculator
   ShippingCalculator calculator = new ShippingCalculator();

   // When LATAM is the country region
   int calculatedCost = calculator.costForRegion("LATAM");

   // Then the shipping cost is 200
   assertEquals(200, calculatedCost);

}

public int costForRegion(String name) {
   if (name.equals("NA")) {
       return 100;
   }

   if (name.equals("LATAM")) {
       return 200;
   }

   return 0;

}

public void onEMEARegionTheCostIs300() {
   // Given a shipping calculator
   ShippingCalculator calculator = new ShippingCalculator();

   // When EMEA is the country region
   int calculatedCost = calculator.costForRegion("EMEA");

   // Then the shipping cost is 300
   assertEquals(300, calculatedCost);
}

public int costForRegion(String name) {

if (name.equals("NA")) {

return 100;

}

if (name.equals("LATAM")) {

return 200;

}

if (name.equals("EMEA")) {

return 300;

}

return 0;

}
}
