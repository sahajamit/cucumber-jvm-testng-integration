package com.cucumber.testng.examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

/**
 * Created by amit.rawat on 21/12/15.
 */
public class BaseTestCase {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This is beforeSuite of Base Test Case");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This is afterSuite of Base Test Case");
    }
    @BeforeClass
    public void beforeClass() {
        System.out.println("This is beforeClass of Base Test Case");
    }
//
//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("This is beforeMethod of Base Test Case");
//    }
}
