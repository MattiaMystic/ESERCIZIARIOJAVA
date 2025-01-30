public class Orario {

    private int h;
    private int m;
    private int s;
    public Orario(int h, int m, int s) {
        try{
            checkOrario(h,m,s);

        }catch(OrarioException4F e){
            System.out.println(e.getMsg());

        }
        this.h = h;
        this.m = m;
        this.s = s;
    }
    private void checkOrario(int h, int m, int s)throws OrarioException4F{
        if(h<0||m<0||s<0||h>=24||s>=60||m>=60) {
            throw new OrarioException4F();

        }
    }
}
