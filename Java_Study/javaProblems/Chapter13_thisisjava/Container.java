package javaProblems.Chapter13_thisisjava;

public class Container<T> {
    T t;

    public T get(){
        return t;
    }

    public void set(T t){
        this.t = t;
    }
}
