public class FighterFight {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        double attacksToKill1 = Math.ceil((double) fighter2.health / fighter1.damagePerAttack) + (fighter1.name.equals(firstAttacker) ? 0 : 1);
        double attacksToKill2 = Math.ceil((double) fighter1.health / fighter2.damagePerAttack);

        return attacksToKill1 <= attacksToKill2 ? fighter1.name : fighter2.name;
    }
}
