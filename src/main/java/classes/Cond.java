package classes;

public class Cond {
    public void numberIs(int numeroIf ){
        if(numeroIf >0) {
            System.out.println("positivo");
        } else if(numeroIf <0) {
            System.out.println("negativo");
        }
        else {
            System.out.println("0");
        }
    }

    public void numberWhile(int numeroWhile ){
        while (numeroWhile < 3) {
            numeroWhile ++;
            System.out.println(numeroWhile);
        }
    }

    public void numberDoWhile(int numeroDo){
        do {
            System.out.println(numeroDo);
            numeroDo++;
        } while (numeroDo < 3);
    }

    public void numberFor(){
        int numeroFor=0;
        for(int i=numeroFor;i<=3;i++){
            System.out.println(i);
        }
    }

    public void seasonSwitch(int seasonId){
        switch(seasonId) {
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("No existe estación para este ID");
        }
    }

}
