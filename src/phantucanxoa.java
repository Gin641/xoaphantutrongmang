import java.util.Scanner;

public class phantucanxoa {
    public static void main(String[] args) {
        int temp,j,i;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập số phần tử trong mảng: ");
            temp = sc.nextInt();
        }while (temp <= 0);
        int x[]= new int[temp];
        System.out.println("nhập các phần tử trong mảng: ");
        for (i = 0; i < temp;i++){
            System.out.print("nhập số thứ tự : "+ i + ": ");
            x[i] = sc.nextInt();
        }
        System.out.println("phần tử cần xóa");
        int k = sc.nextInt();
        for (j = i = 0;i < temp;i++ ){
            if (x[i] != k){
                x[j] = x[i];
                j++;
            }
        }
        temp = j;
        System.out.println("Mảng sau khi xóa phần tử: " + k + " là :");
        for (i = 0; i < temp; i++){
            System.out.println(x[i] + "\t");
        }
    }
}
