package androidx.paging;

import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class d {
    private final boolean a;

    public static final class a extends d {
        private final Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(false, null);
            zq3.h(th, "error");
            this.b = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (a() == aVar.a() && zq3.c(this.b, aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Boolean.hashCode(a()) + this.b.hashCode();
        }

        public String toString() {
            return "Error(endOfPaginationReached=" + a() + ", error=" + this.b + ')';
        }
    }

    public static final class b extends d {
        public static final b b = new b();

        private b() {
            super(false, null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && a() == ((b) obj).a();
        }

        public int hashCode() {
            return Boolean.hashCode(a());
        }

        public String toString() {
            return "Loading(endOfPaginationReached=" + a() + ')';
        }
    }

    public static final class c extends d {
        public static final a b = new a(null);
        private static final c c = new c(true);
        private static final c d = new c(false);

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                return c.c;
            }

            public final c b() {
                return c.d;
            }

            private a() {
            }
        }

        public c(boolean z) {
            super(z, null);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && a() == ((c) obj).a();
        }

        public int hashCode() {
            return Boolean.hashCode(a());
        }

        public String toString() {
            return "NotLoading(endOfPaginationReached=" + a() + ')';
        }
    }

    public /* synthetic */ d(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }

    private d(boolean z) {
        this.a = z;
    }
}
