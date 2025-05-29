public class Array{
    public static void main(String[] args) {
        int arr[][]=new int[5][5];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*100);
            }
        }
        for(int row[]:arr){
            for(int a:row){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}