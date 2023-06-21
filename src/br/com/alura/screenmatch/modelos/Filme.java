public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double notaAvaliacao;
    private int totalDeAvaliacao;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Filme: " + nome);
        System.out.println("Ano do Lançamento: " + anoDeLancamento );
    }

    void avaliar(double nota){
        notaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    double pegaMedia(){
        return notaAvaliacao / totalDeAvaliacao;
    }

    public Filme (){}

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlan(boolean incluidoNoPlan) {
        this.incluidoNoPlano = incluidoNoPlan;
    }

    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public void setTotalDeAvaliacao(int totalDeAvaliacao) {
        this.totalDeAvaliacao = totalDeAvaliacao;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean isIncluidoNoPlan() {
        return incluidoNoPlano;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
