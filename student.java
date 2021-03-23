package type;
class student<T,E,S,D>{
    private T name;
    private E age;
    private S address;
    private D sid;

    public student() {
    }

    public student(T name, E age, S address, D sid) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sid = sid;
    }

    public T getName() {
        return name;
    }

    public E getAge() {
        return age;
    }

    public S getAddress() {
        return address;
    }

    public D getSid() {
        return sid;
    }

    public void setName(T name) {
        this.name = name;
    }

    public void setAge(E age) {
        this.age = age;
    }

    public void setAddress(S address) {
        this.address = address;
    }

    public void setSid(D sid) {
        this.sid = sid;
    }
}
