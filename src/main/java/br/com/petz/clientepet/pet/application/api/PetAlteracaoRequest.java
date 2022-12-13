package br.com.petz.clientepet.pet.application.api;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.petz.clientepet.pet.domain.Porte;
import br.com.petz.clientepet.pet.domain.SexoPet;
import br.com.petz.clientepet.pet.domain.TipoPet;
import lombok.Value;

public class PetAlteracaoRequest {
	@Value
	public class PetAlteracaoRiquest {
		@NotBlank
		private String nomePet;
		private Porte porte;
		@NotNull
		private TipoPet tipo;
		private String microchip;
		@NotBlank
		private String raca;
		@NotNull
		private SexoPet sexo;
		private String pelagemCor;
		@NotNull
		private LocalDate dataNascimento;
		private String rga;
		private Integer peso;

	}

	public @NotBlank String getNomePet() {
		return null;
	}

	public Porte getPorte() {
		return null;
	}

	public @NotNull TipoPet getTipo() {
		return null;
	}

	public String getMicrochip() {
		return null;
	}

	public @NotBlank String getRaca() {
		return null;
	}

	public @NotNull SexoPet getSexo() {
		return null;
	}

	public String getPelagemCor() {
		return null;
	}

	public @NotNull LocalDate getDataNascimento() {
		return null;
	}

	public String getRga() {
		return null;
	}

	public Integer getPeso() {
		return null;
	}

	
}
