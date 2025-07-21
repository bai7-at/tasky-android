package com.nytimes.android.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.h;
import defpackage.gd6;
import defpackage.lf6;
import defpackage.m07;
import defpackage.mx0;
import defpackage.sd6;
import defpackage.xk6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class UsernamePreference extends Preference {
    private final int p0;
    private final int q0;
    private final int r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernamePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zq3.h(context, "context");
        zq3.h(attributeSet, "attrs");
        this.p0 = mx0.c(context, gd6.content_primary);
        this.q0 = mx0.c(context, gd6.content_quaternary);
        this.r0 = context.getResources().getDimensionPixelSize(sd6.settings_summary_textsize);
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        zq3.h(hVar, "holder");
        super.S(hVar);
        View W = hVar.W(R.id.title);
        zq3.f(W, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) W;
        View W2 = hVar.W(R.id.summary);
        zq3.f(W2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) W2;
        textView.setTextColor(this.p0);
        textView.setTypeface(m07.g(j(), lf6.font_franklin_bold));
        textView2.setTextColor(this.q0);
        textView2.setTextSize(0, this.r0);
        View view = hVar.a;
        view.setContentDescription(view.getContext().getString(xk6.settings_username_register_accessibility));
    }
}
