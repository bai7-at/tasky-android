package com.nytimes.android.sectionfront.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import defpackage.hi6;
import defpackage.oe6;
import defpackage.pg6;

/* loaded from: classes4.dex */
public class HomepageGroupHeaderView extends RelativeLayout {
    TextView a;
    TextView b;
    private ImageView c;

    public HomepageGroupHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText("");
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText("");
            this.b.setVisibility(8);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(pg6.homepage_group_header_title);
        this.b = (TextView) findViewById(pg6.homepage_group_header_status);
        this.c = (ImageView) findViewById(pg6.homepage_group_header_title_icon);
    }

    public void setGroupStatus(CharSequence charSequence) {
        if (this.b == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.b.setText(charSequence);
        this.b.setVisibility(0);
    }

    public void setGroupTitle(CharSequence charSequence) {
        TextView textView = this.a;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.c == null || !"ELECTION 2016".equals(charSequence.toString())) {
                return;
            }
            this.c.setImageResource(oe6.election_logo);
            this.c.setVisibility(0);
        }
    }

    public HomepageGroupHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), hi6.homepage_group_header, this);
    }
}
