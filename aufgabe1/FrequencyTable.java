package aufgabe1;

/**
 *
 * @author oliverbittel
 * @since 31.07.2023
 */
public interface FrequencyTable {
	/**
	 * Liefert die Anzahl der Woerter in dieser Tabelle zur&uuml;ck.
	 * @return Anzahl der Haeufigkeitseintraege.
	 */
	int size();

	/**
	 * Prueft, ob die Tabelle leer ist.
	 * @return true, falls diese Tabelle leer ist, sonst false.
	 */
	boolean isEmpty();
	
	/**
	 * Loescht die Tabelle.
	 */
	void clear();

	/**
	 * Fuegt das Wort w mit der Haeufigkeit f zu dieser Tabelle dazu.
	 * Falls w bereits in der Tabelle enthalten ist, 
	 * wird die Haeufigkeit um f erhöht.
	 * @param w Wort.
	 * @param f H&auml;ufigkeit.
	 */
	void add(String w, int f);
	
	/**
	 * Fuegt das Wort w mit der Haeufigkeit 1 zu dieser Tabelle dazu.
	 * Falls w bereits in der Tabelle enthalten ist, 
	 * wird die Haeufigkeit um 1 erhöht.
	 * @param w Wort.
	 */
	void add(String w);
	
	/**
	 * Fuegt alle Woerter mit ihren Haeufigkeiten aus fq zu dieser Tabelle dazu.
	 * Haeufigkeiten für gleiche Woerter werden addiert.
	 * fq bleibt unveraendert.
	 * @param fq Haeufigkeitstabelle.
	 */
	void addAll(FrequencyTable fq);

	/**
	 * Liefert das Wort mit seiner Häufigkeit zur&uuml;ck, das mit seiner Haeufigkeit an Position pos steht.
	 * get(0) liefert das häufigste Wort zurück, 
	 * get(1) liefert das zweithäufigste Wort zurück, usw.
	 * @param pos Position.
	 * @return Wort mit Haeufigkeit oder null,
	 * falls die Tabelle weniger als pos-1 Elemente  enthaelt.
	 */
	Word get(int pos);

	/**
	 * Liefert die Haeufigkeit des Worts w zurueck.
	 * Falls das Wort nicht vorkommt, wird 0 zurueckgeliefert.
	 * @param w Wort
	 * @return Haeufigkeit.
	 */
	int get(String w);
	
	/**
	 * Speichert die n haeufigsten Woerter in fq.
	 * Falls die Tabelle weniger als n Einträge hat, werden alle Woerter in fq gespeichert.
	 * Beispiel: 
	 * Falls tab1 = {"ein":3, "das":3, "ist":2, "der:1", "die":1}, dann 
	 * gilt nach Aufruf von tab1.collectMostFrequent(3,tab2):
	 * tab2 = {"ein":3, "das":3, "ist":2}.
	 * @param fq Haeufigkeitstabelle.
	 */
	void collectNMostFrequent(int n, FrequencyTable fq);
}
