class exp7<T> {
    T value;

    exp7(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }

    public <U> void showType(U element) {
        System.out.println("Generic method with: " + element);
    }
}