import java.util.Scanner;

public class Uso_Enum {

	//enum Talle_Camiseta{Pequeno,Mediano,Grande,XGrande,XXGrande};
	
	enum Talle{
		
		CHICO("S"), MEDIANO("M"), GRANDE("L"),MUY_GRANDE("XL");
		
		private Talle(String abreviatura) {
			
			this.abreviatura = abreviatura;
		}
		
		public String getAbreviatura(){
			 return this.abreviatura;
		}
		
		private String abreviatura;
		
	}
	
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe un talle: (CHICO, MEDIANO GRANDE MUY_GRANDE)");
		
		String entrada_datos = entrada.next().toUpperCase();
		
		Talle elTalle = Enum.valueOf(Talle.class, entrada_datos);
		
		System.out.println("Talle=\t\t" + elTalle);
		System.out.println("La abreviatura=\t" + elTalle.abreviatura);
		
		
		
		
		
		entrada.close();
		
		
		
		
		/*String _talle_camiseta;
		
		_talle_camiseta = "P";
		
		_talle_camiseta = "M";
		
		_talle_camiseta = "G";
		
		_talle_camiseta = "Azul"; *///ESTO NO CORRESPONDE, SE USA enum
		
		
		/*
		Talle_Camiseta s = Talle_Camiseta.Pequeno;
		
		Talle_Camiseta m = Talle_Camiseta.Mediano;
		
		Talle_Camiseta g = Talle_Camiseta.Grande;
		
		*/
		
		
		
	}

}
