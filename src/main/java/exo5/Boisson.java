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

  public void convertion(Unite unite) {
    switch (unite) {
      case L -> {
        switch (quantite.getUnite()) {
          case L -> quantite.setValeur(quantite.getValeur());
          case DL -> quantite.setValeur(quantite.getValeur() / 10);
          case CL -> quantite.setValeur(quantite.getValeur() / 100);
          case ML -> quantite.setValeur(quantite.getValeur() / 1000);
        }
      }
      case DL -> {
        switch (quantite.getUnite()) {
          case L -> quantite.setValeur(quantite.getValeur() * 10);
          case DL -> quantite.setValeur(quantite.getValeur());
          case CL -> quantite.setValeur(quantite.getValeur() / 10);
          case ML -> quantite.setValeur(quantite.getValeur() / 100);
        }
      }
      case CL -> {
        switch (quantite.getUnite()) {
          case L -> quantite.setValeur(quantite.getValeur() * 100);
          case DL -> quantite.setValeur(quantite.getValeur() * 10);
          case CL -> quantite.setValeur(quantite.getValeur());
          case ML -> quantite.setValeur(quantite.getValeur() / 10);
        }
      }
      case ML -> {
        switch (quantite.getUnite()) {
          case L -> quantite.setValeur(quantite.getValeur() * 1000);
          case DL -> quantite.setValeur(quantite.getValeur() * 100);
          case CL -> quantite.setValeur(quantite.getValeur() * 10);
          case ML -> quantite.setValeur(quantite.getValeur());
        }
      }
    }
  }
}
