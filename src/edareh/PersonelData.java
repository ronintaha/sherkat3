package edareh;

import java.util.ArrayList;
import java.util.List;

public class PersonelData {
    private String name ;
    private String lasteName;
    private int age;
    private int id ;

    PersonelData(String name , String lasteName ,int age ,int id){
        this.name=name;
        this.lasteName=lasteName;
        this.age=age;
        this.id=id;

        list.add(this);
    }
    public static List<PersonelData> list = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasteName() {
        return lasteName;
    }

    public void setLasteName(String lasteName) {
        this.lasteName = lasteName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static PersonelData getPersonByID(int a){

        for (int i=0;i<PersonelData.list.size();i++){


            if (PersonelData.list.get(i).getId()==a){
                return list.get(i);
            }


        }
return null;
    }
    public static PersonelData getPersonByLastname(String b){
        for (int i =0;i<PersonelData.list.size();i++){
            if (PersonelData.list.get(i).getLasteName().equals(b)){
                return list.get(i);
            }
        }
        return null;
    }
}
