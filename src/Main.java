public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat -1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общая масса двух бойцов " + (boxer1Weight + boxer2Weight) + " кг");
        System.out.println("Разница в весе " + (boxer2Weight - boxer1Weight) + " кг");
        System.out.println(boxer2Weight % boxer1Weight);

        var allTime = 640;
        var timeWorker = 8;
        var workerInCompany = allTime / timeWorker;
        System.out.println("Всего работников в компании " + workerInCompany + " человек");

        workerInCompany = workerInCompany + 94;
        var allTimeNow = workerInCompany * timeWorker;
        System.out.println("Если в компании работает " + workerInCompany + " человека, то всего " + allTimeNow + " часа работы может быть поделено между сотрудниками");
    }
}
