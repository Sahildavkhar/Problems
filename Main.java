// class Animal{
//     String name;
//     void speak(){
//         System.out.println("Bhow");
//     }

//     void start(){
//         System.out.println("Animal started");
//     }
// }

// class dog extends Animal{
//     void speak(){
//         System.out .println("Woof");
//     }
// }

abstract class car{
    abstract void start();
}

class BMW extends car{
    @Override
    void start(){
        System.out.println("BMW started");
    }
}

class Main{
    public static void main(String[] args){
        // Animal a = new Animal();
        // dog d = new dog();
        // a.speak();
        // a.name = "Tommy";           
        // System.out.println(""+a.name);
        // a.start();

        BMW c = new BMW();
        c.start();
    }
}