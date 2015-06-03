package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge;

public interface WerkzeugObserver
{
    /**
     * Diese Operation wird aufgerufen, sobald sich an an dem beobachteten
     * Werkzeug etwas relevantes geändert hat.
     * 
     * Implementierende Klassen müssen in dieser Operation auf die Aenderung
     * reagieren.
     */
    void reagiereAufAenderung(String argument);
}
