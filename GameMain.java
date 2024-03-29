public class GameMain {
  public static void main(String[] args) {
    int playerHand;
    // 課題User-1 文章の表示
    System.out.println("1:グー 2:チョキ 3:パー");
    System.out.println("じゃんけん...");

    // 課題Bot-1 Playerの手の決定とその表示
    // PlayerクラスのdecidesPlayerHandメソッドとHandクラスのgetHandNameメソッドを使ってPlayerの手を表示する
    if (args.length == 1) {
      playerHand = Integer.parseInt(args[0]);
    } else {
      System.out.println("コマンドライン引数でプレイヤーの手を決定して下さい");
      return;
    }

    // 課題User-2 Computerの手の決定とその表示
    // ComputerクラスのdecidesComputerHandメソッドとHandクラスのgetHandNameメソッドを使ってPlayerの手を表示する
    int computerHand = Computer.decidesComputerHand();

    // 課題Bot-2 勝敗判定とその表示
    // 課題Bot-1,User-2において実装したPlayerおよびComputerの手の表示はVictoryOrDefeatクラスに移動する
    VictoryOrDefeat.decisionVictoryOrDefeat(computerHand, playerHand);

  }
}