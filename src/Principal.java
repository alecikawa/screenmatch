import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome( "O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme : " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(5);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorTemporada(50);
        System.out.println("Duração para maratonar Lost : " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome( "Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoAlec = new Filme();
        filmeDoAlec.setDuracaoEmMinutos(200);
        filmeDoAlec.setNome("Duna");
        filmeDoAlec.setAnoDeLancamento(2022);
        filmeDoAlec.avalia(10);

        ArrayList<Filme> listDeFilmes = new ArrayList<>();
        listDeFilmes.add(filmeDoAlec);
        listDeFilmes.add(meuFilme);
        listDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listDeFilmes.size());
        System.out.println("Primeiro Filme " + listDeFilmes.get(0).getNome());
        System.out.println(listDeFilmes);
        System.out.println("toString do filme " + listDeFilmes.get(0).toString());


    }

}
