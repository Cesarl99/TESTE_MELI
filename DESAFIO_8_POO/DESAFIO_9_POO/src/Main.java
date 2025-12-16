import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Biblioteca b = new Biblioteca();
        while (true) {

            System.out.println("DIGITE A OPÇÃO DESEJADA:");
            System.out.println("0 - PARA FINALIZAR O SISTEMA: ");
            System.out.println("1 - PARA REALIZAR O CADASTRO DE UM LIVRO: ");
            System.out.println("2 - PARA REALIZAR O CADASTRO DE UMA REVISTA:");
            System.out.println("3 - BUSCAR LIVRO/REVISTA POR TITULO: ");
            System.out.println("4 - LISTAR TODOS OS LIVRO E REVISTA: ");

            int opcao = scanner.nextInt();
            String titulo;
            String autor;
            int anoPublicacao;
            int edicao;
            switch (opcao) {
                case 0:
                    System.out.println("FIM !!! ");
                    break;
                case 1:
                    System.out.println("CADASTROS LIVRO");
                    System.out.print("TITULO DO LIVRO: ");
                    titulo = scanner.next();
                    System.out.print("NOME DO AUTOR: ");
                    autor = scanner.next();
                    System.out.print("ANO DE PUBLICACAO: ");
                    anoPublicacao = scanner.nextInt();
                    Livro l = new Livro();
                    l.setAnoPublicacao(anoPublicacao);
                    l.setAutor(autor);
                    l.setTitulo(titulo);
                    b.adiconarLivro(l);
                    break;
                case 2:
                    System.out.println("CADASTROS REVISTA");
                    System.out.println("TITULO DA REVISTA: ");
                    titulo = scanner.next();
                    System.out.println("NOME DO AUTOR: ");
                    autor = scanner.next();
                    System.out.println("ANO DE PUBLICACAO: ");
                    anoPublicacao = scanner.nextInt();
                    System.out.println("EDIÇÃO: ");
                    edicao = scanner.nextInt();
                    Revista r = new Revista();
                    r.setAnoPublicacao(anoPublicacao);
                    r.setAutor(autor);
                    r.setTitulo(titulo);
                    r.setEdicao(edicao);
                    b.adiconarLivro(r);
                    break;
                case 3:
                    System.out.println("PESQUISA POR TITULO");
                    String TituloPesquisado = scanner.next();
                    Livro l3 = b.buscarLivroPorTitulo(TituloPesquisado);
                    String tipo = l3.getTipo();
                    System.out.println( tipo + "ENCONTRADA");
                    System.out.println("TITULO : "+ l3.getTitulo());
                    System.out.println("AUTOR : "+ l3.getAutor());
                    System.out.println("ANO DA PUBLICAÇÃO: "+ l3.getAnoPublicacao());

                    if (l3 instanceof Revista r1) {
                        System.out.println("EDIÇÃO : " + r1.getEdicao());
                    }
                    break;
                case 4:
                    System.out.print("LISTAR TODOS OS LIVROS/REVISTAS PRESENTE NA BIBLIOTECA");
                    b.listarLivros();
                    break;
                default:
                    System.out.println("OPÇÃO INVALIDA");
            }
            if (opcao == 0){
                break;
            }
        }


//
//
//
//
//        Livro l = new Livro();
//        l.setAnoPublicacao(2020);
//        l.setAutor("Gg");
//        l.setTitulo("Vida loka");
//
//
//
//        Revista r = new Revista();
//        r.setEdicao(1);
//        r.setAutor("Cesar");
//        r.setAnoPublicacao(2023);
//        r.setTitulo("abc");
//
//
//        Biblioteca b = new Biblioteca();
//        b.adiconarLivro(l);
//        b.adiconarLivro(l2);
//        b.adiconarLivro(r);
//
//
//
//        Livro l3 = b.buscarLivroPorTitulo("abc");
//        String tipo = l3.getTipo();
//        System.out.println("TIPO DO RETORNO " + tipo);
//
//
////        System.out.println(l3.getTitulo());
////        System.out.println(l3.getAutor());
////        System.out.println(l3.getAnoPublicacao());
////
////        if (l3 instanceof Revista) {
////            Revista r1 = (Revista) l3;
////            System.out.println("Edição: " + r1.getEdicao());
////        }
//
//        b.listarLivros();
//



    }


}




