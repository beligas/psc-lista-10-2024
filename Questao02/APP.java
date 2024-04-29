public class APP {
    public static void main(String[] args) {

        Iphone iphone = new Iphone("Apple","iphone13", 256 , 2);
       
        System.out.println("modelo: " + iphone.getModelo());
        iphone.fotos();
    }
}
