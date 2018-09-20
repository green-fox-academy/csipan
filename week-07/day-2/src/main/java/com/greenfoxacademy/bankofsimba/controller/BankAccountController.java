package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

  BankAccount bankAccount = new BankAccount("Simba", 2000, "Lion");
  String showMan = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

  List<BankAccount> accounts = allBankAccount();

  public List<BankAccount> allBankAccount() {
    List<BankAccount> allAccount = new ArrayList<>();
    allAccount.add(new BankAccount("Simba", 2000, "Lion"));
    allAccount.add(new BankAccount("Timon", 1000, "Meerkat"));
    allAccount.add(new BankAccount("Pumba", 1000, "Warthog"));
    allAccount.add(new BankAccount("Rafiki", 1500, "Mandrill"));
    allAccount.add(new BankAccount("Zordon", -500, "Lion"));
    allAccount.add(new BankAccount("Zazu", 500, "Red-billed hornbill"));
  return allAccount;
  }

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

  @GetMapping(value = "/all")
  public String kingOrNot(Model model) {
    for (BankAccount account : accounts) {
      if (account.getAnimalType().equals("Lion")) {
        account.setKing(true);
      }
      if (account.getBalance() >= 1500) {
        account.setGood(true);
      }
    }
    model.addAttribute("allaccount", accounts);
    return "all";
  }
}
