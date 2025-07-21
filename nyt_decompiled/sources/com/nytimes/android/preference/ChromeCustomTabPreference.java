package com.nytimes.android.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.nytimes.android.preference.ChromeCustomTabPreference;
import defpackage.id9;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class ChromeCustomTabPreference extends Preference {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChromeCustomTabPreference(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        zq3.h(context, "context");
        zq3.h(attributeSet, "attrs");
        u0(context.getString(N0()));
        F0(context.getString(O0()));
        y0(new Preference.d() { // from class: nk0
            @Override // androidx.preference.Preference.d
            public final boolean a(Preference preference) {
                boolean M0;
                M0 = ChromeCustomTabPreference.M0(context, this, preference);
                return M0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean M0(Context context, ChromeCustomTabPreference chromeCustomTabPreference, Preference preference) {
        zq3.h(context, "$context");
        zq3.h(chromeCustomTabPreference, "this$0");
        zq3.h(preference, "it");
        String string = context.getString(chromeCustomTabPreference.P0());
        zq3.g(string, "getString(...)");
        chromeCustomTabPreference.Q0().c(context, string);
        return true;
    }

    public abstract int N0();

    public abstract int O0();

    public abstract int P0();

    public abstract id9 Q0();
}
