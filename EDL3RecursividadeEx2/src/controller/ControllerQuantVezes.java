package controller;

public class ControllerQuantVezes {
	public ControllerQuantVezes() {
		super();
	}
	
	public int QuantVezes (int num, int i) {
		if (num == 0) { // CONDIÇÃO DE PARADA: QUANDO NUM FOR 0, RETORNAMOS 0, JÁ QUE OS DÍGITOS PARA CONTAR ACABARAM.
			return 0;
		}
		else 
			if (num % 10 == i) {
				return 1 + QuantVezes ((num/10), i);
		}
		return QuantVezes(num / 10, i);
	}

}

// COMO ESCREVER A FUNÇÃO PARA O TERMO N EM FUNÇÃO DO TERMO ANTERIOR? 
// SEMPRE QUE CHAMAMOS A FUNÇÃO DIVIDIMOS NUM POR 10 E VERIFICAMOS SE O RESTO DA DIVISÃO 
// CORRESPONDE A I. SE SIM, SOMAMOS 1 AO RESULTADO DA CHAMADA. PROSSEGUIMOS COM A RECURSIVA 
// COM NUM/10, E IGNORANDO OS VALORES A DIREITA, JÁ QUE ESTAMOS TRABALHANDO COM INT.


