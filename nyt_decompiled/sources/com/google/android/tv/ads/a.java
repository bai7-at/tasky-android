package com.google.android.tv.ads;

import com.google.android.tv.ads.IconClickFallbackImage;

/* loaded from: classes3.dex */
final class a extends IconClickFallbackImage.a {
    private int a;
    private int b;
    private String c;
    private String d;
    private String e;
    private byte f;

    a() {
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage a() {
        String str;
        String str2;
        String str3;
        if (this.f == 3 && (str = this.c) != null && (str2 = this.d) != null && (str3 = this.e) != null) {
            return new zzd(this.a, this.b, str, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f & 1) == 0) {
            sb.append(" width");
        }
        if ((this.f & 2) == 0) {
            sb.append(" height");
        }
        if (this.c == null) {
            sb.append(" altText");
        }
        if (this.d == null) {
            sb.append(" creativeType");
        }
        if (this.e == null) {
            sb.append(" staticResourceUri");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage.a b(String str) {
        if (str == null) {
            throw new NullPointerException("Null altText");
        }
        this.c = str;
        return this;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage.a c(String str) {
        if (str == null) {
            throw new NullPointerException("Null creativeType");
        }
        this.d = str;
        return this;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage.a d(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
        return this;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage.a e(String str) {
        if (str == null) {
            throw new NullPointerException("Null staticResourceUri");
        }
        this.e = str;
        return this;
    }

    @Override // com.google.android.tv.ads.IconClickFallbackImage.a
    public final IconClickFallbackImage.a f(int i) {
        this.a = i;
        this.f = (byte) (this.f | 1);
        return this;
    }
}
