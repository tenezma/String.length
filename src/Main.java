public class Main {
    public static void main(String[] args) {
        //1 exercise
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника - " + fullName);
        //2 exercise
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета -" + fullName.toUpperCase());
        //3 exercise
        String employeeName = "Иванов Семён Семёнович";
        String newEmployeeName = employeeName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + newEmployeeName);

    }
}