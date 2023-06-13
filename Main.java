import java.awt.desktop.SystemEventListener;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>(); // 랜덤으로 받은 숫자 배열?
        int user; // 우리가 입력할 값
        int Ball = 0;
        int Strike = 0;
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");

        //1. 랜덤 숫자 만들기(0~9)
        int i = 0;
        boolean t = true;
        while(i < 3){
            int rend = (int)(Math.random() * 9 + 1); // 0<= x <10
            for (int j = 0; j < array.size(); j++) {
                if(array.get(j)== rend){ // 내용물 같은 값 있는 지 검사
                    t = false; // 있으면 안 넣어줄거임
                }
            }
            if(t) { // 없으면 넣음
                array.add(rend);
                i++;
            }
            t = true; // 초기화
        }
        //       System.out.println(array);

        //2. 한자리 숫자에 대해 볼, 스크라이크 판단 하는 부분 구현하기
        for(i = 1; ;i++){
            System.out.print(i +"번째 시도: ");
            user = sc.nextInt();
            Strike = 0;
            Ball = 0;
            for (int j = 2; j >=0 ; j--) {
                int num = user%10;
                user /= 10;
                if (array.get(j) == num) {
                    Strike++;
                } else if (array.contains(num)){
                    Ball++;
                }
            }
            //3. 볼, 스트라이크를 표현하는 부분 구현하기
            if (Ball == 3) {
                System.out.println("3B");
            } else if (Strike == 3) {
                //4. 게임 종료하는 부분 구현하기
                System.out.println("3S");
                System.out.println(i-1 + "번만에 맞히셨습니다.");
                System.out.println("게임을 종료합니다.");
                break;
            }else {
                System.out.println(Ball + "B" + Strike + "S");
            }
        }
    }
}








//        Set<Integer> bnumset = new LinkedHashSet<>();
//        while (bnumset.size() != 3) {
//            bnumset.add((int)(Math.random() * 9 + 1));
//        }
//        for(int i=0;i< arr.length;i++){
//            int rend = (int)(Math.random() * 9 + 1); // 0<= x <10
//            for (int j = 0; j < i; j++) {
//
//            }
//        }