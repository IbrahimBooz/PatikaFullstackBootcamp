public abstract class GameChar {
    private int id;
    private String name;
    private int damage;
    private int health;
    private int money;

    public GameChar(int id,String name, int damage, int health, int money) {
        this.id=id;
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
