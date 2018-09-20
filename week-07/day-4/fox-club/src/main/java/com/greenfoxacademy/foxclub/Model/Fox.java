package com.greenfoxacademy.foxclub.Model;

import org.springframework.stereotype.Component;

@Component
public class Fox {

  private String name;
  private String food;
  private String drink;
  private long numberOfTricks;

  public void setName(String name) {
    this.name = name;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void setNumberOfTricks(long numberOfTricks) {
    this.numberOfTricks = numberOfTricks;
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

  public long getNumberOfTricks() {
    return numberOfTricks;
  }

  public Fox(){

  }

  public Fox(String name, String food, String drink, long numberOfTricks) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    this.numberOfTricks = numberOfTricks;
  }
}
