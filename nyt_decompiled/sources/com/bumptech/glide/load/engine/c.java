package com.bumptech.glide.load.engine;

import defpackage.ov3;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class c implements ov3 {
    private final ov3 b;
    private final ov3 c;

    c(ov3 ov3Var, ov3 ov3Var2) {
        this.b = ov3Var;
        this.c = ov3Var2;
    }

    @Override // defpackage.ov3
    public void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.ov3
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.b.equals(cVar.b) && this.c.equals(cVar.c);
    }

    @Override // defpackage.ov3
    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
