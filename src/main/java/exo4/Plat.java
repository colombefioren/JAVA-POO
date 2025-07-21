package exo4;

import java.util.List;
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
  private List<Ingredient> listeIngredient;

  public boolean contientIngredient(Ingredient ingredient) {
    return this.listeIngredient.contains(ingredient);
  }
}
