// import java.util.Scanner;
class Product{
String name;
String Type;
Product(String name,String Type){
    this.name=name;
    this.Type=Type;
}
void display(){
    System.out.println(name + " "+Type);
}
}
class Constructor{  // ✅ correct convention{
     public static void main(String[] args) {
        Product p=new Product("iphone","smartphone");
        p.display();
    }
}