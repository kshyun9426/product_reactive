package tacos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	/*
	 * Controller에 모델 데이터나 사용자 입력을 처리하지 않는 간단한 컨트롤러를 뷰 컨트롤러라고 부르며
	 * 아래 와 같이 뷰 컨트롤러를 WebMvcConfigurer를 통해 설정 가능하다.
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
	
}
