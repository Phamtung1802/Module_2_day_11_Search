package baitaptimchuoicododailonnhat;

public class Main {
    public static void main(String[] args) {
        SubStringSearch searchTest=new SubStringSearch();
        System.out.println("chuoi dai: "+ searchTest.returnResult());
        System.out.println("chuoi lien tuc: "+searchTest.returnContinuousResult());
    }
}
