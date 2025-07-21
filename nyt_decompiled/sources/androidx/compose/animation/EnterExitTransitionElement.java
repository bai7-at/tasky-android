package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import defpackage.n23;
import defpackage.ov4;
import defpackage.zq3;

/* loaded from: classes.dex */
final class EnterExitTransitionElement extends ov4 {
    private final Transition b;
    private Transition.a c;
    private Transition.a d;
    private Transition.a e;
    private c f;
    private e g;
    private n23 h;

    public EnterExitTransitionElement(Transition transition, Transition.a aVar, Transition.a aVar2, Transition.a aVar3, c cVar, e eVar, n23 n23Var) {
        this.b = transition;
        this.c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = cVar;
        this.g = eVar;
        this.h = n23Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return zq3.c(this.b, enterExitTransitionElement.b) && zq3.c(this.c, enterExitTransitionElement.c) && zq3.c(this.d, enterExitTransitionElement.d) && zq3.c(this.e, enterExitTransitionElement.e) && zq3.c(this.f, enterExitTransitionElement.f) && zq3.c(this.g, enterExitTransitionElement.g) && zq3.c(this.h, enterExitTransitionElement.h);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Transition.a aVar = this.c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Transition.a aVar2 = this.d;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Transition.a aVar3 = this.e;
        return ((((((hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public EnterExitTransitionModifierNode l() {
        return new EnterExitTransitionModifierNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.b + ", sizeAnimation=" + this.c + ", offsetAnimation=" + this.d + ", slideAnimation=" + this.e + ", enter=" + this.f + ", exit=" + this.g + ", graphicsLayerBlock=" + this.h + ')';
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(EnterExitTransitionModifierNode enterExitTransitionModifierNode) {
        enterExitTransitionModifierNode.o2(this.b);
        enterExitTransitionModifierNode.m2(this.c);
        enterExitTransitionModifierNode.l2(this.d);
        enterExitTransitionModifierNode.n2(this.e);
        enterExitTransitionModifierNode.h2(this.f);
        enterExitTransitionModifierNode.i2(this.g);
        enterExitTransitionModifierNode.j2(this.h);
    }
}
