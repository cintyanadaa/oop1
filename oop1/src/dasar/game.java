/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

/**
 *
 * @author Sindy
 */
public class game {
        public static void main(String[] args){

        // membuat objek player
        player petani = new player();

        // mengisi atribut player
        petani.name = "petani kode";
        petani.speed = 78;
        petani.healthPoin = 100;
        

        // menjalankan method
        petani.run();

        if(petani.isDead()){
            System.out.println("Game Over!");
        }
        }
}
