/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author adminf
 */
public class DriveTrain {
    //declarations... yet to see about Victors bl and br
     Victor fl = new Victor(2);
    Victor fr = new Victor(1);
    Victor bl = new Victor(7);
    Victor br = new Victor(8);
    Joystick lef=new Joystick(2);
    Joystick right=new Joystick(1);
    
    
    //sorry no javadoc yet
    public void setSpeeds(){
        double leftmove=-lef.getY();
        double rightmove =right.getY();
        fl.set(leftmove);
        fr.set(rightmove);
        bl.set(leftmove);
        br.set(rightmove);
        //sensitivity measures, yet to be commented in(if commented in add before the .sets)
        /*
        if(leftmove>-0.1&&leftmove<0.1){
            leftmove=0;
        } 
        if(rightmove>-0.1&&rightmove<0.1){
            rightmove=0;
    }
     */
        
}
}
