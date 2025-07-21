package com.bumptech.glide.load.engine;

import defpackage.gd4;
import defpackage.ov3;
import defpackage.sk5;
import defpackage.to;
import defpackage.x19;
import defpackage.xq8;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
final class r implements ov3 {
    private static final gd4 j = new gd4(50);
    private final to b;
    private final ov3 c;
    private final ov3 d;
    private final int e;
    private final int f;
    private final Class g;
    private final sk5 h;
    private final xq8 i;

    r(to toVar, ov3 ov3Var, ov3 ov3Var2, int i, int i2, xq8 xq8Var, Class cls, sk5 sk5Var) {
        this.b = toVar;
        this.c = ov3Var;
        this.d = ov3Var2;
        this.e = i;
        this.f = i2;
        this.i = xq8Var;
        this.g = cls;
        this.h = sk5Var;
    }

    private byte[] c() {
        gd4 gd4Var = j;
        byte[] bArr = (byte[]) gd4Var.f(this.g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.g.getName().getBytes(ov3.a);
        gd4Var.j(this.g, bytes);
        return bytes;
    }

    @Override // defpackage.ov3
    public void b(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.b.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        xq8 xq8Var = this.i;
        if (xq8Var != null) {
            xq8Var.b(messageDigest);
        }
        this.h.b(messageDigest);
        messageDigest.update(c());
        this.b.put(bArr);
    }

    @Override // defpackage.ov3
    public boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f == rVar.f && this.e == rVar.e && x19.c(this.i, rVar.i) && this.g.equals(rVar.g) && this.c.equals(rVar.c) && this.d.equals(rVar.d) && this.h.equals(rVar.h);
    }

    @Override // defpackage.ov3
    public int hashCode() {
        int hashCode = (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f;
        xq8 xq8Var = this.i;
        if (xq8Var != null) {
            hashCode = (hashCode * 31) + xq8Var.hashCode();
        }
        return (((hashCode * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
