package com.cucumber.testng.examples;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import org.apache.log4j.LogManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.apache.log4j.LogManager.*;

/**
 * https://github.com/damianszczepanik/cucumber-reporting
 */
public class GenerateReport
{
    static Reportable result;

    private GenerateReport()
    {
        // do nothing
    }

    public static void generateReport()
    {
        try
        {
            File reportOutputDirectory = new File("target");
            List<String> jsonFiles = new ArrayList<>();
            jsonFiles.add("target/cucumber1.json");
            jsonFiles.add("target/cucumber2.json");

            boolean runWithJenkins = false;
            boolean parallelTesting = false;
            String buildNumber = "1";
            String projectName = "Project Name";

            Configuration configuration = new Configuration(reportOutputDirectory, projectName);

            configuration.setParallelTesting(parallelTesting);
            configuration.setRunWithJenkins(runWithJenkins);
            configuration.setBuildNumber(buildNumber);

            configuration.addClassifications("Platform", "Windows");
            configuration.addClassifications("Browser", "Firefox");
            configuration.addClassifications("Branch", "release/1.0");

            ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
            result = reportBuilder.generateReports();

            Logger logger = Logger.getAnonymousLogger();
            File r = new File("target/cucumber-html-reports/overview-features.html");
            logger.info("Report location: (" + r.getAbsolutePath() + ":0)");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void validateReport()
    {
        // nothing yet
    }

}
