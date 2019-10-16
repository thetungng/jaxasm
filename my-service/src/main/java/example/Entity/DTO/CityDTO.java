package example.Entity.DTO;

import example.Entity.City;

public class CityDTO {
    private String id;
    private String name;
    public CityDTO() {
    }

    public CityDTO(City city) {
        this.id = String.valueOf(city.getId());
        this.name = city.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
