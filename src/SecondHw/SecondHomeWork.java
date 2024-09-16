package SecondHw;

public class SecondHomeWork {
    public static void main(String[] args) {
        double SalaryIncrease = 15;
        double DianaSalary = 66_660;
        double AndreySalary = 77_770;
        double MariaSalary = 88_880;
        double NewDianaSalary = DianaSalary + ((DianaSalary * SalaryIncrease) / 100);
        double NewAndreySalary = AndreySalary + ((AndreySalary * SalaryIncrease) / 100);
        double NewMariaSalary = MariaSalary + ((MariaSalary * SalaryIncrease) / 100);
        double DianaSalarySalaryDifference = (NewDianaSalary * 12) - (DianaSalary * 12);
        double AndreySalarySalaryDifference = (NewAndreySalary * 12) - (AndreySalary * 12);
        double MariaSalarySalaryDifference = (NewMariaSalary * 12) - (MariaSalary * 12);
        System.out.println("Диана теперь получает " + NewDianaSalary + "рублей. Годовой доход вырос на " + DianaSalarySalaryDifference + "рублей»");
        System.out.println("Андрей теперь получает " + NewAndreySalary + "рублей. Годовой доход вырос на " + AndreySalarySalaryDifference + "рублей»");
        System.out.println("Мария теперь получает " + MariaSalary + "рублей. Годовой доход вырос на " + MariaSalarySalaryDifference + "рублей»");
        System.out.println(NewDianaSalary);
    }
}