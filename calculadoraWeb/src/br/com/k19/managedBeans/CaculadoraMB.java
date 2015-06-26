package br.com.k19.managedBeans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import br.com.k19.sessionbeans.Calculadora;

@ManagedBean
public class CaculadoraMB {
	
	@EJB
	private Calculadora calculadora;
	
	private double a, b, resultado;
	
	public CaculadoraMB() {
	}
	
	public void soma(){
		this.resultado = calculadora.soma(a, b);
	}

	public Calculadora getCalculadora() {
		return calculadora;
	}

	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	
}
