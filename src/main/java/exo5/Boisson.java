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
}
