public class Main {
    public static void main(String[] args) {
        Array array = new Array();
        for (int i = 0; i < 9; i++) {
            array.addLast(i+1);
        }
        array.addFirst(6);
        System.out.println(array);
    }
}
