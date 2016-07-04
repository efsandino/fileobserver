/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.scz.edusoft.magicdata.utils;

/**
 *
 * @author eduardo
 */
public class CommonFileUtils {

    public static long getGigas(long value) {
        return value / 1024 / 1024 / 1024;
    }
    
    public static double getPercentage(long part, long total){
        if(total>0){
            
            return ( ((double)(part * 100) / (double)total));
        }else{
            return 0.0d;
        }
    }
}
