package com.isa.patterns.singleton.eager.v2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(JUnit4.class)
public class SingletonTest {

  @Test
  public void shouldFetch() {
    Singleton instance = Singleton.getInstance();

    assertNotNull(instance);
  }

  @Test
  public void shouldFetchSame() {
    Singleton initial = Singleton.getInstance();
    Singleton actual = Singleton.getInstance();

    assertEquals(initial, actual);
  }
}
