
public class Main {
    public static void main(String[] args) {
        //System.out.println( sun(1,2));
        //System.out.println( sun(1,2,4));
        //System.out.println(sun((new int[]{1, 2})));
        //System.out.println(sun((new int[]{1, 2,4})));
        //char a = 'a';
        //int num_of_a = 65;
        //a = (char) num_of_a;
        //int[][] arr = new int[][]{{1,2},{3,4,9},{5,6}};
        int[][] arr = new int[2][3];
        arr[1][1] = 1;
        //running over parameter in arry [][] with index
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("]");
        }
        System.out.println("another method of printing array-");
        //running over parameter in arry [][] without index
        int[][] arr2 = new int[2][3];
        for(int[] row:arr2){
            System.out.print("[");
            for(int cell:row){
                System.out.print(cell+" ");
            }
            System.out.println("]");
        }
    }

    public static int sun(int x,int y){
        return x+y;
    }
    public static int add(int x,int y,int z){
        return x+y+z;
    }
    public static int sun(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }


}
