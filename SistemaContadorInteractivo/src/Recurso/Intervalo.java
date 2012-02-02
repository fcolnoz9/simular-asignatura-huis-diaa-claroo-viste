package Recurso;
public class Intervalo {
	
private int valor, minimo, maximo;

public Intervalo(int min, int val, int max) {
	if ((min <=val) && (val <= max)) {
		minimo = min; valor = val; maximo = max;
	}else {
		minimo = 0; valor = 12; maximo = 20;
	}
}
public void setValor(int val) { 
	valor=val; 
	}
public boolean isValorCorrecto(int val) {
	return ((minimo <=val) && (val <= maximo)); 
	}
public int getValor() { 
	return valor;
	}
public int getMinimo() { 
	return minimo; 
	}
public int getMaximo() { 
	return maximo; 
	}
public void incrementar() { 
	setValor (getValor() + 1); 
	}
public boolean esIncrementable() {
	return (getValor() < getMaximo()); 
	}
public void decrementar() { 
	setValor (getValor() - 1); 
	}
public boolean esDecrementable() {
	return (getValor()>getMinimo());
	}
}