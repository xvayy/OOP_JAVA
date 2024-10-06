import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // 1. Створити символьний масив з даними
        char[] universityData = "Національний лісотехніничй університет України, факультет комп'ютерних наук, група 21, спеціальність комп'ютерні науки".toCharArray();

        // 2. Створити рядок 1, вилучивши спеціальність
        String originalString = new String(universityData);
        String string1 = originalString.replace("спеціальність комп'ютерні науки", "").trim();
        System.out.println("Рядок 1: " + string1);

        // 3. Створити дзеркальне зображення рядка 1
        String string2 = new StringBuilder(string1).reverse().toString();
        System.out.println("Рядок 2 (дзеркальне зображення): " + string2);

        // 4. Створити рядок 3 з великими літерами та порівняти
        String string3 = string1.toUpperCase();
        boolean isEqual = string1.equals(string3);
        System.out.println("Рядок 3 (з великими літерами): " + string3);
        System.out.println("Чи рівні рядки 1 і 3? " + isEqual);

        // 5. Вибрати назву факультету
        String faculty = "факультет комп'ютерних наук"; // Знаємо заздалегідь
        System.out.println("Назва факультету: " + faculty);

        // 6. Створити рядок 4, об'єднавши рядки 1 і 3
        String string4 = string1 + " " + string3;
        System.out.println("Рядок 4 (об'єднаний): " + string4);

        // 7. Знайти індекс першого і останнього входження літери 'а'
        int firstIndex = string1.indexOf('а');
        int lastIndex = string1.lastIndexOf('а');
        System.out.println("Перший індекс 'а': " + firstIndex);
        System.out.println("Останній індекс 'а': " + lastIndex);

        // 8. Створити рядок класу StringBuffer з даними
        StringBuffer sb = new StringBuffer("Іванюк Юлія Андріївна, 16, 04, 2005");
        System.out.println("Дані: " + sb);

        // 9. Вилучити число і місяць народження
        sb.delete(22, 30); // видаляємо дату
        System.out.println("Після видалення: " + sb);

        // 10. Додати місце народження
        sb.append(", Львів");
        System.out.println("Після додавання місця народження: " + sb);

        // 11. Вставити стать після року народження
        sb.insert(sb.length(), ", Жіноча"); // Додаємо "Жіноча" перед останнім символом
        System.out.println("Після вставлення статі: " + sb);

        // 12. Визначити довжину рядка у символах і байтах
        int lengthInChars = sb.length();
        int lengthInBytes = sb.toString().getBytes().length;
        System.out.println("Довжина рядка в символах: " + lengthInChars);
        System.out.println("Довжина рядка в байтах: " + lengthInBytes);

        // 13. Скоротити рядок до прізвища, імені та по батькові
        String fullName = sb.toString().split(",")[0];
        System.out.println("Скорочений рядок: " + fullName);

        // 14. Дзеркальне зображення прізвища
        String lastName = fullName.split(" ")[0]; // Призвище
        String reversedLastName = new StringBuilder(lastName).reverse().toString();
        System.out.println("Дзеркальне зображення прізвища: " + reversedLastName);
    }

}
