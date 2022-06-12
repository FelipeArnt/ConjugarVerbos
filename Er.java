import java.util.Scanner;

public class Er{
    public static void main(String[] args){
        //Classe Scanner;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\f");
        //Pedindo ao usuário para que ele digite o verbo;
        System.out.println("Escreva um verbo terminado em ER no infinitivo : ");
        String palavra = teclado.nextLine();
        //Separando o Radical da Desinência;
        int tamanho = palavra.length();
        int desinencia = tamanho - 2;
        String radical = palavra.substring(0,desinencia);
        //Checando se o usuário obedeceu o programa;
        if(palavra.endsWith("er")){
            System.out.println("O verbo conjugado será : " + palavra +"!");
        }
        else{
            System.out.println("O verbo precisa terminar em 'ER'. Saindo do programa! ");
            System.exit(0);
        }
        //Início do Menu Interativo
        do{
        System.out.println("Escolha em que tempo você quer conjugar o verbo \n [1] Presente \n [2] Pretérito Perfeito \n [3] Futuro do Presente \n [0] Sair do programa!");
        //Variavel das opções do menu;
        int escolha = teclado.nextInt();
        //Início do Switch;
        switch(escolha){    
            //Tempo Presente;
            case 1 :
            {   System.out.println("\f");
                System.out.println("Verbo conjugado no tempo presente: ");
                System.out.println(" Eu " + radical + "o "  );
                System.out.println(" Tu " + radical + "es "  );
                System.out.println(" Ele " + radical + "e "  );
                System.out.println(" Nos " + radical + "emos "  );
                System.out.println(" Vós " + radical + "eis "  );
                System.out.println(" Eles " + radical + "em "  );
                break;
                }
            //Pretérito Perfeito;
            case 2 :
            {   
                System.out.println("\f");
                System.out.println("Verbo conjugado no Pretérito Perfeito: ");
                System.out.println(" Eu " + radical + "i "  );
                System.out.println(" Tu " + radical + "este "  );
                System.out.println(" Ele " + radical + "eu "  );
                System.out.println(" Nós " + radical + "emos "  );
                System.out.println(" Vós " + radical + "estes "  );
                System.out.println(" Eles " + radical + "eram "  ); 
                break;
                }
            //Futuro do Presente;
            case 3 :
            {   System.out.println("\f");
                System.out.println("Verbo conjugado no Futuro do Presente:");
                System.out.println(" Eu " + radical + "erei ");
                System.out.println(" Tu " + radical + "erás ");
                System.out.println(" Ele " + radical + "erá ");
                System.out.println(" Nós " + radical + "eremos ");
                System.out.println(" Vós " + radical + "ereis ");
                System.out.println(" Eles " + radical + "erão ");
                break;
                }
            //Finaliza o programa!
            case 0 : 
            {
                System.out.println("\f");
                System.out.println("Até logo!");
                System.exit(0);
            }
            // Retorna um erro de digitação, por exemplo: Digitar 5 no menu, número que não faz parte das opções, possibilitando que o usuário escolha outra opção!;
            default : System.out.println("Você digitou uma opção inválida, tente novamente!");
            }
        //Fim do Menu Interativo;
        }while(true);
    }
}