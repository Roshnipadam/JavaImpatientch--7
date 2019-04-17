import java.util.ArrayList;
import java.util.Iterator;
public class Question2{
        public static void main(String[] args) {
            ArrayList<String> listString = new ArrayList<>(5);
            listString.add("aa");
            listString.add("bb");
            iteratorLoop(listString).stream().forEach(s -> System.out.print(" "+s+" "));
            System.out.println();
            forLoop(listString).stream().forEach(s -> System.out.print(" "+s+" "));
            System.out.println();
            replaceAll(listString).stream().forEach(s -> System.out.print(" "+s+" "));
        }

        public static ArrayList<String> iteratorLoop(ArrayList<String> list){
            Iterator<String> iterator = list.iterator();
            ArrayList<String> endList = new ArrayList<>();
            while (iterator.hasNext()){
                String temp = iterator.next();
                endList.add(temp.toUpperCase());
            }
            return endList;
        }
        public static ArrayList<String> forLoop(ArrayList<String> list){
            for(int i = 0 ; i<list.size();i++){
                list.set(i,list.get(i).toUpperCase());
            }
            return list;
        }

        public static ArrayList<String> replaceAll(ArrayList<String> list){
            list.replaceAll(s -> s.toUpperCase());
            return list;
        }


}
