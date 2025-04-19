class exp2 {
    String name;
    int age;

    exp2() {
        name = "Unknown";
        age = 0;
    }

    exp2(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    protected void finalize() {
        System.out.println(name + " object is destroyed.");
    }
}
