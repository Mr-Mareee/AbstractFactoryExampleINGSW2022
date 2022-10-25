package Fabbriche;
import Figure.*;
public class CreaFormeAsterischi implements CreaForme{

	@Override
	public void creaTriangolo() {
		TriangoloConAsterischi T = new TriangoloConAsterischi();
		T.Disegna();
	}

	@Override
	public void creaCerchio() {
		CerchioConAsterischi C=new CerchioConAsterischi();
		C.Disegna();
	}

	@Override
	public void creaQuadrato() {
		QuadratoConAsterischi Q=new QuadratoConAsterischi();
		Q.Disegna();
	}

}
