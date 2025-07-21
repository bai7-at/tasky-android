package com.bumptech.glide.load.engine;

import defpackage.ov3;
import defpackage.sk5;
import defpackage.z06;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes2.dex */
class k implements ov3 {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final ov3 g;
    private final Map h;
    private final sk5 i;
    private int j;

    k(Object obj, ov3 ov3Var, int i, int i2, Map map, Class cls, Class cls2, sk5 sk5Var) {
        this.b = z06.d(obj);
        this.g = (ov3) z06.e(ov3Var, "Signature must not be null");
        this.c = i;
        this.d = i2;
        this.h = (Map) z06.d(map);
        this.e = (Class) z06.e(cls, "Resource class must not be null");
        this.f = (Class) z06.e(cls2, "Transcode class must not be null");
        this.i = (sk5) z06.d(sk5Var);
    }

    @Override // defpackage.ov3
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ov3
    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.b.equals(kVar.b) && this.g.equals(kVar.g) && this.d == kVar.d && this.c == kVar.c && this.h.equals(kVar.h) && this.e.equals(kVar.e) && this.f.equals(kVar.f) && this.i.equals(kVar.i);
    }

    @Override // defpackage.ov3
    public int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
            this.j = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.h.hashCode();
            this.j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
            this.j = hashCode5;
            this.j = (hashCode5 * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
