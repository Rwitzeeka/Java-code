public class ARRAY {
    public static void main(String[] args) {
//        ARRAY - Arrays are fundamental structures in Java that allow us to store multiple values of the same type
//        in a single variable. They are useful for managing collections of data efficiently.
//        There are 3 WAYS by which an array can be initialised.
//      1. DECLARATION AND MEMORY ALLOCATION
        int [] marks= new int[5];
        marks[0]=70;
        marks[1]=58;
        marks[2]=33;
        marks[3]=96;
        marks[4]=89;
//        System.out.println(marks.length);
//        for(int i=0; i<marks.length;i++){
//            System.out.println(marks[i]);
        int i=0;
        while(i<marks.length){
            System.out.println(marks[i]);
            i++;
        }
        }





    }

