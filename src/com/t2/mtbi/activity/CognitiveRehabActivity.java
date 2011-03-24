package com.t2.mtbi.activity;

import android.content.Intent;
import android.os.Bundle;

import com.t2.mtbi.ActivityIntents;
import com.t2.mtbi.R;

public class CognitiveRehabActivity extends XMLItemsBrowserActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.setXMLResource(R.xml.cognitive_rehab);
		super.onCreate(savedInstanceState);
	}

	@Override
	protected int getHeaderLayoutResId() {
		return R.layout.list_item_1_separator;
	}

	@Override
	protected int getItemLayoutResId() {
		return R.layout.list_item_1_indent;
	}
}