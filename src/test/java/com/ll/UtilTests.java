package com.ll;

import org.junit.jupiter.api.Test;

import java.util.Map;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class UtilTests {
    @Test
    void t1() {
        Map<String, Object> map = Util.json.jsonToMapFromFile("testData/1.json");
        Map<String, Object> expected = Map.of(
                "id", 1,
                "content", "홍길동",
                "author", "홍길동"
        );

        assertThat(map).isEqualTo(expected);
    }
}
