
public class Hero {
	private String name;
	private int hp;
	public int getHp(){
		return this.hp;
	}
	public void setHp(int hp){
		this.hp=hp;
	}
	Hero(String name){
		this.hp = 100;
		this.name=name;
	}
	Hero(){
		this("ダミー");
	}

	public void attack(Matango m){
		System.out.println(this.name+"の攻撃");
		m.hp-=5;
		System.out.println("5ポイントのダメージを与えた");
	}

	public void run(){
		System.out.println(this.name+"は逃げ出した");
	}
}
