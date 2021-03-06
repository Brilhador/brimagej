/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BRImage.segmetation.color;

import java.awt.image.BufferedImage;
import java.awt.Color;

/**
 *
 * @author ANDERSON
 */
public class Shrestha {

    /*
     valore propostos no artigo:
     Detection of Corn Plant Population And Row Spacing Using Computer Vision
     d = 0.9;
     e = -0.57;
     f = 0.81;
    
    
     */
    public static boolean[][] apply(BufferedImage img, double d, double e, double f) {

        //matriz de saida
        boolean[][] output = new boolean[img.getWidth()][img.getHeight()];

        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                double red = Color.getColor("red", img.getRGB(x, y)).getRed();
                double green = Color.getColor("green", img.getRGB(x, y)).getGreen();
                double blue = Color.getColor("blue", img.getRGB(x, y)).getBlue();

                //normalização
                red = red / (red + green + blue);
                green = green / (red + green + blue);
                blue = blue / (red + green + blue);

                //Calculo proposto por shrestha
                double valor = ((Math.pow(red, 2)) / (Math.pow(d, 2))) + ((Math.pow((1 - green), 2)) / (Math.pow((e * blue + f), 2)));

                if (valor > 1) {
                    output[x][y] = false;
                } else {
                    output[x][y] = true;
                }
            }
        }

        return output;
    }

    public static boolean[][] apply(BufferedImage img) {

        //matriz de saida
        boolean[][] output = new boolean[img.getWidth()][img.getHeight()];

        double d = 0.9;
        double e = -0.57;
        double f = 0.81;

        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                double red = Color.getColor("red", img.getRGB(x, y)).getRed();
                double green = Color.getColor("green", img.getRGB(x, y)).getGreen();
                double blue = Color.getColor("blue", img.getRGB(x, y)).getBlue();

                //normalização
                red = red / (red + green + blue);
                green = green / (red + green + blue);
                blue = blue / (red + green + blue);

                //Calculo proposto por shrestha
                double valor = (Math.pow(red, 2) / Math.pow(d, 2)) + (Math.pow((1 - green), 2) / Math.pow((e * blue + f), 2));

                if (valor > 1) {
                    output[x][y] = false;
                } else {
                    output[x][y] = true;
                }
            }
        }

        return output;
    }

    public static boolean[][] index(BufferedImage img) {
        //matriz de saida
        boolean[][] output = new boolean[img.getWidth()][img.getHeight()];

        double r = -0.884;
        double g = 1.262;
        double b = -0.311;
        
        int soma = 0;

        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                double red = Color.getColor("red", img.getRGB(x, y)).getRed() * r;
                double green = Color.getColor("green", img.getRGB(x, y)).getGreen() * g;
                double blue = Color.getColor("blue", img.getRGB(x, y)).getBlue() * b;
                
                soma += ((red + green + blue) / 3);
            } 
        }
        
        int media = soma / (img.getWidth() * img.getHeight());
        System.out.println("Media=" + media);
        
        for (int x = 0; x < img.getWidth(); x++) {
            for (int y = 0; y < img.getHeight(); y++) {
                double red = Color.getColor("red", img.getRGB(x, y)).getRed() * r;
                double green = Color.getColor("green", img.getRGB(x, y)).getGreen() * g;
                double blue = Color.getColor("blue", img.getRGB(x, y)).getBlue() * b;
                
                int pixel = (int) (red + green + blue) / 3;
//                System.out.println("pixel=" + pixel);
                
                if(pixel < media){
                    output[x][y] = false;
                }else{
                    output[x][y] = true;
                }
            }
        }
        
        
        return output;
    }                
}
