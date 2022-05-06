public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private String weapon;
    private float weight;
    private float height;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, String origin, String weapon, 
            float weight, float height, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.weapon = weapon;
        this.weight = weight;
        this.height = height;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println(modelName + " is moving");
    }

    public String scanKaiju() {
        return modelName + " is scanning";
    }

    public void useWeapon() {
        System.out.println(modelName + " " + weapon + " is activated");
    }
}