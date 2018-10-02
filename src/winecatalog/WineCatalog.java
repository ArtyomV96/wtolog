/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winecatalog;

/*
 *
 * @author wans8
 */

import winecatalog.frames.HomeFrame;
import winecatalog.object.WineObject;

public class WineCatalog {

    WineObject obj = new WineObject();

    public WineObject getObj() {
        return obj;
    }

    public void setObj(WineObject obj) {
        this.obj = obj;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HomeFrame mainFrame = new HomeFrame();
        mainFrame.setVisible(true);
       
    }
    
}
