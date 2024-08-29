package fa.training.hibernate;

import java.util.LinkedHashSet;

public class test1 {
	public static void main(String[] args) {
		// Tạo một LinkedHashSet
		LinkedHashSet<String> set = new LinkedHashSet<>();

		// Thêm các phần tử vào LinkedHashSet
		set.add("Táo");
		set.add("Chuối");
		set.add("Cam");
		set.add("Táo"); 

		// Hiển thị LinkedHashSet
		System.out.println(set); //  kết quả [Táo, Chuối, Cam]
		
		/*
		 * // Kiểm tra nếu tập hợp chứa một phần tử
		 * System.out.println(set.contains("C"));
		 * 
		 * // Xóa một phần tử set.remove("Chuối"); System.out.println(set);
		 */ 

//		// Duyệt qua LinkedHashSet
//		for (String item : set) {
//			System.out.println(item);
//		}
	}
}
