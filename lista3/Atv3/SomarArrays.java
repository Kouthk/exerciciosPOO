package lista3.Atv3;

public class SomarArrays {

    public static void main(String[] args) {
        int[] array1 = new int[] {1,2,3,4,5};
        int[] array2 = new int[] {6,7,8,9,10};

        for(int i = 0; i < array1.length; i++)
            System.out.println("Soma da posição " + (i+1) + " = " + (array1[i] + array2[i]));
    }
}
