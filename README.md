# Vaadin 예제 웹페이지

[Vaadin](https://vaadin.com/) 공식 홈페이지의 문서들은 대부분 [Maven](https://maven.apache.org/) 기반의 설명인데, 나는 [Maven](https://maven.apache.org/)은 잼병인 데다가 솔직히 요즘에 굳이 [Maven](https://maven.apache.org/)을 쓸 이유가 있는가 싶어서 [Gradle](https://gradle.org/) 을 이용해서 간단한 예제 웹페이지를 만들어봤다.

프로젝트는 세개의 독립 모듈로 이루어져 있는데, 그냥 모듈 각각으로 프로젝트라고 보면 무방하겠다. 프로젝트 목록은 아래와 같다.

## vaadin-basic

순수하게 Vaadin 프레임워크만 사용된 예제. 톰캣 같은 서블릿 컨테이너에 얹어서 실행하고 루트 경로로 접속하면 버튼이 표시된다.

## vaadin-with-spring

vaadin-basic 과 같은 예제이지만, 스프링 프레임워크를 곁들여 사용했다. vaadin-basic 과 마찬가지로 톰캣 같은 서블릿 컨테이너에 배포해서 확인할 수 있다.

스프링 프레임워크를 사용한 만큼, 간단한 서비스를 작성해서 View에 주입하도록 작성했다.

스프링 부트를 사용할때와는 달리 서블릿 초기화 설정이나 스프링 설정을 수동으로 해줘야 하기 때문에, 환경설정 클래스가 조금 번잡하다.

다만, 이 설정 부분을 응용하면 web.xml 파일을 사용하는 전통적인 웹 프로젝트로 변환도 가능할 듯 싶다.

현재 Vaadin Spring 라이브러리의 최신 버전은 11.0.0 이지만 프로젝트에서 사용된 버전은 10.1.1 인데, 이유는 알 수 없지만 11.0.0 을 사용하는 경우 버튼의 스타일이 모두 제거되어 표시되었기 때문이다.

## vaadin-with-springboot

vaadin-basic 과 같은 예제이지만, 스프링 부트를 사용했다.

스프링 프레임워크만을 사용했을때와 비교하자면, 환경설정 클래스가 아예 없어져서 코드가 간결해졌다는 점이 있겠다.

# References

  * Vaadin & Spring
    * https://vaadin.com/framework/spring
  * Using Flow with Spring (Vaadin 10)
    * https://vaadin.com/docs/v10/flow/spring/tutorial-spring-basic.html
  * Creating CRUD UI with Vaadin
    * http://spring.io/guides/gs/crud-with-vaadin/

참고로 Vaadin 홈페이지에서 제공되는 [Vaadin Spring](https://vaadin.github.io/framework-spring-tutorial/) 이라는 문서는 오래되어서 그런지, 이대로 따라해도 컴파일이 안된다(Vaadin-Spring 12 버전 기준). 