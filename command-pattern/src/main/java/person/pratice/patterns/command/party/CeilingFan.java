package person.pratice.patterns.command.party;
/**
 * 吊扇
 *
 * @author 何祥敏
 * @create 2019-10-13
 *
 */
public class CeilingFan {
	/**
	 * 高速
	 */
	public static final int HIGH = 3;
	/**
	 * 中速
	 */
	public static final int MEDIUM = 2;
	/**
	 * 低速
	 */
	public static final int LOW = 1;
	/**
	 * 关闭
	 */
	public static final int OFF = 0;
	/**
	 * 位置
	 */
	private String location;
	/**
	 * 速度
	 */
	private int speed;
 	/**
 	 * 构造器
 	 * @param location 位置
 	 * @author 何祥敏
 	 */
	public CeilingFan(String location) {
		this.location = location;
	}

	/**
	 * 高速旋转
	 */
	public void high() {
		// turns the ceiling fan on to high
		speed = HIGH;
		System.out.println(location + " ceiling fan is on high");
	} 
	/**
	 * 中速旋转
	 */
	public void medium() {
		// turns the ceiling fan on to medium
		speed = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}

	/**
	 * 低速旋转
	 */
	public void low() {
		// turns the ceiling fan on to low
		speed = LOW;
		System.out.println(location + " ceiling fan is on low");
	}

	/**
	 * 关闭风扇
	 */
	public void off() {
		// turns the ceiling fan off
		speed = OFF;
		System.out.println(location + " ceiling fan is off");
	}

	/**
	 * 获取风扇的转速
	 */
	public int getSpeed() {
		return speed;
	}
}
