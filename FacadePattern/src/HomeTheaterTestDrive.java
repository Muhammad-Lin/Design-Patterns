package src;

import src.component.*;

/**
 * @name: HomeTheaterTestDrive
 * @author: yoga
 * @create: 2022-09-09 15:44
 **/
public class HomeTheaterTestDrive {
    public static void main(String[] args){
        //实例化组件
        Amplifier amplifier = new Amplifier("Amplifier");
        Tuner tuner = new Tuner("AM/FM Tuner", amplifier);
        StreamingPlayer strp = new StreamingPlayer("Streaming Player", amplifier);
        CdPlayer cdPlayer = new CdPlayer("CD Player", amplifier);
        Projector projector = new Projector("Projector", strp);
        Screen screen = new Screen("Theater Screen");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, tuner, strp, cdPlayer, projector, lights, screen, popper);
        homeTheaterFacade.watchMovie("Raiders of the lost Ark");
        homeTheaterFacade.endMovie();
    }
}
