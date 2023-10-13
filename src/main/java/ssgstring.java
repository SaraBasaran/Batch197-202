public class ssgstring {
    public static void main(String[] args) {


        String s = "Marra";

        for(int i = s.length()-1; i >= 0 ; i--){

            String c = s.substring(i, i+1);

            if(s.indexOf(c)==s.lastIndexOf(c)){

                System.out.println(c);

            }

        }

        int i=1;

        do{
            if(i!=3){
                System.out.print(i + " ");

            } else {
                i++;
                continue;

            }
            i++;

        }while(i<5);

    }
}
