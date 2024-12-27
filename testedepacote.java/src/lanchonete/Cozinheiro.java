package lanchonete;

public class Cozinheiro {

    public void adicionarLancheNobalcao() {
        System.out.println("Adicionando lanche natural hamburguer no balcao");
    }


    public void adicionarSucoNobalcao() {
        System.out.println("Adicionando suco no balcao");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNobalcao();
        adicionarSucoNobalcao();
    }

    public void prepararLanche() {
        System.out.println("Preparando lanche tipo hamburguer");
    }

    public void prepararVitamina() {
        System.out.println("Preparando vitamina");
    }

    public void selecionarIngredientesLanche() {
        System.out.println("Selecionado o PAO, SALADA, OVO E CARNE");
    }

    public void selecionarIngredientesVitamina() {
        System.out.println("Selecionado FRUTA, LEITE E SUCO");
    }

    public void lavarIngredientes() {
        System.out.println("Lavando ingredientes");
    }

    public void baterVitaminaLiquidificador() {
        System.out.println("Batendo vitamina liquidificador");
    }

    public void fritarIngredienteslanche() {
        System.out.println("Fritando a CARNE E OVO PARA O HAMBURGUER");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife) {
        almoxarife.entregarIngredientes();
    }
}






