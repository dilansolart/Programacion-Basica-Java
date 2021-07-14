public class Person {
    private Integer Id;
    private String name;
    private Integer age;



    public Person(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void showData() {
        System.out.println("Identificacion: " + this.getId());
        System.out.println("Nombre: "+ this.getName());
    }
    
}
