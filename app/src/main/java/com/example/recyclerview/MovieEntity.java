package com.example.recyclerview;

public class MovieEntity {
    private int id;
    private String title;
    private String synopsis;
    private int year;
    private double rating;

    public MovieEntity() {

    }

    public MovieEntity(int id, String title, String synopsis, int year, double rating) {
        this.id = id;
        this.title = title;
        this.synopsis = synopsis;
        this.year = year;
        this.rating = rating;
    }

    public MovieEntity(String title, String synopsis, int year, double rating) {
        this.title = title;
        this.synopsis = synopsis;
        this.year = year;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MovieEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }
}
