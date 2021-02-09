package main;

public interface IRepositorio {
    void add(Consumible c);
    void remove(Consumible c);
    void update(Consumible c);
    Consumible[] selectCaducados();
    Refresco[] selectGuardarNevera();
}
