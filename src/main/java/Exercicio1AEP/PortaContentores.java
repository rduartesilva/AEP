/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1AEP;

/**
 *
 * @author Duarte
 */
public class PortaContentores extends Navio{
    private int contentores;

    public PortaContentores(String matricula) {
        super(matricula);
    }

    public int getContentores() {
        return contentores;
    }

    public void setContentores(int contentores) {
        this.contentores = contentores;
    }
}
