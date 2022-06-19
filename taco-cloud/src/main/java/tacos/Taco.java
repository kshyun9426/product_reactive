package tacos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
	
	// id는 객체를 데이터베이스에 저장하고자 할 때는 해당 객체를 고유하게 식별해 주는 필드를 추가하는것이 좋다
	private Long id;
	// 객체가 언제 생성되었는지를 알면 유용하다.
	private Date createdAt;
	
	@NotNull
	@Size(min=5, message="Name must be at least 5 characters long")
	private String name;
	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<String> ingredients;
}
