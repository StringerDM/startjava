public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("кабель");
        wolf.setName("Черный клык");
        wolf.setColor("серо-бурый");
        wolf.setWeight(30);
        wolf.setAge(5);
        System.out.println("Пол - " + wolf.getSex() + ", имя - " + wolf.getName() + ", цвет - " + wolf.getColor() + ", вес - " + wolf.getWeight() + "кг, возраст - " + wolf.getAge() + " лет.");
        
        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}