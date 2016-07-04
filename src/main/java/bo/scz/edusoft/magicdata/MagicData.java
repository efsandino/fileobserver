/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.scz.edusoft.magicdata;

import bo.scz.edusoft.magicdata.file.FileManager;
import bo.scz.edusoft.magicdata.gui.MagicDataDesktop;
import bo.scz.edusoft.magicdata.utils.ArgumentManager;

/**
 *
 * @author eduardo
 */
public class MagicData {

    public void doMagic() {
        FileManager fm = new FileManager();
        //fm.listRoots();
        fm.displayDrives( fm.listDrives() );
           //     fm.listDrives()
    }

    public static void main(String[] args) {
  

        ArgumentManager am = new ArgumentManager(args);

        boolean modeConsole = am.hasArgument("-c");

        if (modeConsole) {
            MagicData md = new MagicData();
            md.doMagic();
        } else {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MagicDataDesktop().setVisible(true);
                }
            });
        }
    }

}
