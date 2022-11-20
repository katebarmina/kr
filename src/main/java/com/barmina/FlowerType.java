package com.barmina;

import java.awt.*;

public class FlowerType {

  private final Color color;
  private final String name;

  public FlowerType(Color color, String name) {
    this.color = color;
    this.name = name;
  }

  public void draw(Graphics g, int x, int y) {
    g.setColor(Color.GREEN);
    g.fillRect(x - 1, y, 2, 5);
    g.setColor(color);
    g.fillOval(x - 5, y - 10, 5, 5);
  }
}
