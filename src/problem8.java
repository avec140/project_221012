import java.util.*;

public class problem8 {
    private HashMap<String, Integer> map = new HashMap<String, Integer>();
    private Scanner scanner = new Scanner(System.in);

    public problem8() { }

    public void run() {
        System.out.println("** 포인트 관리 프로그램입니다 **");

        while(true) {
            System.out.print("이름과 포인트 입력>> ");
            String name = scanner.next();
            if(name.equals("그만"))
                break;
            int point = scanner.nextInt();

            Integer n = map.get(name);
            if(n != null) {
                point += n;
            }

            map.put(name, point); // 이름과 누적 포인트 갱신
            printAll();
        }
    }

    void printAll() {
        Set<String> keys = map.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()) {
            String name = it.next();
            int point = map.get(name);
            System.out.print("("+name+","+point+")");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        problem8 man = new problem8();
        man.run();
    }
}