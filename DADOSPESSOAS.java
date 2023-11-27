package dados.pessoas;

import java.util.Scanner;

public class DADOSPESSOAS {

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int flag = 0, idade = 0, count = 0, maior = 0, menor = 0;
        
        do{
            System.out.println("sexo?\n1 - Masculino\n2 - Feminino");
            int sexo = sc.nextInt();
            
            System.out.println("cor dos olhos?\n1 - Azuis\n2 - Verde\n3 - Castanhos");
            int olhos = sc.nextInt();
            
            System.out.println("Cor dos cabelos?\n1 - louros\n2 - castanhos\n3 - pretos");
            int cabelo = sc.nextInt();
            
            System.out.println("Qual a idade? ");
            idade = sc.nextInt();
            
            if (flag == 0){
                flag = 1;
                maior = idade;
                menor = idade;
            }
            else {
                if (idade == - 1){
                    break;
                }
                else if (idade > maior){
                    maior = idade;
                }else if (idade < menor){
                    menor = idade;
                }
            }
            if(sexo == 2 && idade >= 18 && idade <= 35 && olhos == 2 && cabelo ==1){
                count++;
            }
        }while(idade != -1);
        
        sc.close();
        
     System.out.println("A maior idade entre os habitantes é "+maior);
     System.out.println("A menor idade entre os habitantes é "+menor);
     System.out.println("A quantidade de individuos do sexo feminino cuja idade esta entre 18 e 35 anos inclusive e que tenham olhos verdes e cabelo louros é "+count);
    }
}
        