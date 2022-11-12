package co.edu.udea.naveespacial;

import java.util.ArrayList;

public class Rover {
    private int idFamilia;
    private boolean estado;
    private int nodoAterrizaje;
    private Familia tripulantes;
    private ArrayList<Integer> verticesRecorridos;
    private int kilometrosRecorridos;
    private int oxigeno;

    public Rover() {
        this.oxigeno = 100;
        this.kilometrosRecorridos = 0;
    }

    public Rover(int idFamilia, boolean estado, int nodoAterrizaje, Familia tripulantes) {
        this.idFamilia = idFamilia;
        this.estado = estado;
        this.nodoAterrizaje = nodoAterrizaje;
        this.tripulantes = tripulantes;
        this.oxigeno = 100;
        this.kilometrosRecorridos = 0;
    }
    
    public Rover(int idFamilia, boolean estado, int nodoAterrizaje) {
        this.idFamilia = idFamilia;
        this.estado = estado;
        this.nodoAterrizaje = nodoAterrizaje;
    }
    

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNodoAterrizaje() {
        return nodoAterrizaje;
    }

    public void setNodoAterrizaje(int nodoAterrizaje) {
        this.nodoAterrizaje = nodoAterrizaje;
    }

    public Familia getTripulantes() {
        return tripulantes;
    }

    public void setTripulantes(Familia tripulantes) {
        this.tripulantes = tripulantes;
    }

    public void recorridoRover(ArrayList<Rover> rovers){
        System.out.println(rovers);
        //System.out.println("llega a rover recorrido");
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public ArrayList<Integer> getVerticesRecorridos() {
        return verticesRecorridos;
    }

    public void setVerticesRecorridos(ArrayList<Integer> verticesRecorridos) {
        this.verticesRecorridos = verticesRecorridos;
    }

    @Override
    public String toString() {
        return "Rover{" + "idFamilia=" + idFamilia + ", estado=" + estado + ", nodoAterrizaje=" + nodoAterrizaje + ", tripulantes=" + tripulantes + ", verticesRecorridos=" + verticesRecorridos + ", kilometrosRecorridos=" + kilometrosRecorridos + ", oxigeno=" + oxigeno + '}';
    }

}
