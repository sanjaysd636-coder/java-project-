package JavaArrays;

public class AdditonMatrix {
        public static void main(String[] args) {
            int[][] matrixA = new int[2][2];
            int[][] matrixB = new int[2][2];
            int[][] resultMatrix  = new int[2][2];

            matrixA[0][0] = 10;
            matrixA[0][1] = 15;

            matrixA[1][0] = 20;
            matrixA[1][1] = 25;


            matrixB[0][0] = 15;
            matrixB[0][1] = 20;

            matrixB[1][0] = 20;
            matrixB[1][1] = 25;

            for(int i=0; i<matrixA.length; i++){
                for(int j=0; j<matrixA.length; j++){
                    resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                }
            }

            for(int i=0; i<resultMatrix.length; i++){
                for(int j=0; j<resultMatrix.length; j++){
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }




        }

}
