package com.example;

public class motifs {
        public static void main(String[] args) {
        //Motif3
        // for(String i="*"; i.length()<=5; i+="*"){
        //     System.out.println(i);
        // }


        //Motif1
        // for (int j=1; j<=4;j++){
        //     if (j==1 || j ==4)
        //         for (int i =1; i<=40; i++){
        //             System.out.print('-');
        //         }
        //     if (j==2){
        //         for (int i=1; i <= 10; i++){
        //             System.out.print("_-^-");
        //         }
        //     }

        //     if (j==3) {
        //         for (int i=1; i<=20; i++){
        //             int out = ( i >= 10) ? i%10 : i;
        //             System.out.print(out);
        //             System.out.print(out);
        //         }
        //     }

        //     System.out.println();
        // }

        //Motif6
        // for(int i =1; i<6; i++){
        //     for(int j=5-i; j>0; j-=1){
        //         System.out.print(" ");
        //     }
        //     System.out.println(i);
        // }

            //Motif6
            // for(int i =1; i<7; i++){
            //     for(int b = i; b<7; b++){
            //         System.out.print(" ");
            //     }                    
            //     for(int j =1; j<=i; j++){
            //             System.out.print(i);
            //         }
            //     System.out.println();
            // }
            // Motif8
            // for(int i = 0; i<5; i++){
            //     for(int j=9; j>=0; j--){
            //         for(int b = 0; b<=4; b++){
            //             System.out.print(j);
            //         }
            //     }
            //     System.out.println();
            // }

            // Motif10
            // for(int i = 0; i<5; i++){
            // for(int j=9; j>=1; j--){
            //     for(int b = j; b>=1; b--){
            //         System.out.print(j);
            //     }
            // }
            // System.out.println();
            // }

            for(int i =1; i<=6; i++){
                for(int b = 1; b<i; b++){
                    System.out.print("\\");
                }
                for(int j =0; j<=22-2*i; j++){
                    System.out.print("!");
                }
                for(int b = 1; b<i; b++){
                    System.out.print("//");
                }
                System.out.println();
            }
            //th
    }
        
}