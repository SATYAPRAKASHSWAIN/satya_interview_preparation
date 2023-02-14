package collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class Sortedmap {
	public static void main(String[] args) {
		SortedMap<String,String> sp=new TreeMap<>();
		sp.put("Rocky", "Tusar");
		sp.put("Tusar", "Rocky");
		sp.put("Ram", "Sita");
		System.out.println(sp);//{Ram=Sita, Rocky=Tusar, Tusar=Rocky}
		String firstKey = sp.firstKey();
		System.out.println(firstKey);//Ram
		String lastKey=sp.lastKey();
		System.out.println(lastKey);//Tusar
		SortedMap<String, String> headMap = sp.headMap(lastKey);
		System.out.println(headMap);//{Ram=Sita, Rocky=Tusar}
		SortedMap<String,String>tailMap=sp.tailMap("Rocky");
		System.out.println(tailMap);//{Rocky=Tusar, Tusar=Rocky}
		SortedMap<String, String> subMap = sp.subMap(firstKey, lastKey);
		System.out.println(subMap);//{Ram=Sita, Rocky=Tusar}
		
	}

}
