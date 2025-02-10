package Curriculum_25_process;
public class Hero extends Human
{
	private int hitpoint;
	private int magicpoint;
	private int attack;
	private int speed;
	private int defence;
	
	public Hero(String name) {
		super(name);
		//this.setName(name);
	}
	public int getHitpoint() {
		return hitpoint;
	}

	public void setHitpoint(int hitpoint) {
		this.hitpoint = hitpoint;
	}

	public int getMagicpoint() {
		return magicpoint;
	}

	public void setMagicpoint(int magicpoint) {
		this.magicpoint = magicpoint;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}
	public void display() {
		System.out.println("こんにちは「" + this.getName()+"」さん");
		System.out.println("ステータス");
		System.out.println("HP:"+this.getHitpoint());
		System.out.println("MP:"+this.getMagicpoint());
		System.out.println("攻撃力:"+this.getAttack());
		System.out.println("素早さ:"+this.getSpeed());
		System.out.println("防御力:"+this.getDefence());
		System.out.println();
	}
	public void hello() {
		System.out.println("さあ冒険に出かけよう！");
	}
}
