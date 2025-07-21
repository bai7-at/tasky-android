package com.nytimes.android.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.h;
import defpackage.mx0;
import defpackage.qd6;
import defpackage.xk6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class LogoutPreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zq3.h(context, "context");
        zq3.h(attributeSet, "attrs");
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        zq3.h(hVar, "holder");
        super.S(hVar);
        View W = hVar.W(R.id.title);
        zq3.f(W, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) W).setTextColor(mx0.c(j(), qd6.ds_breaking));
        View view = hVar.a;
        view.setContentDescription(view.getContext().getString(xk6.settings_log_out_accessibility));
    }
}
