import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CustomException {
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		
		IntStream.range(0, 10).forEach(index->stringList.add(String.valueOf(index)));
		stringList.add("abcd");
		IntStream.range(11, 20).forEach(index->stringList.add(String.valueOf(index)));
		for(String str:stringList) {
			try {
				System.out.println(Integer.valueOf(str));
				System.out.println("sdfsdfs");
			} catch (Exception e) {
				System.out.println("it is String:: "+str);
			}
		}
	}

}
