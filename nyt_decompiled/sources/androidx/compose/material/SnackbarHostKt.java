package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentMediaFormat;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.ci;
import defpackage.gh;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.py1;
import defpackage.qs2;
import defpackage.tv7;
import defpackage.ww8;
import defpackage.x08;
import defpackage.z2;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class SnackbarHostKt {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[SnackbarDuration.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnackbarDuration.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnackbarDuration.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bd A[LOOP:2: B:55:0x01bb->B:56:0x01bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.tv7 r16, androidx.compose.ui.Modifier r17, final defpackage.it2 r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt.a(tv7, androidx.compose.ui.Modifier, it2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final SnackbarHostState snackbarHostState, Modifier modifier, it2 it2Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(431012348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (h.S(snackbarHostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.S(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= h.C(it2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i3 & 731) == 146 && h.i()) {
            h.K();
        } else {
            if (i4 != 0) {
                modifier = Modifier.a;
            }
            if (i5 != 0) {
                it2Var = ComposableSingletons$SnackbarHostKt.a.a();
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(431012348, i3, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:157)");
            }
            tv7 b = snackbarHostState.b();
            py1.d(b, new SnackbarHostKt$SnackbarHost$1(b, (z2) h.m(CompositionLocalsKt.c()), null), h, 64);
            a(snackbarHostState.b(), modifier, it2Var, h, i3 & ContentMediaFormat.PREVIEW_EPISODE, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        final Modifier modifier2 = modifier;
        final it2 it2Var2 = it2Var;
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i6) {
                    SnackbarHostKt.b(SnackbarHostState.this, modifier2, it2Var2, composer2, gt6.a(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x08 f(ci ciVar, boolean z, qs2 qs2Var, Composer composer, int i, int i2) {
        composer.z(1016418159);
        if ((i2 & 4) != 0) {
            qs2Var = new qs2() { // from class: androidx.compose.material.SnackbarHostKt$animatedOpacity$1
                /* renamed from: invoke, reason: collision with other method in class */
                public final void m40invoke() {
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m40invoke();
                    return ww8.a;
                }
            };
        }
        qs2 qs2Var2 = qs2Var;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1016418159, i, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:353)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = gh.b(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            composer.q(A);
        }
        composer.R();
        Animatable animatable = (Animatable) A;
        py1.d(Boolean.valueOf(z), new SnackbarHostKt$animatedOpacity$2(animatable, z, ciVar, qs2Var2, null), composer, ((i >> 3) & 14) | 64);
        x08 g = animatable.g();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x08 g(ci ciVar, boolean z, Composer composer, int i) {
        composer.z(2003504988);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(2003504988, i, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:366)");
        }
        composer.z(-492369756);
        Object A = composer.A();
        if (A == Composer.a.a()) {
            A = gh.b(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            composer.q(A);
        }
        composer.R();
        Animatable animatable = (Animatable) A;
        py1.d(Boolean.valueOf(z), new SnackbarHostKt$animatedScale$1(animatable, z, ciVar, null), composer, ((i >> 3) & 14) | 64);
        x08 g = animatable.g();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return g;
    }

    public static final long h(SnackbarDuration snackbarDuration, boolean z, z2 z2Var) {
        long j;
        int i = a.a[snackbarDuration.ordinal()];
        if (i == 1) {
            j = Long.MAX_VALUE;
        } else if (i == 2) {
            j = 10000;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            j = 4000;
        }
        long j2 = j;
        return z2Var == null ? j2 : z2Var.a(j2, true, true, z);
    }
}
