import br.com.alura.screenmatch.calcular.Calculadora;
import br.com.alura.screenmatch.calcular.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("\nPoderoso Chefin", 2022 );

        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliar(5);
        meuFilme.avaliar(8);
        meuFilme.avaliar(9);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        Filme outroFilme = new Filme("\nPoderoso Chefin 2", 2023);

        outroFilme.setDuracaoEmMinutos(180);

        outroFilme.exibeFichaTecnica();
        outroFilme.avaliar(5);
        outroFilme.avaliar(8);
        outroFilme.avaliar(7);

        System.out.println("Total de avaliações: " + outroFilme.getTotalDeAvaliacao());
        System.out.println(outroFilme.pegaMedia());

        Serie lost = new Serie("The Last Kingston",2019 );
        lost.exibeFichaTecnica();
        lost.setTemporada(5);
        lost.setDuracaoEmMinutos(60);

        Calculadora calc = new Calculadora();
        calc.inclui(outroFilme);
        calc.inclui(meuFilme);
        calc.inclui(lost);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
    }
}
