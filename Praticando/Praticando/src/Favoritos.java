import java.util.ArrayList;
import java.util.List;

public class Favoritos {
    
    List<Site> sites; // criando a lista 

    public Favoritos() {

        sites = new ArrayList<Site>() ;
    }

    public void MonstrarnaTela () {


        System.out.println("LISTA DE FAVORITOS!!!Z");
        // AQUI EU EU USEI ESTE COMANDO PARA MOSTRAR OS VALORES NA TELA , DA ARRAYLIST .
            for (Site s : sites){
                System.out.println(s.nome + "///////" + s.url);

            }
    }

        public void Executa () {

            sites.add(new Site( "SITE 1 , " , "WWW.SITE1.COM"));
            sites.add(new Site( "SITE 2 , " , "WWW.SITE2.COM"));
            sites.add(new Site( "SITE 3 , " , "WWW.SITE3.COM"));
            MonstrarnaTela();


          //   sites.remove(1); remove pelo indíce
        }










        public List<Site> getSites() {
            return sites;
        }
    
}
