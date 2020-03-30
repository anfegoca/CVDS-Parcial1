/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.carRental.Exception;

/**
 *
 * @author andres.gonzalez-ca
 */
public class ExceptionValorInvalido extends Exception{
    
    public static String mensajeInvalido = "VALOR INVALIDO";
    public ExceptionValorInvalido(String msj){
        super(msj);
    }
    
}
