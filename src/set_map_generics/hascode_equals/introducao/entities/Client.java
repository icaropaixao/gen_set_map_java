package set_map_generics.hascode_equals.introducao.entities;

import java.util.Objects;

public class Client {

    private String name;
    private String email;

    public Client(String name, String email){
        this.name = name;
        this.email = email;
    }

    // gets sets
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getName(){
        return name;
    }
    public String getEmail9(){
        return email;
    }


    // equals personalizado
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(email, client.email);
    }

    // hashCode personalizado
    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
