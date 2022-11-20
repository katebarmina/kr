package com.barmina;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FlowerTypeFactory {

  private static final Map<String, FlowerType> flowerTypeCache = new HashMap<>();

  public static FlowerType getFlowerType(Color color, String name) {
    return Optional.ofNullable(flowerTypeCache.get(name))
        .orElseGet(
            () -> {
              FlowerType type = new FlowerType(color, name);
              flowerTypeCache.put(name, type);
              return type;
            });
  }
}
