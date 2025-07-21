package defpackage;

import com.nytimes.android.subauth.core.auth.network.response.EmailStatusResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class r3 {

    public static final class a extends r3 {
        private final String a;
        private final Throwable b;
        private final boolean c;

        public /* synthetic */ a(String str, Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : th, (i & 4) != 0 ? false : z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && zq3.c(this.b, aVar.b) && this.c == aVar.c;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Throwable th = this.b;
            return ((hashCode + (th == null ? 0 : th.hashCode())) * 31) + Boolean.hashCode(this.c);
        }

        public String toString() {
            return "Error(error=" + this.a + ", throwable=" + this.b + ", isNetworkConnectivityError=" + this.c + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Throwable th, boolean z) {
            super(null);
            zq3.h(str, "error");
            this.a = str;
            this.b = th;
            this.c = z;
        }
    }

    public static final class b extends r3 {
        private final EmailStatusResponse a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EmailStatusResponse emailStatusResponse) {
            super(null);
            zq3.h(emailStatusResponse, "response");
            this.a = emailStatusResponse;
        }

        public final EmailStatusResponse a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && zq3.c(this.a, ((b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Success(response=" + this.a + ")";
        }
    }

    public /* synthetic */ r3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private r3() {
    }
}
