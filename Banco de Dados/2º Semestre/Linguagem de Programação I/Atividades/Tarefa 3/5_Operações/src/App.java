public class App {

    public static void main(String[] args) {
        Fracao f1 = new Fracao(2, 5);
        Fracao f2 = new Fracao(3, 7);
        Fracao f3 = new Fracao(4, 3);
        Fracao f4 = new Fracao(2, 7);
        Fracao f5 = new Fracao(10, 3);
        Fracao f7 = new Fracao(5, 1);
        Fracao f9 = new Fracao(5, 3);
        Fracao f10 = new Fracao(7, 4);
        Fracao f11 = new Fracao(2, 1);
        Fracao f12 = new Fracao(1, 3);
        Fracao f13 = new Fracao(5, 4);
        Fracao f14 = new Fracao(5, 2);
        Fracao f17 = new Fracao(3, 2);

        Fracao soma = f1.somar(f2);
        System.out.print("Soma: ");
        soma.imprimir();

        Fracao subtracao = f3.subtrair(f4);
        System.out.print("Subtração: ");
        subtracao.imprimir();

        Fracao subtracao2 = f5.subtrair(f3);
        System.out.print("Subtração: ");
        subtracao2.imprimir();

        Fracao soma2 = f7.somar(f4);
        System.out.print("Soma: ");
        soma2.imprimir();

        Fracao multiplicar = f9.multiplicar(f10);
        System.out.print("Multiplicação: ");
        multiplicar.imprimir();

        Fracao soma3 = f11.somar(f12);
        Fracao subtracao3 = soma3.subtrair(f13);
        System.out.print("Operação soma e sutração: ");
        subtracao3.imprimir();

        Fracao subtracao4 = f3.subtrair(f1);
        Fracao multiplicar2 = subtracao4.multiplicar(f14);
        System.out.print("Operação subtração e multiplicação: ");
        multiplicar2.imprimir();

        Fracao soma4 = f3.somar(f1);
        Fracao soma5 = soma4.somar(f17);
        System.out.print("Soma: ");
        soma5.imprimir();

        Fracao dividir = f13.dividir(f12);
        System.out.print("Divisão: ");
        dividir.imprimir();

    }
}
