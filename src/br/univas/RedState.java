package br.univas;

class RedState implements State {
	@Override
	public void doSomething() {
		System.out.println("Pare. Estado: Vermelho");
	}
}