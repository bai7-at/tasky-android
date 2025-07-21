package com.nytimes.subauth.ui.purr;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.nytimes.subauth.ui.purr.privacysettings.PrivacySettingsActivity;
import com.nytimes.subauth.ui.purr.ui.screens.TCFScreensKt;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.s96;
import defpackage.ss2;
import defpackage.u96;
import defpackage.ww8;
import defpackage.zq3;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class PurrUIManager implements s96 {
    private final u96 a;
    private final Flow b;
    private final Flow c;

    public PurrUIManager(u96 u96Var, Flow flow, Flow flow2) {
        zq3.h(u96Var, "purrUIConfig");
        zq3.h(flow, "purrErrorFlow");
        zq3.h(flow2, "purrTCFAnalyticEventFlow");
        this.a = u96Var;
        this.b = flow;
        this.c = flow2;
    }

    @Override // defpackage.s96
    public Intent a(Context context) {
        zq3.h(context, "context");
        return new Intent(context, (Class<?>) PrivacySettingsActivity.class);
    }

    @Override // defpackage.s96
    public Flow b() {
        return this.b;
    }

    @Override // defpackage.s96
    public Flow c() {
        return this.c;
    }

    @Override // defpackage.s96
    public void d(final Modifier modifier, final ss2 ss2Var, Composer composer, final int i) {
        zq3.h(modifier, "modifier");
        zq3.h(ss2Var, "onTCFVisibilityUpdate");
        Composer h = composer.h(47756000);
        if (b.G()) {
            b.S(47756000, i, -1, "com.nytimes.subauth.ui.purr.PurrUIManager.tcfBlockerCard (PurrUIManager.kt:28)");
        }
        TCFScreensKt.f(modifier, this.a, ss2Var, null, h, (i & 14) | ((i << 3) & 896), 8);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.purr.PurrUIManager$tcfBlockerCard$1
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
                    PurrUIManager.this.d(modifier, ss2Var, composer2, i | 1);
                }
            });
        }
    }
}
