package br.univas;

class YellowState implements State {
    @Override
    public void doSomething() {
        System.out.println("Aguarde. Estado: Amarelo");
    }
}