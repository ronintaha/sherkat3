package edareh.entity;


import java.util.ArrayList;
import java.util.List;


public class PersonelData {
    private String name ;
    private  String lasteName;
    private String age;
    private String id ;

    public PersonelData(){
        this.name=name;
        this.lasteName=lasteName;
        this.age=age;
        this.id=id;

//        list.add(this);
        DataStore.dataList.add(this);

    }
//    public static List<PersonelData> list = new ArrayList<>();



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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//    public static PersonelData getPersonByID(String a){
//
//        for (int i=0;i<PersonelData.list.size();i++){
//
//
//            if (PersonelData.list.get(i).getId().equals(a)){
//                return list.get(i);
//            }
//
//
//        }
//return null;
//    }
//    public static PersonelData getPersonByLastname(String b){
//        for (int i =0;i<PersonelData.list.size();i++){
//            if (PersonelData.list.get(i).getLasteName().equals(b)){
//                return list.get(i);
//            }
//        }
//        return null;
//    }
}
