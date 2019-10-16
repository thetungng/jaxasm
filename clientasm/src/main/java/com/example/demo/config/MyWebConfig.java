package com.example.demo.config;

//import com.example.demo.Service.City.CityService;
//import com.example.demo.Service.City.CityServiceServiceLocator;
//import com.example.demo.Service.Comment.RatingService;
//import com.example.demo.Service.Comment.RatingServiceServiceLocator;
//import com.example.demo.Service.District.DistrictService;
//import com.example.demo.Service.District.DistrictServiceServiceLocator;
//import com.example.demo.Service.Member.MemberService;
//import com.example.demo.Service.Member.MemberServiceServiceLocator;
//import com.example.demo.Service.Place.PlaceService;
//import com.example.demo.Service.Place.PlaceServiceServiceLocator;

import com.example.demo.Service.City.CityService;
import com.example.demo.Service.City.CityServiceServiceLocator;
import com.example.demo.Service.District.DistrictService;
import com.example.demo.Service.District.DistrictServiceServiceLocator;
import com.example.demo.Service.Member.MemberService;
import com.example.demo.Service.Member.MemberServiceServiceLocator;
import com.example.demo.Service.Place.PlaceService;
import com.example.demo.Service.Place.PlaceServiceServiceLocator;
import com.example.demo.Service.Rating.RatingService;
import com.example.demo.Service.Rating.RatingServiceServiceLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.rpc.ServiceException;

@Configuration
public class MyWebConfig {

    @Bean
    CityService city() throws ServiceException {
        return new CityServiceServiceLocator().getCityServicePort();
    }

    @Bean
    DistrictService district() throws ServiceException {
        return new DistrictServiceServiceLocator().getDistrictServicePort();
    }

    @Bean
    PlaceService placeService() throws ServiceException {
        return new PlaceServiceServiceLocator().getPlaceServicePort();
    }

    @Bean
    MemberService member() throws ServiceException {
        return new MemberServiceServiceLocator().getMemberServicePort();
    }

    @Bean
    RatingService comment() throws ServiceException {
        return new RatingServiceServiceLocator().getRatingServicePort();
    }
}
