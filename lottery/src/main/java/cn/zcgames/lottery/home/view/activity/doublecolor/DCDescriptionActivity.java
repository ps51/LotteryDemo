package cn.zcgames.lottery.home.view.activity.doublecolor;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import cn.zcgames.lottery.R;
import cn.zcgames.lottery.base.UIHelper;
import cn.zcgames.lottery.base.BaseActivity;

/**
 * 双色球玩法说明
 * Berfy修改
 * 2018.8.23
 */
public class DCDescriptionActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        UIHelper.hideSystemTitleBar(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottery_double_color_description);
        initView();
    }

    private void initView() {
        TextView titleTv = (TextView) findViewById(R.id.title_tv);
        titleTv.setText(R.string.mine_pay_description);

        View backView = findViewById(R.id.title_back);
        backView.setOnClickListener(this);
        UIHelper.showWidget(backView, true);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_back:
                goBack(DCDescriptionActivity.this);
                break;
        }
    }
}
