abstract class abss {
    abstract void read();
    abstract void write();

    public void show() {
        System.out.println("This is a show method");
    
    }
class student extends abss {
        @Override
        void read() {
            System.out.println("read by stu");
        }
        @Override
        void write() {
            System.out.println("wrt by stu");
        }
}
class teacher extends abss {
        @Override
        void read() {
            System.out.println("it can teach");
        }
        @Override
        void write() {
            System.out.println("it can write by teacher");
        }
}

    
    
}
public class abs {
    public static void main(String[] args) {
        student c = new student();
        teacher cc = new teacher();

        cc.write();

       
    }
}
