public class Numeroquatro {
    public static void main(String[] args) {
        int paisB = 200000;
        int paisA = 80000;
        int qntdAnos = 0;
        while(paisA<=paisB){ 
            paisA *= 1.03;
            paisB *= 1.015;
            System.out.println(paisA);
            qntdAnos++;          
        }
        System.out.println("A quantidade de anos possiveis para o paísA passar o paísB é: " + qntdAnos + "anos");
    }
    
}
