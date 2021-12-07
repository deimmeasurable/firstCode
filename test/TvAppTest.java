import chapterSix.Tv;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TvAppTest {
    private Tv infinix = new Tv("infinix", 1, 1);
    private int channel;
    private int volume = 30;


    @Test
    void  canCreateTV(){
        Tv infinix = new Tv("infinix", 1, 1);
        assertEquals(infinix.getName(), "infinix");
        assertEquals(infinix.getChannel(), 1);
        assertEquals(infinix.getVolume(), 1);
        assertEquals(infinix.getBrightness(), 5);
    }

    @Test
    public void TvTurnOn() {
        Tv infinix = new Tv("infinix", 1, 1);
        assertFalse(infinix.isOn);

        infinix.turnOn();
        assertTrue(infinix.isOn());

    }

    @Test
    public void tvIsOff() {
        //given that i have a tv, which is on already;
        infinix.turnOn();
        assertTrue(infinix.isOn());

        infinix.turnOff();
        assertFalse(infinix.isOn());
    }

    @Test
    public void checkChannelsOfTv() {
        infinix.turnOn();
        assertTrue(infinix.isOn());
        int channel = 1;
        infinix.checkChannelsOfTv(1);
        assertEquals(1, channel);


    }

    @Test
    public void IncreaseChannelOfTv() {
        //    given that tv is on
        infinix.turnOn();
        assertTrue(infinix.isOn());
        infinix.increaseChannel(infinix.channel);
        int channel = 1;
        assertEquals(0, channel);
    }

    @Test
    public void setMyChannelCannotBeMoreThan100() {
        infinix.turnOn();
        assertTrue(infinix.isOn());
        infinix.setChannelTo100(89);
        //  int channel = 105;
        assertEquals(89, infinix.setChannelTo100(0));
    }

    @Test
    public void checkSetVolume() {
        infinix.turnOn();
        assertTrue(infinix.isOn());
        int volume = 1;
        infinix.setVolume(1);
        assertEquals(1, volume);
    }

    @Test
    public void increaseVolumeTo30() {
        infinix.turnOn();
        assertTrue(infinix.isOn());
//int volume = 12 ;
        int Volume=infinix.increaseVolumeTo30(20);
        assertEquals(30, infinix.volume);
    }

    @Test
    public void SetBrightness() {
        infinix.turnOn();
        assertTrue(infinix.isOn());

        infinix.getBrightness();
        assertEquals(0, infinix.brightness);
    }

    @Test
    public void increaseBrightnessTo40() {
        infinix.turnOn();
        assertTrue(infinix.isOn());

        int brightness=infinix.increaseBrightnessTo30(40);


        assertEquals(40,infinix.getBrightness());


    }
    @Test
    public void decreaseBrightness(){
        // given that my tv is on
        infinix.turnOn();
        assertTrue(infinix.isOn());

        infinix.setDecreaseBrightness(50);
        assertEquals(30, infinix.brightness);
    }
}





