public class Revista extends Livro implements ItemBiblioteca {
    private int edicao;

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Edição: " + edicao);
    }

    public String getTipo(){
        return "Revista";
    }


}
