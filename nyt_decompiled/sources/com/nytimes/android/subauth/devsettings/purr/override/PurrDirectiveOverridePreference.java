package com.nytimes.android.subauth.devsettings.purr.override;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import androidx.preference.g;
import com.nytimes.android.subauth.core.purr.a;
import com.nytimes.android.subauth.core.purr.directive.AcceptableTracker;
import com.nytimes.android.subauth.core.purr.directive.AdConfiguration;
import com.nytimes.android.subauth.core.purr.directive.DataProcessingPreferenceDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.DataSaleOptOutDirectiveValueV2;
import com.nytimes.android.subauth.core.purr.directive.EmailMarketingOptInDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.FirstPartyDirectiveValue;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;
import com.nytimes.android.subauth.core.purr.directive.ToggleableDirectiveValue;
import com.nytimes.android.subauth.devsettings.purr.override.PurrDirectiveOverridePreference;
import defpackage.ic6;
import defpackage.sn6;
import defpackage.zq3;
import java.util.ArrayList;
import kotlin.collections.d;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PurrDirectiveOverridePreference extends ListPreference {
    private final SharedPreferences A0;
    private final SharedPreferences.OnSharedPreferenceChangeListener B0;
    public a purrManager;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurrDirectiveOverridePreference(Context context) {
        this(context, null, 0, 0, 14, null);
        zq3.h(context, "context");
    }

    private final String[] e1(TypedArray typedArray) {
        Enum[] values;
        int i = typedArray.getInt(sn6.PurrDirectiveOverridePreference_purrDirective, -1);
        String[] strArr = {PurrDirectiveOverrider.NO_OVERRIDE};
        switch (i) {
            case 1:
                values = AcceptableTracker.values();
                break;
            case 2:
                values = AdConfiguration.values();
                break;
            case 3:
                values = AdConfiguration.values();
                break;
            case 4:
            default:
                throw new IllegalArgumentException("Unknown enum value supplied to preference");
            case 5:
                values = DataSaleOptOutDirectiveValueV2.values();
                break;
            case 6:
                values = DataProcessingPreferenceDirectiveValue.values();
                break;
            case 7:
                values = ToggleableDirectiveValue.values();
                break;
            case 8:
                values = ToggleableDirectiveValue.values();
                break;
            case 9:
                values = EmailMarketingOptInDirectiveValue.values();
                break;
            case 10:
                values = ToggleableDirectiveValue.values();
                break;
            case 11:
                values = ToggleableDirectiveValue.values();
                break;
            case 12:
                values = ToggleableDirectiveValue.values();
                break;
            case 13:
                values = FirstPartyDirectiveValue.values();
                break;
        }
        ArrayList arrayList = new ArrayList(values.length);
        for (Enum r0 : values) {
            arrayList.add(r0.name());
        }
        return (String[]) d.C(strArr, arrayList.toArray(new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f1(PurrDirectiveOverridePreference purrDirectiveOverridePreference, SharedPreferences sharedPreferences, String str) {
        zq3.h(purrDirectiveOverridePreference, "this$0");
        purrDirectiveOverridePreference.C0(purrDirectiveOverridePreference.A0.getString(purrDirectiveOverridePreference.q(), PurrDirectiveOverrider.NO_OVERRIDE));
    }

    @Override // androidx.preference.Preference
    public void P() {
        super.P();
        this.A0.registerOnSharedPreferenceChangeListener(this.B0);
    }

    @Override // androidx.preference.Preference
    public void V() {
        super.V();
        this.A0.unregisterOnSharedPreferenceChangeListener(this.B0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurrDirectiveOverridePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        zq3.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PurrDirectiveOverridePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        zq3.h(context, "context");
    }

    public /* synthetic */ PurrDirectiveOverridePreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? ic6.preferenceStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurrDirectiveOverridePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        zq3.h(context, "context");
        SharedPreferences b = g.b(context);
        this.A0 = b;
        this.B0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: v86
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                PurrDirectiveOverridePreference.f1(PurrDirectiveOverridePreference.this, sharedPreferences, str);
            }
        };
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, sn6.PurrDirectiveOverridePreference, 0, 0);
        try {
            u0(obtainStyledAttributes.getString(sn6.PurrDirectiveOverridePreference_purrKey));
            F0(obtainStyledAttributes.getString(sn6.PurrDirectiveOverridePreference_purrLabel));
            C0(b.getString(q(), PurrDirectiveOverrider.NO_OVERRIDE));
            zq3.e(obtainStyledAttributes);
            String[] e1 = e1(obtainStyledAttributes);
            a1(e1);
            b1(e1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
