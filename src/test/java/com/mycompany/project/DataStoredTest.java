/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.project;

import java.util.ArrayList;
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
public class DataStoredTest {
    
    public DataStoredTest() {
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
     * Test of enteringFlie method, of class DataStored.
     */
    @Test
    public void testEnteringFlie() throws Exception {
        System.out.println("enteringFlie");
        ArrayList<? extends RailwaySystem> list = null;
        String fileName = "";
        DataStored instance = new DataStored();
        instance.enteringFlie(list, fileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of releasingFlie method, of class DataStored.
     */
    @Test
    public void testReleasingFlie() throws Exception {
        System.out.println("releasingFlie");
        String fileName = "";
        DataStored instance = new DataStored();
        ArrayList<? extends RailwaySystem> expResult = null;
        ArrayList<? extends RailwaySystem> result = instance.releasingFlie(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
