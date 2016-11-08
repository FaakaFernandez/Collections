package ar.edu.unlam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import org.junit.Test;

public class testPersona {

	@Test
	public void testQueAdmitaDuplicados() {
		List<Persona> miLista = new ArrayList<Persona>();

		Persona p1 = new Persona("Dario");
		Persona p2 = new Persona("Carlos");
		Persona p3 = new Persona("Dario");
		miLista.add(p1);
		miLista.add(p2);
		miLista.add(p3);
		Assert.assertTrue(miLista.size());
	}

	@Test
	public void testQueNoAdmitaDuplicados() {
		Set<Persona> miLista2 = new HashSet<Persona>();

		Persona p1 = new Persona("Dario");
		Persona p2 = new Persona("Carlos");
		Persona p3 = new Persona("Dario");
		miLista2.add(p1);
		miLista2.add(p2);
		miLista2.add(p3);
		Assert.assertTrue(miLista2.size());
	}
}
