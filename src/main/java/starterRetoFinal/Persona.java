package starterRetoFinal;

import java.util.Comparator;
import java.util.Objects;

public class Persona{
	
	String nombre;
	int edad;
	String tipoMiembro;
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTipoMiembro() {
		return tipoMiembro;
	}
	public void setTipoMiembro(String tipoMiembro) {
		this.tipoMiembro = tipoMiembro;
	}
	@Override
	public String toString() {
		return "Datos de Miembro [nombre=" + nombre + ", edad=" + edad + ", tipoMiembro=" + tipoMiembro + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre, tipoMiembro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return edad == other.edad && Objects.equals(nombre, other.nombre)
				&& Objects.equals(tipoMiembro, other.tipoMiembro);
	}

	
	
	

}
