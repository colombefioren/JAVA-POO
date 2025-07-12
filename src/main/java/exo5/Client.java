package exo5;

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
  private String email;

  public Client(int id, String nom, String prenom, String telephone) {
    this.id = id;
    this.nom = nom;
    this.prenom = prenom;
    this.telephone = telephone;
  }
}
