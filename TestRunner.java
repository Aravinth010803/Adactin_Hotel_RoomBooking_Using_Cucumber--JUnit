package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",snippets=SnippetType.CAMELCASE,glue="org.stepdefinition",
plugin= {"pretty","html:\\src\\test\\resources\\Reports","junit:src\\test\\resources\\Reports\\ReportsXML.xml","json:src\\test\\resources\\Reports\\ReportJSON.json"})
public class TestRunner {

}
