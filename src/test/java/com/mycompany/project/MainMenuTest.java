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
public class MainMenuTest {
    
    public MainMenuTest() {
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
     * Test of firstMenu method, of class MainMenu.
     */
    @Test
    public void testFirstMenu() throws Exception {
        System.out.println("firstMenu");
        MainMenu instance = new MainMenu();
        instance.firstMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of adminMenu method, of class MainMenu.
     */
    @Test
    public void testAdminMenu() throws Exception {
        System.out.println("adminMenu");
        MainMenu instance = new MainMenu();
        instance.adminMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userMenu method, of class MainMenu.
     */
    @Test
    public void testUserMenu() throws Exception {
        System.out.println("userMenu");
        MainMenu instance = new MainMenu();
        instance.userMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of trainMenu method, of class MainMenu.
     */
    @Test
    public void testTrainMenu() {
        System.out.println("trainMenu");
        MainMenu instance = new MainMenu();
        instance.trainMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of search method, of class MainMenu.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        ArrayList<? extends RailwaySystem> arr = null;
        String name = "";
        MainMenu instance = new MainMenu();
        instance.search(arr, name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of edit method, of class MainMenu.
     */
    @Test
    public void testEdit() {
        System.out.println("edit");
        MainMenu instance = new MainMenu();
        instance.edit();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
