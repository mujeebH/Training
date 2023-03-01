package assignment;
import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h=new HashMap();
		h.put(1, "hi");
		h.put(2, "bye");
		h.put(3, "hello");
		h.put(4, "taata");
		Set k=h.keySet();
		Collection i=h.values();
		Set g=h.entrySet();
		//for(Entry<Integer,String> data :h.entrySet() ){
			//System.out.println(data.getKey()+" "+data.getValue());
			//}
		}

}
