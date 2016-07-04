/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bo.scz.edusoft.magicdata;

import bo.scz.edusoft.magicdata.file.FileManager;
import java.io.File;


/**
 *
 * @author eduardo
 */
public class MagicData {
    
    public void doMagic(){
        FileManager fm = new FileManager();
        fm.listRoots();
    }
    
    public static void main(String[] args) {
        MagicData md = new MagicData();
        md.doMagic();
    }
    
    
}
