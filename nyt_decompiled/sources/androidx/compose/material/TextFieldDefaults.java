package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import defpackage.ag4;
import defpackage.bu1;
import defpackage.di8;
import defpackage.e01;
import defpackage.eb0;
import defpackage.ei8;
import defpackage.eo3;
import defpackage.it2;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.nn0;
import defpackage.no7;
import defpackage.ss2;
import defpackage.uv0;
import defpackage.ww8;
import defpackage.x08;
import defpackage.ym5;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class TextFieldDefaults {
    public static final TextFieldDefaults a = new TextFieldDefaults();
    private static final float b = bu1.g(56);
    private static final float c = bu1.g(280);
    private static final float d = bu1.g(1);
    private static final float e = bu1.g(2);

    private TextFieldDefaults() {
    }

    public static /* synthetic */ ym5 k(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.g();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.g();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.g();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.g();
        }
        return textFieldDefaults.j(f, f2, f3, f4);
    }

    public static /* synthetic */ ym5 n(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.g();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.g();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldKt.k();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldKt.l();
        }
        return textFieldDefaults.m(f, f2, f3, f4);
    }

    public static /* synthetic */ ym5 p(TextFieldDefaults textFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.g();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.g();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.g();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.g();
        }
        return textFieldDefaults.o(f, f2, f3, f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(final boolean r23, final boolean r24, final defpackage.eo3 r25, final defpackage.di8 r26, defpackage.no7 r27, float r28, float r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.a(boolean, boolean, eo3, di8, no7, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0189, code lost:
    
        if (r10.S(r80) == false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(final java.lang.String r68, final defpackage.gt2 r69, final boolean r70, final boolean r71, final defpackage.kc9 r72, final defpackage.eo3 r73, boolean r74, defpackage.gt2 r75, defpackage.gt2 r76, defpackage.gt2 r77, defpackage.gt2 r78, defpackage.di8 r79, defpackage.ym5 r80, defpackage.gt2 r81, androidx.compose.runtime.Composer r82, final int r83, final int r84, final int r85) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.b(java.lang.String, gt2, boolean, boolean, kc9, eo3, boolean, gt2, gt2, gt2, gt2, di8, ym5, gt2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final java.lang.String r70, final defpackage.gt2 r71, final boolean r72, final boolean r73, final defpackage.kc9 r74, final defpackage.eo3 r75, boolean r76, defpackage.gt2 r77, defpackage.gt2 r78, defpackage.gt2 r79, defpackage.gt2 r80, defpackage.di8 r81, defpackage.ym5 r82, androidx.compose.runtime.Composer r83, final int r84, final int r85, final int r86) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.c(java.lang.String, gt2, boolean, boolean, kc9, eo3, boolean, gt2, gt2, gt2, gt2, di8, ym5, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public final float d() {
        return b;
    }

    public final float e() {
        return c;
    }

    public final no7 f(Composer composer, int i) {
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1899109048, i, -1, "androidx.compose.material.TextFieldDefaults.<get-OutlinedTextFieldShape> (TextFieldDefaults.kt:242)");
        }
        e01 c2 = ag4.a.b(composer, 6).c();
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        return c2;
    }

    public final Modifier g(Modifier modifier, final boolean z, final boolean z2, final eo3 eo3Var, final di8 di8Var, final float f, final float f2) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                x08 b2;
                composer.z(1398930845);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(1398930845, i, -1, "androidx.compose.material.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:299)");
                }
                b2 = ei8.b(z, z2, eo3Var, di8Var, f, f2, composer, 0);
                Modifier j = TextFieldKt.j(Modifier.a, (eb0) b2.getValue());
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return j;
            }
        });
    }

    public final di8 i(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        composer.z(1762667317);
        long r = (i4 & 1) != 0 ? nn0.r(((nn0) composer.m(ContentColorKt.a())).B(), ((Number) composer.m(ContentAlphaKt.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long r2 = (i4 & 2) != 0 ? nn0.r(r, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long f = (i4 & 4) != 0 ? nn0.b.f() : j3;
        long j22 = (i4 & 8) != 0 ? ag4.a.a(composer, 6).j() : j4;
        long d2 = (i4 & 16) != 0 ? ag4.a.a(composer, 6).d() : j5;
        long r3 = (i4 & 32) != 0 ? nn0.r(ag4.a.a(composer, 6).j(), uv0.a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long r4 = (i4 & 64) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long r5 = (i4 & 128) != 0 ? nn0.r(r4, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long d3 = (i4 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? ag4.a.a(composer, 6).d() : j9;
        long r6 = (i4 & 512) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long r7 = (i4 & 1024) != 0 ? nn0.r(r6, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j23 = (i4 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r6 : j12;
        long r8 = (i4 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long r9 = (i4 & 8192) != 0 ? nn0.r(r8, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long d4 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? ag4.a.a(composer, 6).d() : j15;
        long r10 = (32768 & i4) != 0 ? nn0.r(ag4.a.a(composer, 6).j(), uv0.a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long r11 = (65536 & i4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long r12 = (131072 & i4) != 0 ? nn0.r(r11, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long d5 = (262144 & i4) != 0 ? ag4.a.a(composer, 6).d() : j19;
        long r13 = (524288 & i4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long r14 = (i4 & Constants.MB) != 0 ? nn0.r(r13, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1762667317, i, i2, "androidx.compose.material.TextFieldDefaults.outlinedTextFieldColors (TextFieldDefaults.kt:480)");
        }
        e eVar = new e(r, r2, j22, d2, r3, r4, d3, r5, r6, r7, j23, r8, r9, d4, f, r10, r11, r12, d5, r13, r14, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return eVar;
    }

    public final ym5 j(float f, float f2, float f3, float f4) {
        return PaddingKt.d(f, f2, f3, f4);
    }

    public final di8 l(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, Composer composer, int i, int i2, int i3, int i4) {
        composer.z(231892599);
        long r = (i4 & 1) != 0 ? nn0.r(((nn0) composer.m(ContentColorKt.a())).B(), ((Number) composer.m(ContentAlphaKt.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j;
        long r2 = (i4 & 2) != 0 ? nn0.r(r, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long r3 = (i4 & 4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j22 = (i4 & 8) != 0 ? ag4.a.a(composer, 6).j() : j4;
        long d2 = (i4 & 16) != 0 ? ag4.a.a(composer, 6).d() : j5;
        long r4 = (i4 & 32) != 0 ? nn0.r(ag4.a.a(composer, 6).j(), uv0.a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long r5 = (i4 & 64) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long r6 = (i4 & 128) != 0 ? nn0.r(r5, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long d3 = (i4 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? ag4.a.a(composer, 6).d() : j9;
        long r7 = (i4 & 512) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long r8 = (i4 & 1024) != 0 ? nn0.r(r7, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        long j23 = (i4 & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? r7 : j12;
        long r9 = (i4 & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long r10 = (i4 & 8192) != 0 ? nn0.r(r9, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long d4 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? ag4.a.a(composer, 6).d() : j15;
        long r11 = (32768 & i4) != 0 ? nn0.r(ag4.a.a(composer, 6).j(), uv0.a.c(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long r12 = (65536 & i4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long r13 = (131072 & i4) != 0 ? nn0.r(r12, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long d5 = (262144 & i4) != 0 ? ag4.a.a(composer, 6).d() : j19;
        long r14 = (524288 & i4) != 0 ? nn0.r(ag4.a.a(composer, 6).i(), uv0.a.d(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long r15 = (i4 & Constants.MB) != 0 ? nn0.r(r14, uv0.a.b(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(231892599, i, i2, "androidx.compose.material.TextFieldDefaults.textFieldColors (TextFieldDefaults.kt:422)");
        }
        e eVar = new e(r, r2, j22, d2, r4, r5, d3, r6, r7, r8, j23, r9, r10, d4, r3, r11, r12, r13, d5, r14, r15, null);
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return eVar;
    }

    public final ym5 m(float f, float f2, float f3, float f4) {
        return PaddingKt.d(f, f3, f2, f4);
    }

    public final ym5 o(float f, float f2, float f3, float f4) {
        return PaddingKt.d(f, f2, f3, f4);
    }
}
