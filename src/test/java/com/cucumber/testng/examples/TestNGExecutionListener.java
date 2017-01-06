package com.cucumber.testng.examples;

import org.testng.IExecutionListener;

public class TestNGExecutionListener implements IExecutionListener
{
    @Override
    public void onExecutionStart() {
        System.out.println("TestNG is staring the execution ...");
    }

    @Override
    public void onExecutionFinish()
    {
        System.out.println("Generating the Report ...");
        GenerateReport.generateReport();
        System.out.println("TestNG has finished the execution.");
    }
}
