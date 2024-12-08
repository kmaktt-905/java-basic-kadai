package kadai_026;

import java.util.Scanner;

public class JyankenExec_Chapter26 {
    public static void main(String[] args) {
        // Scannerオブジェクトを作成
        Scanner scanner = new Scanner(System.in);

        // Jyanken_Chapter26クラスのインスタンスを作成
        Jyanken_Chapter26 jyanken = new Jyanken_Chapter26(scanner);

        // 自分のじゃんけんの手を入力
        String myChoice = jyanken.getMyChoice();

        // 対戦相手のじゃんけんの手を乱数で選択
        String opponentChoice = jyanken.getRandom();

        // じゃんけんの結果を出力
        jyanken.playGame(myChoice, opponentChoice);

        // Scannerを閉じる
        scanner.close();
    }
}
