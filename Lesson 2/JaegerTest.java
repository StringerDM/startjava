public class JaegerTest {

    public static void main(String[] args) {
        Jaeger coyoteTango = new Jaeger("Coyote Tango", "Mark-1", "Japan", 
                "Ballistic mortar cannons", 2312f, 280f, 5, 7, 4);
        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 
                "Incinerator turbines", 2412f, 280f, 3, 10 ,10);

        System.out.printf("%-11s%s", "Model name", "- " + coyoteTango.getModelName());
        System.out.printf("\n%-11s%s", "Mark", "- " + coyoteTango.getMark());
        System.out.printf("\n%-11s%s", "Origin", "- " + coyoteTango.getOrigin());
        System.out.printf("\n%-11s%s", "Weapon", "- " + coyoteTango.getWeapon());
        System.out.printf("\n%-11s%s", "Weight", "- " + coyoteTango.getWeight());
        System.out.printf("\n%-11s%s", "Height", "- " + coyoteTango.getHeight());
        System.out.printf("\n%-11s%s", "Speed", "- " + coyoteTango.getSpeed());
        System.out.printf("\n%-11s%s", "Strength", "- " + coyoteTango.getStrength());
        System.out.printf("\n%-11s%s\n\n", "Armor", "- " + coyoteTango.getArmor());
        coyoteTango.drift();
        coyoteTango.move();
        System.out.println(coyoteTango.scanKaiju());
        coyoteTango.useWeapon();
        coyoteTango.setWeapon("Super duper blaster");
        coyoteTango.useWeapon();

        System.out.printf("\n%-11s%s", "Model name", "- " + chernoAlpha.getModelName());
        System.out.printf("\n%-11s%s", "Mark", "- " + chernoAlpha.getMark());
        System.out.printf("\n%-11s%s", "Origin", "- " + chernoAlpha.getOrigin());
        System.out.printf("\n%-11s%s", "Weapon", "- " + chernoAlpha.getWeapon());
        System.out.printf("\n%-11s%s", "Weight", "- " + chernoAlpha.getWeight());
        System.out.printf("\n%-11s%s", "Height", "- " + chernoAlpha.getHeight());
        System.out.printf("\n%-11s%s", "Speed", "- " + chernoAlpha.getSpeed());
        System.out.printf("\n%-11s%s", "Strength", "- " + chernoAlpha.getStrength());
        System.out.printf("\n%-11s%s\n\n", "Armor", "- " + chernoAlpha.getArmor());
        chernoAlpha.drift();
        chernoAlpha.move();
        System.out.println(chernoAlpha.scanKaiju());
        chernoAlpha.useWeapon();
        chernoAlpha.setWeight(2050.5f);
        System.out.println(chernoAlpha.getModelName() + " оторвало руку, новый вес - " + 
                chernoAlpha.getWeight());
    }
}