package com.automationteststore.testCases.Demos.DemoPractice.Collections.ArrayList_HashMap_JDBC.JavaArrays_Strings;

public class MultiDimArray {

    public static void main(String[] args) {
		
		/*int a[][]=new int [3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;*/

        int a[][] = {{100, 200}, {300, 400}, {500, 600}, {700, 800}};

        System.out.println("Number List_Scream rows:" + a.length);
        System.out.println("Number List_Scream columns:" + a[0].length);
		
		/*for(int i=0;i<a.length;i++) // outer loop  0 1 2 3
		{
			for(int j=0;j<a[i].length;j++) // inner loop 0 1
			{
				System.out.println(a[i][j]);  //100 200 300 400 500 600
			}
				
		}*/

        //Enhanced for loop

        for (int r[] : a) //500,600
        {
            for (int i : r) {
                System.out.println(i); //100 200 300 400 500 600
            }
        }


    }

}
