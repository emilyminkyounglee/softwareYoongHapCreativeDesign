import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Login {
	
	static Scanner input = new Scanner(System.in);

	static Set<String> 이화인회원 = new HashSet<>();
    static Set<String> 유레카회원 = new HashSet<>();

	public static void welcome() {
		// TODO Auto-generated method stub
		System.out.println("*********************");
		System.out.println("Welcome to 7귀가byte");
		System.out.println("*********************");
	}
	

	public static void loginMenu() {
		// TODO Auto-generated method stub
		String menu = "1.이화인메일로 로그인 2.유레카계정으로 로그인 0.회원가입";
		System.out.println("================");
		System.out.println(menu);
		System.out.println("================");
		
	}
	

	//회원 가입
	public static void 회원가입() {
		// TODO Auto-generated method stub
		System.out.println("1.이화인메일로 회원가입\n2.유레카계정으로 회원가입");
		
		int menu=-1;
		while(true) {
			System.out.print("input: ");
			String inputStr = input.next();
			
			try {
				menu=Integer.parseInt(inputStr);
				if (menu == 1 || menu == 2) break;
                else System.out.println("1 또는 2를 입력하세요.");
				
			}catch(NumberFormatException e) {
				System.out.println("숫자로 입력하세요.");
			}
		}
		
		
		//System.out.print("메일 또는 학번을 입력하세요: ");
		
		
		//이화인메일로 회원가입
		if(menu==1) {
			System.out.print("메일을 입력하세요: ");
			String id=input.next();
			if(이화인회원.contains(id)) {
				System.out.println("이미 존재하는 계정입니다");
			}else
				이화인회원.add(id);
				System.out.println("이화인메일 회원가입이 완료되었습니다!");
		}
		else { //유레카계정으로 회원가입
			System.out.print("학번을 입력하세요: ");
			String id=input.next();
			if (유레카회원.contains(id)) {
                System.out.println("이미 존재하는 계정입니다.");
            } else {
                유레카회원.add(id);
                System.out.println("유레카계정 회원가입이 완료되었습니다!");
            }
		}
		
		
	}
	

	public static void 이화인메일() { //이화인메일 로그인
		// TODO Auto-generated method stub
		System.out.print("이화인메일 입력: ");
		String id=input.next();
		
		if (이화인회원.contains(id)) {
            System.out.println("환영합니다.");
        } else {
            System.out.println("다시 입력하세요.");
        }
		
		
	}
	
	public static void 유레카계정() { //유레카계정 로그인
		// TODO Auto-generated method stub
		System.out.print("유레카 아이디 입력: ");
		String id=input.next();
		
		if (유레카회원.contains(id)) {
            System.out.println("환영합니다.");
        } else {
            System.out.println("다시 입력하세요.");
        }
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		
		while (true) {
            loginMenu();
            System.out.print("input: ");
            
            if(input.hasNextInt()) {
            	int menu = input.nextInt();

                if (menu == 0) 회원가입();
                else if (menu == 1) 이화인메일();
                else if (menu == 2) 유레카계정();
                else System.out.println("다시 입력하세요");//보기에 없는 숫자를 입력했을 경우
                
            }
            else {
            	System.out.println("숫자로 입력하세요");//숫자가 아니라 문자를 입력했을 경우
            	input.next();
            }

		}

	}

}
