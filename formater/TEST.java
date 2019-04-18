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
		list =  Arrays.asList("Thomas", "145");
		System.out.println(TableFromLists.rowFormater(list));
		
		list = Arrays.asList("John", "725");
		System.out.println(TableFromLists.rowFormater(list));

		list = Arrays.asList("Алексей", "748.2555");
		System.out.println(TableFromLists.rowFormater(list, 15));
		
		
	}
	/**Example for work with streams...*/
//	public static void stampajGradBrLjudiPrimanja() {
//		List<String> linija = Arrays.asList("Grad", "Broj ljudi", "Prosecna primanja");
//		System.out.println(TableFromLists.rowFormater(linija, 18));
//		linija = Arrays.asList("-", "-", "-");
//		System.out.println(TableFromLists.rowFormater(linija, 18));
//		Map<String, IntSummaryStatistics> mapa = Osobe.osobeStream(5000)
//			.collect(Collectors.groupingBy(Osoba::getMestoStanovanja, Collectors.summarizingInt(Osoba::getPrimanja)));
//		mapa.entrySet().stream()
//			.map(e -> Arrays.asList(e.getKey().toUpperCase(), ""+e.getValue().getCount(), ""+e.getValue().getAverage()))
//			.forEach(e -> TableFromLists.formaterRowPrinter(e, 18));
//	}

}
