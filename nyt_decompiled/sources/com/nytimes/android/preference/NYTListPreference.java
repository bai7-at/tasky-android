package com.nytimes.android.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import androidx.preference.h;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class NYTListPreference extends ListPreference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NYTListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zq3.h(context, "context");
        zq3.h(attributeSet, "attrs");
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        zq3.h(hVar, "holder");
        super.S(hVar);
        hVar.a.setContentDescription(E());
    }
}
