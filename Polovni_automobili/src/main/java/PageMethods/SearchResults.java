package PageMethods;

import Core.BasePage;
import Core.Locators;

public class SearchResults extends BasePage {

    public SearchResults sortSearch(String sortType){
       clickOnElement(Locators.sortOrderMenu);
       clickOnElement(Locators.setSortType(sortType));
       return this;
    }

    public SearchResults selectSecondSearchPage(){
        clickOnElement(Locators.searchSecondPage);
        return this;
    }

    public CarInformationPage selectSearchResult(){
        clickOnElement(Locators.secondSearchResult);
        return new CarInformationPage();
    }
}
