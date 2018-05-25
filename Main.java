import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.testIt();
        testMap();
    }
    private void testIt(){
        System.out.println("分支提交");
        System.out.println("主干提交");
        System.out.println("test");
    }

    private static void testMap() {
        Map<String,Map<String,String>> map = new HashMap<>();
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        for (int i = 0; i < list.size(); i++) {
            Map<String, String> selectMap = map.get(list.get(i));
            if (selectMap == null) {
                selectMap = new HashMap<>();
                System.out.println(selectMap);
                map.put(list.get(i).toString(),selectMap);
            }
            selectMap.put("extra", list.get(i).toString());
        }
        System.out.println(map);
    }
}
