public class StringBuilderMessageBuilder {
    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();

        message.append("Name: Annabelle A. Paaño");
        message.append("Course: Certificate In Computer Science\n");
        message.append("Year: 1\n");
        message.append("Status: Inactive\n");
        message.append("Temporary line to delete\n");

        // Insert a heading at the beginning
        message.insert(0, "Student Information\n");

        // Change the status from Inactive to Active
        int inactiveStart = message.indexOf("Inactive");
        if (inactiveStart != -1) {
            message.replace(
                inactiveStart,
                inactiveStart + "Inactive".length(),
                "Active"
            );
        }
