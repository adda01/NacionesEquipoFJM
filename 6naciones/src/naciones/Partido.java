package naciones;

import java.util.ArrayList;


public class Partido {
	 private Equipo equipoVisitante;
	    private Equipo equipoLocal;
	    private ArrayList<Arbitro> arbitros;

	    public Partido() {
	        equipoVisitante = new Equipo();
	        equipoLocal = new Equipo();
	        arbitros = new ArrayList<>();
	    }

	    public Partido(Equipo equipoVisitante, Equipo equipoLocal, ArrayList<Arbitro> arbitros) {
	        this.equipoVisitante = equipoVisitante;
	        this.equipoLocal = equipoLocal;
	        this.arbitros = arbitros;
	    }

	    public Equipo getequipoVisitante() {
	        return equipoVisitante;
	    }

	    public void setequipoVisitante(Equipo equipoVisitante) {
	        this.equipoVisitante = equipoVisitante;
	    }

	    public Equipo getequipoLocal() {
	        return equipoLocal;
	    }

	    public void setequipoLocal(Equipo equipoLocal) {
	        this.equipoLocal = equipoLocal;
	    }

	    public ArrayList<Arbitro> getArbitros() {
	        return arbitros;
	    }

	    public void setArbitros(ArrayList<Arbitro> arbitros) {
	        this.arbitros = arbitros;
	    }

	    @Override
	    public String toString() {
	        return "Partido{" + "equipoVisitante=" + equipoVisitante + ", equipoLocal=" + equipoLocal + ", arbitros=" + arbitros  + '}';
	    }

	    public void jugar(Estadio estadio,Arbitro arbitro) {
	    	
	    	arbitro.empezarPartido();
	    	
	    	if(equipoLocal.getMedia() > equipoVisitante.getMedia()) {
	    		equipoLocal.addGanado();
	    		equipoVisitante.addPerdido();
		    	arbitro.finalPartido();
		    	System.out.println("Gana el equipo local");
	    	}
	    	else if(equipoLocal.getMedia() < equipoVisitante.getMedia()) {
	    		equipoVisitante.addGanado();
	    		equipoLocal.addPerdido();
		    	arbitro.finalPartido();
		    	System.out.println("Gana el equipo visitante");
	    	}
	    	else if(equipoLocal.getMedia() == equipoVisitante.getMedia()) {
	    		equipoVisitante.addEmpate();
	    		equipoLocal.addEmpate();
		    	arbitro.finalPartido();
		    	System.out.println("Empate");
	    	}
	    	
	    	
	    }
	    



}
