
  class Person{
    String name;
    int age;

    Person(String name, int age)
    {
      this.name=name;
      this.age=age;
    }
    public static void main(String[] args) {
      Person person1=new Person("Alice", 25);
      Person person2=new Person("Bob", 30);

      System.out.println("Person 1 Details");
      System.out.println(person1.name);
      System.out.println(person1.age);
      System.out.println("Person 2 Details");
      System.out.println(person2.name);
      System.out.println(person2.age);
    }
}



