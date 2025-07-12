package exo4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Client {
  private int id;
  private String nom;
  private String prenom;
  private String telephone;
}
