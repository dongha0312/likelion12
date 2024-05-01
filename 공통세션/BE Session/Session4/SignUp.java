package 공통세션.Session4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SignUp {

/*
    1. 회원가입 선택 (y/n) 다른거 넣으면 끝남 (done)
    2. ID 입력 구현 (done)
    3. 비밀번호/비밀번호 확인 구현(done)
    4. 생년월일/ 생년월일 6자리 확인 구현(done)
    5. 이메일(done)
    6. login(done)
    7. 회원정보 불러오기(done)
    8. 회원정보 수정(done)
    9.종료 (done)

    피드백 받은거 수정(done)
    혹시 키 값들은 어떻게 받나요?
*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<String, String> Data = new HashMap<>();
        boolean success = false;
        String ID, PW;

        while(!success){
            //회원가입 (의사여부)
            System.out.println("========================");
            System.out.println("회원가입을 하시겠습니까? Y/N");
            System.out.println("========================");
            String agree = br.readLine();

            if(agree.equalsIgnoreCase("y")){
                //아이디
                System.out.println("=========================");
                System.out.println("원하시는 아이디를 입력해주세요.");
                System.out.println("=========================");
                ID = br.readLine();

               // 비밀번호
                System.out.println("=========================");
                System.out.println("비밀번호를 입력해주세요.");
                System.out.println("=========================");
                PW = br.readLine();
                int count = 6;
                for (int i = 0; i < 6; i--) {
                    System.out.println("비밀번호를 확인합니다. 다시 한번 입력 해주세요.");
                    String re_PW = br.readLine();

                    if (!re_PW.equals(PW)) {
                        System.out.print("비밀번호가 틀렸습니다.");
                        System.out.println("남은 횟수는 " + (count-1) + "입니다.");
                        count--;

                    }
                    else if (re_PW.equals(PW)) {
                        System.out.println("비밀번호가 일치합니다.");
                        break;
                    }
                    if (count == 0) {
                        System.out.println("남은 횟수는 " + count + "입니다.");
                        success = true;
                        break;
                    }
                }
                if (success) break;

                //생년월일 검사
                System.out.println("=========================");
                System.out.println("생년월일 6자리 입력해주세요.");
                System.out.println("=========================");
                String birthDate = br.readLine();
                if(birthDate.length() != 6){
                    System.out.println("6자리가 아닙니다.");
                    System.out.println("프로그램이 종료됩니다.");
                    success = true;
                }if (success) break;

                int reBirthCnt = 6;
                for (int i = 0; i < 6; i++) {
                    System.out.println("생년월일 확인을 위해 한번 더 입력해주세요.");
                    String reBirthDate = br.readLine();
                    if (reBirthDate.equals(birthDate)){
                        System.out.println("확인이 되었습니다.");
                        break;
                    } else if (!reBirthDate.equals(birthDate)) {
                        System.out.println("생년월일이 틀렸습니다.");
                        System.out.println("남은 횟수는 " + (reBirthCnt-1) + "입니다.");
                        reBirthCnt--;
                        if (reBirthCnt == 0) {
                            success = true;
                            break;
                        }
                    }
                }if (success) break;

                //이메일
                System.out.println("=========================");
                System.out.println("이메일을 입력해주세요.");
                System.out.println("=========================");
                String eMail = br.readLine();

                System.out.println("=========================");
                System.out.println("회원가입이 정상적으로 되었습니다.");
                System.out.println("=========================");

                Data.put(ID,birthDate);
                Data.put(PW,eMail);
                //혹시 키 값들은 어떻게 받나요?
                System.out.println("ID: " + ID  + " Password: " + PW+ " Birthdate: " + Data.get(ID) + " Email: " +Data.get(PW) );
            }
            else if (!agree.equalsIgnoreCase("y")){
                System.out.println("회원가입을 종료합니다.");
                break;
            }
            while (true){
                //switch문 로그인, 로그아웃
                System.out.println("=================================================");
                System.out.println("옵션을 선택해주세요. (1. 로그인 ||  2. 회원정보 불러오기  ||  3. 회원정보 수정  || 4. 종료)");
                System.out.println("=================================================");
                int option = Integer.parseInt(br.readLine());
                switch (option){
                    //login
                    case 1:
                        System.out.println("=========================================");
                        System.out.println("로그인을 시작합니다. 아이디와 비밀번호를 입력해주세요.");
                        System.out.println("=========================================");
                        st = new StringTokenizer(br.readLine());
                        String loginID = st.nextToken();
                        String loginPW = st.nextToken();
                        if(Data.containsKey(loginID) && Data.containsKey(loginPW)){
                            System.out.println("로그인이 되었습니다.");
                        }
                        if (!Data.containsKey(loginID)){
                            System.out.println("없는 아이디 입니다.");
                        }
                        else if (Data.containsKey(loginID) && !Data.containsKey(loginPW)) {
                            System.out.println("비밀번호가 틀렸습니다.");
                            int count = 6;
                            for (int i = 0; i < 6; i++){

                                System.out.println("======================");
                                System.out.println("비밀번호를 다시 입력해주세요.");
                                System.out.println("======================");
                                String retryPW = br.readLine();

                                if(!Data.containsKey(retryPW)){
                                    System.out.print("비밀번호가 틀렸습니다.");
                                    System.out.println("남은 횟수는 " + (count-1) + "입니다.");
                                    count--;
                                    if (count == 0){
                                        System.out.println("남은 기회는 없습니다.");
                                        success = true;
                                    }
                                }
                                else if (Data.containsKey(retryPW)) {
                                    System.out.println("비밀번호가 맞았습니다. 로그인이 되었습니다.");
                                    break;
                                }
                            }if(success)break;
                        }break;

                    //회원 정보 불러오기
                    case 2:
                        System.out.println("-----회원정보----- ");
                        System.out.println("회원의 ID와 비밀번호를 입력해주세요: ");
                        st = new StringTokenizer(br.readLine());
                        String Id = st.nextToken();
                        String Pw = st.nextToken();
                        System.out.println("회원의 정보를 불러옵니다.");
                        if (!Data.containsKey(Id) || !Data.containsKey(Pw)){
                            System.out.println("===========================");
                            System.out.println("입력하신 정보는 일치 하지 않습니다.");
                            System.out.println("===========================");
                        }
                        if(Data.containsKey(Id)&&Data.containsKey(Pw)){
                            System.out.println("================");
                            System.out.println("-----회원정보-----");
                            System.out.println("ID: " + Id);
                            System.out.println("PassWord: " + Pw);
                            System.out.println("BirthDate: " + Data.get(Id));
                            System.out.println("Email: " + Data.get(Pw));
                        }
                        break;

                    //회원 정부 수정
                    case 3:
                        System.out.println("=====================");
                        System.out.println("-----회원정보 수정----- ");
                        System.out.println("회원의 ID와 비밀번호를 입력해주세요: ");
                        st = new StringTokenizer(br.readLine());
                        String iD = st.nextToken();
                        String pW = st.nextToken();
                        if (!Data.containsKey(iD) || !Data.containsKey(pW)){
                            System.out.println("===========================");
                            System.out.println("입력하신 정보는 일치 하지 않습니다.");
                            System.out.println("===========================");
                            break;
                        }

                        System.out.println("수정 하고픈 정보를 골라주세요. (1.생년월일 | 2.이메일)");
                        int dataChange = Integer.parseInt(br.readLine());
                        switch (dataChange){
                            case 1:
                                System.out.println("새로운 생년월일을 입력해주세요.");
                                String newYear = br.readLine();
                                Data.replace(iD,Data.get(iD),newYear);
                                System.out.println("새로운 생년월일은 " + Data.get(iD)+"입니다.");
                                break;

                            case 2:
                                System.out.println("새로운 이메일을 입력해주세요.");
                                String newEmail = br.readLine();
                                Data.replace(pW,Data.get(pW),newEmail);
                                System.out.println("새로운 이메일은 " + Data.get(pW)+"입니다.");
                                break;
                        }

                        break;
                   //종료
                   case 4:
                      System.out.println("시스템을 종료하겠습니다.");
                       success = true;
                      break;

                }if(option == 4)break;
            }
        }
    }
}
