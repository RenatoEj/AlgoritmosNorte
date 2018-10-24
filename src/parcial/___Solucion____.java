package parcial;

public class ___Solucion____ {

	double[] s = {1200.5,1600.2,700.4,1000.3,4700.1,600.0,3400.8,
			3600.6,5100.9,2000.7};
	
	
	public int tamaño(){
		return s.length ;
	}
	
	public double obtener(int pos){
		return s[pos];
	}
	public double promedio(){
		double suma = 0;
		for (double aux : s){
			suma+= aux;
		}
		return suma/s.length;
	}
	public double mayor(){
		double may = s[0];
		for(double aux : s){
			if(aux>may)
				may=aux;
		}
		return may;
	}
	public double menor(){
		double men = s[0];
		for(double aux : s){
			if(aux<men)
				men=aux;
		}
		return men;
	}
	public int mayorAlPromedio(){
		int c=0;
		for(double aux :s){
			if (aux>=promedio())
				c++;
		}
		return c;
	}
	public int menorAlPromedio(){
		int c=0;
		for(double aux :s){
			if (aux<promedio())
				c++;
		}
		return c;	
   }
	public int buscarPrimerPrecioMayorAlMinimo(){
		int pos=-1;
		for(int i=0;i<tamaño();i++){
			if(s[i]>1000) 
				return i;
		}
		return pos;
	}
	public int buscarUltimoPrecioMenorAlMinimo(){
		int pos=-1;
		for(int i=tamaño()-1;i>=0;i--){
			if(s[i]<1000) 
				return i;
		}
		return pos;
	}
}










