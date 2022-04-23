package practicaHarry;

public class Character {
    public String name, gender, house, boggart, patronus;

    public Character() {
    }

    public Character (String name, String gender, String house, String boggart, String patronus){
        this.name = name;
        this.gender = gender;
        this.house = house;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getHouse() { return house; }
    public String getBoggart() { return boggart; }
    public String getPatronus() { return patronus; }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else {
            return false;
        }
    }

    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else {
            return false;
        }
    }

    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        } else {
            return false;
        }
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else {
            return false;
        }
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else {
            return false;
        }
    }

    public String printState() {
        return "The character is " + name +
                ", a " + gender +
                " of the house " + house +
                " whose boggart is " + boggart +
                " and a patronus with the shape of a " + patronus + '.';
    }
}
