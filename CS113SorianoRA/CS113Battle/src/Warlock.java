public class Warlock extends Character{
    //Warlock constructor inherits character class
    Warlock(String name,int lvl,int hp,int mana){
        super(name,lvl,hp,mana);
    }
    //Warlock Skills method class
    //Warlock skill no.1 with damage and mana reduction upon cast
    public void sunstrike(Character enemyCharacter, Character name){
        int damagePoints = 75;
        int manadecrease = 30;
        System.out.println(super.characterName + " Casts Sunstrike (-30 Mana) " + enemyCharacter.characterName + " Damage done(-75hp)");
        damageTarget(enemyCharacter,damagePoints,manadecrease,name);
    }

    //Warlock Skill no. 2 Self-heal(Health Points Increase)
    public void revitalize(Character name) {
        super.healthPoints += 50;
        System.out.println(super.characterName+" Health restored + 50hp");
    }

    //Warlock skill no.3 with damage and mana reduction upon cast
    public void defeaningblast(Character enemyCharacter,Character name){
        int damagePoints = 65;
        int manadecrease = 20;
        System.out.println(super.characterName + " Casts DefeaningBlast (-20 Mana) " + enemyCharacter.characterName + " Damage done(-65hp)");
        damageTarget(enemyCharacter,damagePoints,manadecrease,name);
    }
    
}

