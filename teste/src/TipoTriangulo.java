import java.util.Scanner;

public class TipoTriangulo{
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor do primeiro lado do triangulo: ");
        int A = input.nextInt();

        System.out.println("Digite o valor do segundo lado do triangulo: ");
        int B = input.nextInt();

        System.out.println("Digite o valor do terceiro lado do triangulo: ");
        int C = input.nextInt();

        //(A + B > C, A + C > B, B + C > A). verificar se o triangulo eh valido
        if (A + B > C && A + C > B && B + C > A) {
            if (A == B && B== C) {
                System.out.println("O triangulo eh equilatero.");
            }else if (A != B && B != C && A != C) {
                System.out.println("O triangulo eh escaleno.");
            }else{
                System.out.println("O triangulo eh isosceles.");
            }
        }else{
            System.out.println("Os valores informados nao formam um triangulo.");
        }

        input.close(); // boa pratica para fechar o scanner
    }
}
