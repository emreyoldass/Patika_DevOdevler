
public class Main {
    public static void main(String[] args) {
        int[][] matris = { {1,2,3}, {4,5,6}, {7,8,9} };
        int[][] transpoze = new int[3][3];

        System.out.println("Matrisimiz : ");
        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrisimizin transpozu : ");
        for(int i = 0; i < matris.length; i++){
            for(int j = 0; j < matris[i].length; j++){
                transpoze[i][j] = matris[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println();
        }
    }
}