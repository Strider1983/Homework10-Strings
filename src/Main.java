public class Main {
    public static void main(String[] args) {
        System.out.println("Строки");
        System.out.println("________________");
        System.out.println("Задача №1");
        String name = "Семён";
        String middleName = "Семёнович";
        String lastleName = "Иванов";
        String fullName = lastleName + " " + name + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("________________");
        System.out.println("Задача №2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("________________");
        System.out.println("Задача №3");
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}