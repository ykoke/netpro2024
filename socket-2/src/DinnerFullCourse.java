public class DinnerFullCourse {
    private Dish[] list = new Dish[5];// [0]-[4]の計5個

	public static void main(String[] args) {

		DinnerFullCourse fullcourse = new DinnerFullCourse();
		fullcourse.eatAll();
	}

    DinnerFullCourse (){

        list[0] = new Dish();
        list[0].setName("特選シーザーサラダ");
        list[0].setValune(10);
        list[1] = new Dish();
        list[1].setName("銀シャリ");
        list[1].setValune(2);
        list[2] = new Dish();
        list[2].setName("梅干し");
        list[2].setValune(20);
        list[3] = new Dish();
        list[3].setName("煮干しラーメン");
        list[3].setValune(500);
        list[4] = new Dish();
        list[4].setName("日向夏");
        list[4].setValune(200);

    }
    void eatAll() {
		String str = "";

		for (Dish element : list) {
			str += element.getName() + "=" + element.getValune() + ">";
		}

		System.out.println("たかしへ、ママ２です?J( 'ｰ`)し 今日の晩御飯コースは" + str + "よ");
	}

}
