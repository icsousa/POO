public class ficha1 {

    public String saudacao(String nome) {
        return "Olá " + nome + "!";
    }

    /**
     * Exercícios II - 1.
     * @param grau Graus Celcius que o utilizador quer converter
     * @return Devolve os graus celcius convertidos em fahrenheit
     */
    public double celParaFar(double grau) {
        return grau * (1.8) + 32;
    }

    /**
     * Exercícios II - 2.
     * @param a Um dos números que queremos comparar 
     * @param b Segundo número que queremos comparar
     * @return Devolve o maior número
     */
    public int maximoNumeros(int a, int b) {
        return (a > b) ? a : b;
    }

    /**
     * Exercícios II - 3.
     * @param nome Nome do utilizador
     * @param saldo Saldo do utilizador
     * @return Devolve um frase com o nome e o saldo do utilzador
     */
    public String criaDescricaoConta(String nome, int saldo) {
        return "Olá " + nome + ", o seu saldo é " + saldo + ".";
    }

    /**
     * Exercícios II - 4.
     * @param valor Valor a ser convertido
     * @param taxaConversao Taxa de conversão
     * @return Valor convertido de euro para libra
     */
    public double eurosParaLibras(double valor, double taxaConversao) {    
        return valor * taxaConversao; 
    }

    /**
     * 
     * @param a
     * @param b
     * @return
     */
    public String ordemCrescenteMedia(int a, int b) {
        return "Os valores por ordem crescente são" + ordemCrescente(a, b) + " e a média é " + media(a, b);
    }

    private String ordemCrescente(int a, int b) {
        if (a > b) {
            return "1- " + b + ", 2- " + a;
        } 
        return "1- " + a + ", 2- " + b;
    }

    private double media(int a, int b) {
        return (a + b) / 2;
    }
}

