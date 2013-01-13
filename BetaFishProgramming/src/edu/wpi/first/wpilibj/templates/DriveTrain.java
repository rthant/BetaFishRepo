/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author admin
 */
public class DriveTrain {
    Victor fl=new Victor(1);
    Victor fr=new Victor(2);
    Victor bl=new Victor(3);
    Victor br=new Victor(4);
    Joystick lef=new Joystick(1);
    Joystick right=new Joystick(2);
    public void setSpeeds(){
        double leftmove=lef.getY();
        double rightmove = right.getY(); 
        if(leftmove>-0.1&&leftmove<0.1){
            leftmove=0;
        } 
        if(rightmove>-0.1&&rightmove<0.1){
            rightmove=0;
    }
        fl.set(leftmove);
        fr.set(rightmove);
        bl.set(leftmove);
        br.set(rightmove);
}
}