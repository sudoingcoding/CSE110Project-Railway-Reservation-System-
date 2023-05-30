/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.project;

import java.util.Date;
import java.util.Scanner;
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
public class ticketTest {
    
    public ticketTest() {
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
     * Test of getTicketnumber method, of class ticket.
     */
    @Test
    public void testGetTicketnumber() {
        System.out.println("getTicketnumber");
        ticket instance = new ticketImpl();
        int expResult = 0;
        int result = instance.getTicketnumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicketnumber method, of class ticket.
     */
    @Test
    public void testSetTicketnumber() {
        System.out.println("setTicketnumber");
        int ticketnumber = 0;
        ticket instance = new ticketImpl();
        instance.setTicketnumber(ticketnumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTravellingclass method, of class ticket.
     */
    @Test
    public void testGetTravellingclass() {
        System.out.println("getTravellingclass");
        ticket instance = new ticketImpl();
        String expResult = "";
        String result = instance.getTravellingclass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTravellingclass method, of class ticket.
     */
    @Test
    public void testSetTravellingclass() {
        System.out.println("setTravellingclass");
        String travellingclass = "";
        ticket instance = new ticketImpl();
        instance.setTravellingclass(travellingclass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateofjourny method, of class ticket.
     */
    @Test
    public void testGetDateofjourny() {
        System.out.println("getDateofjourny");
        ticket instance = new ticketImpl();
        Date expResult = null;
        Date result = instance.getDateofjourny();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateofjourny method, of class ticket.
     */
    @Test
    public void testSetDateofjourny() throws Exception {
        System.out.println("setDateofjourny");
        String whichDate = "";
        ticket instance = new ticketImpl();
        instance.setDateofjourny(whichDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSitNo method, of class ticket.
     */
    @Test
    public void testGetSitNo() {
        System.out.println("getSitNo");
        ticket instance = new ticketImpl();
        String expResult = "";
        String result = instance.getSitNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSitNo method, of class ticket.
     */
    @Test
    public void testSetSitNo() {
        System.out.println("setSitNo");
        String sitNo = "";
        ticket instance = new ticketImpl();
        instance.setSitNo(sitNo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSc method, of class ticket.
     */
    @Test
    public void testGetSc() {
        System.out.println("getSc");
        ticket instance = new ticketImpl();
        Scanner expResult = null;
        Scanner result = instance.getSc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSc method, of class ticket.
     */
    @Test
    public void testSetSc() {
        System.out.println("setSc");
        Scanner sc = null;
        ticket instance = new ticketImpl();
        instance.setSc(sc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class ticket.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        ticket instance = new ticketImpl();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ticketImpl extends ticket {
    }
    
}
