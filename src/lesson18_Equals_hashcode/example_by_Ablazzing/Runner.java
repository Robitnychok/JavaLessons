package lesson18_Equals_hashcode.example_by_Ablazzing;

public class Runner {
    public static void main(String[] args) {


        Child child1 = new Child( "Bob", 1999);
        Child child2 = new Child( "Pop", 1999);
        Child child3 = new Child( "Rok", 1999);

        System.out.println(child1);
        System.out.println(child1.hashCode());

        Child [] childs = {child1, child2, child3};
        Kindergarden kindergarden = new Kindergarden(childs);

        Child childToFind = new Child( "Pop", 1999);
        boolean result = false;

        for ( Child child: childs){
            if (child.equals(childToFind)){
                result = true;
            }
        }
        System.out.println(result);
        }


}
