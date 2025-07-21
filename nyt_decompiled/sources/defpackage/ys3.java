package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public class ys3 {
    private final String a;

    private ys3(String str) {
        this.a = (String) b16.k(str);
    }

    public static ys3 f(char c) {
        return new ys3(String.valueOf(c));
    }

    public static ys3 g(String str) {
        return new ys3(str);
    }

    public Appendable a(Appendable appendable, Iterator it2) {
        b16.k(appendable);
        if (it2.hasNext()) {
            appendable.append(h(it2.next()));
            while (it2.hasNext()) {
                appendable.append(this.a);
                appendable.append(h(it2.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder b(StringBuilder sb, Iterable iterable) {
        return c(sb, iterable.iterator());
    }

    public final StringBuilder c(StringBuilder sb, Iterator it2) {
        try {
            a(sb, it2);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String d(Iterable iterable) {
        return e(iterable.iterator());
    }

    public final String e(Iterator it2) {
        return c(new StringBuilder(), it2).toString();
    }

    CharSequence h(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }
}
