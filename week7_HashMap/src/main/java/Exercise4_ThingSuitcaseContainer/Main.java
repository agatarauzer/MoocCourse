package Exercise4_ThingSuitcaseContainer;

public class Main {
    public static void main(String[] args) {

        /*Thing book = new Thing("Happiness in Three Steps", 5);
        Thing mobile = new Thing("Nokia 3210", 1);
        Thing brick = new Thing("Brick", 4);

        Suitcase tomsCase = new Suitcase(8);
        tomsCase.addThing(book);
        tomsCase.addThing(mobile);
        tomsCase.addThing(brick);

        tomsCase.printThings();
        */


        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);


    }

    public static void addSuitcasesFullOfBricks(Container container){

        int weightOfBrick = 4;
        Suitcase oneSuitcase;
        Thing brick;

        for(int i = 0; i < 100; i++){

            brick = new Thing("Brick", weightOfBrick);
            oneSuitcase = new Suitcase(100);
            oneSuitcase.addThing(brick);

            container.addSuitcase(oneSuitcase);
            weightOfBrick++;
        }

        container.printThings();

    }

}
