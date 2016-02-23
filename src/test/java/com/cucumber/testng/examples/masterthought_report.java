//package com.cucumber.testng.examples;
//
//import net.masterthought.cucumber.ReportBuilder;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by amit.rawat on 28/12/15.
// */
//public class masterthought_report {
//    public static void main(String args[]) throws IOException {
//        File reportOutputDirectory = new File("target");
//        List<String> list = new ArrayList<String>();
//        list.add("cucumber.json");
////        list.add("cucumber-report2.json");
//
//        String pluginUrlPath = "";
//        String buildNumber = "1";
//        String buildProject = "cucumber-jvm";
//        boolean skippedFails = true;
//        boolean pendingFails = true;
//        boolean undefinedFails = true;
//        boolean missingFails = true;
//        boolean flashCharts = true;
//        boolean runWithJenkins = false;
//        boolean highCharts = false;s
//        boolean parallelTesting = false;
//
//        ReportBuilder reportBuilder = new ReportBuilder(list, reportOutputDirectory, pluginUrlPath, buildNumber,
//                buildProject, skippedFails, pendingFails, undefinedFails, missingFails, flashCharts, runWithJenkins,
//                highCharts, parallelTesting);
//        reportBuilder.generateReports();
//    }
//}
