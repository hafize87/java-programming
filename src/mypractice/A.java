package mypractice;

public interface A {

    void canLearn();
}


interface B extends A{


    void mentor();
}

class C implements B{




    @Override
    public void mentor() {

    }

    @Override
    public void canLearn() {

    }
}