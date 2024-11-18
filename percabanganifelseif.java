import java.util.Scanner;

public class percabanganifelseif {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int nilai;
        char predikat=0;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Nilai: ");
        nilai = s.nextInt();

        if(nilai >= 90 && nilai <=100){
            predikat='A';
        }
        else if (nilai >=80 && nilai <90){
            predikat='B';
        }
        else if (nilai >=70 && nilai <80){
            predikat='C';
        }
        else if (nilai >=60 && nilai <70){
            predikat='D';
        }
        else if (nilai >=0 && nilai <60){
            predikat='E';
        }

        System.out.println("Nilai: "+nilai);
        System.out.println("Predikat: "+predikat);

    }
    
}
