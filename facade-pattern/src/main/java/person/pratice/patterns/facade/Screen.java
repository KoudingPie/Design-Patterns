package person.pratice.patterns.facade;

/**
 * 屏幕
 *
 * @author 何祥敏
 * @since 2019-10-23
 */
public class Screen {
    /**
     * 描述信息
     */
    private String description;

    /**
     * 构造器
     * @param description 描述信息
     * @author 何祥敏
     */
    public Screen(String description) {
        this.description = description;
    }
    /**
     * 上调
     * @author 何祥敏
     */
    public void up() {
        System.out.println(description + " going up");
    }
    /**
     * 下降
     * @author 何祥敏
     */
    public void down() {
        System.out.println(description + " going down");
    }


    public String toString() {
        return description;
    }
}
