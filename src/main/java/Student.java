import java.util.ArrayList;
import java.util.List;

/**
 * Created by mangguo on 2016/4/16.
 */
public class Student extends AbstractPerson {
    protected void dressUp() {
        System.out.println("dress ...");
    }

    protected void eatBreakfast() {
        System.out.println("eat mum breakfast.....");
    }

    protected void takeThings() {
        System.out.println("tak bag and homework.....");
    }

    @Override
    protected void Hook() {
//        super.Hook();

        System.out.println("this is student hook");
    }

    @Override
    protected boolean isHooK() {
        return false;
    }
}
