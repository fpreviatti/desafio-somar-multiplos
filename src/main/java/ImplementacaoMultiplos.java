public class ImplementacaoMultiplos {

    public static void main(String[] args) {
        ImplementacaoMultiplos im = new ImplementacaoMultiplos();
        int numeroAleatorio = 1 + (int) (Math.random() * 100);
        System.out.println("A soma dos múltiplos de três ou cinco abaixo do número " +numeroAleatorio +" é: "+im.somarMultiplosDeTresOuCinco(numeroAleatorio));
    }

    public int somarMultiplosDeTresOuCinco(int x){
        int somaMultiplosTresOuCinco=0;
        for(int i=x-1; i>0;i--){
            if(i%5==0 || i%3==0){
                somaMultiplosTresOuCinco = somaMultiplosTresOuCinco+i;
                System.out.println(i + " é múltiplo de 3 ou 5") ;
            }
        }
        return somaMultiplosTresOuCinco;
    }
}
