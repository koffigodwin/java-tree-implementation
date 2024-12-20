import trees.Binarytrees;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Binarytrees tres = new Binarytrees();

        tres.insertion(30);
        tres.insertion(15);
        tres.insertion(80);
        tres.insertion(8);
        tres.insertion(45);
        tres.insertion(22);
        tres.insertion(17);
        tres.insertion(70);
        tres.insertion(9);
        tres.insertion(65);

        tres.In_order();
        tres.Pre_order();
        tres.Post_order();



        System.out.println("sucessfull");
    }
}