
public class Wizard {
	String name;
	int hp;
	public void heal(Hero h){
		h.setHp(h.getHp()+ 10);
		System.out.println("勇者のHPを10回復した");
	}
}
