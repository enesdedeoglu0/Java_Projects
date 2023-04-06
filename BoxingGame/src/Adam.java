public class Adam {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Adam(String name, int damage, int health, int weight, int dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge >= 0 && dodge <= 100){
            this.dodge = dodge;
        }else {
            this.dodge = 0;
        }
    }
    boolean isDodge(){
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }

    int hit(Adam Rakip){
        System.out.println(this.name + " => " + Rakip.name + " " + this.damage + " HASAR VURDU .");

        if(Rakip.isDodge()){
            System.out.println(Rakip.name + " GELEN HASARI BLOKLADI");
            System.out.println(" -------------------- ");
            return Rakip.health;
        }
        if(Rakip.health -this.damage < 0){
            return 0;
        }
        return Rakip.health -= this.damage;
    }

}