package com.nytimes.xwords.hybrid.config;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.g;
import com.nytimes.xwords.hybrid.config.AbraVariantPreference;
import defpackage.ic6;
import defpackage.pi6;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class AbraVariantPreference extends EditTextPreference {
    public static final a w0 = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbraVariantPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        zq3.h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Y0(AbraVariantPreference abraVariantPreference, Preference preference, Object obj) {
        zq3.h(abraVariantPreference, "this$0");
        zq3.h(preference, "<anonymous parameter 0>");
        abraVariantPreference.C0(obj.toString());
        return true;
    }

    public /* synthetic */ AbraVariantPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? ic6.preferenceStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbraVariantPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        zq3.h(context, "context");
        u0("SPELLING_BEE_ABRA_VARIANT_KEY");
        F0("Spelling Bee Abra Variant Override");
        C0(g.b(j()).getString("SPELLING_BEE_ABRA_VARIANT_KEY", null));
        R0(pi6.abra_variant_preference_view);
        T0("Ok");
        S0("Cancel");
        x0(new Preference.c() { // from class: w0
            @Override // androidx.preference.Preference.c
            public final boolean a(Preference preference, Object obj) {
                boolean Y0;
                Y0 = AbraVariantPreference.Y0(AbraVariantPreference.this, preference, obj);
                return Y0;
            }
        });
    }
}
