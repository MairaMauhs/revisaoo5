package revisao5;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author AliraMaria
 */
public class Revisao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Uma empresa concederá um aumento de salário aos seus funcionários, variável de acordo com o cargo, 
       // conforme a tabela abaixo. Faça um programa que leia o salário e o código do cargo de um funcionário e 
       // calcule o seu novo salário. Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 15% de aumento. 
       //Mostre o salário antigo, o novo salário e a diferença entre ambos. 

        DecimalFormat f = new DecimalFormat("0.00"); //para deixar o nuero em só duas casas depois da virgula
        int codigo;
        double salario, novoSal, aumento, dif; //dif = diferença, novoSal = Novo Salario
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe seu código de cargo, Por favor:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário atual, Por favor:"));
        
        switch(codigo) {
            case 310:
                novoSal = ((salario * 5)/100);
                aumento = novoSal + salario;
                break;
            case 456:
                novoSal = ((salario * 7.5)/100);
                aumento = novoSal + salario;
                break;
            case 885:
                novoSal = ((salario *10)/100);
                aumento = novoSal + salario;
                break;
            default:
                novoSal = ((salario * 15)/100);
                aumento = novoSal + salario;
                break;
        }
        dif = aumento - salario;
        JOptionPane.showMessageDialog(null, "Seu salário era de R$"+f.format(salario)
                +"\nSeu novo salário é de R$"+f.format(aumento)
                +"\nA diferença dos salários é de R$"+f.format(dif));
    }
    
}
    
