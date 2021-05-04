import model.*;

public class Main {
    public static void main(String[] args) {
        Klient klient1= new  Klient("ihor","Tomashchuk","Zahchodnia", "9b", "2","Wola Mrokowska","05-552",
                "Zahchodnia", "9b", "2","Wola Mrokowska","05-552");
        Klient klient2= new  Klient("oigo","Tomashchuk","Wschodnia", "6a", "5","Mrokowska","05-552",
                "Zahchodnia", "9b", "3","Wola Mrokowska","05-552");
        Bank addCustomer= new Bank();
        addCustomer.AddToCustomer(klient1, 5000);
        System.out.println(addCustomer.toString());
    }
}
