package com.barmina;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Field extends JFrame {

  private final List<Flower> flowers = new ArrayList<>();

  public void plantAFlower(int x, int y, String name, Color color) {
    FlowerType flowerType = FlowerTypeFactory.getFlowerType(color, name);
    Flower flower = new Flower(x, y, flowerType);
    flowers.add(flower);
  }

  @Override
  public void paint(Graphics graphics) {
    for (Flower flower : flowers) {
      flower.draw(graphics);
    }
  }
}
