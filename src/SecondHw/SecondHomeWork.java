package SecondHw;

public class SecondHomeWork {
    public static void main(String[] args) {
        double salaryIncrease = 15;
        double dianaSalary = 66_660;
        double andreySalary = 77_770;
        double mariaSalary = 88_880;
        double NewDianaSalary = dianaSalary + ((dianaSalary * salaryIncrease) / 100);
        double NewAndreySalary = andreySalary + ((andreySalary * salaryIncrease) / 100);
        double NewMariaSalary = mariaSalary + ((mariaSalary * salaryIncrease) / 100);
        double DianaSalarySalaryDifference = (NewDianaSalary * 12) - (dianaSalary * 12);
        double AndreySalarySalaryDifference = (NewAndreySalary * 12) - (andreySalary * 12);
        double MariaSalarySalaryDifference = (NewMariaSalary * 12) - (mariaSalary * 12);
        System.out.println("Диана теперь получает " + NewDianaSalary + "рублей. Годовой доход вырос на " + DianaSalarySalaryDifference + "рублей»");
        System.out.println("Андрей теперь получает " + NewAndreySalary + "рублей. Годовой доход вырос на " + AndreySalarySalaryDifference + "рублей»");
        System.out.println("Мария теперь получает " + mariaSalary + "рублей. Годовой доход вырос на " + MariaSalarySalaryDifference + "рублей»");
        System.out.println(NewDianaSalary);
    }
}