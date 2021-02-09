package ejercicio1;

public interface Animable {
    void moveToPos(double x,double y);
    void changeDir(double angle);
    void changeVelocity(double velocity);
    void startMoving();
    void stopMoving();
}
