package com.barmina;

import java.awt.*;

public class App {

  private static final int CANVAS_SIZE = 400;
  private static final int FLOWERS_TO_DRAW = 10_000;

  public static void main(String[] args) {

    Field field = new Field();
    for (int i = 0; i < FLOWERS_TO_DRAW; i++) {
      field.plantAFlower(getRandomCoordinate(), getRandomCoordinate(), "Roses", Color.RED);
      field.plantAFlower(getRandomCoordinate(), getRandomCoordinate(), "Iris", Color.PINK);
      field.plantAFlower(getRandomCoordinate(), getRandomCoordinate(), "Sunflower", Color.YELLOW);
      field.plantAFlower(getRandomCoordinate(), getRandomCoordinate(), "Bluebell", Color.BLUE);
    }
    field.setSize(CANVAS_SIZE, CANVAS_SIZE);
    field.setVisible(true);
  }

  private static int getRandomCoordinate() {
    return (int) (Math.random() * ((CANVAS_SIZE) + 1));
  }
}
