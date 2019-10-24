package person.pratice.patterns.facade;

/**
 * 家庭剧场外观类：对外提供几种简单的集中剧场模式，不再用一堆设备开关操作才能完成。
 *
 * @author 何祥敏
 * @since 2019-10-23
 */
public class HomeTheaterFacade {
    /**
     * 音箱
     */
    private Amplifier amp;
    /**
     * 调谐键
     */
    private Tuner tuner;
    /**
     * DVD播放器
     */
    private DvdPlayer dvd;
    /**
     * CD播放器
     */
    private CdPlayer cd;
    /**
     * 投影仪
     */
    private Projector projector;
    /**
     * 灯光
     */
    private TheaterLights lights;
    /**
     * 屏幕
     */
    private Screen screen;
    /**
     * 爆米花机
     */
    private PopcornPopper popper;
    /**
     * 构造器，用来构造一个家庭影院
     * @param amp 音箱
     * @param tuner 调谐键
     * @param dvd DVD播放器
     * @param cd CD播放器
     * @param projector 投影仪
     * @param screen 屏幕
     * @param lights 灯光
     * @param popper 爆米花机
     * @author 何祥敏
     */
    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CdPlayer cd,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {

        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }
    /**
     * 看电影模式：来点爆米花、灯光调暗、打开投影（设置为宽屏模式）、打开音箱（接入DVD、设置环绕模式，设置音量）、打开DVD、播放电影
     *
     * @param movie 电影
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    /**
     * 结束观影：关闭爆米花机、打开灯光、屏幕收起、关闭投影、关闭影响、关闭关闭DVD
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();

        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void listenToCd(String cdTitle) {
        System.out.println("Get ready for an audiopile experence...");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play(cdTitle);
    }

    public void endCd() {
        System.out.println("Shutting down CD...");
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}
