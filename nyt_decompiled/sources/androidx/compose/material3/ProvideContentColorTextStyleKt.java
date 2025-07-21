package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.text.j;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.nn0;
import defpackage.o76;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class ProvideContentColorTextStyleKt {
    public static final void a(final long j, final j jVar, final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(1479790536);
        if ((i & 6) == 0) {
            i2 = (h.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h.S(jVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= h.C(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 147) == 146 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1479790536, i2, -1, "androidx.compose.material3.ProvideContentColorTextStyle (ProvideContentColorTextStyle.kt:36)");
            }
            CompositionLocalKt.b(new o76[]{ContentColorKt.a().c(nn0.j(j)), TextKt.d().c(((j) h.m(TextKt.d())).N(jVar))}, gt2Var, h, (i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material3.ProvideContentColorTextStyleKt$ProvideContentColorTextStyle$1
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
                    ProvideContentColorTextStyleKt.a(j, jVar, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
