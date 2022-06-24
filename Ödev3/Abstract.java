package Ödev3;


///Abstraction ne olduğu araştırılacak ve kod yazılacak
///Soyut sınıflar kalıtım özelliğini kullanarak kod tekrarını azaltır,
///Soyut sınıflar kendisinden türeyen sınıflardır.Bu sınıflardan nesne oluşturamayız.
///Erişim belirleyiciler kullanılabilir.
///Soyut sınıfı extend eden sınıf soyut sınıfın tüm soyut metotlarını override etmek zorundadır.

public class Abstract {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabase = new OracleDatabase(); ///Customer managera hangi veritabanı verilirse onunla çalışır  Oracle yerine Sql gibi
        customerManager.getCustomer();
    }
}
