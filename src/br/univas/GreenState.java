package br.univas;

class GreenState implements State {
	@Override
	public void doSomething() {
		System.out.println("Siga. Estado: Verde");
	}
}