package person.pratice.patterns.facade;

/**
 * 剧场灯光
 *
 * @author 何祥敏
 * @since 2019-10-23
 */
public class TheaterLights {
    /**
     * 描述信息
     */
    private String description;
    /**
     * 构造器
     * @param description 描述信息
     * @author 何祥敏
     */
    public TheaterLights(String description) {
        this.description = description;
    }

    /**
     * 打开灯光
     * @author 何祥敏
     */
    public void on() {
        System.out.println(description + " on");
    }
    /**
     * 关闭灯光
     * @author 何祥敏
     */
    public void off() {
        System.out.println(description + " off");
    }
    /**
     * 调节亮度
     * @param level 亮度级别
     * @author 何祥敏
     */
    public void dim(int level) {
        System.out.println(description + " dimming to " + level  + "%");
    }

    public String toString() {
        return description;
    }
}
