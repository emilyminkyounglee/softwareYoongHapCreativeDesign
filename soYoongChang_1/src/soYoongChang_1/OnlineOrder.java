package soYoongChang_1;

import java.util.*;

public class OnlineOrder {

    Scanner sc = new Scanner(System.in);

    String[] order = new String[5];
    List<Store> stores = new ArrayList<>();
    boolean noOrder = false;

    public void setStore(List<Store> stores) {
        this.stores = stores;
    }

    public List<Store> getStore() {
        return this.stores;
    }

    public OnlineOrder(boolean yesOrder, String[] order, String Store, int minute) {
        this.order = order;
        System.out.println("온라인 주문 버튼 클릭");

        if (yesOrder) {
            System.out.println("온라인 주문이 완료 되었습니다.");
            System.out.println("주문하신 메뉴는:");
            for (int i = 0; i < 5; i++) {
                if (this.order[i] != null) {
                    System.out.println(this.order[i]);
                }
            }
            System.out.println("예상 조리 시간 : " + minute + " 분");
        } else {
            System.out.println("온라인 주문을 하시겠습니까? yes/no ");
            String yesNo = sc.nextLine();

            if (yesNo.equalsIgnoreCase("yes")) {
                System.out.println("어느 곳에서 주문하시겠습니까?");
                for (int i = 0; i < stores.size(); i++) {
                    System.out.println(i + " : " + stores.get(i).getName());
                }

                System.out.print("번호 입력 : ");
                int n = sc.nextInt();
                sc.nextLine();

                if (n >= 0 && n < stores.size()) {
                    stores.get(n).showStore();
                    stores.get(n).showMenu();
                } else {
                    System.out.println("유효하지 않은 번호입니다.");
                }

            } else if (yesNo.equalsIgnoreCase("no")) {
                System.out.println("주문하지 않습니다.");
                noOrder = true;
            } else {
                System.out.println("잘못된 입력.");
            }
        }
    }
}