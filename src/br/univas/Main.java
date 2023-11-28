package br.univas;

public class Main {
	public static void main(String[] args) {
		// Criando instância do semáforo
		TrafficLight trafficLight = new TrafficLight();

		// Definindo diferentes estados do semáforo
		State redState = new RedState();
		State yellowState = new YellowState();
		State greenState = new GreenState();

		// Definindo o estado inicial do semáforo
		trafficLight.setState(redState);

		// Realizando ações com base no estado do semáforo
		trafficLight.doSomething(); // Saída: Pare. Estado: Vermelho

		// Mudando para o estado amarelo
		trafficLight.setState(yellowState);
		trafficLight.doSomething(); // Saída: Aguarde. Estado: Amarelo

		// Mudando para o estado verde
		trafficLight.setState(greenState);
		trafficLight.doSomething(); // Saída: Siga. Estado: Verde
	}
}