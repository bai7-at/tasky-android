package defpackage;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class b59 {

    public static final class a extends b59 {
        private final String a;
        private final boolean b;

        public /* synthetic */ a(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? false : z);
        }

        public final String a() {
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
            return zq3.c(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            String str = this.a;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.b);
        }

        public String toString() {
            return "Error(errorMessage=" + this.a + ", isNetworkConnectivityError=" + this.b + ")";
        }

        public a(String str, boolean z) {
            super(null);
            this.a = str;
            this.b = z;
        }
    }

    public static final class b extends b59 {
        public static final b a = new b();

        private b() {
            super(null);
        }
    }

    public static final class c extends b59 {
        private final Set a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Set set) {
            super(null);
            zq3.h(set, "entitlements");
            this.a = set;
        }

        public final Set a() {
            return this.a;
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
            return "Success(entitlements=" + this.a + ")";
        }
    }

    public static final class d extends b59 {
        public static final d a = new d();

        private d() {
            super(null);
        }
    }

    public /* synthetic */ b59(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private b59() {
    }
}
