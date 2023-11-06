package co.edu.ue.age;

import java.io.Serializable;

public class Client implements Serializable {
    private String name;
    private String lastname;
    private String adress;

    public Client(String name, String lastname,String adress) {
        this.name = name;
        this.lastname = lastname;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

}
