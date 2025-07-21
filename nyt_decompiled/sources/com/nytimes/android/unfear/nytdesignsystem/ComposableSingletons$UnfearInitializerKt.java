package com.nytimes.android.unfear.nytdesignsystem;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.comscore.streaming.ContentType;
import com.nytimes.android.unfear.nytdesignsystem.composable.PageLayoutsKt;
import defpackage.j08;
import defpackage.kt2;
import defpackage.ww8;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public final class ComposableSingletons$UnfearInitializerKt {
    public static final ComposableSingletons$UnfearInitializerKt a = new ComposableSingletons$UnfearInitializerKt();
    public static kt2 b = zr0.c(-144143801, false, new kt2() { // from class: com.nytimes.android.unfear.nytdesignsystem.ComposableSingletons$UnfearInitializerKt$lambda-1$1
        public final void b(j08 j08Var, Modifier modifier, Composer composer, int i) {
            zq3.h(j08Var, "page");
            zq3.h(modifier, "modifier");
            if (b.G()) {
                b.S(-144143801, i, -1, "com.nytimes.android.unfear.nytdesignsystem.ComposableSingletons$UnfearInitializerKt.lambda-1.<anonymous> (UnfearInitializer.kt:12)");
            }
            PageLayoutsKt.a(j08Var, modifier, null, null, false, null, null, null, composer, (i & ContentType.LONG_FORM_ON_DEMAND) | 8, 252);
            if (b.G()) {
                b.R();
            }
        }

        @Override // defpackage.kt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            b((j08) obj, (Modifier) obj2, (Composer) obj3, ((Number) obj4).intValue());
            return ww8.a;
        }
    });

    public final kt2 a() {
        return b;
    }
}
