package live;

import music.wind.*;
import music.Playable;
import music.string.*;

public class Test {

	public static void main(String[] args) {
		Veena v=new Veena();
		Saxophone s=new Saxophone();
		v.Play();
		s.Play();
		Playable p=new Veena();
		p.Play();
		p=new Saxophone();
		p.Play();
		
	}

}
