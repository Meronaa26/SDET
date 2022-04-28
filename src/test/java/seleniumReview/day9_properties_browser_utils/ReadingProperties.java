package seleniumReview.day9_properties_browser_utils;

import org.testng.annotations.Test;
import seleniumReview.utilites.ConfigurationReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_propertiesFile() throws IOException {

        //1==> create object of properties class(coming from java)

        Properties properties = new Properties();  //comes with methods that can read from properties file


        //2==> Open the file using FileInputStream
        FileInputStream file= new FileInputStream("configuration.properties");  // in here I had file no found exception

        //Load the properties object with our file
        properties.load(file);   // in here I had IoException

        //reading from configuration.properties
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


    }

    @Test
    public void using_properties_method(){

        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
    }
}
