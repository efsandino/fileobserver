/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bo.scz.edusoft.magicdata.file;

import bo.scz.edusoft.magicdata.model.type.DriveInfo;
import bo.scz.edusoft.magicdata.utils.CommonFileUtils;
import java.io.File;
import java.sql.DriverPropertyInfo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class FileManager {
    

    public List<DriveInfo> listDrives(){
        ArrayList<DriveInfo> drivers = new ArrayList<DriveInfo>();
        File[] roots = File.listRoots();
        for(File root:roots){
            long total = root.getTotalSpace();
            long free = root.getFreeSpace();
            String path= root.getAbsolutePath();
            DriveInfo dInfo = new DriveInfo(path, free,total);
            drivers.add(dInfo);
        }
        return drivers;
    }
    
    private void log(String value){
        System.out.println(value);
    }
    
    public void displayDrives(List<DriveInfo> drives){
        for(DriveInfo drive:drives){
            log("Drive: " + drive.getDrive());
            log("  Total Space:" + CommonFileUtils.getGigas( drive.getTotalSpace()));
            log("  Available  :" + CommonFileUtils.getGigas(drive.getAvailableSpace()) + " Free: " + drive.getFreePercentage() + "%");
        }
    }
    
    
    /**
     * Metodo que lista las particiones del Sistema Operativo
     */ 
     public File[] listRoots(){
        File[] roots=File.listRoots();
        for(File root:roots){
            System.out.println(root);
            System.out.println(root + " FreeSpace: " + CommonFileUtils.getGigas(root.getFreeSpace()) + " OF:" +
                    
                    CommonFileUtils.getGigas(root.getTotalSpace()));
            System.out.println(root + " FreeSpace: " + CommonFileUtils.getGigas(root.getFreeSpace()) + " OF:" + 
                    CommonFileUtils.getGigas(root.getTotalSpace()));
        }
        return roots;
    }
     
     
    
}
