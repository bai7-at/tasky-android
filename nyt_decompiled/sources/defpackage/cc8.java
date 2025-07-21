package defpackage;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;

/* loaded from: classes.dex */
public final class cc8 extends xg3 {
    private final Drawable a;
    private final vg3 b;
    private final DataSource c;
    private final MemoryCache.Key d;
    private final String e;
    private final boolean f;
    private final boolean g;

    public cc8(Drawable drawable, vg3 vg3Var, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2) {
        super(null);
        this.a = drawable;
        this.b = vg3Var;
        this.c = dataSource;
        this.d = key;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.xg3
    public Drawable a() {
        return this.a;
    }

    @Override // defpackage.xg3
    public vg3 b() {
        return this.b;
    }

    public final DataSource c() {
        return this.c;
    }

    public final boolean d() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cc8) {
            cc8 cc8Var = (cc8) obj;
            if (zq3.c(a(), cc8Var.a()) && zq3.c(b(), cc8Var.b()) && this.c == cc8Var.c && zq3.c(this.d, cc8Var.d) && zq3.c(this.e, cc8Var.e) && this.f == cc8Var.f && this.g == cc8Var.g) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.c.hashCode()) * 31;
        MemoryCache.Key key = this.d;
        int hashCode2 = (hashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.e;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.f)) * 31) + Boolean.hashCode(this.g);
    }
}
