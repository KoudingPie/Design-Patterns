package person.pratice.patterns.facade;

/**
 * CD播放器
 * @author 何祥敏
 * @since 2019-10-23
 */
public class CdPlayer {
    /**
     * 描述信息
     */
    private String description;
    /**
     * 当前模式
     */
    private int currentTrack;
    /**
     * 标题
     */
    private String title;
    /**
     * 构造器
     * @param description 描述信息
     * @author 何祥敏
     * @since 2019-10-23
     */
    public CdPlayer(String description) {
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
        title = null;
        System.out.println(description + " eject");
    }

    /**
     * 播放方法:播放指定标题
     * @param title 标题
     * @author 何祥敏
     */
    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        System.out.println(description + " playing \"" + title + "\"");
    }

    /**
     * 按照指定的模式播放
     * @author 何祥敏
     */
    public void play(int track) {
        if (title == null) {
            System.out.println(description + " can't play track " + currentTrack +
                    ", no cd inserted");
        } else {
            currentTrack = track;
            System.out.println(description + " playing track " + currentTrack);
        }
    }

    /**
     * 停止方法
     * @author 何祥敏
     */
    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped");
    }
    /**
     * 暂停方法
     * @author 何祥敏
     */
    public void pause() {
        System.out.println(description + " paused \"" + title + "\"");
    }

    public String toString() {
        return description;
    }
}
