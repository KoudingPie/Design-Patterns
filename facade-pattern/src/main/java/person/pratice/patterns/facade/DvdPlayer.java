package person.pratice.patterns.facade;

/**
 * DVD播放器
 *
 * @author 何祥敏
 * @since 2019-10-23
 */
public class DvdPlayer {
    /**
     * 描述信息
     */
    String description;
    /**
     * 当前播放模式
     */
    int currentTrack;
    /**
     * 电影
     */
    String movie;
    /**
     * 构造器
     * @param description 描述信息
     * @author 何祥敏
     */
    public DvdPlayer(String description) {
        this.description = description;
    }
    /**
     * 打开方法
     * @author 何祥敏
     */
    public void on() {
        System.out.println(description + " on");
    }
    /**
     * 关闭方法
     * @author 何祥敏
     */
    public void off() {
        System.out.println(description + " off");
    }
    /**
     * 喷射方法
     * @author 何祥敏
     */
    public void eject() {
        movie = null;
        System.out.println(description + " eject");
    }
    /**
     * 播放指定的电影
     * @param movie 指定的电影
     * @author 何祥敏
     */
    public void play(String movie) {
        this.movie = movie;
        currentTrack = 0;
        System.out.println(description + " playing \"" + movie + "\"");
    }
    /**
     * 按照指定的模式播放
     * @author 何祥敏
     */
    public void play(int track) {
        if (movie == null) {
            System.out.println(description + " can't play track " + track + " no dvd inserted");
        } else {
            currentTrack = track;
            System.out.println(description + " playing track " + currentTrack + " of \"" + movie + "\"");
        }
    }

    /**
     * 停止播放
     * @author 何祥敏
     */
    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped \"" + movie + "\"");
    }
    /**
     * 暂停方法
     * @author 何祥敏
     */
    public void pause() {
        System.out.println(description + " paused \"" + movie + "\"");
    }

    /**
     * 设置两路音频
     * @author 何祥敏
     */
    public void setTwoChannelAudio() {
        System.out.println(description + " set two channel audio");
    }
    /**
     * 设置环绕立体声
     * @author 何祥敏
     */
    public void setSurroundAudio() {
        System.out.println(description + " set surround audio");
    }

    public String toString() {
        return description;
    }
}
