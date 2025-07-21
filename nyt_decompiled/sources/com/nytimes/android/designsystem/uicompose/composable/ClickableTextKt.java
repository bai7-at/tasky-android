package com.nytimes.android.designsystem.uicompose.composable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.m;
import androidx.compose.ui.text.font.o;
import androidx.compose.ui.text.j;
import com.comscore.streaming.ContentType;
import defpackage.ag4;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.gv1;
import defpackage.jo7;
import defpackage.jy7;
import defpackage.kl0;
import defpackage.l74;
import defpackage.li8;
import defpackage.m60;
import defpackage.ph8;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class ClickableTextKt {
    public static final void a(final List list, Modifier modifier, j jVar, Composer composer, final int i, final int i2) {
        zq3.h(list, "clickableTextData");
        Composer h = composer.h(-140124083);
        Modifier modifier2 = (i2 & 2) != 0 ? Modifier.a : modifier;
        j jVar2 = (i2 & 4) != 0 ? null : jVar;
        if (b.G()) {
            b.S(-140124083, i, -1, "com.nytimes.android.designsystem.uicompose.composable.TextWithClickableSection (ClickableText.kt:26)");
        }
        final a b = b(list, h, 8);
        androidx.compose.foundation.text.ClickableTextKt.a(b, modifier2, jVar2 == null ? j.d.a() : jVar2, false, 0, 0, null, new ss2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ClickableTextKt$TextWithClickableSection$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).intValue());
                return ww8.a;
            }

            public final void invoke(int i3) {
                a.b bVar;
                ss2 a;
                List<kl0> list2 = list;
                a aVar = b;
                for (kl0 kl0Var : list2) {
                    if (kl0Var.d() != null && (bVar = (a.b) i.m0(aVar.h(i3, i3))) != null && (a = kl0Var.a()) != null) {
                        a.invoke(bVar);
                    }
                }
            }
        }, h, i & ContentType.LONG_FORM_ON_DEMAND, 120);
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            final Modifier modifier3 = modifier2;
            final j jVar3 = jVar2;
            k.a(new gt2() { // from class: com.nytimes.android.designsystem.uicompose.composable.ClickableTextKt$TextWithClickableSection$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    ClickableTextKt.a(list, modifier3, jVar3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    private static final a b(List list, Composer composer, int i) {
        composer.z(987406220);
        if (b.G()) {
            b.S(987406220, i, -1, "com.nytimes.android.designsystem.uicompose.composable.createUnderlinedString (ClickableText.kt:49)");
        }
        a.C0064a c0064a = new a.C0064a(0, 1, null);
        composer.z(-2114690638);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            kl0 kl0Var = (kl0) it2.next();
            composer.z(-2114690600);
            if (kl0Var.d() != null) {
                String b = kl0Var.b();
                if (b == null) {
                    b = "Underlined annotation";
                }
                c0064a.l(b, kl0Var.d());
                int n = c0064a.n(new jy7(ag4.a.a(composer, ag4.b).j(), 0L, (o) null, (l) null, (m) null, (e) null, (String) null, 0L, (m60) null, (li8) null, (l74) null, 0L, ph8.b.d(), (jo7) null, (f) null, (gv1) null, 61438, (DefaultConstructorMarker) null));
                try {
                    c0064a.append(kl0Var.c());
                    c0064a.k(n);
                    c0064a.j();
                } catch (Throwable th) {
                    c0064a.k(n);
                    throw th;
                }
            } else {
                c0064a.append(kl0Var.c());
            }
            composer.R();
        }
        composer.R();
        a o = c0064a.o();
        if (b.G()) {
            b.R();
        }
        composer.R();
        return o;
    }
}
