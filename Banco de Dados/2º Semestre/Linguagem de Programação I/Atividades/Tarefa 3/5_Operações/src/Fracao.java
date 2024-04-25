public class Fracao {
    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    private int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }

    private void simplificar() {
        int divisorComum = mdc(Math.abs(numerador), Math.abs(denominador));
        numerador /= divisorComum;
        denominador /= divisorComum;
        // Garantir que o sinal esteja no numerador
        if (denominador < 0) {
            numerador *= -1;
            denominador *= -1;
        }
    }

    public Fracao somar(Fracao outra) {
        int novoDenominador = this.denominador * outra.denominador;
        int novoNumerador = (this.numerador * outra.denominador) + (outra.numerador * this.denominador);
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtrair(Fracao outra) {
        int novoDenominador = this.denominador * outra.denominador;
        int novoNumerador = (this.numerador * outra.denominador) - (outra.numerador * this.denominador);
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao multiplicar(Fracao outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao dividir(Fracao outra) {
        if (outra.numerador == 0) {
            throw new IllegalArgumentException("Impossível dividir por zero.");
        }
        int novoNumerador = this.numerador * outra.denominador;
        int novoDenominador = this.denominador * outra.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public void imprimir() {
        System.out.println(numerador + "/" + denominador);
    }
}
