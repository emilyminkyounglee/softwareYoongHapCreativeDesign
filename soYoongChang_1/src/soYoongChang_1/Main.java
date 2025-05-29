

package soYoongChang_1;

import java.util.*;

public class Main {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Login login = new Login();
		
		boolean authenticated = false;
		
		login.welcome();
		while(!authenticated)
		{
			login.loginMenu();
			System.out.print("input : ");
			
			if(sc.hasNextInt())
			{
				int menu = sc.nextInt();
				sc.nextLine();
				
				switch(menu)
				{
				case 0: 
					login.회원가입();
					break;
				case 1:
					login.이화인메일();
					authenticated = true;
					break;
				case 2:
					login.유레카계정();
					authenticated = true;
					break;
				default: 
					System.out.println("다시 입력하세요.");
				}
			}
			else
			{
				System.out.println("숫자로 입력하세요. ");
				sc.next();
			}
		}
		
		System.out.println("로그인에 성공하였습니다. 기능을 선택하세요. ");
		
		List<Store> stores = new ArrayList<>();
		String[] order = {"삼각김밥", "김밥", "컵라면", "샌드위치", "과자"};
		
		List<String> gusia = Arrays.asList("순두부찌개", "베트남쌀국수", "제육덮밥", "돈까스");
		List<String> conveni = Arrays.asList("삼각김밥", "김밥", "컵라면", "음료", "샌드위치", "컵밥", "과자");
		List<String> ewhaCafe = Arrays.asList("이화김밥", "참치김밥", "아이스티노", "달덩이쿠키", "홍차라떼");
		List<String> ohBong = Arrays.asList("오봉떡볶이", "오봉김밥", "오봉도시락", "오봉덮밥");
		List<String> cafe = Arrays.asList("아메리카노", "라떼", "아이스티", "레모네이드", "초코프라페", "수박주스");
		
		
		stores.add(new Store("구시아_푸드마켓", new ArrayList<>(gusia), Building.ECC));
		stores.add(new Store("CU", new ArrayList<>(conveni), Building.ECC));
		stores.add(new Store("emart24", new ArrayList<>(conveni), Building.아산공학관));
		stores.add(new Store("오봉도시락", new ArrayList<>(ohBong), Building.이화포스코관));
		stores.add(new Store("이화상점", new ArrayList<>(ewhaCafe), Building.학관));
		stores.add(new Store("더_벤티", new ArrayList<>(cafe), Building.이화포스코관));
		
		while(true)
		{
			System.out.println("========기능 선택========");
			System.out.println("1. 건물별 매장 검색");
			System.out.println("2. 온라인 주문");
			System.out.println("0. 종료");
			System.out.print("입력 : ");
			
			if(sc.hasNextInt())
			{
				int choice = sc.nextInt();
				sc.nextLine();
				
				if(choice == 1)
				{
					BuildingSearch search = new BuildingSearch("건물 검색", stores);
					search.showAvailableBuildings();
					System.out.println("건물명을 입력하세요: ");
					String buildingName = sc.nextLine();
					search.searchByBuilding(buildingName);
				}
				else if(choice == 2)
				{
					OnlineOrder orderSystem = new OnlineOrder(order, "emart24");
					orderSystem.setStore(stores);
					System.out.print("온라인 주문을 하시겠습니까? yes/no : ");
					String yesNo = sc.nextLine();
					boolean YesNo;
					if(yesNo == "yes")
					{
						YesNo = true;
					}
					else
					{
						YesNo = false;
					}
					orderSystem.order(YesNo, 10);
				}
				else
				{
					break;
				}
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		do
//		{
//			System.out.print("무엇을 하시겠습니까 : ");
//			int choose = sc.nextInt();
//			sc.nextLine();
//			if(choose == 1)
//			{
//				login.이화인메일();
//				error = false;
//			}
//			else if(choose == 2)
//			{
//				login.유레카계정();
//				error = false;
//			}
//			else if(choose == 0)
//			{
//				login.회원가입();
//				error = false;
//			}
//			else
//			{
//				System.out.println("잘못된 입력. 다시하십시오. ");
//				error = true;
//			}
//		}while(error);
		
	}

}
