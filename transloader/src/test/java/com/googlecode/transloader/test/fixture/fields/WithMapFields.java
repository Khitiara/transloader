package com.googlecode.transloader.test.fixture.fields;

import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import com.googlecode.transloader.test.Triangulate;
import com.googlecode.transloader.test.fixture.serializable.WithFinalFields;
import com.googlecode.transloader.test.fixture.NonCommonJavaObject;

public class WithMapFields extends NonCommonJavaObject {
	private SortedMap map = new TreeMap();
	{
		map.put(Triangulate.anyInteger(), Triangulate.anyString());
		map.put(Triangulate.anyInteger(), new WithFinalFields(Triangulate.anyInteger()));
	}

	private Map unmodifiable = Collections.unmodifiableMap(map);
	private Map synchronizedMap = Collections.synchronizedSortedMap(map);
	private Map singleton = Collections.singletonMap(Triangulate.anyInteger(), Triangulate.anyString());
}
