package com.example.demo.controller;

import com.example.demo.Service.Place.Place;
import com.example.demo.Service.Place.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/place")
public class PlaceController {
    @Autowired
    PlaceService placeService;

    //list place
    @GetMapping(value = "/list")
    public String getAllPlace(Model model) throws RemoteException {
        model.addAttribute("list", placeService.getAll());
        return "place/list";
    }

    //add place
    @GetMapping(value = "/add")
    public String showForm(Model model) throws RemoteException {
        model.addAttribute("place", new Place());
        model.addAttribute("cities", placeService.getAllCity());
        return "place/form";
    }

    @PostMapping(value = "/add")
    public String addPlace(Place place) throws RemoteException {
        placeService.store(place);
        return "redirect:/places/list";
    }

    //edit place
    @GetMapping(value = "/edit/{id}")
    public String showInfoEdit(@PathVariable("id") long id, Model model) throws RemoteException {
        Place place = placeService.getById(id);
        model.addAttribute("place", place);
        model.addAttribute("districts", placeService.getAllDistrict());
        model.addAttribute("cities", placeService.getAllCity());
        return "place/edit";
    }

    @PostMapping(value = "/update")
    public String updatePlace(Place place) throws RemoteException {
        placeService.update(place);
        return "redirect:/places/list";
    }

//    //delete place
//    @GetMapping(value = "/delete/{id}")
//    public String deletePlace(@PathVariable("id") long id) throws RemoteException {
//        placeService.delete(id);
//        return "redirect:/places/list";
//    }
}