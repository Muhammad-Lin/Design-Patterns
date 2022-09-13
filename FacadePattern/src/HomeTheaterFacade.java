package src;

import src.component.*;

/**
 * @name: src.HomeTheaterFacade
 * @author: yoga
 * @create: 2022-09-09 14:41
 **/
public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    StreamingPlayer stp;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer stp, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.stp = stp;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    //实现简化的接口
    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(stp);
        amp.setStereoSound();
        amp.setVolume(5);
        stp.on();
        stp.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        stp.stop();
        stp.off();
    }


}
