package Fabbriche;

import Figure.CerchioConCroci;
import Figure.QuadratoConCroci;
import Figure.TriangoloConCroci;

public class CreaFormeCroci implements CreaForme{

	@Override
	public void creaTriangolo() {
		TriangoloConCroci T=new TriangoloConCroci();
		T.Disegna();
	}

	@Override
	public void creaCerchio() {
		CerchioConCroci C=new CerchioConCroci();
		C.Disegna();
	}

	@Override
	public void creaQuadrato() {
		QuadratoConCroci Q=new QuadratoConCroci();
		Q.Disegna();
		
	}

}
