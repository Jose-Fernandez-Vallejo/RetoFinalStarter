package starterRetoFinal;

import java.util.ArrayList;
import java.util.List;

public class ListaMiembros {
	
	static ListaMiembros lista = null;
	
	
		List<Persona> listaMiembros = new ArrayList<>();
		Long maxMiembros;

	
	public static ListaMiembros getInstance(Long maxMiembros)
	{
		if (lista==null) {
			
			lista = new ListaMiembros(maxMiembros);
			
		}
		
		return lista;
	};
	
	private ListaMiembros(Long maxMiembros){
		
		this.maxMiembros = maxMiembros;
		listaMiembros = new ArrayList<>();
	}
	
	public List<Persona> getMiembros()
	{
		
		return listaMiembros;
	}
	
	
	public boolean addPersona(Persona persona)
	{
		if (listaMiembros.size() >= maxMiembros) {
			
			return false;
		}
		
		listaMiembros.add(persona);
		
		
		return true;
	}
	
	public String deletePersona(Persona persona)
	{
		if (!listaMiembros.contains(persona)) {
			
			return "no existe ese miembro";
		}
		
		listaMiembros.remove(listaMiembros.indexOf(persona));
		
		
		return "miembro eliminado";
	}

}
