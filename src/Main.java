import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
	           //1001 alice 국어 80, 영어 90, 수학 70
		List<StudentDTO> stds = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		stds.add(new StudentDTO("1001","alice",new Score(80,90,70),new Detail("지구","010-1234-4321"))); 
		stds.add(new StudentDTO("1002","jack",new Score(50,30,80),new Detail("화성","010-4321-4321")));
		stds.add(new StudentDTO("1003","john",new Score(15,95,50),new Detail("목성","010-1324-4231")));
		stds.add(new StudentDTO("1004","jane",new Score(99,37,28),new Detail("수성","010-0101-1010")));
		stds.add(new StudentDTO("1005","tom",new Score(66,50,88),new Detail("금성","010-1313-2121")));
		System.out.println("학번\t이름\t합계\t평균");
		
		for(StudentDTO tmp : stds) {
			System.out.println(tmp.getId() + "   " +tmp.getName() + "   " + tmp.getScore().getSum() + 
					"   " + String.format("%.2f",tmp.getScore().getAvg()));
		}
		System.out.print("몇 점을 커트라인으로 설정할까요? ");
		int cut = sc.nextInt();
		for(StudentDTO tmp : stds) {
		if(tmp.getScore().getAvg() >= cut) {
			System.out.println(tmp.getId() + "   " +tmp.getName() + "   " + tmp.getScore().getSum() + 
					"   " + String.format("%.2f",tmp.getScore().getAvg()));
		}
		}
		for(StudentDTO tmp : stds) {
			System.out.println(tmp.getDetail().getContact());
			}
	}
}
