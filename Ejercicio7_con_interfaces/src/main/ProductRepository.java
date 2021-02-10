package main;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IRepository<Products>{
    static private final List<Products> productsList;

    static {
        productsList=new ArrayList<>();
    }


    @Override
    public boolean addObj(Products object) {
        return !productsList.contains(object) && productsList.add(object);
    }

    @Override
    public void editObj(int position, Products object) {
        productsList.set(position, object);
    }

    @Override
    public void removeObj(Products object) {
        productsList.remove(object);
    }

    @Override
    public Products getObj(int position) {
        return productsList.get(position);
    }

    @Override
    public int findObj(Products object) {
        return productsList.indexOf(object);
    }

    @Override
    public Products[] findAllObj() {
        return productsList.toArray(new Products[0]);
    }

    @Override
    public Products[] findObjByName(String name) {
        return productsList.stream().filter(a->a.getName().equals(name)).toArray(Products[]::new);
    }

    @Override
    public Products[] findObjByCode(char character) {
        return productsList.stream().filter(a->a.getCode().charAt(0)==character).toArray(Products[]::new);
    }
}
