package com.nytimes.xwords.hybrid;

import androidx.compose.material.ColorsKt;
import androidx.compose.material.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.font.g;
import androidx.compose.ui.text.font.l;
import androidx.compose.ui.text.font.o;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.mm2;
import defpackage.nf6;
import defpackage.nn0;
import defpackage.ro0;
import defpackage.wn0;
import defpackage.ww8;
import defpackage.zq3;

/* loaded from: classes4.dex */
public abstract class ThemeKt {
    private static final ro0 a = ColorsKt.d(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4095, null);
    private static final ro0 b;
    private static final e c;

    static {
        ro0 g;
        nn0.a aVar = nn0.b;
        g = ColorsKt.g((r43 & 1) != 0 ? wn0.d(4284612846L) : aVar.a(), (r43 & 2) != 0 ? wn0.d(4281794739L) : 0L, (r43 & 4) != 0 ? wn0.d(4278442694L) : 0L, (r43 & 8) != 0 ? wn0.d(4278290310L) : 0L, (r43 & 16) != 0 ? nn0.b.h() : 0L, (r43 & 32) != 0 ? nn0.b.h() : aVar.h(), (r43 & 64) != 0 ? wn0.d(4289724448L) : 0L, (r43 & 128) != 0 ? nn0.b.h() : aVar.h(), (r43 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? nn0.b.a() : 0L, (r43 & 512) != 0 ? nn0.b.a() : 0L, (r43 & 1024) != 0 ? nn0.b.a() : aVar.a(), (r43 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? nn0.b.h() : 0L);
        b = g;
        int i = nf6.franklin_medium_500;
        o.a aVar2 = o.b;
        o e = aVar2.e();
        l.a aVar3 = l.b;
        c = mm2.b(g.b(i, e, aVar3.b(), 0, 8, null), g.b(nf6.franklin_medium_700, aVar2.a(), aVar3.b(), 0, 8, null));
    }

    public static final void a(final boolean z, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(gt2Var, "content");
        Composer h = composer.h(-497197436);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(gt2Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                z = false;
            }
            if (b.G()) {
                b.S(-497197436, i3, -1, "com.nytimes.xwords.hybrid.AppTheme (Theme.kt:21)");
            }
            MaterialThemeKt.a(z ? a : b, null, null, gt2Var, h, (i3 << 6) & 7168, 6);
            if (b.G()) {
                b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.xwords.hybrid.ThemeKt$AppTheme$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i5) {
                    ThemeKt.a(z, gt2Var, composer2, i | 1, i2);
                }
            });
        }
    }

    public static final e b() {
        return c;
    }
}
