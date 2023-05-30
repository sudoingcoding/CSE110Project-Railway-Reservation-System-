/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.project;

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
public class PassengerTest {
    
    public PassengerTest() {
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
     * Test of getTicket method, of class Passenger.
     */
    @Test
    public void testGetTicket() {
        System.out.println("getTicket");
        Passenger instance = new Passenger();
        ticket expResult = null;
        ticket result = instance.getTicket();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTicket method, of class Passenger.
     */
    @Test
    public void testSetTicket() {
        System.out.println("setTicket");
        ticket ticket = null;
        Passenger instance = new Passenger();
        instance.setTicket(ticket);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Passenger.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Passenger instance = new Passenger();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Passenger.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Passenger instance = new Passenger();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrom method, of class Passenger.
     */
    @Test
    public void testGetFrom() {
        System.out.println("getFrom");
        Passenger instance = new Passenger();
        String expResult = "";
        String result = instance.getFrom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFrom method, of class Passenger.
     */
    @Test
    public void testSetFrom() {
        System.out.println("setFrom");
        String from = "";
        Passenger instance = new Passenger();
        instance.setFrom(from);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTo method, of class Passenger.
     */
    @Test
    public void testGetTo() {
        System.out.println("getTo");
        Passenger instance = new Passenger();
        String expResult = "";
        String result = instance.getTo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTo method, of class Passenger.
     */
    @Test
    public void testSetTo() {
        System.out.println("setTo");
        String to = "";
        Passenger instance = new Passenger();
        instance.setTo(to);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSc method, of class Passenger.
     */
    @Test
    public void testGetSc() {
        System.out.println("getSc");
        Passenger instance = new Passenger();
        Scanner expResult = null;
        Scanner result = instance.getSc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSc method, of class Passenger.
     */
    @Test
    public void testSetSc() {
        System.out.println("setSc");
        Scanner sc = null;
        Passenger instance = new Passenger();
        instance.setSc(sc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPayment method, of class Passenger.
     */
    @Test
    public void testGetPayment() {
        System.out.println("getPayment");
        Passenger instance = new Passenger();
        Payment expResult = null;
        Payment result = instance.getPayment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPayment method, of class Passenger.
     */
    @Test
    public void testSetPayment() {
        System.out.println("setPayment");
        Payment payment = null;
        Passenger instance = new Passenger();
        instance.setPayment(payment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Passenger.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Passenger instance = new Passenger();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTicketSlip method, of class Passenger.
     */
    @Test
    public void testPrintTicketSlip() {
        System.out.println("printTicketSlip");
        Passenger instance = new Passenger();
        instance.printTicketSlip();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
