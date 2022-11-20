package monster;

public class Monster {

    private String name;
    private Integer hp;
    private Integer dmg;
    private String enemyName;
    private Integer enemyHP;
    private Integer enemyDMG;

    public Monster(String name, Integer hp, Integer dmg, String enemyName, Integer enemyHP, Integer enemyDMG) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.enemyName = enemyName;
        this.enemyHP = enemyHP;
        this.enemyDMG = enemyDMG;
    }

    public void damageDealt() throws Exception {
        if (enemyHP != 0) {
            if (enemyHP > dmg) {
                this.enemyHP -= dmg;
            } else {
                this.enemyHP = 0;
                endOfDuel(true);
            }
        } else {
            throw new Exception("Duel alread ended");
        }
    }

    public void damageReceveid() throws Exception{
        if (hp != 0) {
            if (hp > enemyDMG) {
                this.hp -= enemyDMG;
            } else {
                this.hp = 0;
                endOfDuel(false);
            }
        } else {
            throw new Exception("Duel alread ended");
        }

    }

    public String endOfDuel(Boolean wol) {
        String result = "";
        if (wol) {
            result = "Congratulations, you won!";
        } else {
            result = "End of duel, you lost!";
        }
        System.out.println(result);
        return result;
    }

    @Override
    public String toString() {
        String s = "";
        s = "Game statistics \n" + name + " has " + hp + "HP" + "\n" + enemyName + " has " + enemyHP + "HP";
        return s;
    }

}
