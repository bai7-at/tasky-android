package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.dropbox.android.external.store4.CacheType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class a38 {
    public static final a d = new a(null);
    private static final int e;
    private final Object a;
    private final int b;
    private final boolean c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a38 a(Object obj, boolean z) {
            return new a38(obj, 0, z, null);
        }

        public final a38 b(Object obj) {
            return new a38(obj, a38.e, true, null);
        }

        private a() {
        }
    }

    static {
        int i = 0;
        for (CacheType cacheType : CacheType.values()) {
            i |= cacheType.getFlag$store();
        }
        e = i;
    }

    public /* synthetic */ a38(Object obj, int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, i, z);
    }

    public final Object b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d(CacheType cacheType) {
        zq3.h(cacheType, TransferTable.COLUMN_TYPE);
        return (this.b & cacheType.getFlag$store()) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a38)) {
            return false;
        }
        a38 a38Var = (a38) obj;
        return zq3.c(this.a, a38Var.a) && this.b == a38Var.b && this.c == a38Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Object obj = this.a;
        int hashCode = (((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.b)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        return "StoreRequest(key=" + this.a + ", skippedCaches=" + this.b + ", refresh=" + this.c + ')';
    }

    private a38(Object obj, int i, boolean z) {
        this.a = obj;
        this.b = i;
        this.c = z;
    }
}
