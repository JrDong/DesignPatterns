package xyz.ibat.designpatterns.command.switches;

/**
 * Created by jerry on 2018/5/16.
 */

public class Stereo implements Switch {

    private String from;

    public Stereo(String from){
        this.from = from;
    }

    @Override
    public void on() {
        System.out.println(from + " Stereo is on");
    }

    @Override
    public void off() {
        System.out.println(from + " Stereo is off");
    }

    public void setCD(){
        System.out.println(from + " Stereo is set for CD input");
    }

    public void setDvd(){
        System.out.println(from + " Stereo is set for Dvd input");
    }

    public void setRadio(){
        System.out.println(from + " Stereo is set for radio input");
    }

    public void setVolume(int volume){
        System.out.println(from + " Stereo volume set to " + volume);
    }

}
