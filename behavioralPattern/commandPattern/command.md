요청은 개체 아래 명령으로 래핑되어 호출자 개체로 전달된다.
이때 호출자 개체는 이 명령을 처리할 수 있는 적절한 개체를 찾고 명령을 실행한다.

1. 먼저 명령 인터페이스를 만든다. (Order.java)
2. 요청 클래스를 만든다 (Stock.java) -- 해당 요청이 들어간다
3. 명령 인터페이스를 구현하는 구체적인 로직을 만든다.  요청클래스를 생성자로 넣는다.
4. 명령 호출자 클래스를 만든다 (broker.java) 여기서에서 명령을 호출한다.
5. 호출 클래스를 사용하여 명령을 받고 실행한다.



