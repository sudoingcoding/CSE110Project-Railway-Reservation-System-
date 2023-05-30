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
public class RailwaySystemTest {
    
    public RailwaySystemTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
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
     * Test of search method, of class RailwaySystem.
     */
    @org.junit.jupiter.api.Test
    public void testSearch() {
        System.out.println("search");
        String name = "";
        RailwaySystem instance = new RailwaySystemImpl();
        instance.search(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class RailwaySystem.
     */
    @org.junit.jupiter.api.Test
    public void testEdit() {
        System.out.println("edit");
        String name = "";
        RailwaySystem instance = new RailwaySystemImpl();
        instance.edit(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RailwaySystemImpl implements RailwaySystem {

        public void search(String name) {
        }

        public void edit(String name) {
        }
    }

    /**
     * Test of getName method, of class RailwaySystem.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        RailwaySystem instance = new RailwaySystemImpl();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RailwaySystemImpl implements RailwaySystem {

        public String getName() {
            return "";
        }
    }
    
}
