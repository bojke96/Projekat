package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;

public class CarInformationPage extends BasePage {

    public CarInformationPage verifyBrand(String brand){
     String realCarBrand = getElementText(Locators.getCarInformation("Marka"));
        Assertions.assertEquals(brand, realCarBrand, "Car brand is not as expected" );
        return this;
    }

    public CarInformationPage verifyFuelType(String fuelType){
        String realFuelType = getElementText(Locators.getCarInformation("Gorivo"));
        Assertions.assertEquals(fuelType, realFuelType, "Fuel type is not as expected" );
        return this;
    }

    public CarInformationPage verifyModel(String model){
        String realModel = getElementText(Locators.getCarInformation("Model"));
        Assertions.assertEquals(model, realModel, "Model is not as expected" );
        return this;
    }

    public CarInformationPage verifyProductionYear(int yearFrom, int yearTo){
        String realProductionYear = getElementText(Locators.getCarInformation("Godište"));
        realProductionYear.replace(".","");
        boolean isYearValid;
        int productionYear = Integer.parseInt(realProductionYear, 10);
        if(productionYear >= yearFrom && productionYear <= yearTo){
            isYearValid = true;
        }
        else {
            isYearValid = false;
        }
        Assertions.assertTrue(isYearValid, "Year is not as expected");
        return this;
    }


}
