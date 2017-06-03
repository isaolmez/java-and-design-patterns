package com.isa.patterns.proxy.caching;

import java.util.Arrays;
import java.util.List;

public class ServiceImpl implements Service {

  private int count;

  @Override
  public List<String> getUsers(String country) {
    count++;
    return Arrays.asList("user1", "user2", "user3", "user4", "user5");
  }

  @Override
  public int getAccessCount() {
    return count;
  }
}
