package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ne2 {
    private final boolean a;
    private final boolean b;
    private final jp5 c;
    private final Long d;
    private final Long e;
    private final Long f;
    private final Long g;
    private final Map h;

    public ne2(boolean z, boolean z2, jp5 jp5Var, Long l, Long l2, Long l3, Long l4, Map map) {
        zq3.h(map, "extras");
        this.a = z;
        this.b = z2;
        this.c = jp5Var;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = t.v(map);
    }

    public final ne2 a(boolean z, boolean z2, jp5 jp5Var, Long l, Long l2, Long l3, Long l4, Map map) {
        zq3.h(map, "extras");
        return new ne2(z, z2, jp5Var, l, l2, l3, l4, map);
    }

    public final Long c() {
        return this.d;
    }

    public final jp5 d() {
        return this.c;
    }

    public final boolean e() {
        return this.b;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        if (this.d != null) {
            arrayList.add("byteCount=" + this.d);
        }
        if (this.e != null) {
            arrayList.add("createdAt=" + this.e);
        }
        if (this.f != null) {
            arrayList.add("lastModifiedAt=" + this.f);
        }
        if (this.g != null) {
            arrayList.add("lastAccessedAt=" + this.g);
        }
        if (!this.h.isEmpty()) {
            arrayList.add("extras=" + this.h);
        }
        return i.u0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    public /* synthetic */ ne2(boolean z, boolean z2, jp5 jp5Var, Long l, Long l2, Long l3, Long l4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : jp5Var, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : l4, (i & 128) != 0 ? t.i() : map);
    }
}
