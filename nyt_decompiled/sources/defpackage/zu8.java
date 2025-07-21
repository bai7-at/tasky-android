package defpackage;

import androidx.compose.ui.text.j;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class zu8 {
    private final j a;
    private final j b;
    private final j c;
    private final j d;
    private final j e;
    private final j f;
    private final j g;
    private final j h;
    private final j i;
    private final j j;
    private final j k;
    private final j l;
    private final j m;
    private final j n;
    private final j o;

    public zu8(j jVar, j jVar2, j jVar3, j jVar4, j jVar5, j jVar6, j jVar7, j jVar8, j jVar9, j jVar10, j jVar11, j jVar12, j jVar13, j jVar14, j jVar15) {
        this.a = jVar;
        this.b = jVar2;
        this.c = jVar3;
        this.d = jVar4;
        this.e = jVar5;
        this.f = jVar6;
        this.g = jVar7;
        this.h = jVar8;
        this.i = jVar9;
        this.j = jVar10;
        this.k = jVar11;
        this.l = jVar12;
        this.m = jVar13;
        this.n = jVar14;
        this.o = jVar15;
    }

    public final j a() {
        return this.j;
    }

    public final j b() {
        return this.k;
    }

    public final j c() {
        return this.l;
    }

    public final j d() {
        return this.a;
    }

    public final j e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu8)) {
            return false;
        }
        zu8 zu8Var = (zu8) obj;
        return zq3.c(this.a, zu8Var.a) && zq3.c(this.b, zu8Var.b) && zq3.c(this.c, zu8Var.c) && zq3.c(this.d, zu8Var.d) && zq3.c(this.e, zu8Var.e) && zq3.c(this.f, zu8Var.f) && zq3.c(this.g, zu8Var.g) && zq3.c(this.h, zu8Var.h) && zq3.c(this.i, zu8Var.i) && zq3.c(this.j, zu8Var.j) && zq3.c(this.k, zu8Var.k) && zq3.c(this.l, zu8Var.l) && zq3.c(this.m, zu8Var.m) && zq3.c(this.n, zu8Var.n) && zq3.c(this.o, zu8Var.o);
    }

    public final j f() {
        return this.c;
    }

    public final j g() {
        return this.d;
    }

    public final j h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    public final j i() {
        return this.f;
    }

    public final j j() {
        return this.m;
    }

    public final j k() {
        return this.n;
    }

    public final j l() {
        return this.o;
    }

    public final j m() {
        return this.g;
    }

    public final j n() {
        return this.h;
    }

    public final j o() {
        return this.i;
    }

    public String toString() {
        return "Typography(displayLarge=" + this.a + ", displayMedium=" + this.b + ",displaySmall=" + this.c + ", headlineLarge=" + this.d + ", headlineMedium=" + this.e + ", headlineSmall=" + this.f + ", titleLarge=" + this.g + ", titleMedium=" + this.h + ", titleSmall=" + this.i + ", bodyLarge=" + this.j + ", bodyMedium=" + this.k + ", bodySmall=" + this.l + ", labelLarge=" + this.m + ", labelMedium=" + this.n + ", labelSmall=" + this.o + ')';
    }

    public /* synthetic */ zu8(j jVar, j jVar2, j jVar3, j jVar4, j jVar5, j jVar6, j jVar7, j jVar8, j jVar9, j jVar10, j jVar11, j jVar12, j jVar13, j jVar14, j jVar15, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? cv8.a.d() : jVar, (i & 2) != 0 ? cv8.a.e() : jVar2, (i & 4) != 0 ? cv8.a.f() : jVar3, (i & 8) != 0 ? cv8.a.g() : jVar4, (i & 16) != 0 ? cv8.a.h() : jVar5, (i & 32) != 0 ? cv8.a.i() : jVar6, (i & 64) != 0 ? cv8.a.m() : jVar7, (i & 128) != 0 ? cv8.a.n() : jVar8, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? cv8.a.o() : jVar9, (i & 512) != 0 ? cv8.a.a() : jVar10, (i & 1024) != 0 ? cv8.a.b() : jVar11, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? cv8.a.c() : jVar12, (i & ProgressEvent.PART_FAILED_EVENT_CODE) != 0 ? cv8.a.j() : jVar13, (i & 8192) != 0 ? cv8.a.k() : jVar14, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? cv8.a.l() : jVar15);
    }
}
