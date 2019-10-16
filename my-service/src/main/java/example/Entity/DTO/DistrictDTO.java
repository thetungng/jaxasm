package example.Entity.DTO;

import example.Entity.District;

public class DistrictDTO {
    private String id;
    private String name;
    public DistrictDTO() {
    }

    public DistrictDTO(District district) {
        this.id = String.valueOf(district.getId());
        this.name = district.getName();
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
