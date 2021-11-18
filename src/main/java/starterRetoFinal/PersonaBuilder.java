package starterRetoFinal;



public class PersonaBuilder {

Persona persona = new Persona();
	
	public PersonaBuilder()
	{
		
	};
	
	public PersonaBuilder nombre(String nombre)
	{
		persona.setNombre(nombre);
		
		return this;
	}
	
	public PersonaBuilder edad(int edad)
	{
		persona.setEdad(edad);
		
		return this;
	}
	
	public PersonaBuilder tipoMiembro(String tipoMiembro)
	{
		persona.setTipoMiembro(tipoMiembro);
		
		return this;
	}
	
	
	public Persona build()
	{
		
		//esto no creo que deberia hacerse pero me estaba dando un error y era la unica manera de solucionarlo
		Persona personatmp = new Persona();
		
		personatmp = persona;
		
		persona = new Persona();
		
		return personatmp;
	}
}
