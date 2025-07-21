package androidx.compose.ui.draw;

import defpackage.fg0;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class DrawWithCacheElement extends ov4 {
    private final ss2 b;

    public DrawWithCacheElement(ss2 ss2Var) {
        this.b = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && zq3.c(this.b, ((DrawWithCacheElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public CacheDrawModifierNodeImpl l() {
        return new CacheDrawModifierNodeImpl(new fg0(), this.b);
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.b + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl) {
        cacheDrawModifierNodeImpl.g2(this.b);
    }
}
