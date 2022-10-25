package Fabbriche;

import Figure.CerchioConPunti;
import Figure.QuadratoConPunti;
import Figure.TriangoloConPunti;

public class CreaFormePunti implements CreaForme{

	@Override
	public void creaTriangolo() {
		TriangoloConPunti T = new TriangoloConPunti();
		T.Disegna();
	}

	@Override
	public void creaCerchio() {
		CerchioConPunti c =new CerchioConPunti();
		c.Disegna();
	}

	@Override
	public void creaQuadrato() {
		QuadratoConPunti Q=new QuadratoConPunti();
		Q.Disegna();
	}

}
