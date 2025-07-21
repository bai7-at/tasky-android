package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ra8;
import defpackage.rg4;
import defpackage.sg4;
import defpackage.ww8;
import defpackage.zr0;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public abstract class BoxWithConstraintsKt {
    public static final void a(Modifier modifier, Alignment alignment, boolean z, final it2 it2Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(1781813501);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(alignment) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.a(z) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.C(it2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (i5 != 0) {
                alignment = Alignment.a.o();
            }
            if (i6 != 0) {
                z = false;
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1781813501, i3, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:64)");
            }
            final rg4 g = BoxKt.g(alignment, z, h, (i3 >> 3) & WebSocketProtocol.PAYLOAD_SHORT);
            h.z(-1765292870);
            boolean C = h.C(it2Var) | h.S(g);
            Object A = h.A();
            if (C || A == Composer.a.a()) {
                A = new gt2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final sg4 b(ra8 ra8Var, long j) {
                        final c cVar = new c(ra8Var, j, null);
                        ww8 ww8Var = ww8.a;
                        final it2 it2Var2 = it2Var;
                        return rg4.this.d(ra8Var, ra8Var.H0(ww8Var, zr0.c(-1945019079, true, new gt2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$1$1$measurables$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                                invoke((Composer) obj, ((Number) obj2).intValue());
                                return ww8.a;
                            }

                            public final void invoke(Composer composer2, int i7) {
                                if ((i7 & 11) == 2 && composer2.i()) {
                                    composer2.K();
                                    return;
                                }
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.S(-1945019079, i7, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:68)");
                                }
                                it2.this.invoke(cVar, composer2, 0);
                                if (androidx.compose.runtime.b.G()) {
                                    androidx.compose.runtime.b.R();
                                }
                            }
                        })), j);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return b((ra8) obj, ((fv0) obj2).t());
                    }
                };
                h.q(A);
            }
            h.R();
            SubcomposeLayoutKt.a(modifier, (gt2) A, h, i3 & 14, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        final Modifier modifier2 = modifier;
        final Alignment alignment2 = alignment;
        final boolean z2 = z;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.foundation.layout.BoxWithConstraintsKt$BoxWithConstraints$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i7) {
                    BoxWithConstraintsKt.a(Modifier.this, alignment2, z2, it2Var, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }
}
