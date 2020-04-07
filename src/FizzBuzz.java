public class FizzBuzz {
// 3で割り切れる = Fizz
// 5で割り切れる = Buzz
// 15で割り切れる = FizzBuzz
    public static void main(String[] args){
        // 見出し表示の出力
        System.out.println("実行例");
        for (int i = 1; i <= 150; i++) {
            //if (i % 15 == 0) {
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
