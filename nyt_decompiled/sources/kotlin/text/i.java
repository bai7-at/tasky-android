package kotlin.text;

import defpackage.ss2;
import defpackage.zq3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class i {
    public static void a(Appendable appendable, Object obj, ss2 ss2Var) {
        zq3.h(appendable, "<this>");
        if (ss2Var != null) {
            appendable.append((CharSequence) ss2Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(String.valueOf(obj));
        }
    }
}
