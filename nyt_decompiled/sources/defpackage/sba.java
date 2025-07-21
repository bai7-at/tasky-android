package defpackage;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class sba {
    private final int a;
    private final List b;
    private final int c;
    private final InputStream d;

    public sba(int i, List list, int i2, InputStream inputStream) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    public final InputStream c() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List d() {
        return Collections.unmodifiableList(this.b);
    }
}
