
  class Person{
    private String name;
    private int age;

    public void setName(String n){
        name=n;
    }
    public  void setAge(int age){
      this.age=age;
    }

    public static void main(String[] args) {
      Person person1=new Person();
      Person person2=new Person();
      person1.setName("Alice");
      person1.setAge(25);
      person2.setName("Bob");
      person2.setAge(30);

      System.out.println("Person 1 Details");
      System.out.println(person1.name);
      System.out.println(person1.age);
      System.out.println("Person 2 Details");
      System.out.println(person2.name);
      System.out.println(person2.age);
    }
}



