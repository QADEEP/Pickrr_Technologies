package actions;

//public class TestClass {

//
//    public static void main(String[] args) {
//        String str="hello, World";
//        Map<Character,Integer> map=new HashMap<>();
//        str=str.replaceAll("\\s+","").toLowerCase();
//        for(char i:str.toCharArray()){
//            map.put(i, map.getOrDefault(i,0)+1);
//        }
//        for(Map.Entry entry:map.entrySet()) {
//                System.out.println("String " + entry.getKey() + ": count" + entry.getValue());
//        }
//    }
class Animal {

    public void eat() {
        System.out.println("Animal is eating.");
    }
}

    class Dog extends Animal {
        public void bark() {
            System.out.println("Dog is barking.");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Animal animal = new Dog();  // Upcasting - assigning a Dog object to an Animal reference

            // Downcasting - casting the Animal reference back to Dog
            Dog dog = (Dog) animal;

            dog.eat();  // Accessing the eat() method from the Dog class
            dog.bark(); // Accessing the bark() method from the Dog class
        }
}
