package com.example.codingquestions.misc;

import java.util.ArrayList;
import java.util.List;

public class PixelColor {
    public static List<String> closestColour(List<String> pixels) {
        List<String> result = new ArrayList<>();

        // Define color values
        int[][] colors = {
                {0, 0, 0},       // Black
                {255, 255, 255}, // White
                {255, 0, 0},     // Red
                {0, 255, 0},     // Green
                {0, 0, 255}      // Blue
        };

        // Parse each pixel and find the closest color
        for (String pixel : pixels) {
            int r = Integer.parseInt(pixel.substring(0, 8), 2);
            int g = Integer.parseInt(pixel.substring(8, 16), 2);
            int b = Integer.parseInt(pixel.substring(16), 2);

            double minDistance = Double.MAX_VALUE;
            List<String> closestColors = new ArrayList<>();

            // Calculate distance to each color
            for (int i = 0; i < colors.length; i++) {
                int colorR = colors[i][0];
                int colorG = colors[i][1];
                int colorB = colors[i][2];

                double distance = Math.sqrt(Math.pow(r - colorR, 2) + Math.pow(g - colorG, 2) + Math.pow(b - colorB, 2));


                // Update minimum distance and closest color(s)
                if (distance < minDistance) {
                    minDistance = distance;
                    closestColors.clear();
                    closestColors.add(getColorName(i));
                } else if (distance == minDistance) {
                    closestColors.add(getColorName(i));
                }
            }

            // Determine output based on closest color(s)
            if (closestColors.size() == 1) {
                result.add(closestColors.get(0));
            } else {
                if (minDistance == 0) {
                    result.add("Black");
                } else {
                    result.add("Ambiguous");
                }
            }
        }

        return result;
    }

    // Helper method to get color name from index
    private static String getColorName(int index) {
        switch (index) {
            case 0:
                return "Black";
            case 1:
                return "White";
            case 2:
                return "Red";
            case 3:
                return "Green";
            case 4:
                return "Blue";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        List<String> pixels = new ArrayList<>();
        pixels.add("000000010111111101110111");

        List<String> result = closestColour(pixels);
        for (String color : result) {
            System.out.println(color);
        }
    }
//    public static void main(String[] args) {
//        List<String> pixels = new ArrayList<>();
////        pixels.add("001111100000110110000110");
////        pixels.add("110110001001011100101100");
////        pixels.add("001101110001001010101010");
////        pixels.add("110101101001000000110100");
//        pixels.add("000000010111111101110111");
////        pixels.add("011111111010011100001001");
////        pixels.add("011001111011000101100000");
////        pixels.add("111010010010011111010111");
////        pixels.add("000111111100011000101101");
////        pixels.add("111110100001011110111111");
////        pixels.add("101001110001000000111111");
////        pixels.add("011000100001001011111111");
////        pixels.add("110110001001110001000010");
////        pixels.add("111001000000110100011101");
////        pixels.add("100100111011100111100000");
////        pixels.add("110110101100111111000011");
////        pixels.add("010111110101011111010100");
////        pixels.add("111111111000000101110001");
////        pixels.add("010010100101100100010111");
////        pixels.add("010110101011111000011000");
//
//        List<String> result = closestColour(pixels);
//        for (String color : result) {
//            System.out.println(color);
//        }
//    }
}

/*
Blue
Red
Blue
Red
Black
Green
Green
Red
Green
Red
Red
Blue
Red
Red
White
White
Blue
Red
Black
Green
 */
