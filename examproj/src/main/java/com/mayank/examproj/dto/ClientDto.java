package com.mayank.examproj.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mayank.examproj.model.Client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ClientDto {
    public long id;
    public String identificacion;
    public String nombre;
    public String apellido;
    public String tipoCliente;

    @JsonIgnore
    public Client getAsEntity(){
        return new Client(this.id,this.identificacion,this.nombre,this.apellido,this.tipoCliente);
    }

	public ClientDto(long id, String identificacion, String nombre, String apellido, String tipoCliente) {
		super();
		this.id = id;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoCliente = tipoCliente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
}
