package com.ism.services;

import java.util.ArrayList;

import com.ism.entities.Medecin;

public interface IService<T> {

    int  add(Medecin medecin);
    ArrayList<T> getAll();
    int update(Medecin medecin);
    T show(int id);
    int remove(int id);
    int[] remove(int[] ids);
    Medecin getById(int id);
}
