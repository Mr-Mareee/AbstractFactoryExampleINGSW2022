package General;

import java.util.Scanner;

import Fabbriche.*;
//*****************************
//USARE UN PO' DI FANTASIA SULLE FIGURE GEOMETRICHE
//*****************************
public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	CreaForme C;
	System.out.println("Inserisci che tipo di forme vorresti visionare: Croci - Asterischi - Punti");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	if (s.equals("Asterischi")) C=new CreaFormeAsterischi();
	else if (s.equals("Croci")) C=new CreaFormeCroci();
	else C=new CreaFormePunti();
	while (!s.equals("Esci")) {
		System.out.println("Inserire che tipo di forma vorresti Visualizzare, Altrimenti reinserisci uno fra: Croci - Asterischi -Punti");
		s=sc.nextLine();
		if (s.equals("Cerchio")) C.creaCerchio();
		else if (s.equals("Quadrato")) C.creaQuadrato();
		else if (s.equals("Triangolo")) C.creaTriangolo();
		else if (s.equals(("Croci"))) C=new CreaFormeCroci();
		else if (s.equals(("Punti"))) C=new CreaFormePunti();
		else if (s.equals(("Asterischi"))) C=new CreaFormeAsterischi();
		}
	System.out.println("Ciao, è stato molto bello :)");
	}
}
