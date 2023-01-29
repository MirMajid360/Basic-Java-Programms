public class CountNumberOfObjectsOfClass {


    public  static void main(String[] args){

        Demo dem1 = new Demo();
        Demo dem2 = new Demo();
        Demo dem3 = new Demo();
        System.out.println(dem1.count());
    }
}


class  Demo{

    static int counter= 0;
    Demo(){
        counter++;
    }

    Integer count(){
       return  counter;
    }

}
