package com.nytimes.android.preference;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.h;
import defpackage.en7;
import defpackage.fn7;
import defpackage.id9;
import defpackage.jk;
import defpackage.p16;
import defpackage.xk6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class ContactUsPreference extends ChromeCustomTabPreference {
    public id9 webActivityNavigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactUsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        en7 a;
        zq3.h(context, "context");
        zq3.h(attributeSet, "attrs");
        Activity a2 = p16.a(this, context);
        jk jkVar = a2 instanceof jk ? (jk) a2 : null;
        if (jkVar == null || (a = fn7.a(jkVar)) == null) {
            return;
        }
        a.u0(this);
    }

    @Override // com.nytimes.android.preference.ChromeCustomTabPreference
    public int N0() {
        return xk6.settings_chat_key;
    }

    @Override // com.nytimes.android.preference.ChromeCustomTabPreference
    public int O0() {
        return xk6.settings_contact_us;
    }

    @Override // com.nytimes.android.preference.ChromeCustomTabPreference
    public int P0() {
        return xk6.chat_with_us_url;
    }

    @Override // com.nytimes.android.preference.ChromeCustomTabPreference
    public id9 Q0() {
        id9 id9Var = this.webActivityNavigator;
        if (id9Var != null) {
            return id9Var;
        }
        zq3.z("webActivityNavigator");
        return null;
    }

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        zq3.h(hVar, "holder");
        super.S(hVar);
        hVar.a.setContentDescription(E());
    }
}
