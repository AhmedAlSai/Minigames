/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xo;

/**
 *
 * @author Sherif Ashraf
 */
import java.util.Timer;
import java.util.TimerTask;
public class Xo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//         MainMenu mm=new MainMenu();
//         mm.setVisible(true);
//        Games3 g=new Games3();
//        g.setVisible(true);
        //first f=new first();
       // f.setVisible(true);
//           first f=new first();
//            f.setVisible(true);

        first f=new first();
        f.setVisible(true);
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
           @Override
           public void run() {
             // Your database code here
                   f.setVisible(false);
                   Games3 g=new Games3();
                   g.setVisible(true);
                }
            }, 1*1000);


    }
    
}
