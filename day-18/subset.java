
public class subset {
    public static void subsets(String s,String res,int i){
        if(i==s.length()){
            if(res.length()==0){
                System.out.println("null");
                return;
            }
            System.out.println(res);
            return;
        }
        subsets(s,res+s.charAt(i),i+1);
        subsets(s,res,i+1);

    }
    public static void main(String[] args) {
        String s="abc";
        
        String result="";
        subsets(s,result,0);
    }
    
}
