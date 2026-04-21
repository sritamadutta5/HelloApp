public class HelloApp {
    public static void main(String[] args) {

        String message;

        if (args.length > 0) {
            String names = String.join(", ", args);
            message = "Hello, " + names + "!";
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            message = "Hello, World!";
        }
            StringBuilder names = new StringBuilder();

        System.out.println(message);
            for (String name : args) {
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }

            System.out.println("Hello, " + names + "!");
        }
    }
}