/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bo.scz.edusoft.magicdata.mvc.models.types;

import bo.scz.edusoft.magicdata.utils.CommonFileUtils;

/**
 *
 * @author eduardo
 */
public class DriveInfo {
    
    private final long availableSpace;
    private final long totalSpace;
    private final String drive;
    
    public DriveInfo(String drive, long availableSpace, long totalSpace){
        this.drive = drive;
        this.totalSpace = totalSpace;
        this.availableSpace = availableSpace;
    }

    public long getAvailableSpace() {
        return availableSpace;
    }

    public long getTotalSpace() {
        return totalSpace;
    }

    public String getDrive() {
        return drive;
    }
    
    public double getFreePercentage(){
        return  CommonFileUtils.getPercentage(getAvailableSpace(),getTotalSpace());
    }
    
}
