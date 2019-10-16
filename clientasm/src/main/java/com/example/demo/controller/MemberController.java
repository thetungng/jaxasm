package com.example.demo.controller;

import com.example.demo.Service.Member.Member;
import com.example.demo.Service.Member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.rmi.RemoteException;

@Controller
@RequestMapping(value = "/members")
public class MemberController {
    //    @Autowired
//    PasswordEncoder passwordEncoder;
    @Autowired
    MemberService memberService;

    @RequestMapping(method = RequestMethod.GET, value = "/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping(value = "/create")
    public String createMember(Model model) {
        model.addAttribute("member", new Member());
        return "member/form";
    }

    @PostMapping(value = "/create")
    public String addMember(Member member) throws RemoteException {
//        member.setRole("Member");
//        member.setPassword(passwordEncoder.encode(member.getPassword()));
        memberService.register(member);
        return "index";
    }
}