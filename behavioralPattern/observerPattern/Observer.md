옵저퍼 패턴을 하나의 객체가 수정되면 종속 객체에 자동으로 알려야 하는 등 객체 간에 1:N의 관계가 있을때 사용된다.

1. 개체를 만든다.
2. 해당객체의 set에서는 옵저버를 사용하고 있고 옵저버의 돌면서 메서드를 실행한다.
3. 옵저버 클래스를 만든다.
4. 옵저버 클래스를 구현한다. 옵저버에서는 옵저버가 실행되면 해야할 일을 구현한다.
5. 메인에서는 객체를 생성하고 사용하고 싶은 옵저버를 연결한다.
6. 값을 바꾼뒤 확인한다.
