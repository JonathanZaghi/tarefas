package model;

import java.io.Serializable;

public class Pais implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private long popula��o;
	private double area;
	
	public Pais() {
		
	}
	
	public Pais(int id,String nome,long popula��o,double area) {
		this.id = id;
		this.nome = nome;
		this.popula��o = popula��o;
		this.area = area;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopula��o() {
		return popula��o;
	}

	public void setPopula��o(long popula��o) {
		this.popula��o = popula��o;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", popula��o=" + popula��o
				+ ", area=" + area + "]";
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (area == 0) {
			if (other.area != 0)
				return false;
		} else if (area != other.area)
			return false;
		if (popula��o == 0) {
			if (other.popula��o != 0)
				return false;
		} else if (popula��o!=other.popula��o)
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}



