package acApp;

import chapterSix.AirCondition.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTest {
    private AirConditioner lG = new AirConditioner ("lG");
@Test
    public void checkAcTurnOn(){
    AirConditioner lG = new AirConditioner("lG");
    assertFalse(lG.isOn());

    lG.turnOn();
    assertTrue(lG.isOn());
}
@Test
  public void acTurnOff(){
    // given I have Ac; Ac is On
    lG.turnOn();
    assertTrue(lG.isOn());

 // when I turn Ac off;
    lG.turnOff();
    // check that Ac is off;
    assertFalse(lG.isOn());

}
@Test
    public void temperatureCanBeIncrease(){

}

}
