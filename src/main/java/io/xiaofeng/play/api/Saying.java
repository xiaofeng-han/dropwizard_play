package io.xiaofeng.play.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
@AllArgsConstructor
@NoArgsConstructor
public class Saying {
    @Getter
    @JsonProperty
    private long id;

    @Length(max = 3)
    @Getter
    @JsonProperty
    private String content;
}
