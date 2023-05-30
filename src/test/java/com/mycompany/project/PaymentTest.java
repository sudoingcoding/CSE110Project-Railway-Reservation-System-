/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.project;

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
public class PaymentTest {
    
    public PaymentTest() {
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
     * Test of getPaymentId method, of class Payment.
     */
    @Test
    public void testGetPaymentId() {
        System.out.println("getPaymentId");
        Payment instance = null;
        String expResult = "";
        String result = instance.getPaymentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaymentId method, of class Payment.
     */
    @Test
    public void testSetPaymentId() {
        System.out.println("setPaymentId");
        String paymentId = "";
        Payment instance = null;
        instance.setPaymentId(paymentId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Payment.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Payment instance = null;
        double expResult = 0.0;
        double result = instance.getAmount();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAmount method, of class Payment.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        double amount = 0.0;
        Payment instance = null;
        instance.setAmount(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPaymentMethod method, of class Payment.
     */
    @Test
    public void testGetPaymentMethod() {
        System.out.println("getPaymentMethod");
        Payment instance = null;
        String expResult = "";
        String result = instance.getPaymentMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPaymentMethod method, of class Payment.
     */
    @Test
    public void testSetPaymentMethod() {
        System.out.println("setPaymentMethod");
        String paymentMethod = "";
        Payment instance = null;
        instance.setPaymentMethod(paymentMethod);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processPayment method, of class Payment.
     */
    @Test
    public void testProcessPayment() {
        System.out.println("processPayment");
        Payment instance = null;
        instance.processPayment();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Payment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Payment instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
