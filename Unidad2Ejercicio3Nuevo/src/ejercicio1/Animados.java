package ejercicio1;

public class Animados implements Animable{
    private boolean moving;
    private double posX;
    private double posY;
    private double angle;
    private double velocity;

    public Animados() {
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    @Override
    public void moveToPos(double x, double y) {
        if(!isMoving()) throw new RuntimeException("The object is not moving yet, you can not change its position!");
        else {this.setPosX(x);this.setPosY(y);}
    }

    @Override
    public void changeDir(double angle) {
        if(!isMoving()) throw new RuntimeException("The object is not moving yet, you can not change its position!");
        else{this.setAngle(angle);}
    }

    @Override
    public void changeVelocity(double velocity) {
        if(!isMoving()) throw new RuntimeException("The object is not moving yet, you can not change its position!");
        else{this.setVelocity(velocity);}
    }

    @Override
    public void startMoving() {
        if(!isMoving()) this.setMoving(true);
    }

    @Override
    public void stopMoving() {
        if(isMoving()) this.setMoving(false);
    }
}
