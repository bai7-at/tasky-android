package androidx.compose.ui.graphics;

import defpackage.ov4;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
final class BlockGraphicsLayerElement extends ov4 {
    private final ss2 b;

    public BlockGraphicsLayerElement(ss2 ss2Var) {
        this.b = ss2Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockGraphicsLayerElement) && zq3.c(this.b, ((BlockGraphicsLayerElement) obj).b);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public BlockGraphicsLayerModifier l() {
        return new BlockGraphicsLayerModifier(this.b);
    }

    public String toString() {
        return "BlockGraphicsLayerElement(block=" + this.b + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
        blockGraphicsLayerModifier.g2(this.b);
        blockGraphicsLayerModifier.f2();
    }
}
