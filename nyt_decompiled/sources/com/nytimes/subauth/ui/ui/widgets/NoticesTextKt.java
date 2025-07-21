package com.nytimes.subauth.ui.ui.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import com.nytimes.subauth.ui.ui.custom.SubauthComposeUIKt;
import defpackage.cc7;
import defpackage.dj7;
import defpackage.gt2;
import defpackage.j98;
import defpackage.jj7;
import defpackage.k48;
import defpackage.lj7;
import defpackage.mm6;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class NoticesTextKt {
    public static final void a(final boolean z, Modifier modifier, final gt2 gt2Var, Composer composer, final int i, final int i2) {
        int i3;
        zq3.h(gt2Var, "onWebItem");
        Composer h = composer.h(1394645088);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.S(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (b.G()) {
                b.S(1394645088, i3, -1, "com.nytimes.subauth.ui.ui.widgets.NoticesText (NoticesText.kt:18)");
            }
            final String b = k48.b(mm6.subauth_email_first_screen_california_notices_accessibility, h, 0);
            j98 j98Var = j98.a;
            String str = (String) j98Var.d(h, 8).b().c();
            List list = (List) j98Var.d(h, 8).b().d();
            j j = j98Var.c(h, 8).j();
            h.z(-893742583);
            boolean S = h.S(b);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new ss2() { // from class: com.nytimes.subauth.ui.ui.widgets.NoticesTextKt$NoticesText$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(lj7 lj7Var) {
                        zq3.h(lj7Var, "$this$clearAndSetSemantics");
                        jj7.O(lj7Var, b);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        b((lj7) obj);
                        return ww8.a;
                    }
                };
                h.q(A);
            }
            h.R();
            SubauthComposeUIKt.f(dj7.a(modifier, (ss2) A), str, j, list, z, gt2Var, h, ((i3 << 12) & 57344) | ProgressEvent.PART_FAILED_EVENT_CODE | ((i3 << 9) & 458752), 0);
            if (b.G()) {
                b.R();
            }
        }
        final Modifier modifier2 = modifier;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: com.nytimes.subauth.ui.ui.widgets.NoticesTextKt$NoticesText$2
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
                    NoticesTextKt.a(z, modifier2, gt2Var, composer2, i | 1, i2);
                }
            });
        }
    }
}
