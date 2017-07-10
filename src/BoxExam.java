import javax.swing.*;



/**
 * Created by cad211 on 6/26/17.
 */
public class BoxExam {
    public static void main (String[] args) {

        class Box {
            private Object obj;
            public void setObj(Object obj) {
                this.obj = obj;
            }

            public Object getObj() {
                return obj;
            }
        }

        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();

        box.setObj("hello");
        String str = (String)box.getObj();
        System.out.println(str);
    }
}
