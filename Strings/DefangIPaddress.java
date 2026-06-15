

public class DefangIPaddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String result =defangIPaddr(address);
        System.out.println(result);

    }
    static String defangIPaddr(String address) {
       
        address.replace("1", "2");
        address.replace(".","[.]");
        return address;
        
    }
}
