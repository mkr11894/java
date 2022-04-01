package com.mayank.examproj.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.mayank.examproj.dto.ClientDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String identificacion;
    public String nombre;

    public String apellido;

    public String tipoCliente;

    public ClientDto getAsTo(){
        return new ClientDto(this.id,this.identificacion,this.nombre,this.apellido,this.tipoCliente);
    }

	public Client(long id, String identificacion, String nombre, String apellido, String tipoCliente) {
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
