package person.pratice.patterns.facade;

/**
 * 投影仪
 *
 * @author 何祥敏
 * @since 2019-10-23
 */
public class Projector {
    /**
     * 描述信息
     */
    private String description;

    /**
     * 构造器
     * @param description 描述信息
     * @author 何祥敏
     */
    public Projector(String description) {
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
     * 宽屏模式
     * @author 何祥敏
     */
    public void wideScreenMode() {
        System.out.println(description + " in widescreen mode (16x9 aspect ratio)");
    }
    /**
     * TV模式
     * @author 何祥敏
     */
    public void tvMode() {
        System.out.println(description + " in tv mode (4x3 aspect ratio)");
    }

    public String toString() {
        return description;
    }
}
