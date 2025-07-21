package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class q7f {
    static final CharSequence a(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final Appendable b(Appendable appendable, Iterator it2, String str) {
        if (it2.hasNext()) {
            appendable.append(a(it2.next()));
            while (it2.hasNext()) {
                appendable.append(",");
                appendable.append(a(it2.next()));
            }
        }
        return appendable;
    }
}
