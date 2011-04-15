package org.t2health.mtbi.activity;

import android.os.Bundle;


import org.t2health.mtbi.R;

public class EducationActivity extends XMLItemsBrowserActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.setXMLResource(R.xml.education);
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