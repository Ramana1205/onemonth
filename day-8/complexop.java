

public class complexop {
    public static void main(String[] args) {
        complex c1=new complex(2,3);
        complex c2=new complex(4,5);
        complex c3=c1.add(c2);
        complex c4=c1.sub(c2);
        complex c5=c1.mul(c2);
        System.out.println("c1:");
        c1.display();
        System.out.println("c2:");
        c2.display();
        System.out.println("c1+c2:");
        c3.display();
        System.out.println("c1-c2:");
        c4.display();
        System.out.println("c1*c2:");
        c5.display();
    }
    
}
class complex{
    int real;
    int img;
    complex(int r,int i){
        real=r;
        img=i;
    }
    public void display(){
        System.out.println(real+"+"+img+"i");
    }
    public complex add(complex c){
        int r=real+c.real;
        int i=img+c.img;
        return new complex(r,i);
    }
    public complex sub(complex c){
        int r=real-c.real;
        int i=img-c.img;
        return new complex(r,i);
    }
    public complex mul(complex c){
        int r=real*c.real-img*c.img;
        int i=real*c.img+img*c.real;
        return new complex(r,i);
    }
}
