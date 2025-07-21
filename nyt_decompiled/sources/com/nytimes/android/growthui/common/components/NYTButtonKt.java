package com.nytimes.android.growthui.common.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.a;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.c74;
import defpackage.cc7;
import defpackage.eb0;
import defpackage.fb0;
import defpackage.gt2;
import defpackage.it2;
import defpackage.m37;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.zq3;
import defpackage.zr0;

/* loaded from: classes4.dex */
public abstract class NYTButtonKt {
    public static final void a(Modifier modifier, final qs2 qs2Var, final String str, final boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long a;
        long b;
        Composer composer2;
        final Modifier modifier3;
        zq3.h(qs2Var, "onClick");
        zq3.h(str, "text");
        Composer h = composer.h(1263991713);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(qs2Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(str) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.a(z) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        int i5 = i3;
        if ((i5 & 5851) == 1170 && h.i()) {
            h.K();
            modifier3 = modifier2;
            composer2 = h;
        } else {
            Modifier h2 = i4 != 0 ? SizeKt.h(SizeKt.b(Modifier.a, 0.0f, bu1.g(44), 1, null), 0.0f, 1, null) : modifier2;
            if (b.G()) {
                b.S(1263991713, i5, -1, "com.nytimes.android.growthui.common.components.NYTButton (NYTButton.kt:23)");
            }
            if (z) {
                h.z(-2132740292);
                a = c74.a.a(h, 6).d().a();
            } else {
                h.z(-2132738756);
                a = c74.a.a(h, 6).a();
            }
            h.R();
            long j = a;
            h.z(-2132737517);
            eb0 a2 = z ? null : fb0.a(bu1.g(1), c74.a.a(h, 6).b());
            h.R();
            if (z) {
                h.z(-2132731847);
                b = c74.a.a(h, 6).d().c();
            } else {
                h.z(-2132730407);
                b = c74.a.a(h, 6).b();
            }
            h.R();
            final long j2 = b;
            ym5 a3 = PaddingKt.a(bu1.g(15));
            a aVar = a.a;
            int i6 = a.l;
            float f = 0;
            composer2 = h;
            ButtonKt.a(qs2Var, h2, false, null, aVar.b(bu1.g(f), bu1.g(f), bu1.g(f), 0.0f, 0.0f, h, (i6 << 15) | 438, 24), null, a2, aVar.a(j, 0L, 0L, 0L, h, i6 << 12, 14), a3, zr0.b(h, -351812719, true, new it2() { // from class: com.nytimes.android.growthui.common.components.NYTButtonKt$NYTButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // defpackage.it2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((m37) obj, (Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(m37 m37Var, Composer composer3, int i7) {
                    zq3.h(m37Var, "$this$Button");
                    if ((i7 & 81) == 16 && composer3.i()) {
                        composer3.K();
                        return;
                    }
                    if (b.G()) {
                        b.S(-351812719, i7, -1, "com.nytimes.android.growthui.common.components.NYTButton.<anonymous> (NYTButton.kt:45)");
                    }
                    TextKt.e(str, null, j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c74.a.b(composer3, 6).j(), composer3, 0, 0, 32762);
                    if (b.G()) {
                        b.R();
                    }
                }
            }), h, ((i5 >> 3) & 14) | 905969664 | ((i5 << 3) & ContentType.LONG_FORM_ON_DEMAND), 44);
            if (b.G()) {
                b.R();
            }
            modifier3 = h2;
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.android.growthui.common.components.NYTButtonKt$NYTButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i7) {
                    NYTButtonKt.a(Modifier.this, qs2Var, str, z, composer3, i | 1, i2);
                }
            });
        }
    }
}
