package person.pratice.patterns.facade;

/**
 * 爆米花机
 *
 * @author 何祥敏
 * @since 2019-10-23
 */
public class PopcornPopper {
    /**
     * 描述信息
     */
    private String description;

    /**
     * 构造器
     * @param description 描述信息
     * @author 何祥敏
     */
    public PopcornPopper(String description) {
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
     * 制作爆米花
     * @author 何祥敏
     */
    public void pop() {
        System.out.println(description + " popping popcorn!");
    }


    public String toString() {
        return description;
    }
}
