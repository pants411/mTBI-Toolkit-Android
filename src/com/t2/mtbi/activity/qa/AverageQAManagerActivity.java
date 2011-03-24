package com.t2.mtbi.activity.qa;


public class AverageQAManagerActivity extends SimpleQAManagerActivity {
	@Override
	protected double getTotalScore() {
		int total = 0;
		for(Answer[] ans: this.selectdAnswers.values()) {
			for(int i = 0; i < ans.length; ++i) {
				total += ans[i].value;
			}
		}
		return (int)(total / this.selectdAnswers.size());
	}
}