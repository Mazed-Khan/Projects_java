package School_Management;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    //Display Method
    public void displayInfo(){
        System.out.println("Student id:"+id+" name:"+name);
    }



}
