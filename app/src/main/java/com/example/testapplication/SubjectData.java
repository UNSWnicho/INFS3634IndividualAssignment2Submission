package com.example.testapplication;

public class SubjectData {
    String Name;
    String Location;
    String Timezone;
    String Rating;
    String Link;
    String Image;
    String Map;
    String Desc;

    // Subject Data Constructor
    public SubjectData(String name, String location, String timezone, String rating, String link, String image, String map, String desc) {
        this.Name = name;
        this.Location = location;
        this.Timezone = timezone;
        this.Rating = rating;
        this.Link = link;
        this.Image = image;
        this.Map = map;
        this.Desc = desc;
    }

    // Getters & Setters
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getTimezone() {
        return Timezone;
    }

    public void setTimezone(String timezone) {
        Timezone = timezone;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getMap() {
        return Map;
    }

    public void setMap(String map) {
        Map = map;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
}
