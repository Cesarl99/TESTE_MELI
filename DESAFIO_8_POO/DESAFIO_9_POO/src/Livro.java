import java.util.List;

public class Livro extends Item implements ItemBiblioteca{
    private String titulo;
    private String autor;
    private int anoPublicacao;


    public void exibirDetalhes(Livro livro){
        System.out.println("conteudo do livro Titulo: "+ livro.titulo + " Autor: " + livro.autor + "Ano da Publicacao" + livro.anoPublicacao);
    }

    public  String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo){
        if (titulo != null || !titulo.trim().isEmpty()){
            this.titulo = titulo;
        } else {
            System.out.println("titulo invalido");
        }

    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if (anoPublicacao > 0){
            this.anoPublicacao = anoPublicacao;
        } else{
            System.out.println("Ano de publicacao invalida");
        }

    }

    public void setAutor(String autor) {
        if (autor != null || !autor.trim().isEmpty()) {
            this.autor = autor;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void exibirDetalhes(){
        System.out.println("Livro: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Ano de Publicacao: "+ anoPublicacao);
    }

    public String getTipo(){
        return "Livro";
    }


}