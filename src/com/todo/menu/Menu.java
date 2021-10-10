package com.todo.menu;
public class Menu {

    private static void displaymenu()
    {
        System.out.println();
        System.out.println("1. 아이템 추가 ( add )");
        System.out.println("2. 아이템 삭제 ( del )");
        System.out.println("3. 아이템 업데이트  ( edit )");
        System.out.println("4. 아이템 제목/내용 검색 ( find <키워드> )");
        System.out.println("5. 아이템 카테고리 검색 ( find_cate <키워드> )");
        System.out.println("6. 아이템 카테고리 종류 나열 ( ls_cate )");
        System.out.println("7. 아이템 리스트 보기 ( ls )");
        System.out.println("8. 아이템 리스트 이름 정렬 ( ls_name_asc )");
        System.out.println("9. 아이템 리스트 이름 역순 정렬 ( ls_name_desc )");
        System.out.println("10. 아이템 리스트 날짜 정렬 ( ls_date )");
        System.out.println("11. 아이템 리스트 날짜 역순 정렬 ( ls_date_desc )");
        System.out.println("12. 종료 (Or press escape key to exit)");
        System.out.println();
    }
    
    public static void prompt(boolean tf) {
    	if (tf == true) {
    		displaymenu();
    	} else {
    		System.out.print("명령어를 선택하시오 > ");
    	}
    }
}
