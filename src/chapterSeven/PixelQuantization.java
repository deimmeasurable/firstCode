package chapterSeven;

public class PixelQuantization {

    public static void main(String[] args) {
        displayOverWriteImage();
    }

    public static void displayOverWriteImage() {
        int[] image = {24, 40, 76, 88, 12, 200, 54, 70, 46, 78};

        for (int pixel = 0; pixel < image.length; pixel++) {

            if(image[pixel] >=0 && image[pixel]<=20){
                System.out.print(10 +" ");
            }
            else if(image[pixel]>=21 && image[pixel] <=40){
                System.out.print(30 + " ");
            }
            else if (image[pixel] >=41 && image[pixel] <=60){
                System.out.print(50+" ");

            }
            else if(image[pixel]>=61 && image[pixel] <=80){
                System.out.print(70+" ");
            }
            else if(image[pixel] >=81 && image[pixel] <=100){
                System.out.print(90 + " ");
            }
            else if (image[pixel] >= 101 && image[pixel] <= 120){
                System.out.print(110 + " ");
            }
            else if(image[pixel] >= 121 && image[pixel] <= 140){
                System.out.print(130+" ");
            }
            else if (image[pixel] >=141 && image[pixel] <=160){
                System.out.print(150+" ");
            }
            else if(image[pixel] >= 161 && image[pixel]>=180){
                System.out.print(170+" ");
            } else if (image[pixel] > 180) {
                System.out.print(190+ " ");

            }


        }
        System.out.print(image.length);
    }
}