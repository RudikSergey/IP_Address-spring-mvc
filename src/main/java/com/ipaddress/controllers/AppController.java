package com.ipaddress.controllers;

import com.ipaddress.entity.*;
import com.ipaddress.service.IpAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private IpAddressService ipAddressService;

    @RequestMapping("/")
    public String showAllIpAddress(Model model) {
        List<IpAddress> allIpAddress = ipAddressService.getAllIpAddress();
        model.addAttribute("allIp", allIpAddress);

        List<IpAddressTwo> allIpAddressTwo = ipAddressService.getAllIpAddressTwo();
        model.addAttribute("allIpTwo", allIpAddressTwo);

        List<IpAddressThree> allIpAddressThree = ipAddressService.getAllIpAddressThree();
        model.addAttribute("allIpThree", allIpAddressThree);

        List<IpAddressFour> allIpAddressFour = ipAddressService.getAllIpAddressFour();
        model.addAttribute("allIpFour", allIpAddressFour);

        List<IpAddressFive> allIpAddressFive = ipAddressService.getAllIpAddressFive();
        model.addAttribute("allIpFive", allIpAddressFive);
        return "ipaddress";
    }

    /*@RequestMapping("addNewIp")//добавление новой строки. сейчас не используется
    public String addNewIp(Model model) {
        IpAddress ipAddress = new IpAddress();
        model.addAttribute("ipAddress", ipAddress);
        return "ip-info";
    }*/

    @RequestMapping("/saveIpAddress")
    public String saveIpAddress(@ModelAttribute("ipAddress") IpAddress ipAddress) {
        ipAddressService.saveIpAddress(ipAddress);
        return "redirect:/";
    }

    @RequestMapping("/saveIpAddressTwo")
    public String saveIpAddressTwo(@ModelAttribute("ipAddressTwo") IpAddressTwo ipAddressTwo) {
        ipAddressService.saveIpAddressTwo(ipAddressTwo);
        return "redirect:/";
    }

    @RequestMapping("/saveIpAddressThree")
    public String saveIpAddressThree(@ModelAttribute("ipAddressThree") IpAddressThree ipAddressThree) {
        ipAddressService.saveIpAddressThree(ipAddressThree);
        return "redirect:/";
    }

    @RequestMapping("/saveIpAddressFour")
    public String saveIpAddressFour(@ModelAttribute("ipAddressFour") IpAddressFour ipAddressFour) {
        ipAddressService.saveIpAddressFour(ipAddressFour);
        return "redirect:/";
    }

    @RequestMapping("/saveIpAddressFive")
    public String saveIpAddressFive(@ModelAttribute("ipAddressFive") IpAddressFive ipAddressFive) {
        ipAddressService.saveIpAddressFive(ipAddressFive);
        return "redirect:/";
    }


    @RequestMapping("/updateInfo")
    public String updateIpAddress(@RequestParam("ipId") int id, Model model) {
        IpAddress ipAddress = ipAddressService.getIpAddress(id);
        model.addAttribute("ipAddress", ipAddress);
        return "ip-info";
    }

    @RequestMapping("/updateInfoTwo")
    public String updateIpAddressTwo(@RequestParam("ipIdTwo") int id, Model model) {
        IpAddressTwo ipAddressTwo = ipAddressService.getIpAddressTwo(id);
        model.addAttribute("ipAddressTwo", ipAddressTwo);
        return "ip-info2";
    }

    @RequestMapping("/updateInfoThree")
    public String updateIpAddressThree(@RequestParam("ipIdThree") int id, Model model) {
        IpAddressThree ipAddressThree = ipAddressService.getIpAddressThree(id);
        model.addAttribute("ipAddressThree", ipAddressThree);
        return "ip-info3";
    }

    @RequestMapping("/updateInfoFour")
    public String updateIpAddressFour(@RequestParam("ipIdFour") int id, Model model) {
        IpAddressFour ipAddressFour = ipAddressService.getIpAddressFour(id);
        model.addAttribute("ipAddressFour", ipAddressFour);
        return "ip-info4";
    }

    @RequestMapping("/updateInfoFive")
    public String updateIpAddressFive(@RequestParam("ipIdFive") int id, Model model) {
        IpAddressFive ipAddressFive = ipAddressService.getIpAddressFive(id);
        model.addAttribute("ipAddressFive", ipAddressFive);
        return "ip-info5";
    }
    /*@RequestMapping("/deleteIp")//удаление строки-сейчас не исползуется
    public String deleteIpAddress(@RequestParam("ipId") int id) {
        ipAddressService.deleteIpAddress(id);
        return "redirect:/";
    }*/
}
