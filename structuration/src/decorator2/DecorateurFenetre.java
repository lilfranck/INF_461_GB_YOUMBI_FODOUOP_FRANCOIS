package decorator2;

public abstract class DecorateurFenetre  implements Fenetre{

	protected Fenetre decorateurFenetre;

public DecorateurFenetre (Fenetre decorateurFenetre)
   {
this.decorateurFenetre= decorateurFenetre;
   }
}
