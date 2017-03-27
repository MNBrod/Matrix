package math;
import java.util.Arrays;
/*RREF: Reduces the Matrix to its simplest form possible. If matrix corresponds to a system
 * of equations, RREF form is the solution of the system.
 * TRANSPOSE: Returns the transpose of the Matrix. Transpose of Matrix A :mxn is denoted by A^t and has dimension
 * of nxm where A^t's rows are A's columns and its columns are A's rows.
 * LINEAR INDPENDENCE TEST: It checks if the columns of the matrix is L.IND. L.IND is defined as 
 * the matrix equation Ax=0 has only the trivial Solution.
 * Determinant and Invertibility: returns the determinant of the matrix. If determinant != 0 the matrix is 
 * invertible and otherwise it is singular(non-invertible).
 */

public class MatrixCalculations {

  public static void toRREF(double[][] mat) {
    int numRow = mat.length;
    if (numRow == 0)
      return;// if numRow has reached a 0
    
    int numCol = mat[0].length;// number of columns
    
    int leadentry = 0;
    for (int r = 0; r < numRow; r++) {
      if (leadentry >= numCol)
        break;
      {
        int i = r;
        while (mat[i][leadentry] == 0) {
          i++;
          if (i == numRow) {
            i = r;
            leadentry++;
            if (leadentry == numCol)
              return;
          }
        }
        double[] dummy = mat[r];
        mat[r] = mat[i];
        mat[i] = dummy;
      } //check availabe pivots and make row interchanges accordingly
      
      {
        double scale = mat[r][leadentry];
        for (int j = 0; j < numCol; j++)
          mat[r][j] = mat[r][j]/ scale;
      }
      
      for (int i = 0; i < numRow; i++) {
        if (i != r) {
          double scale2 =  mat[i][leadentry];
          for (int j = 0; j < numCol; j++)
            mat[i][j] =mat[i][j]- scale2 * mat[r][j]; // making the entries below the leadentry all zeros.
        }
      }
      leadentry++; // move on to the next entry
    }//for Each row
    
  }// This implements a well-known pseudocode of RREF reduction algorithm. The mathmatical logic comes
  //from "Linear Algebra and Its Applications, 4th E" by David C. Lay.
  public static double[][] rrefFinal (double[][] mat){
    toRREF(mat);
    for (int i = 0; i < mat.length; i++) {
    	for (int c = 0; c < mat[i].length; c++) {
    		if (mat[i][c]==-0.0) {
    			mat[i][c] = 0.0;
    		}
    	}
    }
    return mat;
  }//rrefFinal returns a double[][] form of toRREF
  public static double[][] transFinal (double[][] mat) {
	  Transpose(mat);
	  return mat;
  }
  
  
  public static double Determinant(double[][] arry){ //method sig. takes a arry (two dimensional array), returns determinant.
    double det=0; 
    int dim =arry.length;
    int numRow = arry.length;
    int numCol = arry[0].length;
    if (numRow!=numCol){
      det =0; 
    }
    
    else{
    if(dim==1){  //Trivial case of 1x1 matrix
      det = arry[0][0];
    }else if(dim==2){//general case of 2x2 
      
     det= arry[0][0]*arry[1][1]-arry[0][1]*arry[1][0]; 
    }
    else{
    
    for(int i=0;i<dim;i++){ //start cofactor expansion using the top row
      double [][]subarry= new double[dim-1][dim-1]; //submatrix needed for the cofactor expansion
      
      for(int j=1;j<dim;j++){
        for(int k=0;k<dim;k++){
          if(k<i){
            subarry[j-1][k]=arry[j][k];
          }//"covering the row and column of containining "cofactor"
          else if(k>i){
            subarry[j-1][k-1]=arry[j][k];
          }
        }
      }
      det=det + /*The alternating sign*/Math.pow(-1,0)*arry[0][i]*(Determinant(subarry)); // recursive..
      //creates sub matrices until subarry is 2x2 then uses the simple 2x2 determinant case
    }
   
  }//else if it is a square matrix
}
    return det;
}// END DET TAKES IN DOUBLE[][] FORM RETURNS ITS DETERMINANT =DOUBLE
    
    public static boolean LINDEPENDENCE(double [][]arry){
      double [][]arry2 = rrefFinal(arry);
      int numRow = arry2.length;
      int numCol = arry2[0].length;
      int numPivot = getnumPivot(arry2);//imaginary method getnumPivot
      if(numPivot== numCol){
       return true;//means the columns are linearly independt 
        
        
      }else
      return false;//means the columns are linearly Dependent
    }//LIND --> ARE COLUMNS OF THE MATRIX LINEARLY INDEPENDENT? FALSE MEANS DEPENDENT
    
    
    public static boolean ISINVERTIBLE (double [][]arry){
      double k = Determinant (arry);
      if ( k==0 ){
        return false;//meaning the matrix is not invertible
      }else
        return true;
    }//INVERTIBILITY TRUE MEANS INVERTIBLE
    
    
    public static double [][] Transpose(double [][]arry){
     int numRow= arry.length;
     int numCol= arry[0].length;
      int numRowofTrans= arry[0].length;
    int  numColofTrans = arry.length;
     double [][] Trans = new double [numRowofTrans][numColofTrans];
    double [][] dummy =  new double [numRowofTrans][numColofTrans];
     for (int i =0; i<numRow ;i++){
       for (int j=0; j<numCol;j++){
        dummy[j][i]= arry[i][j];
        Trans[j][i]=dummy[j][i];
       }//forj
       
       
     }//for i.. for all row and columns, swap them using a dummy array.
      return Trans;
    }// Transspose of a matrix
    
    public static int getnumPivot(double [][] arry){
    double [][] arry2 = rrefFinal(arry); //converts it to RREF
    int numRow = arry2.length;
    int numCol = arry2 [0].length;
    int maxPivot =0;
    if (numRow<= numCol){
     maxPivot=numRow; 
    }
    if(numCol<= numRow){
     maxPivot = numCol; 
    }


    int numPivot=0;
//    Position [] result = new Position[];
    for (int j=0; j<numCol ; j++){
      int dummyCount=0;//RESETS FOR EVERY COLUMN
      for(int i=0; i<numRow; i++){
        
        if(arry2[i][j]!=0){
          dummyCount++; 
        }
      }//for each row
      if(dummyCount==1){
        numPivot++; 
      }
      
    }//for each column
    if(numPivot>= maxPivot){
      
     numPivot= maxPivot; 
    }
//   System.out.println(numPivot);
    return numPivot;
    
   }//get Pivot Position in a matrix
     

  /*  public static void main(String[] args) { //TESTING
      double[][] matrix_1 = {
        {0,-3,-6,4,9},
        {-1,-2,-1,3,1},
        {-2,-3,0,3,-1},
        {1,4,5,-9,-7}
      }; 
      
      System.out.println("Transpose is:  " +Arrays.deepToString(Transpose(matrix_1)));
      System.out.println("The Determinant is: " + (Determinant(matrix_1)));
      System.out.println("RREF form is: " +Arrays.deepToString(rrefFinal(matrix_1)));

      System.out.println("Linearly Independent??: "+ LINDEPENDENCE(matrix_1));
      
    }*/
}