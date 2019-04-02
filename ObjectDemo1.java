public class ObjectDemo1 {

    public static void main(String[] args) throws Throwable{
        new Student();
        // Student对象变成垃圾，会被垃圾回收器回收，回收之前，垃圾回收器会调用finalize()方法.
        // 强制执行垃圾回收
        System.gc();

        // 我们可以用对象调用吗？
        // 用对象直接调用的话，只是一个普通的方法调用，并不能说明你这个对象变成了垃圾，即将被回收
        /*Student s = new Student();
        s.finalize();

        System.out.println(s);*/
    }
}

class Student {
    @Override
    protected void finalize() throws Throwable {
        // super.finalize();
        System.out.println("I gonna to die...");
    }
}

