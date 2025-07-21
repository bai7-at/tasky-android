package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    private final Modifier b;
    private final Modifier c;

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.b = modifier;
        this.c = modifier2;
    }

    @Override // androidx.compose.ui.Modifier
    public boolean a(ss2 ss2Var) {
        return this.b.a(ss2Var) && this.c.a(ss2Var);
    }

    @Override // androidx.compose.ui.Modifier
    public Object b(Object obj, gt2 gt2Var) {
        return this.c.b(this.b.b(obj, gt2Var), gt2Var);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (zq3.c(this.b, combinedModifier.b) && zq3.c(this.c, combinedModifier.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.c.hashCode() * 31);
    }

    public final Modifier l() {
        return this.c;
    }

    public final Modifier r() {
        return this.b;
    }

    public String toString() {
        return '[' + ((String) b("", new gt2() { // from class: androidx.compose.ui.CombinedModifier$toString$1
            @Override // defpackage.gt2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke(String str, Modifier.b bVar) {
                if (str.length() == 0) {
                    return bVar.toString();
                }
                return str + ", " + bVar;
            }
        })) + ']';
    }
}
