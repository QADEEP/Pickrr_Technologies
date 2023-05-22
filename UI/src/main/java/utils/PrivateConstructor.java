package utils;

public class PrivateConstructor {
    int age;
    private PrivateConstructor(){
        int age=30;
    }
    public static void abc() {
        PrivateConstructor privateConstructor=new PrivateConstructor();
        privateConstructor.age=50;
        System.out.println(privateConstructor.age);
    }

    public static void main(String[] args) {
        PrivateConstructor privateConstructor=new PrivateConstructor();
        System.out.println(privateConstructor.age);
    }
}
