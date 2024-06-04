package Core;

import org.openqa.selenium.By;

public class Locators {

    public static String DEMO_QA_SECTION = "//h5[text()='%ARG%']//parent::div";

    public static String SPAN_ELEMENT_BY_TEXT ="//span[text()='%ARG%']";

    public static String ELEMENT_LIST_SHOWN ="//div[@class='element-list collapse show']";


    public static String INPUT_BY_ID = "//input[@id='%ARG%']";

    public static String HEADER_SAMPLE_PAGE = "//h1[@id='sampleHeading']";

    public static String NEW_TAB_BUTTON = "//button[@id='tabButton']";

    public static String NEW_WINDOW_BUTTON = "//button[@id='windowButton']";

    public static By brandSearchField = By.xpath("//div[@class='SumoSelect sumo_brand']//input");

    public static By setBrand(String brandName){
        String brandSearchLocator = "//div[contains(@class,'open')]//li//label[text()='****']";
        brandSearchLocator.replace("****",brandName);
        return By.xpath(brandSearchLocator);
    }
    public static By setModel(String modelName){
        String modelSearchLocator = "//div[contains(@class,'open')]//li//label[text()='****']";
        modelSearchLocator.replace("****",modelName);
        return By.xpath(modelSearchLocator);
    }

    public static By modelSearchField = By.xpath("//div[@class='SumoSelect sumo_model']//input");

    public static By yearFromMenu = By.xpath("//div[@class='SumoSelect sumo_year_from']");

    public static By yearToMenu = By.xpath("//div[@class='SumoSelect sumo_year_to']");

    public static By selectYear = By.xpath("//div[contains(@class,'open')]//li//label[text()='**** god.']");

    public static By setYearInLocator(String year){
       String yearLocator = "//div[contains(@class,'open')]//li//label[text()='**** god.']";
       yearLocator.replace("****",year);
       return By.xpath(yearLocator);
    }
    public static By fuelTypeMenu = By.xpath("//div[@class='SumoSelect sumo_fuel']");

    public static By fuelTypeDizel = By.xpath("//div[@class='SumoSelect sumo_fuel open']//li//label[text() = 'Dizel']");

    public static By setFuelType(String fuelType){
        String fuelTypeLocator = "//div[@class='SumoSelect sumo_fuel open']//li//label[text() = '****']";
        fuelTypeLocator.replace("****",fuelType);
        return By.xpath(fuelTypeLocator);
    }

    public static By setRegion(String region){
        String regionLocator = "//div[contains(@class,'open')]//li//label[text()='****']";
        regionLocator.replace("****",region);
        return By.xpath(regionLocator);
    }

    public static By regionMenu = By.xpath("//div[@class='SumoSelect sumo_region']");

    public static By searchButton = By.xpath("//button[@name='submit_1']");

    public static By searchSecondPage = By.xpath("(//a[text()='2'])[1]");

    public static By sortOrderMenu = By.xpath("(//div[@class='SumoSelect sumo_sortOrder'])[1]");

    public static By priceDescendingSort = By.xpath("//div[contains(@class,'open')]//li//label[text()='ceni silazno']");

    public static By setSortType(String sortType){
        String sortTypeLocator = "//div[contains(@class,'open')]//li//label[text()='****']";
        sortTypeLocator.replace("****",sortType);
        return By.xpath(sortTypeLocator);
    }

    public static By secondSearchResult = By.xpath("(//article)[2]");

    public static By getCarInformation = By.xpath("//div[text() = 'Marka']//following-sibling::div");

    public static By getCarInformation(String information){
        String carInformationLocator = "//div[text() = 'Marka']//following-sibling::div";
        carInformationLocator.replace("****",information);
        return By.xpath(carInformationLocator);
    }







    }





