package com.nytimes.android.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.y;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t;
import com.nytimes.android.features.giftsharehub.GiftShareHubViewModel;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.h03;
import defpackage.ic6;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class GiftShareHubPreference extends ComposablePreference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftShareHubPreference(Context context) {
        this(context, null, 0, 0, 14, null);
        zq3.h(context, "context");
    }

    @Override // com.nytimes.android.preference.ComposablePreference
    public void L0(Composer composer, final int i) {
        Composer h = composer.h(-1176131265);
        if ((i & 1) == 0 && h.i()) {
            h.K();
        } else {
            if (b.G()) {
                b.S(-1176131265, i, -1, "com.nytimes.android.preference.GiftShareHubPreference.Content (GiftShareHubPreference.kt:17)");
            }
            GiftShareHubPreferenceLayoutKt.b(i.P0(((h03) y.b(((GiftShareHubViewModel) new t((Fragment) h.m(ComposablePreferenceKt.a())).a(GiftShareHubViewModel.class)).getState(), null, h, 8, 1).getValue()).a(), 3), h, 8);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.preference.GiftShareHubPreference$Content$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    GiftShareHubPreference.this.L0(composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftShareHubPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        zq3.h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftShareHubPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        zq3.h(context, "context");
    }

    public /* synthetic */ GiftShareHubPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? ic6.preferenceStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftShareHubPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        zq3.h(context, "context");
    }
}
