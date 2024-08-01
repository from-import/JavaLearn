package com.xxx.d5_equals;



class Person {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1.equals(s2)); // 输出: true，因为内容相同

        Person p1 = new Person("John", 25);
        Person p2 = new Person("John", 25);
        System.out.println(p1.equals(p2)); // 输出: true，因为内容相同
        System.out.println(p1 == p2); // 输出: false，因为引用不同

    }


    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}


