package arrays;

import java.util.Objects;

public class Usuario {

    String nome;
    String email;

    public boolean equals(Object objeto) { // definindo os critérios para comparar 2 objetos

        if (objeto instanceof Usuario){
            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }else {
            return false;
        }
    }

    // O HashCode será abordado em outra aula

    public int hashCode() {
        return this.nome.length();
    }
}
