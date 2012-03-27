package jp.co.rough_and_ready.brain;

import java.util.HashMap;

/**
 * 電気グルーヴと電撃ネットワークを頭の中でどうやって切り分けているか整理してみた。
 *
 *
 * @author seitaro
 *
 */
public class Denki_Dengeki_Docchi {

	//groupName に電気グルーヴか電撃ネットワークを入れてください。
	public static void main(String[] groupName) {
		String denki_dengeki = groupName[0].substring(0, 2);
		String volt = voltMap.get(denki_dengeki);
		String mood = moodMap.get(volt);
		String biribiri = biribiriMap.get(mood);
		String name = nameMap.get(biribiri);
		String attribute = groupNameMap.get(name);
		System.out.println(attribute);
	}

	private static HashMap<String,String> voltMap = null;
	private static HashMap<String,String> moodMap = null;
	private static HashMap<String,String> biribiriMap = null;
	private static HashMap<String,String> nameMap = null;
	private static HashMap<String,String> groupNameMap = null;

	static {
		voltMap = new HashMap<String,String>();
		voltMap.put("電撃", "100万ボルト");
		voltMap.put("電気", "100ボルト");
		voltMap.put("ビリビリするらしいです", "1000ボルト");
	}

	static {
		moodMap = new HashMap<String,String>();
		moodMap.put("100万ボルト", "やばい");
		moodMap.put("100ボルト", "普通");
		moodMap.put("1000ボルト", "亜種ぐらい");
	}

	static {
		biribiriMap = new HashMap<String,String>();
		biribiriMap.put("やばい", "頭焦げる");
		biribiriMap.put("普通", "家電製品");
		biribiriMap.put("亜種ぐらい", "雷電袋");
	}

	static {
		nameMap = new HashMap<String,String>();
		nameMap.put("頭焦げる","とらた");
		nameMap.put("エロイ","アラーキー");
		nameMap.put("家電製品","キーボード");
	}

	static {
		groupNameMap = new HashMap<String,String>();
		groupNameMap.put("とらた","dangerous!!!!!!");
		groupNameMap.put("キーボード","techno");
	}

}
