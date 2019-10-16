package example;

import example.Service.*;

import javax.xml.ws.Endpoint;

public class MainApplication {
    public static void main(String[] argv) {
        String placeService = "http://localhost:9000/place_service";
        String cityService = "http://localhost:9000/city_service";
        String districtService = "http://localhost:9000/district_service";
        String memberService = "http://localhost:9000/member_service";
        String commentService = "http://localhost:9000/comment_service";
        String ratingService = "http://localhost:9000/rating_service";
        Endpoint.publish(placeService, new PlaceService());
        Endpoint.publish(cityService, new CityService());
        Endpoint.publish(districtService, new DistrictService());
        Endpoint.publish(memberService, new MemberService());
        Endpoint.publish(commentService, new CommentService());
        Endpoint.publish(ratingService, new RatingService());
    }
}
