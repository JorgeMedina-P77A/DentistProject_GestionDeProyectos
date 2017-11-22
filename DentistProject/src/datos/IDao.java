/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.ArrayList;

/**
 *
 * @author danie
 */
public interface IDao<T> {

    public boolean Insert(T obj);

    public T Buscar(int id);

    public ArrayList<T> ConsultarTodos();

    public boolean Delete(int id);

    public boolean Update(T obj);
}
