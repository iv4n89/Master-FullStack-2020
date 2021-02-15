package ejercicio1;

public interface Animable {
    void ubicar(double x, double y);
    void cambiarDireccion(double angulo);
    void cambiarVelocidad(double metrosPorSegundo);
    void mover();
    void parar();
}
