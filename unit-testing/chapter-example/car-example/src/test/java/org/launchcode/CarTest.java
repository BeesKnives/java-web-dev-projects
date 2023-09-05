package org.launchcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car testCar;
    @BeforeEach
    public void createCarObject(){
        testCar = new Car("Nissan", "Versa", 10, 9001);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception


    @Test
    public void testInitialGasTank(){
        double gas = testCar.getGasTankLevel();
        assertFalse(gas == 0);
    }

}