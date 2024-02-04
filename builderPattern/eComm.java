package builderPattern;

import static builderPattern.User.printUser;

public class eComm {
    public static void main(String[] args) {

        System.out.println("[]--  Builder Pattern  --[]");

        User jake = new User.UserBuilder()
                .firstName("Jake")
                .lastName("Josh")
                .email("JakeJosh@gmail.com")
                .build();
        User zaki = new User.UserBuilder()
                .firstName("Zaki")
                .lastName("Dasalla")
                .phone("0912312312")
                .age(20)
                .build();
        printUser(jake);
        printUser(zaki);

        System.out.println("\n[]---------Program Exit---------[]");
        System.out.println("[]--by Emmanuel Zaki Dasalla--[]");
        System.out.println("[]----------3-BSCS-1----------[]");
    }
}
