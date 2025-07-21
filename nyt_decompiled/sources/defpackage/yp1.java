package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes.dex */
public abstract class yp1 {
    private static final String a;

    static {
        String i = h94.i("DiagnosticsWrkr");
        zq3.g(i, "tagWithPrefix(\"DiagnosticsWrkr\")");
        a = i;
    }

    private static final String c(dk9 dk9Var, String str, Integer num, String str2) {
        return '\n' + dk9Var.a + "\t " + dk9Var.c + "\t " + num + "\t " + dk9Var.b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(uj9 uj9Var, kk9 kk9Var, le8 le8Var, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            dk9 dk9Var = (dk9) it2.next();
            ke8 d = le8Var.d(ik9.a(dk9Var));
            sb.append(c(dk9Var, i.u0(uj9Var.b(dk9Var.a), ",", null, null, 0, null, null, 62, null), d != null ? Integer.valueOf(d.c) : null, i.u0(kk9Var.a(dk9Var.a), ",", null, null, 0, null, null, 62, null)));
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
