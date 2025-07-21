package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public abstract class t7g {
    public int a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final i8g e() {
        if (this instanceof i8g) {
            return (i8g) this;
        }
        toString();
        throw new IllegalStateException("Not a JSON Object: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            gt9 gt9Var = new gt9(stringWriter);
            gt9Var.s(true);
            ys9.V.b(gt9Var, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
