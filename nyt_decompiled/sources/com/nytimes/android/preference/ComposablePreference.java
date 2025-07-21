package com.nytimes.android.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b;
import androidx.preference.Preference;
import androidx.preference.h;
import com.nytimes.android.utils.composeutils.ComposeViewWithFragment;
import defpackage.gt2;
import defpackage.ic6;
import defpackage.ii6;
import defpackage.o76;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class ComposablePreference extends Preference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComposablePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        zq3.h(context, "context");
    }

    public abstract void L0(Composer composer, int i);

    @Override // androidx.preference.Preference
    public void S(h hVar) {
        zq3.h(hVar, "holder");
        super.S(hVar);
        View view = hVar.a;
        zq3.f(view, "null cannot be cast to non-null type com.nytimes.android.utils.composeutils.ComposeViewWithFragment");
        final ComposeViewWithFragment composeViewWithFragment = (ComposeViewWithFragment) view;
        composeViewWithFragment.setContent(zr0.c(764117183, true, new gt2() { // from class: com.nytimes.android.preference.ComposablePreference$onBindViewHolder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return ww8.a;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) == 2 && composer.i()) {
                    composer.K();
                    return;
                }
                if (b.G()) {
                    b.S(764117183, i, -1, "com.nytimes.android.preference.ComposablePreference.onBindViewHolder.<anonymous> (ComposablePreference.kt:31)");
                }
                o76 c = ComposablePreferenceKt.a().c(ComposeViewWithFragment.this.getFragment());
                final ComposablePreference composablePreference = this;
                CompositionLocalKt.a(c, zr0.b(composer, -672213633, true, new gt2() { // from class: com.nytimes.android.preference.ComposablePreference$onBindViewHolder$1.1
                    {
                        super(2);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return ww8.a;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 11) == 2 && composer2.i()) {
                            composer2.K();
                            return;
                        }
                        if (b.G()) {
                            b.S(-672213633, i2, -1, "com.nytimes.android.preference.ComposablePreference.onBindViewHolder.<anonymous>.<anonymous> (ComposablePreference.kt:34)");
                        }
                        ComposablePreference.this.L0(composer2, 0);
                        if (b.G()) {
                            b.R();
                        }
                    }
                }), composer, 56);
                if (b.G()) {
                    b.R();
                }
            }
        }));
    }

    public /* synthetic */ ComposablePreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? ic6.preferenceStyle : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposablePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        zq3.h(context, "context");
        v0(ii6.layout_compose);
        A0(false);
    }
}
