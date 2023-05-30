/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.project;

import java.util.ArrayList;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class TrainTest {
    
    public TrainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Train.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Train instance = new Train();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Train.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Train instance = new Train();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSeat method, of class Train.
     */
    @Test
    public void testGetSeat() {
        System.out.println("getSeat");
        Train instance = new Train();
        int expResult = 0;
        int result = instance.getSeat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSeat method, of class Train.
     */
    @Test
    public void testSetSeat() {
        System.out.println("setSeat");
        int seat = 0;
        Train instance = new Train();
        instance.setSeat(seat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharge method, of class Train.
     */
    @Test
    public void testGetCharge() {
        System.out.println("getCharge");
        Train instance = new Train();
        int expResult = 0;
        int result = instance.getCharge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCharge method, of class Train.
     */
    @Test
    public void testSetCharge() {
        System.out.println("setCharge");
        int charge = 0;
        Train instance = new Train();
        instance.setCharge(charge);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassengers method, of class Train.
     */
    @Test
    public void testGetPassengers() {
        System.out.println("getPassengers");
        Train instance = new Train();
        ArrayList<Passenger> expResult = null;
        ArrayList<Passenger> result = instance.getPassengers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassengers method, of class Train.
     */
    @Test
    public void testSetPassengers() {
        System.out.println("setPassengers");
        ArrayList<Passenger> passengers = null;
        Train instance = new Train();
        instance.setPassengers(passengers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoardingPoint method, of class Train.
     */
    @Test
    public void testGetBoardingPoint() {
        System.out.println("getBoardingPoint");
        Train instance = new Train();
        String expResult = "";
        String result = instance.getBoardingPoint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBoardingPoint method, of class Train.
     */
    @Test
    public void testSetBoardingPoint() {
        System.out.println("setBoardingPoint");
        String boardingPoint = "";
        Train instance = new Train();
        instance.setBoardingPoint(boardingPoint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeparturePoint method, of class Train.
     */
    @Test
    public void testGetDeparturePoint() {
        System.out.println("getDeparturePoint");
        Train instance = new Train();
        String expResult = "";
        String result = instance.getDeparturePoint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeparturePoint method, of class Train.
     */
    @Test
    public void testSetDeparturePoint() {
        System.out.println("setDeparturePoint");
        String departurePoint = "";
        Train instance = new Train();
        instance.setDeparturePoint(departurePoint);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBoardingTime method, of class Train.
     */
    @Test
    public void testGetBoardingTime() {
        System.out.println("getBoardingTime");
        Train instance = new Train();
        Date expResult = null;
        Date result = instance.getBoardingTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBoardingTime method, of class Train.
     */
    @Test
    public void testSetBoardingTime() {
        System.out.println("setBoardingTime");
        Date boardingTime = null;
        Train instance = new Train();
        instance.setBoardingTime(boardingTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDepatureTime method, of class Train.
     */
    @Test
    public void testGetDepatureTime() {
        System.out.println("getDepatureTime");
        Train instance = new Train();
        Date expResult = null;
        Date result = instance.getDepatureTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDepatureTime method, of class Train.
     */
    @Test
    public void testSetDepatureTime() {
        System.out.println("setDepatureTime");
        Date depatureTime = null;
        Train instance = new Train();
        instance.setDepatureTime(depatureTime);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Train.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Train instance = new Train();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPassenger method, of class Train.
     */
    @Test
    public void testAddPassenger() {
        System.out.println("addPassenger");
        Passenger p = null;
        Train instance = new Train();
        instance.addPassenger(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
