package exo5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Boisson {
  private int id;
  private String nom;
  private Quantite quantite;
  private double prixUnitaire;

  public double conversion(Unite targetUnit) {
    double valeur = quantite.getValeur();
    Unite currentUnit = quantite.getUnite();

    double valeurEnLitres = switch (currentUnit) {
      case L -> valeur;
      case DL -> valeur / 10;
      case CL -> valeur / 100;
      case ML -> valeur / 1000;
    };

    return switch (targetUnit) {
      case L -> valeurEnLitres;
      case DL -> valeurEnLitres * 10;
      case CL -> valeurEnLitres * 100;
      case ML -> valeurEnLitres * 1000;
    };
  }

}
