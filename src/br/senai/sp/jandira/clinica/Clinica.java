/*
 * Programador: Isabelle
 * Empresa: SENAI
 * Data:19-02-2025
 */


package br.senai.sp.jandira.clinica;

import java.time.LocalDate;

import br.senai.sp.jandira.clinica.model.Paciente;

public class Clinica {

	public static void main(String[] args) {
		
		// Criação dos objetos do tipo paciente
		Paciente p1 = new Paciente();
		p1.nome = "Ana Maria";
		p1.setAltura(-1.65);
		p1.setPeso(68.200);
		p1.telefone = "(11)98888-8888";
		p1.dataNascimento = LocalDate.of(2003, 2, 28);
		p1.estaInternado = true;
		
		Paciente p2 = new Paciente();
		p2.nome = "Isabelle";
		p2.setAltura(1.60);
		p2.setPeso(-53.200);
		p2.telefone = "(11)99999-9999";
		p2.dataNascimento = LocalDate.of(2007, 8, 27);
		p2.estaInternado = false;
		

				
		//Mostrar dados do paciente 1
				p1.mostrarfichaPaciente();
				p2.mostrarfichaPaciente();
	
		
	
		
		
	}

}
