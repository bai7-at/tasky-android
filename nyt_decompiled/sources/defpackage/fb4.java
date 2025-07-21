package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class fb4 implements Iterable, yu3 {
    public static final a d = new a(null);
    private final long a;
    private final long b;
    private final long c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public fb4(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = j;
        this.b = y46.d(j, j2, j3);
        this.c = j3;
    }

    public final long g() {
        return this.a;
    }

    public final long j() {
        return this.b;
    }

    @Override // java.lang.Iterable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public db4 iterator() {
        return new gb4(this.a, this.b, this.c);
    }
}
