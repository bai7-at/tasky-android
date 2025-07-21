package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class rj0 implements Iterable, yu3 {
    public static final a d = new a(null);
    private final char a;
    private final char b;
    private final int c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public rj0(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = c;
        this.b = (char) y46.c(c, c2, i);
        this.c = i;
    }

    public final char g() {
        return this.a;
    }

    public final char j() {
        return this.b;
    }

    @Override // java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public oj0 iterator() {
        return new sj0(this.a, this.b, this.c);
    }
}
