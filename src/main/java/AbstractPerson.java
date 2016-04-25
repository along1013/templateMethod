/**
 * Created by mangguo on 2016/4/16.
 */
public abstract class AbstractPerson {
    public void prepareGotoSchool(){
        dressUp();
        eatBreakfast();
        takeThings();
        if(isHooK()){
            Hook();
        }
    }
    protected abstract void dressUp();
    protected abstract void eatBreakfast();
    protected abstract void takeThings();
    protected void Hook(){
        System.out.println("this is father hook");
    }
    protected boolean isHooK(){
        return true;
    }
}
