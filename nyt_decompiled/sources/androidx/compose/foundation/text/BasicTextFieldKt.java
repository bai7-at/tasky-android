package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.sy4;

/* loaded from: classes.dex */
public abstract class BasicTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final androidx.compose.ui.text.input.TextFieldValue r37, final defpackage.ss2 r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.j r42, androidx.compose.foundation.text.c r43, androidx.compose.foundation.text.b r44, boolean r45, int r46, int r47, defpackage.kc9 r48, defpackage.ss2 r49, defpackage.dy4 r50, defpackage.yc0 r51, defpackage.it2 r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, ss2, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.j, androidx.compose.foundation.text.c, androidx.compose.foundation.text.b, boolean, int, int, kc9, ss2, dy4, yc0, it2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r41, final defpackage.ss2 r42, androidx.compose.ui.Modifier r43, boolean r44, boolean r45, androidx.compose.ui.text.j r46, androidx.compose.foundation.text.c r47, androidx.compose.foundation.text.b r48, boolean r49, int r50, int r51, defpackage.kc9 r52, defpackage.ss2 r53, defpackage.dy4 r54, defpackage.yc0 r55, defpackage.it2 r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.b(java.lang.String, ss2, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.j, androidx.compose.foundation.text.c, androidx.compose.foundation.text.b, boolean, int, int, kc9, ss2, dy4, yc0, it2, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue c(sy4 sy4Var) {
        return (TextFieldValue) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(sy4 sy4Var, TextFieldValue textFieldValue) {
        sy4Var.setValue(textFieldValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(sy4 sy4Var) {
        return (String) sy4Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(sy4 sy4Var, String str) {
        sy4Var.setValue(str);
    }
}
