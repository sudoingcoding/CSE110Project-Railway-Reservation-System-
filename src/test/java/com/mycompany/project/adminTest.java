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
public class adminTest {
    
    public adminTest() {
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
     * Test of getId method, of class admin.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        admin instance = new admin();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class admin.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        admin instance = new admin();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPass method, of class admin.
     */
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        admin instance = new admin();
        String expResult = "";
        String result = instance.getPass();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPass method, of class admin.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String Pass = "";
        admin instance = new admin();
        instance.setPass(Pass);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class admin.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        admin instance = new admin();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class admin.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        admin instance = new admin();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class admin.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        admin instance = new admin();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class admin.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        admin instance = new admin();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class admin.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        admin instance = new admin();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerifyLogin method, of class admin.
     */
    @Test
    public void testVerifyLogin() {
        System.out.println("VerifyLogin");
        String name = "";
        String password = "";
        admin instance = new admin();
        boolean expResult = false;
        boolean result = instance.VerifyLogin(name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class admin.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String name = "";
        admin instance = new admin();
        instance.search(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class admin.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        String name = "";
        admin instance = new admin();
        instance.edit(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
