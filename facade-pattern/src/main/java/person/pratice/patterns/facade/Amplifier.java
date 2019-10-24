package person.pratice.patterns.facade;

/**
 * 扬声器：音箱
 *
 * @author 何祥敏
 * @since 2019-10-23
 */
public class Amplifier {
    /**
     * 描述信息
     */
    private String description;
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
     * 构造器
     * @param description 描述信息
     * @author 何祥敏
     */
    public Amplifier(String description) {
        this.description = description;
    }
    /**
     * 打开
     * @author 何祥敏
     */
    public void on() {
        System.out.println(description + " on");
    }

    /**
     * 关闭
     * @author 何祥敏
     */
    public void off() {
        System.out.println(description + " off");
    }
    /**
     * 设置立体声模式
     */
    public void setStereoSound() {
        System.out.println(description + " stereo mode on");
    }
    /**
     * 设置环绕声模式
     */
    public void setSurroundSound() {
        System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
    }
    /**
     * 调节音量
     */
    public void setVolume(int level) {
        System.out.println(description + " setting volume to " + level);
    }
    /**
     * 设置调谐键
     */
    public void setTuner(Tuner tuner) {
        System.out.println(description + " setting tuner to " + dvd);
        this.tuner = tuner;
    }
    /**
     * 设置DVD播放器
     */
    public void setDvd(DvdPlayer dvd) {
        System.out.println(description + " setting DVD player to " + dvd);
        this.dvd = dvd;
    }
    /**
     * 设置CD播放器
     */
    public void setCd(CdPlayer cd) {
        System.out.println(description + " setting CD player to " + cd);
        this.cd = cd;
    }

    public String toString() {
        return description;
    }
}
