/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.hack.fxinterfaceproject;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Emmanuelle
 */
public class InfoTemp extends StackPane{
    
  
    
    Text texteTemp = new Text("Les îlots de chaleur urbains causent une augmentation du smog et dégradent la qualité. Aussi, "
            + "ils créent \nun plus grand besoin en réfrigération, augmentant la consommation d’énergie et "
            + "d’eau potable.");
    
    public InfoTemp(){
        
        this.setMaxSize(1400, 90);//Était 1500 850
        this.setPrefSize(1400, 90);//Était 1500 850
        this.setStyle("-fx-background-color: #333333;");
        
       
        
        texteTemp.setFont(Font.font("verdana", 24));
        texteTemp.setFill(Color.WHITE);
        texteTemp.setTextAlignment(TextAlignment.CENTER);
        
        
        this.getChildren().add(texteTemp);
    }
}
