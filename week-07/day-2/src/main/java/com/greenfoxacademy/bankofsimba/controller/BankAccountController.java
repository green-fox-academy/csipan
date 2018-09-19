package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class BankAccountController {

  BankAccount bankAccount = new BankAccount("Simba", 2000, "Lion");
  ArrayList<BankAccount> allAccount = new ArrayList<>();
  String showMan = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

  @RequestMapping(value = "/show")
  public String bankAccount(Model model) {
//    bankAccount.add(new BankAccount("Simba", 2000, "Lion"));
    model.addAttribute("bankaccount", bankAccount);
    return "show";
  }

  @RequestMapping(value = "/showhtml")
  public String showMan(Model model) {
    model.addAttribute("showman", showMan);
    model.addAttribute("bankaccount", bankAccount);
    return "show";
  }

  @RequestMapping(value = "/all")
  public String allAccount(Model model) {
    allAccount.add(new BankAccount("Simba", 2000, "Lion"));
    allAccount.add(new BankAccount("Timon", 1000, "Meerkat"));
    allAccount.add(new BankAccount("Pumba", 1000, "Warthog"));
    allAccount.add(new BankAccount("Rafiki", 1500, "Mandrill"));
    allAccount.add(new BankAccount("Zazu", 500, "Red-billed hornbill"));
    model.addAttribute("allaccount", allAccount);
    return "all";
  }
}
