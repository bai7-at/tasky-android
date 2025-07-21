package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.di;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.kf8;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.nn0;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.x08;
import defpackage.xx1;

/* loaded from: classes.dex */
public final class TabRowDefaults {
    public static final TabRowDefaults a = new TabRowDefaults();
    private static final float b = bu1.g(1);
    private static final float c = bu1.g(2);
    private static final float d = bu1.g(52);
    public static final int e = 0;

    private TabRowDefaults() {
    }

    public final void a(Modifier modifier, float f, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long j2;
        final Modifier modifier3;
        final float f3;
        final long j3;
        int i4;
        int i5;
        Composer h = composer.h(910934799);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (h.S(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            if ((i2 & 2) == 0) {
                f2 = f;
                if (h.b(f2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                f2 = f;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            f2 = f;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (h.e(j2)) {
                    i4 = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
                    i3 |= i4;
                }
            } else {
                j2 = j;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            j2 = j;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= h.S(this) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((i3 & 5851) == 1170 && h.i()) {
            h.K();
            modifier3 = modifier2;
            f3 = f2;
            j3 = j2;
        } else {
            h.E();
            if ((i & 1) == 0 || h.N()) {
                modifier3 = i6 != 0 ? Modifier.a : modifier2;
                if ((i2 & 2) != 0) {
                    f3 = b;
                    i3 &= -113;
                } else {
                    f3 = f2;
                }
                if ((i2 & 4) != 0) {
                    j2 = nn0.r(((nn0) h.m(ContentColorKt.a())).B(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i3 &= -897;
                }
            } else {
                h.K();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                modifier3 = modifier2;
                f3 = f2;
            }
            long j4 = j2;
            int i7 = i3;
            j3 = j4;
            h.u();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(910934799, i7, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:371)");
            }
            DividerKt.a(modifier3, j3, f3, 0.0f, h, (i7 & 14) | ((i7 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | ((i7 << 3) & 896), 8);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.TabRowDefaults$Divider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i8) {
                    TabRowDefaults.this.a(modifier3, f3, j3, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.compose.ui.Modifier r17, float r18, long r19, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowDefaults.b(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public final float c() {
        return c;
    }

    public final float d() {
        return d;
    }

    public final Modifier e(Modifier modifier, final kf8 kf8Var) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2
            {
                super(3);
            }

            private static final float b(x08 x08Var) {
                return ((bu1) x08Var.getValue()).n();
            }

            private static final float c(x08 x08Var) {
                return ((bu1) x08Var.getValue()).n();
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(-398757863);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-398757863, i, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:412)");
                }
                x08 c2 = AnimateAsStateKt.c(kf8.this.c(), di.k(250, 0, xx1.c(), 2, null), null, null, composer, 0, 12);
                Modifier s = SizeKt.s(OffsetKt.c(SizeKt.y(SizeKt.h(modifier2, 0.0f, 1, null), Alignment.a.d(), false, 2, null), c(AnimateAsStateKt.c(kf8.this.a(), di.k(250, 0, xx1.c(), 2, null), null, null, composer, 0, 12)), 0.0f, 2, null), b(c2));
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return s;
            }
        });
    }
}
