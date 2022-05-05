public class JaegerTest {

    public static void main(String[] args) {
        Jaeger coyoteTango = new Jaeger();
        Jaeger chernoAlpha = new Jaeger();
        coyoteTango.setModelName("Coyote Tango");
        coyoteTango.setMark("Mark-1");
        coyoteTango.setOrigin("Japan");
        coyoteTango.setWeapon("Ballistic mortar cannons");
        coyoteTango.setWeight(2312f);
        coyoteTango.setHeight(280f);
        coyoteTango.setSpeed(5);
        coyoteTango.setStrength(7);
        coyoteTango.setArmor(4);
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

        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMark("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setWeapon("Incinerator turbines");
        chernoAlpha.setWeight(2412f);
        chernoAlpha.setHeight(280f);
        chernoAlpha.setSpeed(3);
        chernoAlpha.setStrength(10);
        chernoAlpha.setArmor(10);
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