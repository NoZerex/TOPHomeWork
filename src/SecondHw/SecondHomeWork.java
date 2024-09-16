package SecondHw;

public class SecondHomeWork {
    public static void main(String[] args) {
        double salaryIncrease = 15;
        double dianaSalary = 66_660;
        double andreySalary = 77_770;
        double mariaSalary = 88_880;
        double newDianaSalary = dianaSalary + ((dianaSalary * salaryIncrease) / 100);
        double newAndreySalary = andreySalary + ((andreySalary * salaryIncrease) / 100);
        double newMariaSalary = mariaSalary + ((mariaSalary * salaryIncrease) / 100);
        double dianaSalarySalaryDifference = (newDianaSalary * 12) - (dianaSalary * 12);
        double andreySalarySalaryDifference = (newAndreySalary * 12) - (andreySalary * 12);
        double mariaSalarySalaryDifference = (newMariaSalary * 12) - (mariaSalary * 12);
        System.out.println("Диана теперь получает " + newDianaSalary + "рублей. Годовой доход вырос на " + dianaSalarySalaryDifference + "рублей»");
        System.out.println("Андрей теперь получает " + newAndreySalary + "рублей. Годовой доход вырос на " + andreySalarySalaryDifference + "рублей»");
        System.out.println("Мария теперь получает " + newMariaSalary + "рублей. Годовой доход вырос на " + mariaSalarySalaryDifference + "рублей»");
        System.out.println(newDianaSalary);
    }
}