package defpackage;

/* loaded from: classes3.dex */
final class gee extends bfe {
    private int a;
    private String b;
    private byte c;

    gee() {
    }

    @Override // defpackage.bfe
    public final bfe a(String str) {
        this.b = str;
        return this;
    }

    @Override // defpackage.bfe
    public final bfe b(int i) {
        this.a = i;
        this.c = (byte) 1;
        return this;
    }

    @Override // defpackage.bfe
    public final cfe c() {
        if (this.c == 1) {
            return new iee(this.a, this.b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
