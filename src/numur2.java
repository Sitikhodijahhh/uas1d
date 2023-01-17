public class numur2 {
    public static void UbahHurufEToStar(String[] args){
        for (int index=0; index<args.length; index++){
            System.out.println(args[index].replace("0","*"));
        }
    }
    public static void main(String[] args){
        String[]_block = new String[]{"Contoh Kalimat"};
        UbahHurufEToStar(_block);
    }
}

