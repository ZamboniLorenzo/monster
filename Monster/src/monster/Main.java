package monster;

public class Main {

    public static void main(String[] args) throws Exception {
        Monster m = new Monster("Jamal", 100, 15, "Jonathan", 75, 10);

        try {
            System.out.println(m.toString());
            m.damageDealt();
            m.damageReceveid();
            m.damageDealt();
            m.damageReceveid();
            m.damageReceveid();
            m.damageDealt();
            m.damageDealt();
            m.damageDealt();
            m.damageDealt();
            m.damageDealt();

        } catch (Exception e) {
            
        }

    }

}
