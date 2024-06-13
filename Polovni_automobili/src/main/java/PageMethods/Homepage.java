package PageMethods;

import Core.BasePage;
import Core.Locators;

public class Homepage extends BasePage {

    public Homepage openBrandMenu(){
        clickOnElement(Locators.brandSearch);
        return this;
    }
    public Homepage openModelMenu(){
        clickOnElement(Locators.modelSearch);
        return this;
    }



    public Homepage selectBrand(String brandName){
        typeText(brandName,Locators.brandSearchField);
        clickOnElement(Locators.setBrand(brandName));
        return this;
    }

    public Homepage selectModel(String modelName){
        typeText(modelName,Locators.modelSearchField);
        clickOnElement(Locators.setModel(modelName));
        return this;
    }

    public Homepage selectYearFrom(int yearFrom){
        clickOnElement(Locators.yearFromMenu);
        clickOnElement(Locators.setYearInLocator(Integer.toString(yearFrom)));
        return this;
    }

    public Homepage selectYearTo(int yearTo){
        clickOnElement(Locators.yearToMenu);
        clickOnElement(Locators.setYearInLocator(Integer.toString(yearTo)));
        return this;
    }

    public Homepage selectFuelType(String fuelType){
        clickOnElement(Locators.fuelTypeMenu);
        clickOnElement(Locators.setFuelType(fuelType));
        return this;
    }

    public Homepage selectRegion(String region){
        clickOnElement(Locators.regionMenu);
        clickOnElement(Locators.setRegion(region));
        return this;
    }

    public SearchResults search(){
        clickOnElement(Locators.searchButton);
        return new SearchResults();
    }




}
