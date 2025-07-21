package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.b0;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.l;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.b92;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ka7;
import defpackage.m76;
import defpackage.qs2;
import defpackage.ra8;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class ScaffoldKt {
    private static final sy4 a = b0.e(Boolean.TRUE, null, 2, null);
    private static final m76 b = CompositionLocalKt.e(new qs2() { // from class: androidx.compose.material.ScaffoldKt$LocalFabPlacement$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b92 mo865invoke() {
            return null;
        }
    });
    private static final float c = bu1.g(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final boolean z, final int i, final gt2 gt2Var, final it2 it2Var, final gt2 gt2Var2, final gt2 gt2Var3, final androidx.compose.foundation.layout.o oVar, final gt2 gt2Var4, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer h = composer.h(141059468);
        if ((i2 & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.d(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= h.C(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= h.C(it2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= h.C(gt2Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= h.C(gt2Var3) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= h.S(oVar) ? Constants.MB : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= h.C(gt2Var4) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) == 4793490 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(141059468, i3, -1, "androidx.compose.material.LegacyScaffoldLayout (Scaffold.kt:627)");
            }
            h.z(188877366);
            boolean C = h.C(gt2Var) | h.C(gt2Var2) | h.S(oVar) | h.C(gt2Var3) | h.d(i) | h.a(z) | h.C(gt2Var4) | h.C(it2Var);
            Object A = h.A();
            if (C || A == Composer.a.a()) {
                composer2 = h;
                gt2 gt2Var5 = new gt2() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final sg4 b(final ra8 ra8Var, long j) {
                        final int n = fv0.n(j);
                        final int m = fv0.m(j);
                        final long e = fv0.e(j, 0, 0, 0, 0, 10, null);
                        final gt2 gt2Var6 = gt2.this;
                        final gt2 gt2Var7 = gt2Var2;
                        final gt2 gt2Var8 = gt2Var3;
                        final int i4 = i;
                        final boolean z2 = z;
                        final androidx.compose.foundation.layout.o oVar2 = oVar;
                        final gt2 gt2Var9 = gt2Var4;
                        final it2 it2Var2 = it2Var;
                        return androidx.compose.ui.layout.f.J(ra8Var, n, m, null, new ss2() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Removed duplicated region for block: B:110:0x0308  */
                            /* JADX WARN: Removed duplicated region for block: B:114:0x02ec  */
                            /* JADX WARN: Removed duplicated region for block: B:115:0x02a4  */
                            /* JADX WARN: Removed duplicated region for block: B:116:0x026c  */
                            /* JADX WARN: Removed duplicated region for block: B:49:0x0253 A[LOOP:3: B:48:0x0251->B:49:0x0253, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:53:0x0269  */
                            /* JADX WARN: Removed duplicated region for block: B:56:0x0299  */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x02a8  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x02f0  */
                            /* JADX WARN: Removed duplicated region for block: B:68:0x0349 A[LOOP:4: B:67:0x0347->B:68:0x0349, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:72:0x0372 A[LOOP:5: B:71:0x0370->B:72:0x0372, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:76:0x038d A[LOOP:6: B:75:0x038b->B:76:0x038d, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:80:0x03b0 A[LOOP:7: B:79:0x03ae->B:80:0x03b0, LOOP_END] */
                            /* JADX WARN: Removed duplicated region for block: B:84:0x03d3  */
                            /* JADX WARN: Removed duplicated region for block: B:94:0x03f9  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void b(androidx.compose.ui.layout.l.a r30) {
                                /*
                                    Method dump skipped, instructions count: 1059
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$1$1.AnonymousClass1.b(androidx.compose.ui.layout.l$a):void");
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                b((l.a) obj);
                                return ww8.a;
                            }
                        }, 4, null);
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return b((ra8) obj, ((fv0) obj2).t());
                    }
                };
                composer2.q(gt2Var5);
                A = gt2Var5;
            } else {
                composer2 = h;
            }
            composer2.R();
            SubcomposeLayoutKt.a(null, (gt2) A, composer2, 0, 1);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.ScaffoldKt$LegacyScaffoldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    ScaffoldKt.a(z, i, gt2Var, it2Var, gt2Var2, gt2Var3, oVar, gt2Var4, composer3, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01af, code lost:
    
        if (r0.e(r72) == false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.Modifier r58, defpackage.ka7 r59, defpackage.gt2 r60, defpackage.gt2 r61, defpackage.it2 r62, defpackage.gt2 r63, int r64, boolean r65, defpackage.it2 r66, boolean r67, defpackage.no7 r68, float r69, long r70, long r72, long r74, long r76, long r78, final defpackage.it2 r80, androidx.compose.runtime.Composer r81, final int r82, final int r83, final int r84) {
        /*
            Method dump skipped, instructions count: 1223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.b(androidx.compose.ui.Modifier, ka7, gt2, gt2, it2, gt2, int, boolean, it2, boolean, no7, float, long, long, long, long, long, it2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final androidx.compose.foundation.layout.o r39, androidx.compose.ui.Modifier r40, defpackage.ka7 r41, defpackage.gt2 r42, defpackage.gt2 r43, defpackage.it2 r44, defpackage.gt2 r45, int r46, boolean r47, defpackage.it2 r48, boolean r49, defpackage.no7 r50, float r51, long r52, long r54, long r56, long r58, long r60, final defpackage.it2 r62, androidx.compose.runtime.Composer r63, final int r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 1322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.c(androidx.compose.foundation.layout.o, androidx.compose.ui.Modifier, ka7, gt2, gt2, it2, gt2, int, boolean, it2, boolean, no7, float, long, long, long, long, long, it2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final boolean z, final int i, final gt2 gt2Var, final it2 it2Var, final gt2 gt2Var2, final gt2 gt2Var3, final androidx.compose.foundation.layout.o oVar, final gt2 gt2Var4, Composer composer, final int i2) {
        int i3;
        Composer h = composer.h(-468424875);
        if ((i2 & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.d(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= h.C(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= h.C(it2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= h.C(gt2Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= h.C(gt2Var3) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= h.S(oVar) ? Constants.MB : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= h.C(gt2Var4) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) == 4793490 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-468424875, i3, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:409)");
            }
            if (k()) {
                h.z(-2103098080);
                e(z, i, gt2Var, it2Var, gt2Var2, gt2Var3, oVar, gt2Var4, h, i3 & 33554430);
                h.R();
            } else {
                h.z(-2103097736);
                a(z, i, gt2Var, it2Var, gt2Var2, gt2Var3, oVar, gt2Var4, h, i3 & 33554430);
                h.R();
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    ScaffoldKt.d(z, i, gt2Var, it2Var, gt2Var2, gt2Var3, oVar, gt2Var4, composer2, gt6.a(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final boolean z, final int i, final gt2 gt2Var, final it2 it2Var, final gt2 gt2Var2, final gt2 gt2Var3, final androidx.compose.foundation.layout.o oVar, final gt2 gt2Var4, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer h = composer.h(1285900760);
        if ((i2 & 14) == 0) {
            i3 = (h.a(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i3 |= h.d(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= h.C(gt2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= h.C(it2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= h.C(gt2Var2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= h.C(gt2Var3) ? 131072 : 65536;
        }
        if ((3670016 & i2) == 0) {
            i3 |= h.S(oVar) ? Constants.MB : 524288;
        }
        if ((29360128 & i2) == 0) {
            i3 |= h.C(gt2Var4) ? 8388608 : 4194304;
        }
        if ((23967451 & i3) == 4793490 && h.i()) {
            h.K();
            composer2 = h;
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1285900760, i3, -1, "androidx.compose.material.ScaffoldLayoutWithMeasureFix (Scaffold.kt:449)");
            }
            h.z(188870142);
            boolean C = h.C(gt2Var) | h.C(gt2Var2) | h.S(oVar) | h.C(gt2Var3) | h.d(i) | h.a(z) | h.C(gt2Var4) | h.C(it2Var);
            Object A = h.A();
            if (C || A == Composer.a.a()) {
                composer2 = h;
                gt2 gt2Var5 = new gt2() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:49:0x025b A[LOOP:3: B:48:0x0259->B:49:0x025b, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x0271  */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x02a6  */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x02b5  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x02f9  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0352 A[LOOP:4: B:67:0x0350->B:68:0x0352, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:76:0x0311  */
                    /* JADX WARN: Removed duplicated region for block: B:81:0x02f5  */
                    /* JADX WARN: Removed duplicated region for block: B:82:0x02b1  */
                    /* JADX WARN: Removed duplicated region for block: B:83:0x0273  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final defpackage.sg4 b(final defpackage.ra8 r33, long r34) {
                        /*
                            Method dump skipped, instructions count: 916
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$1$1.b(ra8, long):sg4");
                    }

                    @Override // defpackage.gt2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        return b((ra8) obj, ((fv0) obj2).t());
                    }
                };
                composer2.q(gt2Var5);
                A = gt2Var5;
            } else {
                composer2 = h;
            }
            composer2.R();
            SubcomposeLayoutKt.a(null, (gt2) A, composer2, 0, 1);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = composer2.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayoutWithMeasureFix$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer3, int i4) {
                    ScaffoldKt.e(z, i, gt2Var, it2Var, gt2Var2, gt2Var3, oVar, gt2Var4, composer3, gt6.a(i2 | 1));
                }
            });
        }
    }

    public static final m76 j() {
        return b;
    }

    public static final boolean k() {
        return ((Boolean) a.getValue()).booleanValue();
    }

    public static final ka7 l(DrawerState drawerState, SnackbarHostState snackbarHostState, Composer composer, int i, int i2) {
        composer.z(1569641925);
        if ((i2 & 1) != 0) {
            drawerState = DrawerKt.j(DrawerValue.Closed, null, composer, 6, 2);
        }
        if ((i2 & 2) != 0) {
            composer.z(-492369756);
            Object A = composer.A();
            if (A == Composer.a.a()) {
                A = new SnackbarHostState();
                composer.q(A);
            }
            composer.R();
            snackbarHostState = (SnackbarHostState) A;
        }
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.S(1569641925, i, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:76)");
        }
        composer.z(-492369756);
        Object A2 = composer.A();
        if (A2 == Composer.a.a()) {
            A2 = new ka7(drawerState, snackbarHostState);
            composer.q(A2);
        }
        composer.R();
        ka7 ka7Var = (ka7) A2;
        if (androidx.compose.runtime.b.G()) {
            androidx.compose.runtime.b.R();
        }
        composer.R();
        return ka7Var;
    }
}
