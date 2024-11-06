package vn.edu.usth.planetapp;

// This class acting as a Model class for our ListView
public class Planet {
    // Attributes
    private String planetName, moonCount;
    private Integer planetImg;

    // Constructor
    public Planet(String planetName, String moonCount, Integer planetImg) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImg = planetImg;
    }

    // Getter, Setter
    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public Integer getPlanetImg() {
        return planetImg;
    }

    public void setPlanetImg(Integer planetImg) {
        this.planetImg = planetImg;
    }
}
