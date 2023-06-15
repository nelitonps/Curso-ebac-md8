/**
 * @author Neliton
 * @version 1.0
 */
public class Principal {

    public static void main(String[] args){
        Calculo calculo = new Calculo();

        calculo.setNota1(6);
        calculo.setNota2(4);
        calculo.setNota3(7);
        calculo.setNota4(5);

        System.out.println("A media é: " + calculo.calculoMedia());
    }

}
