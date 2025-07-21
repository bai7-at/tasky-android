package defpackage;

import com.nytimes.android.subauth.core.purchase.network.response.LinkResponse;
import com.nytimes.android.subauth.core.purchase.network.response.LinkResponseData;
import defpackage.d54;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class n54 {

    public static final class a extends n54 {
        private final l54 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l54 l54Var) {
            super(null);
            zq3.h(l54Var, "linkingError");
            this.a = l54Var;
        }

        public final l54 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && zq3.c(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "Error(linkingError=" + this.a + ")";
        }
    }

    public static final class b extends n54 {
        private final LinkResponse a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LinkResponse linkResponse) {
            super(null);
            zq3.h(linkResponse, "response");
            this.a = linkResponse;
        }

        public final LinkResponse b() {
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

    public /* synthetic */ n54(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final d54 a() {
        if (this instanceof b) {
            b bVar = (b) this;
            LinkResponseData a2 = bVar.b().a();
            String a3 = a2 != null ? a2.a() : null;
            return (a3 == null || a3.length() == 0) ? new d54.c(bVar.b().b()) : d54.d.b;
        }
        if (!(this instanceof a)) {
            throw new NoWhenBranchMatchedException();
        }
        a aVar = (a) this;
        String a4 = aVar.b().a();
        return aVar.b().b() instanceof IOException ? new d54.e(a4) : new d54.c(a4);
    }

    private n54() {
    }
}
