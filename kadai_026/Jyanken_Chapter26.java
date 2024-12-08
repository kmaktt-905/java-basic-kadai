package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
    private Scanner scanner;

    public Jyanken_Chapter26(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getMyChoice() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        return scanner.nextLine();
    }

    public String getRandom() {
        String[] hands = {"r", "s", "p"};
        int randomIndex = (int) Math.floor(Math.random() * 3);
        return hands[randomIndex];
    }

    public void playGame(String myHand, String opponentHand) {
        HashMap<String, String> handMap = new HashMap<>();
        handMap.put("r", "グー");
        handMap.put("s", "チョキ");
        handMap.put("p", "パー");

        if (!handMap.containsKey(myHand)) {
            System.out.println("不正な入力です。r, s, pのいずれかを入力してください。");
            return;
        }

        System.out.println("自分の手は" + handMap.get(myHand) + ", 対戦相手の手は" + handMap.get(opponentHand));

        if (myHand.equals(opponentHand)) {
            System.out.println("あいこです");
        } else if ((myHand.equals("r") && opponentHand.equals("s")) ||
                   (myHand.equals("s") && opponentHand.equals("p")) ||
                   (myHand.equals("p") && opponentHand.equals("r"))) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }
}
