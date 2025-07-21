package defpackage;

import com.comscore.streaming.ContentFeedType;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class eu8 implements sw1 {
    private final int a;
    private final int b;
    private final vx1 c;

    public eu8(int i, int i2, vx1 vx1Var) {
        this.a = i;
        this.b = i2;
        this.c = vx1Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof eu8)) {
            return false;
        }
        eu8 eu8Var = (eu8) obj;
        return eu8Var.a == this.a && eu8Var.b == this.b && zq3.c(eu8Var.c, this.c);
    }

    @Override // defpackage.sw1, defpackage.ci
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public t49 a(hu8 hu8Var) {
        return new t49(this.a, this.b, this.c);
    }

    public int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public /* synthetic */ eu8(int i, int i2, vx1 vx1Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? ContentFeedType.OTHER : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? xx1.c() : vx1Var);
    }
}
