package formater;
import java.util.Arrays;
import java.util.List;

public class TEST {

	/**Showing list as an row for table...*/
	public static void main(String[] args) {
		List<String> list;
		/**HEADER!
		 * could have 1 or more column (just input items as a list)*/
		list =  Arrays.asList("NAME", "SCORE");
		System.out.println(TableFromLists.rowFormater(list));
		/**can put some other underline (must be string with length == 1)*/
		list =  Arrays.asList("-","-");
		System.out.println(TableFromLists.rowFormater(list));
		
		/**CONTENT of a rows!*/
		//1. way
		list =  Arrays.asList("Thomas", "145");
		System.out.println(TableFromLists.rowFormater(list));
		
		//2. way (1 line - printer)
		TableFromLists.formaterRowPrinter(Arrays.asList("John", "725"));

		//3. way (custom width)
		list = Arrays.asList("Алексей", "748.2555");
		System.out.println(TableFromLists.rowFormater(list, 15));
		
		
	}
	/**Example for work with streams...*/
//	public static void stampajGradBrLjudiPrimanja() {
//		TableFromLists.formaterRowPrinter(Arrays.asList("Data1", "Data2", "Data3"), 18);
//		TableFromLists.formaterRowPrinter(Arrays.asList("-", "-", "-"), 18);
//		Map<String, IntSummaryStatistics> map1 = TMP.getStream(5000)
//			.collect(Collectors.groupingBy(TMP::getKey, Collectors.summarizingInt(TMP::getValue)));
//		map1.entrySet().stream()
//			.map(e -> Arrays.asList(e.getKey().toUpperCase(), ""+e.getValue().getCount(), ""+e.getValue().getAverage()))
//			.forEach(e -> TableFromLists.formaterRowPrinter(e, 18));
//	}

}
