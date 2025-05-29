package soYoongChang_1;

import java.util.*;

public class BuildingSearch extends Search {

    List<Store> stores;

    public BuildingSearch(String searchType, List<Store> stores) {
        super(searchType);
        this.stores = stores;
    }

    public void searchByBuilding(String buildingName) {
        boolean found = false;
        System.out.println("[" + buildingName + "]에 위치한 가게 목록:");

        for (Store store : stores) {
            if (store.getBuilding().name().equals(buildingName)) {
                store.showStore();
                found = true;
            }
        }

        if (!found) {
            System.out.println("해당 건물에 등록된 매장이 없습니다.");
        }
    }

    public void showAvailableBuildings() {
        System.out.println("검색 가능한 건물 목록:");
        for (Building b : Building.values()) {
            System.out.println("- " + b.name());
        }
    }
}