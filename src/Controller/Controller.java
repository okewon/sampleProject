package Controller;

import java.util.Scanner;

import service.UserService;

public class Controller {
	
	public static void main(String[] args) {
		
		/*
		 * 조 소개 > 주제 소개 > 주제선정 배경> 프로그램 구조 > 시연
		 * 발표자 1명, ppt및 시연 1명
		 * 
		 * Controller : 메뉴 선택
		 * Service : 메뉴 기능 수행
		 * Dao : 데이터베이스 접속
		 * VO : 데이터를 담는 클래스
		 * 
		 * 회원가입	로그인	회원목록
		 * 
		 * 정보입력	정보입력	정보출력
		 * 
		 * DB에 저장	DB조회	DB조회
		 * 
		 * 데이터 베이스
		 * 
		 */
		
		/*
		 * ppt의 내용은 위와 같이 순서대로 
		 * 어떤 이유로 주제를 선정하게 되었는지..
		 * 시연을 하기 전 프로그램의 구조를 설명..
		 * 프로젝트 구조는 컨트롤러 서비스 다오 브이오
		 * 컨트롤러 에서 메뉴를 선택후 서비스에서 구동
		 * 데이터가 필요하면 Dao로 접근
		 * VO는 데이터를 불러올 때  VO에 담아서 왔다갔다...
		 * 
		 * 이 구조를 이용하여 회원가입, 로그인, 회원목록 을 해보자.(2020-02-04)
		 * 아주 간단하게 살펴보면
		 * 회원가입은 사용자가 사용자의 정보를 입력하고 로그인도 본인의 아이디와 패스워드를 입력한다.
		 * 그리고 회원목록을 출력할 때는 정보를 그냥 출력하는 것이다.
		 * 
		 * 회원가입을 하게 되면 DB에 저장을 해야겠죠~
		 * 데이터 베이스의 클래스에 저장을 해야겠죠..
		 * 그 클래스에서 정보가 일치하는 사람이 있는지 확인해야함
		 * 
		 * 
		 * 지금 이렇게 기준이 나누어져 있는데 DAO를 기준으로 나눈것이다. 
		 * 회원가입, 로그인, 회원목록의 기능들은 컨트롤러 에서 선택하게 되고 
		 * 실제로 정보를 입력을 하게 되면 서비스에서 수행되고, DB에 접근할 필요가 있으면 DAO에서 함
		 * 
		 * DAO에서 데이터베이스에 접근해서 조회를 하거나 사용을 하게 된다.
		 */
		
		da123
		new Controller().start();
	
	}

	UserService userService = UserService.getInstance();
	
	private void start() {
		Scanner s = new Scanner(System.in);
		
		int menu;
		
		do{
			System.out.println("---------------------메뉴--------------------");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원목록");
			System.out.println("0.프로그램 종료");
			System.out.println("--------------------------------------------");
			System.out.println("메뉴에 해당되는 번호 입력>");
			
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu){
				case 1: //회원가입
					userService.join();
					break;
				case 2: //로그인
					userService.login();
					break;
				case 3:	//회원목록
					userService.userList();
					break;
				case 0:	//프로그램종료
					System.out.println("프로그램 종료");
					break;
			}
		}while(menu != 0);
		
	}
}