package androidx.constraintlayout.compose;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.ss2;
import defpackage.u08;
import defpackage.zq3;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    private int b;
    private final List a = new ArrayList();
    private final int c = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;
    private int d = NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT;

    public static final class a {
        private final Object a;

        public a(Object obj) {
            zq3.h(obj, "id");
            this.a = obj;
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
            return "BaselineAnchor(id=" + this.a + ')';
        }
    }

    public static final class b {
        private final Object a;
        private final int b;

        public b(Object obj, int i) {
            zq3.h(obj, "id");
            this.a = obj;
            this.b = i;
        }

        public final Object a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return zq3.c(this.a, bVar.a) && this.b == bVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "HorizontalAnchor(id=" + this.a + ", index=" + this.b + ')';
        }
    }

    /* renamed from: androidx.constraintlayout.compose.c$c, reason: collision with other inner class name */
    public static final class C0069c {
        private final Object a;
        private final int b;

        public C0069c(Object obj, int i) {
            zq3.h(obj, "id");
            this.a = obj;
            this.b = i;
        }

        public final Object a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0069c)) {
                return false;
            }
            C0069c c0069c = (C0069c) obj;
            return zq3.c(this.a, c0069c.a) && this.b == c0069c.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Integer.hashCode(this.b);
        }

        public String toString() {
            return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ')';
        }
    }

    public final void a(u08 u08Var) {
        zq3.h(u08Var, TransferTable.COLUMN_STATE);
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            ((ss2) it2.next()).invoke(u08Var);
        }
    }

    public final int b() {
        return this.b;
    }

    public void c() {
        this.a.clear();
        this.d = this.c;
        this.b = 0;
    }
}
