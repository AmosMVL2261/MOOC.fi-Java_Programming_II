public class Container {
    private int liquid;

    public Container(){
        this.liquid=0;
    }

    public int contains(){
        return this.liquid;
    }

    public void add(int ammount){
        if(ammount<=0){
            return;
        }
        if(this.liquid+ammount>100){
            this.liquid=100;
        }else{
            this.liquid+=ammount;
        }
    }


    public void remove(int ammount){
        if(ammount<=0){
            return;
        }
        if(this.liquid-ammount<0){
            this.liquid=0;
        }else{
            this.liquid-=ammount;
        }
    }

    public String toString(){
        return this.liquid+"/100";
    }

}
