package derece.oop;

public class derece {   private String[]  name;
    private final int[] arrays;


    public String[] getName(){
        return name;
    }

    public int[] getArrays() {
        return arrays;
    }



    public derece(String[] name,int[]arrays) {
        this.name =name;
        this.arrays = arrays;

    }

    public void processderece() {
        System.out.println("Birinci :"+ getName1()  + " " +    getFirst()    +"'");
        System.out.println("ikinci  :"+  getName2()  + " "+   getSecond()    +"'");
        System.out.println("Ucuncu  :"+  getName3()  + "  "+    getThird()    +"'");
        tDegree();


    }





    public int getFirst() {
        int lowestArrays = arrays[0];
        for (int array : arrays)
            if (array < lowestArrays)
                lowestArrays = array;
        return lowestArrays;


    }

    public int getSecond() {
        int first= getFirst();
        int highArrays = arrays[0];
        for (int array : arrays)
            if (array < highArrays && array>first )
                highArrays = array;

        return highArrays ;

    }
    public int getThird(){
        int second=getSecond();
        int median=arrays[0];
        for (int array:arrays)
            if (array<median && array>second)
                median=array;

        return median;
    }
    public void tDegree(){
        int a=0;
        int b=0;
        int c=0;
        for (int i = 0; i <arrays.length ; i++) {
            if (arrays[i] <= 299 && arrays[i] > 200)
                a++;
            else if (arrays[i] < 399 && arrays[i] > 300)
                b++;
            else
                c++;


        }
        System.out.println("A->" + a);
        System.out.println("B->" + b);
        System.out.println("C->" + c);






    }
    public String getName1(){
        int a = getFirst();
        int number1 = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == a){
                number1 = i;
                break;}
        }
        return this.name[number1];
    }
    public String getName2(){
        int b = getSecond();
        int number2 = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == b){
                number2 = i;
                break;}
        }
        return this.name[number2];
    }
    public String getName3(){
        int c = getThird();
        int number3 = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == c){
                number3 = i;
                break;}
        }
        return this.name[number3];
    }

}
