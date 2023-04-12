package com.zzg.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootTest
class LeetcodeApplicationTests {

	@Test
	void contextLoads() {
		HashMap<Object, Object> map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.entrySet().stream();
	}

}
