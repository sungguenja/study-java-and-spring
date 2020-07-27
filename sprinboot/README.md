# README

## 0726

1. @ RestController
   - 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줍니다.
   - 예전에는 @ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해준다고 생각하면 됩니다
2. @GetMapping
   - HTTP Method인 Get요청을 받을 수 있는 API제작
   - 예전에는 @RequestMapping(method = RequestMethod.GET)으로 사용되었습니다. 이제 이 프로젝트는 /hello로 요청이 오면 문자열 hello를 반환하는 기능을 가지게 되었습니다.
3. @RunWith(SpringRunner.class)
   - 테스트를 진행할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킵니다.
   - 여기서는 SpingRunner라는 스프링 실행자를 사용합니다.
   - 즉, 스프링 부트 테스트와 JUnit 사이에 연결자 역할을 합니다.
4. @WebMvcTest
   - 여러 스프링 테스트 어노테이션 중, Web(Spring MVC)에 집중할 수 있는 어노테이션입니다.
   - 선언할 경우 @Controller, @ControllerAdvice 등을 사용할 수 있습니다.
   - 단, @Service, @Component, @Repository등은 사용할 수 없습니다.
   - 여기서는 컨트롤러만 사용하기 때문에 선언합니다.
5. @Autowired
   - 스프링이 관리하는 빈(Bean)을 주입 받습니다.
6. private MockMvc mvc
   - 웹 API를 테스트할 때 사용합니다.
   - 스프링 MVC 테스트의 시작점입니다.
   - 이 클래스를 통해 HTTP GET, POST 등에 대한 API 테스트를 할 수 있습니다.
7. mvc.perform(get("/hello"))
   - MockMvc를 통해 /hello 주소로 HTTP GET 요청을 합니다.
   - 체이닝이 지원되어 아래와 같이 여러 검증 기능을 이어서 선언할 수 있습니다.
8. .andExpect(status().isOk())
   - mvc.perform의 결과를 검증합니다.
   - HTTP Header의 Status를 검증합니다
   - 우리가 흔히 알고 있는 200,404,500 등의 상태를 검증합니다.
   - 여기선 OK 즉, 200인지 아닌지를 검증합니다.
9. .andExpect(content().string(hello))
   - mvc.perform의 결과를 검증ㅎ바니다.
   - 응답 본문의 내용을 검증합니다.
   - Controller에서 "hello"를 리턴하기 때문에 이 값이 맞는지 검증합니다.



## 0727

1. @Getter
   - 선언된 모든 필드의 get 메소드를 생성해 줍니다.
2. @RequiredArgsConstructor
   - 선언된 모든 final 필드가 포함된 생성자를 생성해 줍니다.
   - final이 없는 필드는 생성자에 포함되지 않습니다.
3. final
   - [참고링크](https://blog.lulab.net/programming-java/java-final-when-should-i-use-it/)
   - 엔티티를 한번만 할당한다 (엔티티 개념을 알아야할듯)
4. assertThat
   - assertj라는 테스트 검증 라이브러리의 검증 메소드입니다.
   - 검증하고 싶은 대상을 메소드 인자로 받습니다.
   - 메소드 체이닝이 지원되어 isEqualTo와 같이 메소드를 이어서 사용할 수 있습니다.
5. isEqualTo
   - assertj의 동등 비교 메소드입니다.
   - assertthat에 있는 값과 isEqualTo의 갑슬 비교해서 같을 때만 성공입니다.
6. @RequestParam
   - 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션입니다.
   - 여기서는 외부에서 name이란 이름으로 넘긴 파라미터를 메소드 파라미터 name에 저장하게 됩니다.