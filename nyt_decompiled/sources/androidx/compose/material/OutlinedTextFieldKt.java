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
import defpackage.cg4;
import defpackage.cs0;
import defpackage.dg4;
import defpackage.et0;
import defpackage.fv0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.it2;
import defpackage.ju7;
import defpackage.ql0;
import defpackage.qs2;
import defpackage.rg4;
import defpackage.ss2;
import defpackage.uo6;
import defpackage.vm3;
import defpackage.ww8;
import defpackage.ym5;
import defpackage.yv0;
import defpackage.zq3;
import defpackage.zt7;
import defpackage.zu1;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class OutlinedTextFieldKt {
    private static final float a = bu1.g(4);
    private static final float b = bu1.g(8);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0051  */
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
    public static final void a(final androidx.compose.ui.text.input.TextFieldValue r103, final defpackage.ss2 r104, androidx.compose.ui.Modifier r105, boolean r106, boolean r107, androidx.compose.ui.text.j r108, defpackage.gt2 r109, defpackage.gt2 r110, defpackage.gt2 r111, defpackage.gt2 r112, boolean r113, defpackage.kc9 r114, androidx.compose.foundation.text.c r115, androidx.compose.foundation.text.b r116, boolean r117, int r118, int r119, defpackage.dy4 r120, defpackage.no7 r121, defpackage.di8 r122, androidx.compose.runtime.Composer r123, final int r124, final int r125, final int r126) {
        /*
            Method dump skipped, instructions count: 1580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, ss2, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.j, gt2, gt2, gt2, gt2, boolean, kc9, androidx.compose.foundation.text.c, androidx.compose.foundation.text.b, boolean, int, int, dy4, no7, di8, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0440  */
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
    /* JADX WARN: Removed duplicated region for block: B:163:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c5  */
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
    /* JADX WARN: Removed duplicated region for block: B:92:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0295  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void b(final androidx.compose.ui.text.input.TextFieldValue r72, final defpackage.ss2 r73, androidx.compose.ui.Modifier r74, boolean r75, boolean r76, androidx.compose.ui.text.j r77, defpackage.gt2 r78, defpackage.gt2 r79, defpackage.gt2 r80, defpackage.gt2 r81, boolean r82, defpackage.kc9 r83, androidx.compose.foundation.text.c r84, androidx.compose.foundation.text.b r85, boolean r86, int r87, defpackage.dy4 r88, defpackage.no7 r89, defpackage.di8 r90, androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.b(androidx.compose.ui.text.input.TextFieldValue, ss2, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.j, gt2, gt2, gt2, gt2, boolean, kc9, androidx.compose.foundation.text.c, androidx.compose.foundation.text.b, boolean, int, dy4, no7, di8, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r72, final defpackage.ss2 r73, androidx.compose.ui.Modifier r74, boolean r75, boolean r76, androidx.compose.ui.text.j r77, defpackage.gt2 r78, defpackage.gt2 r79, defpackage.gt2 r80, defpackage.gt2 r81, boolean r82, defpackage.kc9 r83, androidx.compose.foundation.text.c r84, androidx.compose.foundation.text.b r85, boolean r86, int r87, int r88, defpackage.dy4 r89, defpackage.no7 r90, defpackage.di8 r91, androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.c(java.lang.String, ss2, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.j, gt2, gt2, gt2, gt2, boolean, kc9, androidx.compose.foundation.text.c, androidx.compose.foundation.text.b, boolean, int, int, dy4, no7, di8, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void d(final java.lang.String r73, final defpackage.ss2 r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.j r78, defpackage.gt2 r79, defpackage.gt2 r80, defpackage.gt2 r81, defpackage.gt2 r82, boolean r83, defpackage.kc9 r84, androidx.compose.foundation.text.c r85, androidx.compose.foundation.text.b r86, boolean r87, int r88, defpackage.dy4 r89, defpackage.no7 r90, defpackage.di8 r91, androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.d(java.lang.String, ss2, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.j, gt2, gt2, gt2, gt2, boolean, kc9, androidx.compose.foundation.text.c, androidx.compose.foundation.text.b, boolean, int, dy4, no7, di8, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void e(final Modifier modifier, final gt2 gt2Var, final it2 it2Var, final gt2 gt2Var2, final gt2 gt2Var3, final gt2 gt2Var4, final boolean z, final float f, final ss2 ss2Var, final gt2 gt2Var5, final ym5 ym5Var, Composer composer, final int i, final int i2) {
        int i3;
        Composer h = composer.h(-2049536174);
        int i4 = (i & 14) == 0 ? i | (h.S(modifier) ? 4 : 2) : i;
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i4 |= h.C(gt2Var) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i4 |= h.C(it2Var) ? JceEncryptionConstants.SYMMETRIC_KEY_LENGTH : 128;
        }
        if ((i & 7168) == 0) {
            i4 |= h.C(gt2Var2) ? ProgressEvent.PART_COMPLETED_EVENT_CODE : 1024;
        }
        if ((57344 & i) == 0) {
            i4 |= h.C(gt2Var3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i) == 0) {
            i4 |= h.C(gt2Var4) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i4 |= h.a(z) ? Constants.MB : 524288;
        }
        if ((29360128 & i) == 0) {
            i4 |= h.b(f) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i4 |= h.C(ss2Var) ? 67108864 : 33554432;
        }
        if ((1879048192 & i) == 0) {
            i4 |= h.C(gt2Var5) ? 536870912 : 268435456;
        }
        int i5 = i4;
        int i6 = (i2 & 14) == 0 ? i2 | (h.S(ym5Var) ? 4 : 2) : i2;
        if ((i5 & 1533916891) == 306783378 && (i6 & 11) == 2 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-2049536174, i5, i6, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:492)");
            }
            Object[] objArr = {ss2Var, Boolean.valueOf(z), Float.valueOf(f), ym5Var};
            h.z(-568225417);
            int i7 = 0;
            boolean z2 = false;
            for (int i8 = 4; i7 < i8; i8 = 4) {
                z2 |= h.S(objArr[i7]);
                i7++;
            }
            Object A = h.A();
            if (z2 || A == Composer.a.a()) {
                A = new OutlinedTextFieldMeasurePolicy(ss2Var, z, f, ym5Var);
                h.q(A);
            }
            h.R();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) A;
            LayoutDirection layoutDirection = (LayoutDirection) h.m(CompositionLocalsKt.j());
            h.z(-1323940314);
            int a2 = cs0.a(h, 0);
            et0 o = h.o();
            ComposeUiNode.Companion companion = ComposeUiNode.F;
            qs2 a3 = companion.a();
            it2 c = LayoutKt.c(modifier);
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
            Updater.c(a4, outlinedTextFieldMeasurePolicy, companion.e());
            Updater.c(a4, o, companion.g());
            gt2 b2 = companion.b();
            if (a4.f() || !zq3.c(a4.A(), Integer.valueOf(a2))) {
                a4.q(Integer.valueOf(a2));
                a4.v(Integer.valueOf(a2), b2);
            }
            c.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            gt2Var5.invoke(h, Integer.valueOf((i5 >> 27) & 14));
            h.z(1169918334);
            if (gt2Var3 != null) {
                Modifier h2 = androidx.compose.ui.layout.b.b(Modifier.a, "Leading").h(TextFieldImplKt.e());
                Alignment e = Alignment.a.e();
                h.z(733328855);
                rg4 g = BoxKt.g(e, false, h, 6);
                h.z(-1323940314);
                int a5 = cs0.a(h, 0);
                et0 o2 = h.o();
                qs2 a6 = companion.a();
                it2 c2 = LayoutKt.c(h2);
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
                c2.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                gt2Var3.invoke(h, Integer.valueOf((i5 >> 12) & 14));
                h.R();
                h.t();
                h.R();
                h.R();
            }
            h.R();
            h.z(1169918619);
            if (gt2Var4 != null) {
                Modifier h3 = androidx.compose.ui.layout.b.b(Modifier.a, "Trailing").h(TextFieldImplKt.e());
                Alignment e2 = Alignment.a.e();
                h.z(733328855);
                rg4 g2 = BoxKt.g(e2, false, h, 6);
                h.z(-1323940314);
                int a8 = cs0.a(h, 0);
                et0 o3 = h.o();
                qs2 a9 = companion.a();
                it2 c3 = LayoutKt.c(h3);
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
                c3.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.a;
                gt2Var4.invoke(h, Integer.valueOf((i5 >> 15) & 14));
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
            h.z(1169919630);
            if (it2Var != null) {
                it2Var.invoke(androidx.compose.ui.layout.b.b(aVar, "Hint").h(m), h, Integer.valueOf((i5 >> 3) & ContentType.LONG_FORM_ON_DEMAND));
            }
            h.R();
            Modifier h4 = androidx.compose.ui.layout.b.b(aVar, "TextField").h(m);
            h.z(733328855);
            Alignment.a aVar2 = Alignment.a;
            rg4 g4 = BoxKt.g(aVar2.o(), true, h, 48);
            h.z(-1323940314);
            int a11 = cs0.a(h, 0);
            et0 o4 = h.o();
            qs2 a12 = companion.a();
            it2 c4 = LayoutKt.c(h4);
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
            c4.invoke(ju7.a(ju7.b(h)), h, 0);
            h.z(2058660585);
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.a;
            gt2Var.invoke(h, Integer.valueOf((i5 >> 3) & 14));
            h.R();
            h.t();
            h.R();
            h.R();
            h.z(-614207693);
            if (gt2Var2 != null) {
                Modifier b6 = androidx.compose.ui.layout.b.b(aVar, "Label");
                h.z(733328855);
                rg4 g5 = BoxKt.g(aVar2.o(), false, h, 0);
                h.z(-1323940314);
                int a14 = cs0.a(h, 0);
                et0 o5 = h.o();
                qs2 a15 = companion.a();
                it2 c5 = LayoutKt.c(b6);
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
                gt2 b7 = companion.b();
                if (a16.f() || !zq3.c(a16.A(), Integer.valueOf(a14))) {
                    a16.q(Integer.valueOf(a14));
                    a16.v(Integer.valueOf(a14), b7);
                }
                c5.invoke(ju7.a(ju7.b(h)), h, 0);
                h.z(2058660585);
                gt2Var2.invoke(h, Integer.valueOf((i5 >> 9) & 14));
                h.R();
                h.t();
                h.R();
                h.R();
            }
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
            k.a(new gt2() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i9) {
                    OutlinedTextFieldKt.e(Modifier.this, gt2Var, it2Var, gt2Var2, gt2Var3, gt2Var4, z, f, ss2Var, gt2Var5, ym5Var, composer2, gt6.a(i | 1), gt6.a(i2));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, ym5 ym5Var) {
        int max = Math.max(i3, Math.max(i5, cg4.b(i4, 0, f)));
        float d = ym5Var.d() * f2;
        return Math.max(fv0.o(j), Math.max(i, Math.max(i2, dg4.d(cg4.a(d, Math.max(d, i4 / 2.0f), f) + max + (ym5Var.a() * f2)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(int i, int i2, int i3, int i4, int i5, float f, long j, float f2, ym5 ym5Var) {
        int max = i + Math.max(i3, Math.max(cg4.b(i4, 0, f), i5)) + i2;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return Math.max(max, Math.max(dg4.d((i4 + (bu1.g(ym5Var.b(layoutDirection) + ym5Var.c(layoutDirection)) * f2)) * f), fv0.p(j)));
    }

    public static final Modifier l(Modifier modifier, final long j, final ym5 ym5Var) {
        return androidx.compose.ui.draw.a.d(modifier, new ss2() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            public /* synthetic */ class a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(yv0 yv0Var) {
                float f;
                float i = zt7.i(j);
                if (i <= 0.0f) {
                    yv0Var.A1();
                    return;
                }
                f = OutlinedTextFieldKt.a;
                float f1 = yv0Var.f1(f);
                float f12 = yv0Var.f1(ym5Var.b(yv0Var.getLayoutDirection())) - f1;
                float f2 = 2;
                float f3 = i + f12 + (f1 * f2);
                LayoutDirection layoutDirection = yv0Var.getLayoutDirection();
                int[] iArr = a.a;
                float i2 = iArr[layoutDirection.ordinal()] == 1 ? zt7.i(yv0Var.b()) - f3 : uo6.c(f12, 0.0f);
                if (iArr[yv0Var.getLayoutDirection().ordinal()] == 1) {
                    f3 = zt7.i(yv0Var.b()) - uo6.c(f12, 0.0f);
                }
                float f4 = f3;
                float g = zt7.g(j);
                float f5 = (-g) / f2;
                float f6 = g / f2;
                int a2 = ql0.a.a();
                zu1 i1 = yv0Var.i1();
                long b2 = i1.b();
                i1.c().t();
                i1.a().b(i2, f5, f4, f6, a2);
                yv0Var.A1();
                i1.c().k();
                i1.d(b2);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((yv0) obj);
                return ww8.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l.a aVar, int i, int i2, androidx.compose.ui.layout.l lVar, androidx.compose.ui.layout.l lVar2, androidx.compose.ui.layout.l lVar3, androidx.compose.ui.layout.l lVar4, androidx.compose.ui.layout.l lVar5, androidx.compose.ui.layout.l lVar6, float f, boolean z, float f2, LayoutDirection layoutDirection, ym5 ym5Var) {
        int d = dg4.d(ym5Var.d() * f2);
        int d2 = dg4.d(PaddingKt.g(ym5Var, layoutDirection) * f2);
        float d3 = TextFieldImplKt.d() * f2;
        if (lVar != null) {
            l.a.j(aVar, lVar, 0, Alignment.a.i().a(lVar.v0(), i), 0.0f, 4, null);
        }
        if (lVar2 != null) {
            l.a.j(aVar, lVar2, i2 - lVar2.F0(), Alignment.a.i().a(lVar2.v0(), i), 0.0f, 4, null);
        }
        if (lVar4 != null) {
            l.a.j(aVar, lVar4, dg4.d(lVar == null ? 0.0f : (TextFieldImplKt.j(lVar) - d3) * (1 - f)) + d2, cg4.b(z ? Alignment.a.i().a(lVar4.v0(), i) : d, -(lVar4.v0() / 2), f), 0.0f, 4, null);
        }
        l.a.j(aVar, lVar3, TextFieldImplKt.j(lVar), Math.max(z ? Alignment.a.i().a(lVar3.v0(), i) : d, TextFieldImplKt.i(lVar4) / 2), 0.0f, 4, null);
        if (lVar5 != null) {
            if (z) {
                d = Alignment.a.i().a(lVar5.v0(), i);
            }
            l.a.j(aVar, lVar5, TextFieldImplKt.j(lVar), Math.max(d, TextFieldImplKt.i(lVar4) / 2), 0.0f, 4, null);
        }
        l.a.h(aVar, lVar6, vm3.b.a(), 0.0f, 2, null);
    }
}
