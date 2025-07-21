package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.font.e;
import androidx.compose.ui.text.j;
import defpackage.do0;
import defpackage.kj8;
import defpackage.ov4;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class TextStringSimpleElement extends ov4 {
    private final String b;
    private final j c;
    private final e.b d;
    private final int e;
    private final boolean f;
    private final int g;
    private final int h;
    private final do0 i;

    public /* synthetic */ TextStringSimpleElement(String str, j jVar, e.b bVar, int i, boolean z, int i2, int i3, do0 do0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jVar, bVar, i, z, i2, i3, do0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return zq3.c(this.i, textStringSimpleElement.i) && zq3.c(this.b, textStringSimpleElement.b) && zq3.c(this.c, textStringSimpleElement.c) && zq3.c(this.d, textStringSimpleElement.d) && kj8.e(this.e, textStringSimpleElement.e) && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        int hashCode = ((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + kj8.f(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + this.g) * 31) + this.h) * 31;
        do0 do0Var = this.i;
        return hashCode + (do0Var != null ? do0Var.hashCode() : 0);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public TextStringSimpleNode l() {
        return new TextStringSimpleNode(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(TextStringSimpleNode textStringSimpleNode) {
        textStringSimpleNode.l2(textStringSimpleNode.r2(this.i, this.c), textStringSimpleNode.t2(this.b), textStringSimpleNode.s2(this.c, this.h, this.g, this.f, this.d, this.e));
    }

    private TextStringSimpleElement(String str, j jVar, e.b bVar, int i, boolean z, int i2, int i3, do0 do0Var) {
        this.b = str;
        this.c = jVar;
        this.d = bVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = do0Var;
    }
}
