/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Capsule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person taro = new Person("山田太郎",20,"Tokyo","A","aaa@co.jp");
		System.out.println(taro.getName());
		System.out.println(taro.getAge());
		System.out.println(taro.getSyussin());
		System.out.println(taro.getKetueki());
		System.out.println(taro.getAddress());

		Person jiro=new Person();
		jiro.setName("jiro");
		jiro.setAge(20);
		jiro.setSyussin("Kanagawa");
		jiro.setKetueki("B");
		jiro.setAddress("bbb@co.jp");
		System.out.println(jiro.getName());
		System.out.println(jiro.getAge());
		System.out.println(jiro.getSyussin());
		System.out.println(jiro.getKetueki());
		System.out.println(jiro.getAddress());
	}
}
