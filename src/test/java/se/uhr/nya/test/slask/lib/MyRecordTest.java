package se.uhr.nya.test.slask.lib;

import org.junit.jupiter.api.Test;

import jakarta.json.bind.JsonbBuilder;

public class MyRecordTest {

	@Test
	void recordTest() throws Exception {
		try (var jsonb = JsonbBuilder.create()) {
			MyRecord myRecord = new MyRecord("value");
			String json = jsonb.toJson(myRecord);

			var my = jsonb.fromJson(json, MyRecord.class);
		}
	}

}
