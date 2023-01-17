public class nuuu {
        public static void UbahHurufEToStar(String[] args){
            for (int index=0; index<args.length; index++){
                System.out.println(args[index].replaceAll("i","*"));
                System.out.println(args[index].replace("o" ,"*"));
                System.out.println(args[index].replace("a" ,"*"));
            }
        }
        public static void main(String[] args){
            String[]_block = new String[]{"contoh kalimat"};
            UbahHurufEToStar(_block);
        }
}
