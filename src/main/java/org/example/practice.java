package org.example;

public class practice {
    public static void main(String[] args) {
//        String ansh="imanshulkanojiya";
//        System.out.println(ansh);
//        for(int i=ansh.length()-1;i>=0;i--)
//        {
//            System.out.print(ansh.charAt(i));
//        }
//    String name="ANshul";
//    String pal="";
//    System.out.println(name);
//    for(int i=name.length()-1;i>=0;i--){
//        pal=pal+name.charAt(i);}
//System.out.println(pal);
//            if (name.equals(pal)) {
//                System.out.println("its a palindrome");
//            }
//
//        else
//            System.out.println("not valid");
//

//        String name="im$%&nakndlk";
//        String newname=name.replaceAll("[^a-zA-Z]","");
//        System.out.println(newname);

//        String name="abcbcbabaacccccccccccbc";
//       int countA=0,countB=0,countC=0;
//       String s1="a";
//        String s2="b";
//        String s3="c";
//        for(int i=0;i<=name.length()-1;i++){
//            char res=name.charAt(i);
//            if( res=='a'){
//            countA++;
//            } else if (res=='b') {
//                countB++;
//
//            } else if (res=='c') {
//                countC++;
//
//            }
//
//        }
//        System.out.println("count of a" +countA);
//        System.out.println("count of b" +countB);
//        System.out.println("count of c" +countC);


        String name=" i m anshul ";
        String sep=name.trim();
        String res=sep.replaceAll("[^a-zA-Z]","");
        System.out.println(res);
        int count=1;
        for (int i=0;i<sep.length()-1;i++)
        {
            if(sep.charAt(i)==' ' && sep.charAt(i+1)!=' '){
              count++;
            }

        }
        System.out.println(count);


    }
}
