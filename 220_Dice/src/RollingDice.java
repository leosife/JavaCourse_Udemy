import java.util.Random;


public class RollingDice {
    private int numeroDados;
    private int numero;

    public RollingDice(int numeroDados){
        this.numeroDados = numeroDados;
    }

    public int jogar(){
        Random rd = new Random();
        numero = rd.nextInt(1,7);


        return numero;


    }



}
