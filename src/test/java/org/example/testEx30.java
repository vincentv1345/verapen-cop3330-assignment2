package org.example;
import org.junit.jupiter.api.Test;
public class testEx30 {
        public static void main(String []args){
            createMultiplicationTable();
        }
        @Test
        public static void createMultiplicationTable(){
            for(int i = 1; i <13; i++){
                System.out.print(i+ " ");
            }
            for(int x = 2; x<13; x++){
                System.out.print("\n" + x);
            }
        }
    }
