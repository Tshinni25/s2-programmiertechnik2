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
	 * Löscht die Tabelle.
	 */
	void clear();

	/**
	 * Fügt das Wort w mit der Haeufigkeit f zu dieser Tabelle dazu.
	 * Falls w bereits in der Tabelle enthalten ist, 
	 * wird die Haeufigkeit um f erhöht.
	 * @param w Wort.
	 * @param f Häufigkeit.
	 */
	void add(String w, int f);
	
	/**
	 * Fügt das Wort w mit der Haeufigkeit 1 zu dieser Tabelle dazu.
	 * Falls w bereits in der Tabelle enthalten ist, 
	 * wird die Haeufigkeit um 1 erhöht.
	 * @param w Wort.
	 */
	void add(String w);
	
	/**
	 * Fügt alle Wörter mit ihren Häufigkeiten aus fq zu dieser Tabelle dazu.
	 * Häufigkeiten für gleiche Wörter werden addiert.
	 * fq bleibt unverändert.
	 * @param fq Häufigkeitstabelle.
	 */
	void addAll(FrequencyTable fq);

	/**
	 * Liefert das Wort mit seiner Häufigkeit zurück, das mit seiner Häufigkeit an Position pos steht.
	 * get(0) liefert das häufigste Wort zurück, 
	 * get(1) liefert das zweithäufigste Wort zurück, usw.
	 * @param pos Position.
	 * @return Wort mit Haeufigkeit oder null,
	 * falls die Tabelle weniger als pos-1 Elemente  enthaelt.
	 */
	Word get(int pos);

	/**
	 * Liefert die Häufigkeit des Worts w zurück.
	 * Falls das Wort nicht vorkommt, wird 0 zurueckgeliefert.
	 * @param w Wort
	 * @return Häufigkeit.
	 */
	int get(String w);
	
	/**
	 * Speichert die n häufigsten Wörter in fq.
	 * Falls die Tabelle weniger als n Einträge hat, werden alle Wörter in fq gespeichert.
	 * Beispiel: 
	 * Falls tab1 = {"ein":3, "das":3, "ist":2, "der:1", "die":1}, dann 
	 * gilt nach Aufruf von tab1.collectMostFrequent(3,tab2):
	 * tab2 = {"ein":3, "das":3, "ist":2}.
	 * @param fq Haeufigkeitstabelle.
	 */
	void collectNMostFrequent(int n, FrequencyTable fq);
}
