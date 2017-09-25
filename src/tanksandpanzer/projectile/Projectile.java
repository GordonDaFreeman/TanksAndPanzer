package tanksandpanzer.projectile;

import tanksandpanzer.model.Panzer;

public abstract class Projectile {
	
	Panzer shooter;
	
	public abstract void hit(Panzer p);
}
