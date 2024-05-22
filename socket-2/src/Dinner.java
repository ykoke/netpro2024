public class Dinner {

	Dish dish1;
	Dish dish2;
	Dish dish3;
	Dish dish4;
	Dish dish5;

	public static void main(String[] args) {

		Dinner dinner = new Dinner();
		dinner.eat3Dishes();
	}

	Dinner() {

		dish1 = new Dish();
		dish1.setName("特選シーザサラダ");
		dish1.setValune(10);

		dish2 = new Dish();
		dish2.setName("銀しゃり");
		dish2.setValune(2);
		
		dish3 = new Dish();
		dish3.setName("梅干し");
		dish3.setValune(20);

		dish4 = new Dish();
		dish4.setName("煮干しラーメン");
		dish4.setValune(500);

		dish5 = new Dish();
		dish5.setName("日向夏");
		dish5.setValune(200);

	}// Dinnerコンストラクターエンド

	void eat3Dishes() {
		String str = dish1.getName() + "=" + dish1.getValune() + ","
				+ dish2.getName() + "=" + dish2.getValune() + ","
				+ dish3.getName() + "=" + dish3.getValune() + ","
				+ dish4.getName() + "=" + dish4.getValune() + ","
				+ dish5.getName() + "=" + dish5.getValune();
		System.out.println("たかしへ、ママです。今日の晩御飯は" + str + "よ");
	}// eat end

	// cook3Dishes()

}//Dinner end