package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
final class vue {
    private final Class a;
    private final tze b;

    /* synthetic */ vue(Class cls, tze tzeVar, uue uueVar) {
        this.a = cls;
        this.b = tzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vue)) {
            return false;
        }
        vue vueVar = (vue) obj;
        return vueVar.a.equals(this.a) && vueVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        tze tzeVar = this.b;
        return this.a.getSimpleName() + ", object identifier: " + String.valueOf(tzeVar);
    }
}
