package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.y;
import androidx.compose.ui.text.j;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.dv8;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.m76;
import defpackage.o76;
import defpackage.qs2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class TextKt {
    private static final m76 a = CompositionLocalKt.c(y.q(), new qs2() { // from class: androidx.compose.material3.TextKt$LocalTextStyle$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final j mo865invoke() {
            return dv8.a();
        }
    });

    public static final void a(final j jVar, final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-460300127);
        if ((i & 6) == 0) {
            i2 = (h.S(jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= h.C(gt2Var) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-460300127, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:349)");
            }
            m76 m76Var = a;
            CompositionLocalKt.a(m76Var.c(((j) h.m(m76Var)).N(jVar)), gt2Var, h, (i2 & ContentType.LONG_FORM_ON_DEMAND) | o76.d);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material3.TextKt$ProvideTextStyle$1
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
                    TextKt.a(j.this, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r68, androidx.compose.ui.Modifier r69, long r70, long r72, androidx.compose.ui.text.font.l r74, androidx.compose.ui.text.font.o r75, androidx.compose.ui.text.font.e r76, long r77, defpackage.ph8 r79, defpackage.dh8 r80, long r81, int r83, boolean r84, int r85, int r86, defpackage.ss2 r87, androidx.compose.ui.text.j r88, androidx.compose.runtime.Composer r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instructions count: 1063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.b(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.l, androidx.compose.ui.text.font.o, androidx.compose.ui.text.font.e, long, ph8, dh8, long, int, boolean, int, int, ss2, androidx.compose.ui.text.j, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void c(final java.lang.String r54, androidx.compose.ui.Modifier r55, long r56, long r58, androidx.compose.ui.text.font.l r60, androidx.compose.ui.text.font.o r61, androidx.compose.ui.text.font.e r62, long r63, defpackage.ph8 r65, defpackage.dh8 r66, long r67, int r69, boolean r70, int r71, defpackage.ss2 r72, androidx.compose.ui.text.j r73, androidx.compose.runtime.Composer r74, final int r75, final int r76, final int r77) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.c(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.l, androidx.compose.ui.text.font.o, androidx.compose.ui.text.font.e, long, ph8, dh8, long, int, boolean, int, ss2, androidx.compose.ui.text.j, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final m76 d() {
        return a;
    }
}
