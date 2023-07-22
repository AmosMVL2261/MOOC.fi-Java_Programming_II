public class Hideout<T> {
    T hide;

    public Hideout(){
        this.hide = null;
    }

    public void putIntoHideout(T toHide){
        this.hide = toHide;
    }

    public T takeFromHideout(){
        return this.hide;
    }

    public boolean isInHideout(){
        if(this.hide!=null){
            return true;
        }else{
            return false;
        }
    }
}
