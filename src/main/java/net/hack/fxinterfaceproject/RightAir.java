/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hack.fxinterfaceproject;

/**
 *
 * @author panbe
 */
public class RightAir extends Right{

    public RightAir() {
        this.setVisible(false);
        this.setLayoutX(100);
        this.setLayoutY(FinaleMaster.TOP_VGAP);
        this.setMaxSize(1500, 850);//Était 1500 850
        this.setPrefSize(1500, 850);//Était 1500 850
        this.setStyle("-fx-background-color: #1F1F1F;");
    }
    
    
}