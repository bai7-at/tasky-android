package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.y;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.ac0;
import defpackage.ag4;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.d37;
import defpackage.dg4;
import defpackage.eo3;
import defpackage.eu8;
import defpackage.fd5;
import defpackage.fm1;
import defpackage.fv1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hd5;
import defpackage.hd8;
import defpackage.l27;
import defpackage.nn0;
import defpackage.py1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.v48;
import defpackage.vm3;
import defpackage.vt7;
import defpackage.wm3;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zy1;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class SwitchKt {
    private static final float a;
    private static final float b;
    private static final float c;
    private static final float d;
    private static final float e;
    private static final float f;
    private static final float g;
    private static final float h;
    private static final eu8 i;
    private static final float j;
    private static final float k;
    private static final float l;

    static {
        float g2 = bu1.g(34);
        a = g2;
        b = bu1.g(14);
        float g3 = bu1.g(20);
        c = g3;
        d = bu1.g(24);
        e = bu1.g(2);
        f = g2;
        g = g3;
        h = bu1.g(g2 - g3);
        i = new eu8(100, 0, null, 6, null);
        j = bu1.g(1);
        k = bu1.g(6);
        l = bu1.g(125);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r46, final defpackage.ss2 r47, androidx.compose.ui.Modifier r48, boolean r49, defpackage.dy4 r50, defpackage.hd8 r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.a(boolean, ss2, androidx.compose.ui.Modifier, boolean, dy4, hd8, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(sy4 sy4Var) {
        return ((Boolean) sy4Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(sy4 sy4Var, boolean z) {
        sy4Var.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ss2 d(x08 x08Var) {
        return (ss2) x08Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(x08 x08Var) {
        return ((Boolean) x08Var.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final ac0 ac0Var, final boolean z, final boolean z2, final hd8 hd8Var, final qs2 qs2Var, final eo3 eo3Var, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer h2 = composer.h(70908914);
        if ((i2 & 14) == 0) {
            i3 = (h2.S(ac0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h2.a(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= h2.a(z2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= h2.S(hd8Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= h2.C(qs2Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= h2.S(eo3Var) ? 131072 : 65536;
        }
        if ((374491 & i3) == 74898 && h2.i()) {
            h2.K();
            composer2 = h2;
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(70908914, i3, -1, "androidx.compose.material.SwitchImpl (Switch.kt:219)");
            }
            h2.z(-492369756);
            Object A = h2.A();
            Composer.a aVar = Composer.a;
            if (A == aVar.a()) {
                A = y.f();
                h2.q(A);
            }
            h2.R();
            SnapshotStateList snapshotStateList = (SnapshotStateList) A;
            h2.z(-1650291661);
            boolean S = h2.S(eo3Var) | h2.S(snapshotStateList);
            Object A2 = h2.A();
            if (S || A2 == aVar.a()) {
                A2 = new SwitchKt$SwitchImpl$1$1(eo3Var, snapshotStateList, null);
                h2.q(A2);
            }
            h2.R();
            py1.d(eo3Var, (gt2) A2, h2, ((i3 >> 15) & 14) | 64);
            float f2 = !snapshotStateList.isEmpty() ? k : j;
            int i4 = ((i3 >> 6) & 14) | (i3 & ContentType.LONG_FORM_ON_DEMAND) | ((i3 >> 3) & 896);
            final x08 b2 = hd8Var.b(z2, z, h2, i4);
            Modifier.a aVar2 = Modifier.a;
            Alignment.a aVar3 = Alignment.a;
            Modifier f3 = SizeKt.f(ac0Var.c(aVar2, aVar3.e()), 0.0f, 1, null);
            h2.z(-1650290721);
            boolean S2 = h2.S(b2);
            Object A3 = h2.A();
            if (S2 || A3 == aVar.a()) {
                A3 = new ss2() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((fv1) obj);
                        return ww8.a;
                    }

                    public final void invoke(fv1 fv1Var) {
                        long g2;
                        g2 = SwitchKt.g(x08.this);
                        SwitchKt.r(fv1Var, g2, fv1Var.f1(SwitchKt.t()), fv1Var.f1(SwitchKt.s()));
                    }
                };
                h2.q(A3);
            }
            h2.R();
            CanvasKt.a(f3, (ss2) A3, h2, 0);
            x08 a2 = hd8Var.a(z2, z, h2, i4);
            zy1 zy1Var = (zy1) h2.m(ElevationOverlayKt.d());
            float g2 = bu1.g(((bu1) h2.m(ElevationOverlayKt.c())).n() + f2);
            h2.z(-539243554);
            long h3 = (!nn0.t(h(a2), ag4.a.a(h2, 6).n()) || zy1Var == null) ? h(a2) : zy1Var.a(h(a2), g2, h2, 0);
            h2.R();
            composer2 = h2;
            x08 a3 = vt7.a(h3, null, null, null, h2, 0, 14);
            Modifier c2 = ac0Var.c(aVar2, aVar3.h());
            composer2.z(-1650290103);
            boolean C = composer2.C(qs2Var);
            Object A4 = composer2.A();
            if (C || A4 == aVar.a()) {
                A4 = new ss2() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    {
                        super(1);
                    }

                    public final long b(fm1 fm1Var) {
                        return wm3.a(dg4.d(((Number) qs2.this.mo865invoke()).floatValue()), 0);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return vm3.b(b((fm1) obj));
                    }
                };
                composer2.q(A4);
            }
            composer2.R();
            SpacerKt.a(BackgroundKt.c(ShadowKt.b(SizeKt.l(IndicationKt.b(OffsetKt.a(c2, (ss2) A4), eo3Var, l27.e(false, d, 0L, composer2, 54, 4)), c), f2, d37.f(), false, 0L, 0L, 24, null), i(a3), d37.f()), composer2, 0);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k2 = composer2.k();
        if (k2 != null) {
            k2.a(new gt2() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i5) {
                    SwitchKt.f(ac0.this, z, z2, hd8Var, qs2Var, eo3Var, composer3, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long g(x08 x08Var) {
        return ((nn0) x08Var.getValue()).B();
    }

    private static final long h(x08 x08Var) {
        return ((nn0) x08Var.getValue()).B();
    }

    private static final long i(x08 x08Var) {
        return ((nn0) x08Var.getValue()).B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(fv1 fv1Var, long j2, float f2, float f3) {
        float f4 = f3 / 2;
        fv1.s0(fv1Var, j2, hd5.a(f4, fd5.p(fv1Var.t1())), hd5.a(f2 - f4, fd5.p(fv1Var.t1())), f3, v48.a.b(), null, 0.0f, null, 0, 480, null);
    }

    public static final float s() {
        return b;
    }

    public static final float t() {
        return a;
    }
}
