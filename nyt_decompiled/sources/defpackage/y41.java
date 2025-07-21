package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.threeten.bp.Duration;

/* loaded from: classes4.dex */
public abstract class y41 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends y41 {
        private final Duration a;
        private final Duration b;
        private final long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Duration duration, Duration duration2) {
            super(null);
            zq3.h(duration, "start");
            zq3.h(duration2, "end");
            this.a = duration;
            this.b = duration2;
            this.c = duration2.minus(duration).toMillis();
        }

        public final long a() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && zq3.c(this.b, bVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "Complete(start=" + this.a + ", end=" + this.b + ")";
        }
    }

    public static final class c extends y41 {
        private final Duration a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Duration duration) {
            super(null);
            zq3.h(duration, "start");
            this.a = duration;
        }

        public final b a(Duration duration) {
            zq3.h(duration, "end");
            return new b(this.a, duration);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.a, ((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Incomplete(start=" + this.a + ")";
        }
    }

    public /* synthetic */ y41(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private y41() {
    }
}
