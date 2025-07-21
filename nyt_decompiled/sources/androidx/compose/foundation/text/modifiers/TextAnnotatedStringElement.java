package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import defpackage.do0;
import defpackage.kj8;
import defpackage.ov4;
import defpackage.ss2;
import defpackage.ui7;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends ov4 {
    private final a b;
    private final j c;
    private final e.b d;
    private final ss2 e;
    private final int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final List j;
    private final ss2 k;
    private final ui7 l;
    private final do0 m;

    public /* synthetic */ TextAnnotatedStringElement(a aVar, j jVar, e.b bVar, ss2 ss2Var, int i, boolean z, int i2, int i3, List list, ss2 ss2Var2, ui7 ui7Var, do0 do0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, jVar, bVar, ss2Var, i, z, i2, i3, list, ss2Var2, ui7Var, do0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return zq3.c(this.m, textAnnotatedStringElement.m) && zq3.c(this.b, textAnnotatedStringElement.b) && zq3.c(this.c, textAnnotatedStringElement.c) && zq3.c(this.j, textAnnotatedStringElement.j) && zq3.c(this.d, textAnnotatedStringElement.d) && zq3.c(this.e, textAnnotatedStringElement.e) && kj8.e(this.f, textAnnotatedStringElement.f) && this.g == textAnnotatedStringElement.g && this.h == textAnnotatedStringElement.h && this.i == textAnnotatedStringElement.i && zq3.c(this.k, textAnnotatedStringElement.k) && zq3.c(this.l, textAnnotatedStringElement.l);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        ss2 ss2Var = this.e;
        int hashCode2 = (((((((((hashCode + (ss2Var != null ? ss2Var.hashCode() : 0)) * 31) + kj8.f(this.f)) * 31) + Boolean.hashCode(this.g)) * 31) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        ss2 ss2Var2 = this.k;
        int hashCode4 = (((hashCode3 + (ss2Var2 != null ? ss2Var2.hashCode() : 0)) * 31) + 0) * 31;
        do0 do0Var = this.m;
        return hashCode4 + (do0Var != null ? do0Var.hashCode() : 0);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public TextAnnotatedStringNode l() {
        return new TextAnnotatedStringNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.l2(textAnnotatedStringNode.y2(this.m, this.c), textAnnotatedStringNode.A2(this.b), textAnnotatedStringNode.z2(this.c, this.j, this.i, this.h, this.g, this.d, this.f), textAnnotatedStringNode.x2(this.e, this.k, this.l));
    }

    private TextAnnotatedStringElement(a aVar, j jVar, e.b bVar, ss2 ss2Var, int i, boolean z, int i2, int i3, List list, ss2 ss2Var2, ui7 ui7Var, do0 do0Var) {
        this.b = aVar;
        this.c = jVar;
        this.d = bVar;
        this.e = ss2Var;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = ss2Var2;
        this.m = do0Var;
    }
}
