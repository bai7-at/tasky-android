package kotlin.time;

import defpackage.c04;
import defpackage.im8;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.a;

/* loaded from: classes5.dex */
public abstract class AbstractLongTimeSource implements im8 {
    private final DurationUnit unit;
    private final c04 zero$delegate;

    private static final class a implements kotlin.time.a {
        private final long a;
        private final AbstractLongTimeSource b;
        private final long c;

        public /* synthetic */ a(long j, AbstractLongTimeSource abstractLongTimeSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(kotlin.time.a aVar) {
            return a.C0498a.a(this, aVar);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && zq3.c(this.b, ((a) obj).b) && b.l(h((kotlin.time.a) obj), b.b.d());
        }

        @Override // kotlin.time.a
        public long h(kotlin.time.a aVar) {
            zq3.h(aVar, "other");
            if (aVar instanceof a) {
                a aVar2 = (a) aVar;
                if (zq3.c(this.b, aVar2.b)) {
                    return b.I(f.c(this.a, aVar2.a, this.b.getUnit()), b.H(this.c, aVar2.c));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + aVar);
        }

        public int hashCode() {
            return (b.A(this.c) * 37) + Long.hashCode(this.a);
        }

        public String toString() {
            return "LongTimeMark(" + this.a + e.f(this.b.getUnit()) + " + " + ((Object) b.L(this.c)) + ", " + this.b + ')';
        }

        private a(long j, AbstractLongTimeSource abstractLongTimeSource, long j2) {
            zq3.h(abstractLongTimeSource, "timeSource");
            this.a = j;
            this.b = abstractLongTimeSource;
            this.c = j2;
        }
    }

    public AbstractLongTimeSource(DurationUnit durationUnit) {
        zq3.h(durationUnit, "unit");
        this.unit = durationUnit;
        this.zero$delegate = kotlin.c.a(new qs2() { // from class: kotlin.time.AbstractLongTimeSource$zero$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Long mo865invoke() {
                return Long.valueOf(AbstractLongTimeSource.this.read());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long a() {
        return read() - b();
    }

    private final long b() {
        return ((Number) this.zero$delegate.getValue()).longValue();
    }

    protected final DurationUnit getUnit() {
        return this.unit;
    }

    protected abstract long read();

    /* renamed from: markNow, reason: merged with bridge method [inline-methods] */
    public kotlin.time.a m870markNow() {
        return new a(a(), this, b.b.d(), null);
    }
}
