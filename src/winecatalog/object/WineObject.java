/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winecatalog.object;

/**
 *
 * @author wans8
 */
public class WineObject { 
    int id;
    String name;
    String company;
    String country;
    String color;
    String grape;
    String sugar;
    String description;
    String pic;
    int year;
    double alcohol;
    double price;

    public WineObject() {
    }
    
    public WineObject(int id, String name, String company, String country, String color, String grape, String sugar, String description, String pic, int year, double alcohol, double price) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.country = country;
        this.color = color;
        this.grape = grape;
        this.sugar = sugar;
        this.description = description;
        this.pic = pic;
        this.year = year;
        this.alcohol = alcohol;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGrape() {
        return grape;
    }

    public void setGrape(String grape) {
        this.grape = grape;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(double alcohol) {
        this.alcohol = alcohol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
  }
