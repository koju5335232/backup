/**
 *
 */

/**
 * @author internousdev
 *
 */
public class Person {

	/**
	 * @param args
	 */
	private String name = null;
	private int age = 0;
	private String syussin = null;
	private String ketueki = null;
	private String address = "aaa@co.jp";

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}

	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}

	public String getSyussin(){
		return this.syussin;
	}
	public void setSyussin(String syussin){
		this.syussin=syussin;
	}

	public String getKetueki(){
		return this.ketueki;
	}
	public void setKetueki(String ketueki){
		this.ketueki=ketueki;
	}


	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address=address;
	}

	public Person(){}
	public Person(String name,int age,String syussin,String ketueki,String address){
		this.name=name;
		this.age=age;
		this.syussin=syussin;
		this.ketueki=ketueki;
		this.address=address;
	}
}