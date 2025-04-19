public class PrintArray {
    public static <T> void printArray(T[] dizi){ //Generics method tanımı

        for (T dönen :dizi){

            System.out.print(dönen + " ");

        }
        System.out.println();

    }
    public static void main(String[] args) {//Kodu ayağa kaldırma

        Integer[] intArray = {1, 2, 3, 4, 5};

        String[] strArray = {"Java", "Generics", "Ödev"};

        printArray(intArray);

        printArray(strArray);
    }
}
