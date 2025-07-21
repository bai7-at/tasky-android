package defpackage;

import com.dropbox.android.external.store4.ResponseOrigin;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class b38 {

    public static final class a extends b38 {
        private final Object a;
        private final ResponseOrigin b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, ResponseOrigin responseOrigin) {
            super(null);
            zq3.h(responseOrigin, "origin");
            this.a = obj;
            this.b = responseOrigin;
        }

        @Override // defpackage.b38
        public ResponseOrigin b() {
            return this.b;
        }

        public final Object e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && b() == aVar.b();
        }

        public int hashCode() {
            Object obj = this.a;
            return ((obj == null ? 0 : obj.hashCode()) * 31) + b().hashCode();
        }

        public String toString() {
            return "Data(value=" + this.a + ", origin=" + b() + ')';
        }
    }

    public static abstract class b extends b38 {

        public static final class a extends b {
            private final Throwable a;
            private final ResponseOrigin b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th, ResponseOrigin responseOrigin) {
                super(null);
                zq3.h(th, "error");
                zq3.h(responseOrigin, "origin");
                this.a = th;
                this.b = responseOrigin;
            }

            @Override // defpackage.b38
            public ResponseOrigin b() {
                return this.b;
            }

            public final Throwable e() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return zq3.c(this.a, aVar.a) && b() == aVar.b();
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + b().hashCode();
            }

            public String toString() {
                return "Exception(error=" + this.a + ", origin=" + b() + ')';
            }
        }

        /* renamed from: b38$b$b, reason: collision with other inner class name */
        public static final class C0127b extends b {
            public abstract String e();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
            super(null);
        }
    }

    public static final class c extends b38 {
        private final ResponseOrigin a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ResponseOrigin responseOrigin) {
            super(null);
            zq3.h(responseOrigin, "origin");
            this.a = responseOrigin;
        }

        @Override // defpackage.b38
        public ResponseOrigin b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && b() == ((c) obj).b();
        }

        public int hashCode() {
            return b().hashCode();
        }

        public String toString() {
            return "Loading(origin=" + b() + ')';
        }
    }

    public static final class d extends b38 {
        private final ResponseOrigin a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ResponseOrigin responseOrigin) {
            super(null);
            zq3.h(responseOrigin, "origin");
            this.a = responseOrigin;
        }

        @Override // defpackage.b38
        public ResponseOrigin b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && b() == ((d) obj).b();
        }

        public int hashCode() {
            return b().hashCode();
        }

        public String toString() {
            return "NoNewData(origin=" + b() + ')';
        }
    }

    public /* synthetic */ b38(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Object a() {
        if (this instanceof a) {
            return ((a) this).e();
        }
        return null;
    }

    public abstract ResponseOrigin b();

    public final Object c() {
        if (this instanceof a) {
            return ((a) this).e();
        }
        if (!(this instanceof b)) {
            throw new NullPointerException(zq3.q("there is no data in ", this));
        }
        c38.a((b) this);
        throw new KotlinNothingValueException();
    }

    public final b38 d() {
        if ((this instanceof b) || (this instanceof c) || (this instanceof d)) {
            return this;
        }
        if (this instanceof a) {
            throw new RuntimeException("cannot swap type for StoreResponse.Data");
        }
        throw new NoWhenBranchMatchedException();
    }

    private b38() {
    }
}
