package com.greenfoxacademy.foxclub.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxPack {
  private List<Fox> foxes;

  @Autowired
  public FoxPack() {
    foxes = new ArrayList<>();
  }

  public void createFoxByName(String name) {
    Fox fox = new Fox();
    fox.setName(name);
    foxes.add(fox);
  }

  public boolean isOrNotTheFoxInThePack(String name) {
    for (int i = 0; i < foxes.size() ; i++) {
      if (name.equals(foxes.get(i).getName())) {
        return true;
      }
    }
    return false;
  }

//  public Fox giveTheFoxFromPackByName(String name) {
//
//  }
}
