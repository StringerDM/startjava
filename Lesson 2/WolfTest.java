public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "кабель";
        wolf.name = "Черный клык";
        wolf.color = "серо-бурый";
        wolf.weight = 30;
        wolf.age = 5;
        System.out.println("Пол - " + wolf.sex + ", имя - " + wolf.name + ", цвет - " + wolf.color + ", вес - " + wolf.weight + "кг, возраст - " + wolf.age + " лет.");
        
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}