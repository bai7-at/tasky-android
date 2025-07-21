package com.nytimes.android.sectionfront.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import defpackage.ee6;
import defpackage.hi6;
import defpackage.k57;
import defpackage.nz4;
import defpackage.qn6;

/* loaded from: classes4.dex */
public class DefaultArticleSummary extends a {
    private LayoutInflater c;
    private TextView d;
    private Integer e;
    private int f;
    private boolean g;

    public DefaultArticleSummary(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void j(nz4 nz4Var) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TextView) {
                nz4Var.call((TextView) childAt);
            }
        }
    }

    private TextView k(CharSequence charSequence, boolean z) {
        TextView l = z ? this.d : l();
        Integer num = this.e;
        if (num != null) {
            l.setMaxWidth(num.intValue());
        }
        l.setText(charSequence);
        l.setPaintFlags(l.getPaintFlags() | 128);
        return l;
    }

    private TextView l() {
        return (TextView) this.c.inflate(this.g ? hi6.sf_article_summary_lede_text : hi6.sf_article_summary_text, (ViewGroup) this, false);
    }

    private boolean m(int i, int i2) {
        return i + 1 < i2;
    }

    private void o() {
        this.f = getResources().getDimensionPixelSize(ee6.section_front_summary_bullet_spacing);
    }

    private void setCustomAttrs(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        if (attributeSet == null || (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, qn6.DefaultArticleSummary)) == null) {
            return;
        }
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == qn6.DefaultArticleSummary_isLede) {
                this.g = obtainStyledAttributes.getBoolean(index, false);
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.a1
    public void a() {
        setVisibility(8);
    }

    @Override // defpackage.a1
    public void b() {
        removeAllViews();
    }

    @Override // defpackage.a1
    public void c() {
        setVisibility(0);
    }

    @Override // defpackage.a1
    public boolean d() {
        return getVisibility() == 0;
    }

    public void i(CharSequence charSequence, boolean z, boolean z2) {
        TextView k = k(charSequence, z2);
        if (z) {
            k.setPadding(0, 0, 0, this.f);
        }
        addView(k);
    }

    @Override // defpackage.a1
    public void setData(k57 k57Var) {
        ImmutableList immutableList = (ImmutableList) k57Var.e().c();
        int size = immutableList.size();
        boolean z = true;
        int i = 0;
        while (i < size) {
            i((CharSequence) immutableList.get(i), m(i, size), z);
            i++;
            z = false;
        }
    }

    @Override // defpackage.a1
    public void setMaxWidth(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.a1
    public void setTextColor(final int i) {
        j(new nz4() { // from class: gg1
            @Override // defpackage.nz4
            public final void call(Object obj) {
                ((TextView) obj).setTextColor(i);
            }
        });
    }

    public DefaultArticleSummary(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = LayoutInflater.from(getContext());
        this.d = l();
        setOrientation(1);
        setCustomAttrs(attributeSet);
        o();
    }
}
