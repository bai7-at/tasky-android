package com.nytimes.android.features.settings;

import android.R;
import android.content.Context;
import android.text.util.Linkify;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PreferenceLongSummary extends Preference {
    private Integer p0;
    private final int q0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceLongSummary(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        zq3.h(context, "context");
    }

    public final void L0(Integer num) {
        this.p0 = num;
    }

    @Override // androidx.preference.Preference
    public void S(androidx.preference.h hVar) {
        zq3.h(hVar, "holder");
        super.S(hVar);
        View W = hVar.W(R.id.summary);
        zq3.f(W, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) W;
        textView.setMaxLines(this.q0);
        Integer num = this.p0;
        if (num != null) {
            Linkify.addLinks(textView, num.intValue());
        }
    }

    public /* synthetic */ PreferenceLongSummary(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceLongSummary(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zq3.h(context, "context");
        this.q0 = 100;
    }
}
