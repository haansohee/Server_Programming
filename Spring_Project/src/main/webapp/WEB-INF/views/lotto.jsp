<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 내가 한 코드.. -->
<%
Random rand = new Random();
int[] arr = new int[6];

for(int i=0; i<6; i++) {
    arr[i] = rand.nextInt(45)+1;
    for(int j=0; j<i; j++) {
        if(arr[i] == arr[j]) {
        	i—;
        }
    }
}

for(int i=0; i<6; i++) {
	out.print(i+1 + "번째 숫자: " + arr[i] + "<br>");
}
%>

<!-- 교수님 코드  -->

<%-- <%
Random ran = new Random();
int nLottoNum = 6;
int arrLotto[] = new int[nLottoNum];

for (int i = 0; i <= nLottoNum - 1; i++) {
	arrLotto[i] = 0;
}

int nCurrentCnt = 0;
int nCurrentVal = 0;
boolean bExistVal = false;

while (true) {
	nCurrentVal = ran.nextInt(45) + 1;
	bExistVal = false;
	for(int j = 0; j <= nCurrentCnt; j++) {
		if (arrLotto[j] == nCurrentVal) {
			out.print("중복 발생..");
			bExistVal = true;
			continue;
		}
	}
	if (bExistVal == false ){
		arrLotto[nCurrentCnt] = nCurrentVal;
		nCurrentCnt++;
	}
	
	if (nCurrentCnt == 6) {
		break;
	}
	
	for (int i = 0; i <= nLottoNum-1; i++) {
		out.print(i + 1 +"번째 숫자 : " + arrLotto[i] + "<br>");
	}
}
%>
 --%>
</body>
</html>