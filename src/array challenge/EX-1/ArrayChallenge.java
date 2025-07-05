public class ArrayChallenge{
    public static void main(String[] args){
        String[] orderIds={"JD-O1","SK-O2","JD-O3","SK-O4","JD-O5"};

        for (String item : orderIds){
if (item.startsWith("JD")){

    System.out.println("item starts with JD " + item);
}


if(item.startsWith("SK")){
    System.out.println(item);
}
        }

    }

}