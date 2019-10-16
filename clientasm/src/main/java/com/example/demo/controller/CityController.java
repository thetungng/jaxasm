package com.example.demo.controller;

import com.example.demo.Service.City.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/city")
public class CityController {
    @Autowired
    CityService cityService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllPlace(Model model) throws RemoteException {
        try {
            model.addAttribute("city", cityService.getAll());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "city/list";
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/store")
//    public String create(Model model) {
//        model.addAttribute("City", new City());
//        return "City/store";
//    }
//    @RequestMapping(method = RequestMethod.POST, value = "/store")
//    public String storeAccount(@Valid City City, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "City/store";
//        }
//        cityService.store(City);
//        return "City/store";
//    }


}
