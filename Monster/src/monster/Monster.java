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

    public void damageDealt() {
        if (enemyHP > dmg) {
            enemyHP = -dmg;
        } else {
            enemyHP = 0;
            endOfDuel('w');
        }
    }

    public void damageReceveid() {
        if (hp > enemyDMG) {
            hp = -enemyDMG;
        } else {
            hp = 0;
            endOfDuel('l');
        }

    }

    private String endOfDuel(char wol) {
        String result = "";
        switch (wol) {
            case 'w':
                result = "Congratulations, you won!";
                break;
            case 'l':
                result = "End of duel, you lost!";
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        String s = "";
        s = "Game statistics \n" + name + " has " + hp + "HP" + "\n" + enemyName + " has " + enemyHP + "HP";
        return s;
    }
    
    
}
