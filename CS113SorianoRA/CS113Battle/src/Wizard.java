public class Wizard extends Character{
    //Wizard constructor inherits character class
    Wizard(String name, int lvl, int hp, int mana){
        super(name,lvl,hp,mana);
    }
    //Wizard Skills method class
    //Wizard skill no.1 with damage and mana reduction upon cast
    public void chaosmeteor(Character enemyCharacter, Character name){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with chaosMeteor (Damage - 75)");
        int damagePoints = 75;
        int manadecrease = 35;
        damageTarget(enemyCharacter,damagePoints,manadecrease,name);
    }

    //Wizard skill no.2 Self-heal(Health Points Increase)
    public void hero(){
        super.healthPoints += 75;
        System.out.println(super.characterName + " Health restored + 75hp");
    }
    //Wizard skill no.3 with damage and mana reduction upon cast
    public void coldsnap(Character enemyCharacter, Character name){
        int damagePoints = 50;
        int manadecrease = 30;
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Coldsnap (Damage - 50)");
        damageTarget(enemyCharacter,damagePoints,manadecrease,name);
    }
}
