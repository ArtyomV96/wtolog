/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winecatalog.object;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wans8
 */
public class FilterObject {
    
    List<String> sugarFilter;
    List<String> typeList;
    List<String> grapeList;
    List<String> countryList;

    public List<String> getSugarFilter() {
        return sugarFilter;
    }

    public void setSugarFilter(List<String> sugarFilter) {
        this.sugarFilter = sugarFilter;
    }

    public List<String> getTypeList() {
        return typeList;
    }

    public void setTypeList(List<String> typeList) {
        this.typeList = typeList;
    }

    public List<String> getGrapeList() {
        return grapeList;
    }

    public void setGrapeList(List<String> grapeList) {
        this.grapeList = grapeList;
    }

    public List<String> getCountryList() {
        return countryList;
    }

    public void setCountryList(List<String> countryList) {
        this.countryList = countryList;
    }

      
    
    
    
}
