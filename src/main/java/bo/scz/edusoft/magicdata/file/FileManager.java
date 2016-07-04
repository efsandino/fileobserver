/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bo.scz.edusoft.magicdata.file;

import java.io.File;

/**
 *
 * @author eduardo
 */
public class FileManager {
    
    /**
     * Transforma Bytes a Gigas
     */
    private long getGigas(long value){
        return value / 1024 / 1024 / 1024;
    }
    
    /**
     * Metodo que lista las particiones del Sistema Operativo
     */ 
     public File[] listRoots(){
        File[] roots=File.listRoots();
        for(File root:roots){
            System.out.println(root);
            System.out.println(root + " FreeSpace: " + root.getFreeSpace() + " OF:" + root.getTotalSpace());
            System.out.println(root + " FreeSpace: " + getGigas(root.getFreeSpace()) + " OF:" + 
                    getGigas(root.getTotalSpace()));
        }
        return roots;
    }
     
     
    
}
