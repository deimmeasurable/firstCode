package chapterSix;

public class Tv {

    private String name;
    public boolean isOn;
    public int channel;
    public int volume;
    public int brightness = 0;


    public Tv(String TvName, int channel, int volume) {
        name = TvName;
        this.channel = channel;
        this.volume = volume;
        brightness = 5;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public boolean turnOff() {
        return isOn = false;

    }

    public int checkChannelsOfTv(int number) {
        return number;
    }


    public int increaseChannel(int channel) {
        if (channel <= 100) return channel;
        if (channel >= 0)
            return channel;
        return 1;
    }

    public int increaseChannelMoreThan100(int channel) {
        return channel;
    }

    public int setChannelTo100(int userInput) {
        if (channel <= 100) {
            channel = channel + userInput;
            return channel;
        }
        return 100;
    }


    public int setVolume(int volume) {
        return volume;
    }

    public int increaseVolumeTo30(int userInput) {
        if (volume <= 30) {

            volume = volume + userInput;
            return volume;
        }
        return 30;
    }

    public int getBrightness() {
        //    if (brightness < 100 && brightness >0) {
        return brightness;

    }


    public int increaseBrightnessTo30(int userInput) {
        if (userInput > 30 || userInput < 0){
            System.out.println("Sorry don't do that again");
        }
        brightness = userInput;
        return brightness;
    }

    public int setDecreaseBrightness(int userInput) {
        if (brightness == 30) {
            return brightness-userInput;

        }
        return 30;
    }

    public String getName() {
        return name;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
}














//private String name;
// private int channel;
//private int volume;
//private int brightness;
//private int colour;



