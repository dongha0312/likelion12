package 공통세션.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SignUp {

//    1. 회원가입 선택 (y/n) (done)
//    2. ID 입력 구현 (done)
//    3. 비밀번호/비밀번호 확인 구현(done
//    4. 생년월일/ 생년월일 6자리 확인 구현(done)
//    5. 이메일
//
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> id = new HashMap<>( );
        HashMap<String, String> pw = new HashMap<>();
        boolean success = false;

        while(!success){
            System.out.println("========================");
            System.out.println("회원가입을 하시겠습니까? Y/N");
            System.out.println("========================");
            String agree = br.readLine();
            if(agree.equals("y") || agree.equals("Y")){
                System.out.println("=========================");
                System.out.println("원하시는 아이디를 입력해주세요.");
                System.out.println("=========================");
                String ID = br.readLine();
                System.out.println("=========================");
                System.out.println("비밀번호를 입력해주세요.");
                System.out.println("=========================");
                String PW = br.readLine();
                int count = 5;
                for (int i = 0; i < 5; i++) {
                    System.out.println("비밀번호를 확인합니다. 다시 한번 입력 해주세요.");
                    String re_PW = br.readLine();

                    if (!re_PW.equals(PW)) {
                        System.out.print("비밀번호가 틀렸습니다.");
                        System.out.println("남은 횟수는 " + count + "입니다.");
                        count--;
                        if (count == 0) {
                            System.out.println("남은 횟수는 " + count + "입니다.");
                            success = true;
                            break;
                        }
                    }
                    else if (re_PW.equals(PW)) {
                        System.out.println("비밀번호가 일치합니다.");
                        break;
                    }
                }
                if (success == true) break;


                System.out.println("=========================");
                System.out.println("생년월일 6자리를 입력해주세요.");
                System.out.println("=========================");
                String birthDate = br.readLine();

                int reBirthCnt = 5;
                for (int i = 0; i < 5; i++) {
                    System.out.println("생년월일 확인을 위해 한번 더 입력해주세요.");
                    String reBirthDate = br.readLine();
                    if (reBirthDate.equals(birthDate)){
                        System.out.println("확인이 되었습니다.");
                        break;
                    } else if (!reBirthDate.equals(birthDate)) {
                        System.out.println("생년월일이 틀렸습니다.");
                        System.out.println("남은 횟수는 " + reBirthCnt + "입니다.");
                        reBirthCnt--;
                        if (reBirthCnt == 0) {
                            break;
                        }
                    }
                }
                System.out.println("=========================");
                System.out.println("이메일을 입력해주세요.");
                System.out.println("=========================");
                String eMail = br.readLine();

                System.out.println("=========================");
                System.out.println("회원가입이 정상적으로 되었습니다.");
                System.out.println("=========================");

                id.put(ID,birthDate);
                pw.put(PW,eMail);
                System.out.println("ID: " + ID + " " + " Password: " + PW+ " Birthdate: " + birthDate + " Email: " +eMail );
            }
            else if (agree.equals("n") || agree.equals("N")){
                System.out.println("회원가입을 종료합니다.");
                break;
            }
            System.out.println("=========================");
            System.out.println("로그인을 시작합니다. 아이디와 비밀번호를 입력해주세요.");
            System.out.println("=========================");
            StringTokenizer st = new StringTokenizer(br.readLine());
            String loginID = st.nextToken();
            String loginPW = st.nextToken();
            id.get(loginID);
            pw.get(loginPW);

            if(id.containsKey(loginID) && pw.containsKey(loginPW)){
                System.out.println("로그인이 되었습니다.");
            }


        }
    }
}
