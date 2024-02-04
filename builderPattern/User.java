package builderPattern;

public class User {
    protected final String firstName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;

    private User(UserBuilder user) {
        this.firstName = user.firstName;
        this.lastName = user.lastName;
        this.email = user.email;
        this.address = user.address;
        this.phone = user.phone;
        this.age = user.age;
    }

    protected static class UserBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private int age;

        public UserBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new builderPattern.User(this);
        }
    }

    public static void printUser(User user){

        System.out.println("\n >---USER INFO---<");

        if (user.firstName != null){
            System.out.println("First Name: "+user.firstName);
        } else {
            System.out.println("First Name:  N/A");
        }

        if (user.lastName != null){
            System.out.println("Last Name: "+user.lastName);
        } else {
            System.out.println("Last Name:  N/A");
        }

        if (user.email != null){
            System.out.println("Email: "+user.email);
        } else {
            System.out.println("Email: N/A");
        }

        if (user.address != null){
            System.out.println("Address: "+user.address);
        } else {
            System.out.println("Address: N/A");
        }

        if (user.phone != null){
            System.out.println("Phone Number: "+user.phone);
        } else {
            System.out.println("Phone Number: N/A");
        }

        if (user.age != 0){
            System.out.println("Age: "+user.age);
        } else {
            System.out.println("Age: N/A");
        }
    }
}
