package com.nytimes.android.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.h;
import defpackage.xk6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class LoginInOrRegisterPreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginInOrRegisterPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zq3.h(context, "context");
        zq3.h(attributeSet, "attrs");
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        zq3.h(hVar, "holder");
        super.S(hVar);
        View view = hVar.a;
        view.setContentDescription(view.getContext().getString(xk6.settings_log_in_or_register_accessibility));
    }
}
