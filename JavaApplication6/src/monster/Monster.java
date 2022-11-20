package monster;

public class Monster {

    private String name;
    private Integer hp;
    private Integer dmg;
    private Double atkSpdRto; //Attack Speed Ratio

    public Monster(String name, Integer hp, Integer dmg, Double atkSpdRto) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
    }

    public void damageDealt(Integer enemyHP) {
        if (enemyHP > dmg) {
            enemyHP = -dmg;
        } else {
            endOfDuel('w');
        }
    }

    public void damageReceveid(Integer enemyDMG) {
        if (hp > enemyDMG) {
            hp = -enemyDMG;
        } else {
            endOfDuel('l');
        }

    }

    public String endOfDuel(char wol) {
        String result = "";
        switch (wol) {
            case 'w':
                result = "Congratulations, you won!";
                break;
            case 'l':
                result = "End of duel, you lost!";
        }
        return result;
    }
}
