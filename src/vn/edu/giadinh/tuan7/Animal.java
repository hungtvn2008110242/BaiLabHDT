package vn.edu.giadinh.tuan7;

public class Animal {
    private String picture;
    private String food;
    private String hunger;
    private String boundaries;
    private String location;

    protected void makeNoise() {
        System.out.println("Dang keu");
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(String boundaries) {
        this.boundaries = boundaries;
    }

    public String getHunger() {
        return hunger;
    }

    public void setHunger(String hunger) {
        this.hunger = hunger;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    protected void eat() {
        System.out.println("Dang an");
    }

    protected void sleep() {
        System.out.println("Dang ngu!!!");
    }

    protected void roam() {
        System.out.println("Dang Di dao ");
    }

}
