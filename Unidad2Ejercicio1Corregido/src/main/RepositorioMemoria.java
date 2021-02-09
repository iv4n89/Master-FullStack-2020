package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMemoria implements IRepositorio{
    private List<Consumible> consumibles = new ArrayList<>();

    @Override
    public void add(Consumible c) {
        consumibles.add(c);
    }

    @Override
    public void remove(Consumible c) {
        consumibles.remove(c);
    }

    @Override
    public void update(Consumible c) {
        int pos=consumibles.indexOf(c);
        if(pos>0) consumibles.set(pos, c);
    }

    @Override
    public Consumible[] selectCaducados() {
        //List<Consumible> aux= new ArrayList<>();
        //for(var c:consumibles) aux.add(c);
        //return aux.toArray(n->new Consumible[n]);
        return consumibles.stream().filter(c->c.isCaducado()).toArray(n->new Consumible[n]);
    }

    @Override
    public Refresco[] selectGuardarNevera() {
        return consumibles.stream().filter(c->(c instanceof Refresco)&&((Refresco) c).isGuardarNevera()).toArray(n->new Refresco[n]);
    }
}
