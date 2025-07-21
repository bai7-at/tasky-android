package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class hge {
    static final CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final StringBuilder b(StringBuilder sb, Iterable iterable, String str) {
        Iterator it2 = iterable.iterator();
        try {
            if (it2.hasNext()) {
                sb.append(a(it2.next()));
                while (it2.hasNext()) {
                    sb.append((CharSequence) str);
                    sb.append(a(it2.next()));
                }
            }
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
