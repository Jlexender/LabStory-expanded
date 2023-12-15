package ru.jlexender.se.labstory.utilityClasses;

import ru.jlexender.se.labstory.utilityInterfaces.INamed;

public final class Printer {
    public static String formatList(INamed ... objects) {
        String result = "";
        for (INamed object: objects) {
            if (result != "") result += ", ";
            result += object.getName();
        }
        return result;
    }
    public static void describeAction(String stringToPrint) {
        System.out.println(stringToPrint);
    }
}
