public class Match {

    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;

    }

    public void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {

                System.out.println("==========YENİ ROUND=========");
                this.f2.health = f1.hit(f2);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f2.name + " canı: " + this.f2.health);
                this.f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " canı: " + this.f1.health);
            }

        } else {
            System.out.println("Sporcular birbirlerine denk değildir.");
        }


    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + "Kazandı.");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + "Kazandı.");
            return true;
        }
        return false;
    }
}


