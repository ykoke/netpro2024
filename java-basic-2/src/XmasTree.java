public class XmasTree {

	public static void main(String[] args) {
		/*int i=0;
        int first,second;
		while(i<10) {
			Scanner scan = new Scanner(System.in);
            
			String str = scan.next();
			System.out.println("最初のトークンは: " + str);
            System.out.println("文字を分割すると・・・");
            String[] word = str.split(",");//splitメソッドの引数に、どこの文字で分割するか指定します。この場合は空白文字。
            for(String w:word) {
                System.out.println(w);
            }
            System.out.println("word[0]"+word[0]);
            System.out.println("word[1]"+word[1]);
            System.out.println("word[2]"+word[2]);
            System.out.println("word[3]"+word[3]);
            //19,3,7,c
            //first = Integer.parseInt(str);
            System.out.println("----次の数字の入力をお願いします ");
            
		}*/
        int N=10;
        for (int j = 0; j < N; j++) {

            for (int i = 0; i <= N-j; i++) {
                if(i%2==1){
                    System.out.print("+");
                } else{
                    System.out.print(" ");
                }
                
            }

            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            for (int i = 0; i <= j*2; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = 0; i<=7; i++){
            System.out.println("            ***          ");
        }
	}
}

//  課題    キーボードから2つの数字を打ち込む
//     その足し算結果を、出力する








