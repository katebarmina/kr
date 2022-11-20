package com.barmina;

import java.awt.*;

public class Flower {
  private final int x;
  private final int y;
  private final FlowerType type;

  public Flower(int x, int y, FlowerType type) {
    this.x = x;
    this.y = y;
    this.type = type;
  }

  public void draw(Graphics graphics) {
    type.draw(graphics, x, y);
  }
}
