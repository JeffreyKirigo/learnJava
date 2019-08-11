public class myWork {
    public static void jeffrey(){
        System.out.println("Try this method");
       return;
    }
        public myWork(){
            System.out.println("Hello am a constructor");
        }
    public static int sum(int a,int d,int w){
        return a + d + w;
    }
    public static void main(String[] args) {
        System.out.println("My name is Jeffrey");
        int score = 100;
        System.out.println(score);
        String name = "Laureen";
        System.out.println(name);
        boolean isCorrect = true;
        System.out.println(isCorrect);
        int b = 50;
        int c;
        c = score + b;
        System.out.println(c);
        jeffrey();
        int total = sum(5,6,7);
        System.out.println(total);
        myWork learn1 = new myWork();

    }
}
