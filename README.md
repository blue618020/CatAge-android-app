# 고양이 나이 구하기

<b> 📝 tistory : </b> https://blue618020.tistory.com/79

### 🔍 학습 내용
- Calendar를 사용하여 날짜, 시간 정보가 들어있는 Date객체를 불러오기

### 💻 실습
- 고양이가 태어난 년도를 입력받으면, 정수로 변경하기
  
       Integer 변수 = Integer.parseInt(문자열이 담긴 변수); 

- 현재 년도를 가져오기

       Calendar now = getInstance();
       int currentYear = now.get(Calendar.YEAR);

- 날짜 계산하고 다시 문자열로 변경해서 화면에 출력하기
        
      Integer age = currentYear - inYear;
      textResult.setText("" + age + "살 입니다.");

