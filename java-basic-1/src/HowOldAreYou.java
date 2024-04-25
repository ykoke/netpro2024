// C言語では、#include に相当する
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {

	public static void main(String[] args) { 

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		try {
			while(true){
			System.out.println("何歳ですか?");
			String line = reader.readLine();
			int age = Integer.parseInt(line);
			int bornyear = 2024-age;
			String era = getEra(bornyear);
			int num =  getNum(bornyear);//元号を得る変数。
			if(line.equals("q")||line.equals("e")){
				System.out.println("プログラムを終了します。");
				break;
			}
			if(age>=120||age<0){
				System.out.println("再入力してください。");
				continue;
			}
			
            System.out.println("2030年の年齢は、"+(age + 6)+"歳ですね。");
			if(num==1){
				System.out.println("あなたの生まれた元号は"+era+"元年ですね。");
			} else{
				System.out.println("あなたの生まれた元号は"+era+num+"年ですね。");
			}

		}
		}
		catch(IOException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e){
			System.out.println("プログラムを終了します。");
		}


	}

	//元号を返す関数
	public static String getEra(int bornyear){
		String era;
		if(1868<=bornyear&&bornyear<1912){
			era = "明治";
		} else if (1912<=bornyear&&bornyear<1926){
			era = "大正";
		} else if(1926<=bornyear&&bornyear<1989){
			era = "昭和";
		} else if(1989<=bornyear&&bornyear<2019){
			era = "平成";
		} else if(2019<=bornyear){
			era = "令和";
		} else{
			era = "?";
		}
		return era;
	}
	//元号何年を返す関数
	public static int getNum(int bornyear){
		int num;
		if(1868<=bornyear&&bornyear<=1912){
			num = (bornyear-1868)+1;
		} else if (1912<=bornyear&&bornyear<1926){
			num = (bornyear-1912)+1;
		} else if(1926<=bornyear&&bornyear<1989){
			num = (bornyear-1926)+1;
		} else if(1989<=bornyear&&bornyear<2019){
			num = (bornyear-1989)+1;
		} else if(2019<=bornyear){
			num = (bornyear-2019)+1;
		} else{
			num = 0;
		}
		return num;
	}
}
