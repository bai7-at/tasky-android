package com.nytimes.xwords.hybrid.view.error;

import defpackage.bu1;
import defpackage.ek8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
final class c implements a {
    private final long a;
    private final long b;
    private final float c;
    private final float d;
    private final long e;
    private final float f;

    public /* synthetic */ c(long j, long j2, float f, float f2, long j3, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f, f2, j3, f3);
    }

    @Override // com.nytimes.xwords.hybrid.view.error.a
    public float a() {
        return this.f;
    }

    @Override // com.nytimes.xwords.hybrid.view.error.a
    public long b() {
        return this.e;
    }

    @Override // com.nytimes.xwords.hybrid.view.error.a
    public long c() {
        return this.b;
    }

    @Override // com.nytimes.xwords.hybrid.view.error.a
    public float d() {
        return this.c;
    }

    @Override // com.nytimes.xwords.hybrid.view.error.a
    public long e() {
        return this.a;
    }

    @Override // com.nytimes.xwords.hybrid.view.error.a
    public float f() {
        return this.d;
    }

    private c(long j, long j2, float f, float f2, long j3, float f3) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = f2;
        this.e = j3;
        this.f = f3;
    }

    public /* synthetic */ c(long j, long j2, float f, float f2, long j3, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ek8.g(16) : j, (i & 2) != 0 ? ek8.g(20) : j2, (i & 4) != 0 ? bu1.g(32) : f, (i & 8) != 0 ? bu1.g(36) : f2, (i & 16) != 0 ? ek8.g(20) : j3, (i & 32) != 0 ? bu1.g(86) : f3, null);
    }
}
