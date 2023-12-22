public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int startChance;


    Fighter(String name, int damage, int health, int weight, int dodge,int startChance) {
        this.name = name;
        this.damage = damage;       // Constructor tanımlamaları yapalım.
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;

        }
        this.startChance = startChance;


    }


    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.isStartChance()) {
            System.out.println("______________");
            System.out.println(this.name + " oyuncusu ilk başlayacak.");
            return foe.health - this.damage;
        }

        if (foe.isDodge()) {
            System.out.println("-----------");
            System.out.println(foe.name + " gelen hasarı blokladı!");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;
    }

    boolean isDodge() {

        double randomNumber = Math.random() * 100; // 0 - 100 Rastgele bir sayı üretmemizi sağlıyor
        return randomNumber <= this.dodge;
    }

     // Başlama şansı için metod
    boolean isStartChance(){
        double startNumber = Math.random() * 100;
        return startNumber <= this.startChance;
    }


}
