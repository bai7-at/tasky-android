package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class sb extends d6 {
    private final String c;

    public static final class a extends sb {
        private final String d;

        public a(String str) {
            super(str, null);
            this.d = str;
        }

        @Override // defpackage.d6
        public String a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.d, ((a) obj).d);
        }

        public int hashCode() {
            String str = this.d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AlsRequest(pageType=" + this.d + ")";
        }
    }

    public static final class b extends sb {
        private final String d;
        private final Throwable e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Throwable th) {
            super(str, null);
            zq3.h(th, "error");
            this.d = str;
            this.e = th;
        }

        @Override // defpackage.d6
        public String a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.d, bVar.d) && zq3.c(this.e, bVar.e);
        }

        public int hashCode() {
            String str = this.d;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.e.hashCode();
        }

        public String toString() {
            return "AlsResponseFailed(pageType=" + this.d + ", error=" + this.e + ")";
        }
    }

    public static final class c extends sb {
        private final String d;

        public c(String str) {
            super(str, null);
            this.d = str;
        }

        @Override // defpackage.d6
        public String a() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && zq3.c(this.d, ((c) obj).d);
        }

        public int hashCode() {
            String str = this.d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AlsResponseSuccess(pageType=" + this.d + ")";
        }
    }

    public /* synthetic */ sb(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private sb(String str) {
        super(null, str, null);
        this.c = str;
    }
}
