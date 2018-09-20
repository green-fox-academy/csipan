package com.greenfoxacademy.foxclub.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox {

  private String name;
  private String food;
  private String drink;
  private List<String> tricks;

  public Fox() {
    tricks = new ArrayList<>();
  }

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public String getName() {
    return name;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setTricks(List<String> tricks) {
    this.tricks = tricks;
  }

}
