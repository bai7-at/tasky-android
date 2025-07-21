package androidx.compose.foundation;

import defpackage.nn0;
import defpackage.no7;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.yc0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class BackgroundElement extends ov4 {
    private final long b;
    private final yc0 c;
    private final float d;
    private final no7 e;
    private final ss2 f;

    public /* synthetic */ BackgroundElement(long j, yc0 yc0Var, float f, no7 no7Var, ss2 ss2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, yc0Var, f, no7Var, ss2Var);
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && nn0.t(this.b, backgroundElement.b) && zq3.c(this.c, backgroundElement.c) && this.d == backgroundElement.d && zq3.c(this.e, backgroundElement.e);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int z = nn0.z(this.b) * 31;
        yc0 yc0Var = this.c;
        return ((((z + (yc0Var != null ? yc0Var.hashCode() : 0)) * 31) + Float.hashCode(this.d)) * 31) + this.e.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public a l() {
        return new a(this.b, this.c, this.d, this.e, null);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(a aVar) {
        aVar.h2(this.b);
        aVar.g2(this.c);
        aVar.c(this.d);
        aVar.e1(this.e);
    }

    public /* synthetic */ BackgroundElement(long j, yc0 yc0Var, float f, no7 no7Var, ss2 ss2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nn0.b.g() : j, (i & 2) != 0 ? null : yc0Var, f, no7Var, ss2Var, null);
    }

    private BackgroundElement(long j, yc0 yc0Var, float f, no7 no7Var, ss2 ss2Var) {
        this.b = j;
        this.c = yc0Var;
        this.d = f;
        this.e = no7Var;
        this.f = ss2Var;
    }
}
