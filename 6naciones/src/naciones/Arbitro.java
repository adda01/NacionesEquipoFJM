package naciones;

public class Arbitro{
	
	 private int precisionA;
	 private String nombreA;
	 private String apellidoA;
	 private double peso;
	 private String acta;

	    public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getActa() {
		return acta;
	}

	public void setActa(String acta) {
		this.acta = acta;
	}

		public Arbitro() {
	        super();
	        precisionA = 0;
	    }

	    public Arbitro(Arbitro arbitro) {
	        precisionA = arbitro.precisionA;
	    }

	    public Arbitro(String nombreA, String apellidoA, String nombre,  int precisionA, double peso, String acta) {
	        this.precisionA = precisionA;
	        this.nombreA= nombreA;
	        this.apellidoA = apellidoA;
	        this.peso = peso;
	        this.acta = acta;
	    }

	    public int getprecision() {
	        return precisionA;
	    }

	    public void setprecision(int precision) {
	        this.precisionA = precision;
	    }

	    @Override

	    public String toString() {
	        return "Arbitro{" + "precision=" + precisionA + "nombre: " + nombreA + "apellido: " + apellidoA + peso + "peso" + acta + "acta: " +  '}';
	    }

	    //METODO EMPEZAR PARTIDO
	    
	    public void empezarPartido() {
	    	
	    	System.out.println("El arbitro pita el comienzo");
	    
	    }
	    public void finalPartido() {
	    
	    	System.out.println("El arbitro pita el final");
	    	
	    }

}
