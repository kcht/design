/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author KCH
 */
public class MatrixMultiply {
    public static Matrix multiply(Matrix m1, Matrix m2){
        Matrix matrix = new Matrix();
        
        try{
            
            
            int m1rows = m1.getRows();
            int m2rows = m2.getRows();
            int m1cols = m1.getCols();
            int m2cols = m2.getCols();
            
            if(m1cols != m2rows){
                throw new Exception();
            }
            
            for(int row = 1 ; row<= m1rows; row++){
                for(int col = 1; col<=m2cols; col++){
                    for(int i = 1 ; i<=m2rows ; i++){
                    String czlon1 = m1.getElem(row, i);
                    String czlon2 = m2.getElem(i, col );
                    String sum = czlon1+"*"+czlon2;
                    matrix.addElem(row, col,sum);
                }
            }
            
        }
        catch(Exception e){
            System.out.println("wrong dimensitons");
        }
    }
}
