
public class Program {

    public static void main(String[] args) {
        // Test your method here
    }

    public static String arrayAsString(int[][] array){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<array.length;i++){  
            for(int j=0;j<array[i].length;j++){
                s.append(array[i][j]);
            }    
            s.append("\n");
        }
        return s.toString();
    }

}
