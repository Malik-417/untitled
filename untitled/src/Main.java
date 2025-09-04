public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello world!!!");
        var dog=8;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общая масса: " + totalWeight + " кг");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница масс: " + weightDifference + " кг");
        var remainder = boxer2 % boxer1;
        System.out.println("Остаток от деления: " + remainder);
        var totalHours = 640;
        var hoursPerEmployee = 8;
        var employees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + employees + " человек");
        var newEmployees = employees + 94;
        var newTotalHours = newEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + newEmployees +
                " человек, то всего " + newTotalHours +
                " часов работы может быть поделено между сотрудниками");
            }
        }
