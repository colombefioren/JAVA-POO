package exo4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Plat {
  private int id;
  private String nom;
  private double prixUnitaire;
  private Type type;
}
