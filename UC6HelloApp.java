

class UC6HelloApp {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder nameBuilder = new StringBuilder();

        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // Remove trailing ", "
        if (nameBuilder.length() > 0) {
            String result = nameBuilder.toString()
                                       .substring(0, nameBuilder.length() - 2);

            System.out.println("Hello, " + result + "!");
        }
    }
}