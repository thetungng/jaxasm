package example.Entity.DTO;

import example.Entity.Place;

public class PlaceDTO {
    private String id;
    private String name;
    private String images;
    private Object cityDTO;
    private Object districtDTO;
    private Object commentDTOList;
    private int countRate;
    private Object memberDTO;

    public PlaceDTO() {
    }

    public PlaceDTO(Place place, Object cityDTO, Object districtDTO, Object commentDTOList, int countRate, Object memberDTO) {
        this.id = String.valueOf(place.getId());
        this.name = place.getName();
        this.images = place.getImages();
        this.cityDTO = cityDTO;
        this.districtDTO = districtDTO;
        this.commentDTOList = commentDTOList;
        this.countRate = countRate;
        this.memberDTO = memberDTO;
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

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Object getCityDTO() {
        return cityDTO;
    }

    public void setCityDTO(Object cityDTO) {
        this.cityDTO = cityDTO;
    }

    public Object getDistrictDTO() {
        return districtDTO;
    }

    public void setDistrictDTO(Object districtDTO) {
        this.districtDTO = districtDTO;
    }

    public Object getCommentDTOList() {
        return commentDTOList;
    }

    public void setCommentDTOList(Object commentDTOList) {
        this.commentDTOList = commentDTOList;
    }

    public int getCountRate() {
        return countRate;
    }

    public void setCountRate(int countRate) {
        this.countRate = countRate;
    }

    public Object getMemberDTO() {
        return memberDTO;
    }

    public void setMemberDTO(Object memberDTO) {
        this.memberDTO = memberDTO;
    }
}
