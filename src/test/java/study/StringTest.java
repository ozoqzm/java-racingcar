package study;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    void split() {
        String given = "1,2";
        String[] result = given.split(",");

        assertThat(result).contains("1");
        assertThat(result).containsExactly("1", "2");
    }

    @DisplayName("특정 위치 문자 가져오기 test")
    @Test
    void charAtRange() {
        String given = "abc";
        assertThatThrownBy(() -> {
            char result = given.charAt(3);  // 인덱스 3은 범위를 벗어남
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }
}
