package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.y;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.do0;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.m76;
import defpackage.o76;
import defpackage.qs2;
import defpackage.ww8;

/* loaded from: classes.dex */
public abstract class TextKt {
    private static final m76 a = CompositionLocalKt.c(y.q(), new qs2() { // from class: androidx.compose.material.TextKt$LocalTextStyle$1
        @Override // defpackage.qs2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.text.j mo865invoke() {
            return TypographyKt.b();
        }
    });

    static final class a implements do0 {
        final /* synthetic */ long a;

        a(long j) {
            this.a = j;
        }

        @Override // defpackage.do0
        public final long a() {
            return this.a;
        }
    }

    static final class b implements do0 {
        final /* synthetic */ long a;

        b(long j) {
            this.a = j;
        }

        @Override // defpackage.do0
        public final long a() {
            return this.a;
        }
    }

    public static final void a(final androidx.compose.ui.text.j jVar, final gt2 gt2Var, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(1772272796);
        if ((i & 14) == 0) {
            i2 = (h.S(jVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.C(gt2Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(1772272796, i2, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:393)");
            }
            m76 m76Var = a;
            CompositionLocalKt.a(m76Var.c(((androidx.compose.ui.text.j) h.m(m76Var)).N(jVar)), gt2Var, h, (i2 & ContentType.LONG_FORM_ON_DEMAND) | o76.d);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
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
                    TextKt.a(androidx.compose.ui.text.j.this, gt2Var, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void b(final androidx.compose.ui.text.a r52, androidx.compose.ui.Modifier r53, long r54, long r56, androidx.compose.ui.text.font.l r58, androidx.compose.ui.text.font.o r59, androidx.compose.ui.text.font.e r60, long r61, defpackage.ph8 r63, defpackage.dh8 r64, long r65, int r67, boolean r68, int r69, java.util.Map r70, defpackage.ss2 r71, androidx.compose.ui.text.j r72, androidx.compose.runtime.Composer r73, final int r74, final int r75, final int r76) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.b(androidx.compose.ui.text.a, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.l, androidx.compose.ui.text.font.o, androidx.compose.ui.text.font.e, long, ph8, dh8, long, int, boolean, int, java.util.Map, ss2, androidx.compose.ui.text.j, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r68, androidx.compose.ui.Modifier r69, long r70, long r72, androidx.compose.ui.text.font.l r74, androidx.compose.ui.text.font.o r75, androidx.compose.ui.text.font.e r76, long r77, defpackage.ph8 r79, defpackage.dh8 r80, long r81, int r83, boolean r84, int r85, int r86, defpackage.ss2 r87, androidx.compose.ui.text.j r88, androidx.compose.runtime.Composer r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.c(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.l, androidx.compose.ui.text.font.o, androidx.compose.ui.text.font.e, long, ph8, dh8, long, int, boolean, int, int, ss2, androidx.compose.ui.text.j, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final androidx.compose.ui.text.a r71, androidx.compose.ui.Modifier r72, long r73, long r75, androidx.compose.ui.text.font.l r77, androidx.compose.ui.text.font.o r78, androidx.compose.ui.text.font.e r79, long r80, defpackage.ph8 r82, defpackage.dh8 r83, long r84, int r86, boolean r87, int r88, int r89, java.util.Map r90, defpackage.ss2 r91, androidx.compose.ui.text.j r92, androidx.compose.runtime.Composer r93, final int r94, final int r95, final int r96) {
        /*
            Method dump skipped, instructions count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.d(androidx.compose.ui.text.a, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.l, androidx.compose.ui.text.font.o, androidx.compose.ui.text.font.e, long, ph8, dh8, long, int, boolean, int, int, java.util.Map, ss2, androidx.compose.ui.text.j, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void e(final java.lang.String r54, androidx.compose.ui.Modifier r55, long r56, long r58, androidx.compose.ui.text.font.l r60, androidx.compose.ui.text.font.o r61, androidx.compose.ui.text.font.e r62, long r63, defpackage.ph8 r65, defpackage.dh8 r66, long r67, int r69, boolean r70, int r71, defpackage.ss2 r72, androidx.compose.ui.text.j r73, androidx.compose.runtime.Composer r74, final int r75, final int r76, final int r77) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.e(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.l, androidx.compose.ui.text.font.o, androidx.compose.ui.text.font.e, long, ph8, dh8, long, int, boolean, int, ss2, androidx.compose.ui.text.j, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final m76 f() {
        return a;
    }
}
