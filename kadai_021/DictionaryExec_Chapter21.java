package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 調べる英単語の配列を作成
        String[] wordsToCheck = { "apple", "banana", "grape", "orange" };

        // 各英単語の意味を調べて出力
        for (String word : wordsToCheck) {
            String meaning = dictionary.getMeaning(word);
            System.out.println(word + "の意味は" + meaning);
        }
    }
}
