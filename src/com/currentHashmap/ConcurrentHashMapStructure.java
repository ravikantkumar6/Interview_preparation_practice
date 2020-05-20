package com.currentHashmap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapStructure {

    public static void main(String[] args) {
        Country india = new Country("India", 1000);
        Country japan = new Country("Japan", 10000);
        Country france = new Country("France", 2000);
        Country russia = new Country("Russia", 20000);
        ConcurrentHashMap<Country, String> countryCapitalMap = new ConcurrentHashMap<Country, String>();
        countryCapitalMap.put(india, "Delhi");
        countryCapitalMap.put(japan, "Tokyo");
        countryCapitalMap.put(france, "Paris");
        countryCapitalMap.put(russia, "Moscow");

        Iterator<Country> countryCapitalIterator = countryCapitalMap.keySet().iterator();
        while (countryCapitalIterator.hasNext()) {
            Country countryObject = countryCapitalIterator.next();
            String capital = countryCapitalMap.get(countryObject);
            System.out.println(countryObject.getName() + "-->" + capital);
        }
    }
}
