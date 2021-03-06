package com.segurosx.models;
import com.segurosx.models.Seguro;
import java.util.ArrayList;
import java.util.List;
import com.segurosx.models.interfaces.IDetalleSeguro;

public class Cliente {
    
    private String nombre;
    private List<Seguro> seguros;

    public Cliente(String nombre)   {

        this.nombre = nombre;
        this.seguros = new ArrayList<Seguro>();
    }

    public void setCompraSeguro(Seguro seguro) {

        this.seguros.add( seguro );
    }

    public void getListaSeguroCliente()    {

        System.out.println("Nombre: " + this.nombre );
        for (Seguro seguro : seguros )  {

            System.out.println( "Seguro: " + seguro.getDetalleSeguro());
        }
        
    }
}