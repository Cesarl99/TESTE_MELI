import java.util.ArrayList;


public class Biblioteca {

    private ArrayList<Livro> biblioteca = new ArrayList<>();

    public void adiconarLivro(Livro livro){
        biblioteca.add(livro);
    }

    public void listarLivros(){
        for(Livro l : biblioteca){
            l.exibirDetalhes();
        }
    }

    public Livro buscarLivroPorTitulo(String tituloPesquisado){

        for(Livro b : biblioteca){
            if(b.getTitulo().equalsIgnoreCase(tituloPesquisado)) {
                return b;
            }
        }
        return null;
    }


}
