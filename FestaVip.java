public class FestaVip {
    private int quantidadeCafe = 30; //atributos
    private int quantidadeSalgados = 50; //atributos

    public void entrar(){ //
        bebeCafe();
        comerSalgado();
    }

    //MODIFICADOR - RETORNO - NOME    
    private void bebeCafe(){
        quantidadeCafe = quantidadeCafe - 1;
        System.out.println("Bebeu 1 xícara de café.");
    }

    private void comerSalgado(){
        quantidadeSalgados = quantidadeSalgados - 1;
        System.out.println("Comeu 5 salgados.");
    }
}
