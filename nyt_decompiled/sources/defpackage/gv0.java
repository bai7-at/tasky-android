package defpackage;

import android.net.NetworkRequest;
import android.net.Uri;
import androidx.work.NetworkType;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class gv0 {
    public static final b j = new b(null);
    public static final gv0 k = new gv0(null, false, false, false, 15, null);
    private final NetworkType a;
    private final t45 b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final long g;
    private final long h;
    private final Set i;

    public static final class a {
        private boolean a;
        private boolean b;
        private boolean e;
        private boolean f;
        private t45 c = new t45(null, 1, null);
        private NetworkType d = NetworkType.NOT_REQUIRED;
        private long g = -1;
        private long h = -1;
        private Set i = new LinkedHashSet();

        public final gv0 a() {
            Set c1 = i.c1(this.i);
            return new gv0(this.c, this.d, this.a, this.b, this.e, this.f, this.g, this.h, c1);
        }

        public final a b(NetworkType networkType) {
            zq3.h(networkType, "networkType");
            this.d = networkType;
            this.c = new t45(null, 1, null);
            return this;
        }

        public final a c(boolean z) {
            this.e = z;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public static final class c {
        private final Uri a;
        private final boolean b;

        public c(Uri uri, boolean z) {
            zq3.h(uri, "uri");
            this.a = uri;
            this.b = z;
        }

        public final Uri a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!zq3.c(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            zq3.f(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return zq3.c(this.a, cVar.a) && this.b == cVar.b;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
        }
    }

    public /* synthetic */ gv0(NetworkType networkType, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    public final long a() {
        return this.h;
    }

    public final long b() {
        return this.g;
    }

    public final Set c() {
        return this.i;
    }

    public final NetworkRequest d() {
        return this.b.b();
    }

    public final t45 e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zq3.c(gv0.class, obj.getClass())) {
            return false;
        }
        gv0 gv0Var = (gv0) obj;
        if (this.c == gv0Var.c && this.d == gv0Var.d && this.e == gv0Var.e && this.f == gv0Var.f && this.g == gv0Var.g && this.h == gv0Var.h && zq3.c(d(), gv0Var.d()) && this.a == gv0Var.a) {
            return zq3.c(this.i, gv0Var.i);
        }
        return false;
    }

    public final NetworkType f() {
        return this.a;
    }

    public final boolean g() {
        return !this.i.isEmpty();
    }

    public final boolean h() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int hashCode2 = (((i + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.i.hashCode()) * 31;
        NetworkRequest d = d();
        return hashCode2 + (d != null ? d.hashCode() : 0);
    }

    public final boolean i() {
        return this.c;
    }

    public final boolean j() {
        return this.d;
    }

    public final boolean k() {
        return this.f;
    }

    public String toString() {
        return "Constraints{requiredNetworkType=" + this.a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gv0(NetworkType networkType, boolean z, boolean z2, boolean z3) {
        this(networkType, z, false, z2, z3);
        zq3.h(networkType, "requiredNetworkType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gv0(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4) {
        this(networkType, z, z2, z3, z4, -1L, 0L, null, 192, null);
        zq3.h(networkType, "requiredNetworkType");
    }

    public /* synthetic */ gv0(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NetworkType.NOT_REQUIRED : networkType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false, (i & 32) != 0 ? -1L : j2, (i & 64) == 0 ? j3 : -1L, (i & 128) != 0 ? b0.e() : set);
    }

    public gv0(NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        zq3.h(networkType, "requiredNetworkType");
        zq3.h(set, "contentUriTriggers");
        this.b = new t45(null, 1, null);
        this.a = networkType;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public gv0(t45 t45Var, NetworkType networkType, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, Set set) {
        zq3.h(t45Var, "requiredNetworkRequestCompat");
        zq3.h(networkType, "requiredNetworkType");
        zq3.h(set, "contentUriTriggers");
        this.b = t45Var;
        this.a = networkType;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = set;
    }

    public gv0(gv0 gv0Var) {
        zq3.h(gv0Var, "other");
        this.c = gv0Var.c;
        this.d = gv0Var.d;
        this.b = gv0Var.b;
        this.a = gv0Var.a;
        this.e = gv0Var.e;
        this.f = gv0Var.f;
        this.i = gv0Var.i;
        this.g = gv0Var.g;
        this.h = gv0Var.h;
    }
}
