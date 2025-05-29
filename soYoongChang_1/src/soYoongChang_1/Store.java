package soYoongChang_1;

import java.util.*;

public class Store {

    List<String> menu = new ArrayList<>();
    String name;
    Enum building;

    public Store(String name, List<String> menu , Enum building) {
        this.name = name;
        this.building = building;
        this.menu = new ArrayList<>(menu);  // 배열을 ArrayList로 변환
    }

    public Enum getBuilding() {
        return building;
    }

    public void setBuilding(Enum building) {
        this.building = building;
    }

    public List<String> getMenu() {
        return menu;
    }

    public void setMenu(List<String> menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showStore() {
        System.out.println(this.name);
    }

    public void showMenu() {
        showStore();
        System.out.println("           메뉴창");
        System.out.println("==============================");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + " : " + menu.get(i));
        }
    }
}