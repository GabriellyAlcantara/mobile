import java.util.Scanner;

public class aula{
    public static void main(String[] args){
        String nome = "Gabrielly";
        int a = 10;
        int b = 7;
        System.out.println("Bom dia "+nome+", sua idade e: "+(a+b)+" anos");
        aniversario();
        idade(2008, 2025);
        pergunta();
        questao1();
        questao2();
        questao3();
        questao4();
        questao5();
    }
    public static void aniversario(){
        int anoNascimento = 2008;
        int anoAtual = 2025;
        System.out.println("Sua idade e "+(anoAtual-anoNascimento));
    }
    public static void idade(int anoNascimento, int ano){
        System.out.println("A sua idade e"+(ano - anoNascimento));
    }
    public static void pergunta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();
        if(nome == "Gabrielly"){
            System.out.println("O seu nome e Gabrielly.");
        }else{
            System.out.println("O seu nome nao e Gabrielly.");
        }
        scanner.close();
    }


// 1) Faça um código que leia 2 números e calcule a multiplicação deles.

public static void questao1(){
    int numero1 = 20;
    int numero2 = 10;
    System.out.println(numero1*numero2);
}

//2) Faça um código que leia o nome de uma fruta e diga se é maçã, banana, uva, ou abacate.

    public static void questao2(){
        String nomeFruta = "M";
        if(nomeFruta == "M"){
            System.out.println("Maca");
        }
        if(nomeFruta == "B"){
            System.out.println("Banana");
        }
        if(nomeFruta == "U"){
            System.out.println("Uva");
        }
        if(nomeFruta == "A"){
             System.out.println("Abacate");
        }
    }

//3) Faça um codigo que leia as horas trabalhadas, o valor da hora trabalhada e diga o salario mensal do trabalhador.

    public static void questao3(){
         int horaTrabalhada = 8;
         double valorHora = 12.50;
         int diasMes = 30;
         double salarioMensal = (horaTrabalhada*valorHora*diasMes);
        System.out.println("O seu salario e "+salarioMensal);
    }

 // 4) Faça um código que leia o nome de um usuário, a senha dele, e diga se: Usuario/senha está incorreta, ou diga: Login realizado com sucesso.
 
    public static void questao4(){
        String usuario = "Gabrielly";
        String senha = "1111";
        if(usuario == "Gabrielly" && senha == "1111"){
            System.out.println("Login realizado com sucesso.");
        }else{
            System.out.println("Usuário incorreto.");
        }
    }
 
 // 5) Faça um código que leia o valor de uma compra e aplique desconto de 10% se a compra for maior que R$ 20,00, 20% se for maior que R$ 50,00, 30% se for maior que R$ 100,00, e 35% se for maior que R$ 200,00.
 
    public static void questao5(){
        double valorCompra = 150.00;
        double desconto1 = (valorCompra-(valorCompra/100*10));
        double desconto2 = (valorCompra-(valorCompra/100*20));
        double desconto3=  (valorCompra-(valorCompra/100*30));
        double desconto4 = (valorCompra-(valorCompra/100*35));
        if(valorCompra >= 20 && valorCompra < 50){
            System.out.println("O valor da compra com desconto e de: " +desconto1);
        }
        if(valorCompra >= 50  && valorCompra < 100){
            System.out.println("O valor da compra com desconto e de: " +desconto2);
        }
        if(valorCompra >= 100 && valorCompra < 200){
            System.out.println("O valor da compra com desconto e de: " +desconto3);
        }
        if(valorCompra >= 200){
            System.out.println("O valor da compra com desconto e de: " +desconto4);
        }
    }
        
}
