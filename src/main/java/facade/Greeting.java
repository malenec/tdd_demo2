package facade;

public class Greeting {

    public String greetSingleName(String name) {

        String greeting = "Hello, " + name;

        if (name == null) {
            return "Hello, my friend";
        }

        if (name != null && name.equals(name.toUpperCase())) {
            return "HELLO " + name;
        }

        return greeting;
    }

    public String greetMultipleNames(String[] names) {

        String greeting = "Hello, " + names[0] + " and " + names[1] + ".";
        String shoutedName = "";
        int arrayLength = names.length;

        if (names.length > 2) {

            greeting = "Hello, ";

            for (int i = 0; i < names.length - 1; i++) {

                if (names[i].equals(names[i].toUpperCase())) {

                    shoutedName = " AND HELLO " + names[i] + "!";
                    arrayLength = arrayLength - 1;

                    if (arrayLength == 2) {
                        return "Hello, " + names[i - 1] + " and " + names[i + 1] + "." + shoutedName;
                    } else {
                        continue;
                    }
                }

                greeting = greeting + names[i] + ", ";
            }

            return greeting + "and " + names[names.length - 1] + "." + shoutedName;
        }

        return greeting;
    }
}
