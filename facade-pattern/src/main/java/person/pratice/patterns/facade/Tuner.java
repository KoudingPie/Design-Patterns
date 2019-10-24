package person.pratice.patterns.facade;

/**
 * 调谐键
 *
 * @author 何祥敏
 * @since 2019-10-23
 */
public class Tuner {
    /**
     * 描述信息
     */
    String description;
    /**
     * 频率
     */
    double frequency;
    /**
     * 构造器
     * @param description 描述信息
     * @author 何祥敏
     */
    public Tuner(String description) {
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
     * 设置频率
     * @param frequency 频率
     * @author 何祥敏
     */
    public void setFrequency(double frequency) {
        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    /**
     * 设置为AM模式
     * @author 何祥敏
     */
    public void setAm() {
        System.out.println(description + " setting AM mode");
    }
    /**
     * 设置为FM模式
     * @author 何祥敏
     */
    public void setFm() {
        System.out.println(description + " setting FM mode");
    }

    public String toString() {
        return description;
    }
}
