package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.l;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.comscore.streaming.ContentType;
import defpackage.bu1;
import defpackage.cc7;
import defpackage.cs0;
import defpackage.dg4;
import defpackage.eb0;
import defpackage.et0;
import defpackage.fv0;
import defpackage.fv1;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hd5;
import defpackage.it2;
import defpackage.ju7;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.yv0;
import defpackage.zq3;
import defpackage.zt7;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class TextFieldKt {
    private static final float a = bu1.g(20);
    private static final float b = bu1.g(10);
    private static final float c = bu1.g(2);

    /* JADX WARN: Removed duplicated region for block: B:100:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.String r103, final defpackage.ss2 r104, androidx.compose.ui.Modifier r105, boolean r106, boolean r107, androidx.compose.ui.text.j r108, defpackage.gt2 r109, defpackage.gt2 r110, defpackage.gt2 r111, defpackage.gt2 r112, boolean r113, defpackage.kc9 r114, androidx.compose.foundation.text.c r115, androidx.compose.foundation.text.b r116, boolean r117, int r118, int r119, defpackage.dy4 r120, defpackage.no7 r121, defpackage.di8 r122, androidx.compose.runtime.Composer r123, final int r124, final int r125, final int r126) {
        /*
            Method dump skipped, instructions count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.a(java.lang.String, ss2, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.j, gt2, gt2, gt2, gt2, boolean, kc9, androidx.compose.foundation.text.c, androidx.compose.foundation.text.b, boolean, int, int, dy4, no7, di8, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void b(final java.lang.String r72, final defpackage.ss2 r73, androidx.compose.ui.Modifier r74, boolean r75, boolean r76, androidx.compose.ui.text.j r77, defpackage.gt2 r78, defpackage.gt2 r79, defpackage.gt2 r80, defpackage.gt2 r81, boolean r82, defpackage.kc9 r83, androidx.compose.foundation.text.c r84, androidx.compose.foundation.text.b r85, boolean r86, int r87, defpackage.dy4 r88, defpackage.no7 r89, defpackage.di8 r90, androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.b(java.lang.String, ss2, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.j, gt2, gt2, gt2, gt2, boolean, kc9, androidx.compose.foundation.text.c, androidx.compose.foundation.text.b, boolean, int, dy4, no7, di8, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void c(final Modifier modifier, final gt2 gt2Var, final gt2 gt2Var2, final it2 it2Var, final gt2 gt2Var3, final gt2 gt2Var4, final boolean z, final float f, final ym5 ym5Var, Composer composer, final int i) {
        int i2;
        int i3;
        Composer h = composer.h(-2112507061);
        if ((i & 14) == 0) {
            i2 = (h.S(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(gt2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= h.C(gt2Var2) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= h.C(it2Var) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= h.C(gt2Var3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= h.C(gt2Var4) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= h.a(z) ? Constants.MB : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= h.b(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= h.S(ym5Var) ? 67108864 : 33554432;
        }
        if ((191739611 & i2) == 38347922 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-2112507061, i2, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:486)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            Float valueOf2 = Float.valueOf(f);
            h.z(1618982084);
            boolean S = h.S(valueOf) | h.S(valueOf2) | h.S(ym5Var);
            Object A = h.A();
            if (S || A == Composer.a.a()) {
                A = new TextFieldMeasurePolicy(z, f, ym5Var);
                h.q(A);
            }
            h.R();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) A;
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c2 = LayoutKt.c(modifier);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a3);
            } else {
                h.p();
            }
            Composer a4 = Updater.a(h);
            Updater.c(a4, textFieldMeasurePolicy, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c2.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            h.z(254819939);
            if (gt2Var3 != null) {
                Modifier h2 = androidx.compose.ui.layout.b.b(Modifier.a, "Leading").h(TextFieldImplKt.e());
                Alignment e = Alignment.a.e();
                h.z(733328855);
                rg4 g = BoxKt.g(e, false, h, 6);
                h.z(-1323940314);
                int a5 = cs0.a(h, 0);
                et0 o2 = h.o();
                qs2 a6 = companion.a();
                it2 c3 = LayoutKt.c(h2);
                if (h.j() == null) {
                    cs0.c();
                }
                h.G();
                if (h.f()) {
                    h.D(a6);
                } else {
                    h.p();
                }
                Composer a7 = Updater.a(h);
                Updater.c(a7, g, companion.e());
                Updater.c(a7, o2, companion.g());
                gt2 b3 = companion.b();
                if (a7.f() || !zq3.c(a7.A(), Integer.valueOf(a5))) {
                    a7.q(Integer.valueOf(a5));
                    a7.v(Integer.valueOf(a5), b3);
                }
                c3.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                gt2Var3.invoke(h, Integer.valueOf((i2 >> 12) & 14));
                h.R();
                h.t();
                h.R();
                h.R();
            }
            h.R();
            h.z(254820224);
            if (gt2Var4 != null) {
                Modifier h3 = androidx.compose.ui.layout.b.b(Modifier.a, "Trailing").h(TextFieldImplKt.e());
                Alignment e2 = Alignment.a.e();
                h.z(733328855);
                rg4 g2 = BoxKt.g(e2, false, h, 6);
                h.z(-1323940314);
                int a8 = cs0.a(h, 0);
                et0 o3 = h.o();
                qs2 a9 = companion.a();
                it2 c4 = LayoutKt.c(h3);
                if (h.j() == null) {
                    cs0.c();
                }
                h.G();
                if (h.f()) {
                    h.D(a9);
                } else {
                    h.p();
                }
                Composer a10 = Updater.a(h);
                Updater.c(a10, g2, companion.e());
                Updater.c(a10, o3, companion.g());
                gt2 b4 = companion.b();
                if (a10.f() || !zq3.c(a10.A(), Integer.valueOf(a8))) {
                    a10.q(Integer.valueOf(a8));
                    a10.v(Integer.valueOf(a8), b4);
                }
                c4.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                gt2Var4.invoke(h, Integer.valueOf((i2 >> 15) & 14));
                h.R();
                h.t();
                h.R();
                h.R();
            }
            h.R();
            float g3 = PaddingKt.g(ym5Var, layoutDirection);
            float f2 = PaddingKt.f(ym5Var, layoutDirection);
            Modifier.a aVar = Modifier.a;
            if (gt2Var3 != null) {
                i3 = 0;
                g3 = bu1.g(uo6.c(bu1.g(g3 - TextFieldImplKt.d()), bu1.g(0)));
            } else {
                i3 = 0;
            }
            float f3 = g3;
            if (gt2Var4 != null) {
                f2 = bu1.g(uo6.c(bu1.g(f2 - TextFieldImplKt.d()), bu1.g(i3)));
            }
            Modifier m = PaddingKt.m(aVar, f3, 0.0f, f2, 0.0f, 10, null);
            h.z(254821235);
            if (it2Var != null) {
                it2Var.invoke(androidx.compose.ui.layout.b.b(aVar, "Hint").h(m), h, Integer.valueOf((i2 >> 6) & ContentType.LONG_FORM_ON_DEMAND));
            }
            h.R();
            h.z(254821364);
            if (gt2Var2 != null) {
                Modifier h4 = androidx.compose.ui.layout.b.b(aVar, "Label").h(m);
                h.z(733328855);
                rg4 g4 = BoxKt.g(Alignment.a.o(), false, h, 0);
                h.z(-1323940314);
                int a11 = cs0.a(h, 0);
                et0 o4 = h.o();
                qs2 a12 = companion.a();
                it2 c5 = LayoutKt.c(h4);
                if (h.j() == null) {
                    cs0.c();
                }
                h.G();
                if (h.f()) {
                    h.D(a12);
                } else {
                    h.p();
                }
                Composer a13 = Updater.a(h);
                Updater.c(a13, g4, companion.e());
                Updater.c(a13, o4, companion.g());
                gt2 b5 = companion.b();
                if (a13.f() || !zq3.c(a13.A(), Integer.valueOf(a11))) {
                    a13.q(Integer.valueOf(a11));
                    a13.v(Integer.valueOf(a11), b5);
                }
                c5.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.a;
                gt2Var2.invoke(h, Integer.valueOf((i2 >> 6) & 14));
                h.R();
                h.t();
                h.R();
                h.R();
            }
            h.R();
            Modifier h5 = androidx.compose.ui.layout.b.b(aVar, "TextField").h(m);
            h.z(733328855);
            rg4 g5 = BoxKt.g(Alignment.a.o(), true, h, 48);
            h.z(-1323940314);
            int a14 = cs0.a(h, 0);
            et0 o5 = h.o();
            qs2 a15 = companion.a();
            it2 c6 = LayoutKt.c(h5);
            if (h.j() == null) {
                cs0.c();
            }
            h.G();
            if (h.f()) {
                h.D(a15);
            } else {
                h.p();
            }
            Composer a16 = Updater.a(h);
            Updater.c(a16, g5, companion.e());
            Updater.c(a16, o5, companion.g());
            gt2 b6 = companion.b();
            if (a16.f() || !zq3.c(a16.A(), Integer.valueOf(a14))) {
                a16.q(Integer.valueOf(a14));
                a16.v(Integer.valueOf(a14), b6);
            }
            c6.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.a;
            gt2Var.invoke(h, Integer.valueOf((i2 >> 3) & 14));
            h.R();
            h.t();
            h.R();
            h.R();
            h.R();
            h.t();
            h.R();
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.TextFieldKt$TextFieldLayout$2
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
                    TextFieldKt.c(Modifier.this, gt2Var, gt2Var2, it2Var, gt2Var3, gt2Var4, z, f, ym5Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(int i, boolean z, int i2, int i3, int i4, int i5, long j, float f, ym5 ym5Var) {
        float f2 = c * f;
        float d = ym5Var.d() * f;
        float a2 = ym5Var.a() * f;
        int max = Math.max(i, i5);
        return Math.max(dg4.d(z ? i2 + f2 + max + a2 : d + max + a2), Math.max(Math.max(i3, i4), fv0.o(j)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i, int i2, int i3, int i4, int i5, long j) {
        return Math.max(i + Math.max(i3, Math.max(i4, i5)) + i2, fv0.p(j));
    }

    public static final Modifier j(Modifier modifier, final eb0 eb0Var) {
        final float b2 = eb0Var.b();
        return androidx.compose.ui.draw.a.d(modifier, new ss2() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(yv0 yv0Var) {
                yv0Var.A1();
                if (bu1.j(b2, bu1.b.a())) {
                    return;
                }
                float density = b2 * yv0Var.getDensity();
                float g = zt7.g(yv0Var.b()) - (density / 2);
                fv1.l1(yv0Var, eb0Var.a(), hd5.a(0.0f, g), hd5.a(zt7.i(yv0Var.b()), g), density, 0, null, 0.0f, null, 0, 496, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((yv0) obj);
                return ww8.a;
            }
        });
    }

    public static final float k() {
        return a;
    }

    public static final float l() {
        return b;
    }

    public static final float m() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(l.a aVar, int i, int i2, androidx.compose.ui.layout.l lVar, androidx.compose.ui.layout.l lVar2, androidx.compose.ui.layout.l lVar3, androidx.compose.ui.layout.l lVar4, androidx.compose.ui.layout.l lVar5, boolean z, int i3, int i4, float f, float f2) {
        if (lVar4 != null) {
            l.a.j(aVar, lVar4, 0, Alignment.a.i().a(lVar4.v0(), i2), 0.0f, 4, null);
        }
        if (lVar5 != null) {
            l.a.j(aVar, lVar5, i - lVar5.F0(), Alignment.a.i().a(lVar5.v0(), i2), 0.0f, 4, null);
        }
        if (lVar2 != null) {
            l.a.j(aVar, lVar2, TextFieldImplKt.j(lVar4), (z ? Alignment.a.i().a(lVar2.v0(), i2) : dg4.d(TextFieldImplKt.g() * f2)) - dg4.d((r0 - i3) * f), 0.0f, 4, null);
        }
        l.a.j(aVar, lVar, TextFieldImplKt.j(lVar4), i4, 0.0f, 4, null);
        if (lVar3 != null) {
            l.a.j(aVar, lVar3, TextFieldImplKt.j(lVar4), i4, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(l.a aVar, int i, int i2, androidx.compose.ui.layout.l lVar, androidx.compose.ui.layout.l lVar2, androidx.compose.ui.layout.l lVar3, androidx.compose.ui.layout.l lVar4, boolean z, float f, ym5 ym5Var) {
        int d = dg4.d(ym5Var.d() * f);
        if (lVar3 != null) {
            l.a.j(aVar, lVar3, 0, Alignment.a.i().a(lVar3.v0(), i2), 0.0f, 4, null);
        }
        if (lVar4 != null) {
            l.a.j(aVar, lVar4, i - lVar4.F0(), Alignment.a.i().a(lVar4.v0(), i2), 0.0f, 4, null);
        }
        l.a.j(aVar, lVar, TextFieldImplKt.j(lVar3), z ? Alignment.a.i().a(lVar.v0(), i2) : d, 0.0f, 4, null);
        if (lVar2 != null) {
            if (z) {
                d = Alignment.a.i().a(lVar2.v0(), i2);
            }
            l.a.j(aVar, lVar2, TextFieldImplKt.j(lVar3), d, 0.0f, 4, null);
        }
    }
}
