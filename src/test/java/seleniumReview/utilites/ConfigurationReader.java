package seleniumReview.utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // we will create a re-usable method that will be reading from configuration.reader.file

         //1==> Create properties object
    private static Properties properties =new Properties();


    static {

        try {
            //2==> Load file into fileInputStream
            FileInputStream file= new FileInputStream("configuration.properties");

            //3==>Load properties object with the file(configuration.properties)
            properties.load(file);
        } catch (IOException e) {
            System.out.println("File not Found in configuration properties ");
        }

    }
    //USE THE ABOVE CREATED LOGIC TO CREATE A RE-USABLE METHOD

    public static String getProperty(String keyWord){

        return properties.getProperty(keyWord);
    }


}
