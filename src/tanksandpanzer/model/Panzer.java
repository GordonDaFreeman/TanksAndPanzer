package tanksandpanzer.model;
import java.util.ArrayList;
import java.util.List;

import tanksandpanzer.buff.Buff;
import tanksandpanzer.powerup.Powerup;

public class Panzer {
	int baseMovementspeed;
	int baseAttackDamage;
	int baseArmor;
	int baseHealth;
	int baseRegeneration;
	Powerup powerup;
	List<Buff> buffs = new ArrayList<Buff>();
}
 