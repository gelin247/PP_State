package br.univas;

class TrafficLight {
	private State state;

	public void setState(State newState) {
		this.state = newState;
	}

	public void doSomething() {
		state.doSomething();
	}
}