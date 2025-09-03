#include <stdio.h>

int main() {
    double nettoPreis, bruttoPreis, mehrwertsteuer, rabatt, endpreis;
    const double MWST_SATZ = 0.20;
    const double RABATT_SATZ = 0.02;
    
    printf("=== Mehrwertsteuer-Berechnung ===
");
    printf("Geben Sie den Nettopreis ein: ");
    scanf("%lf", &nettoPreis);
    
    mehrwertsteuer = nettoPreis * MWST_SATZ;
    bruttoPreis = nettoPreis + mehrwertsteuer;
    rabatt = bruttoPreis * RABATT_SATZ;
    endpreis = bruttoPreis - rabatt;
    
    printf("
=== Berechnungsergebnisse ===
");
    printf("Nettopreis:     %.2f EUR
", nettoPreis);
    printf("Mehrwertsteuer: %.2f EUR (%.0f%%)
", mehrwertsteuer, MWST_SATZ * 100);
    printf("Bruttopreis:    %.2f EUR
", bruttoPreis);
    printf("Rabatt:         %.2f EUR (%.0f%%)
", rabatt, RABATT_SATZ * 100);
    printf("Endpreis:       %.2f EUR
", endpreis);
    
    return 0;
}
