package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class xxe {
    private final pxe a;
    private final List b;
    private final Integer c;

    /* synthetic */ xxe(pxe pxeVar, List list, Integer num, wxe wxeVar) {
        this.a = pxeVar;
        this.b = list;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xxe)) {
            return false;
        }
        xxe xxeVar = (xxe) obj;
        return this.a.equals(xxeVar.a) && this.b.equals(xxeVar.b) && Objects.equals(this.c, xxeVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
}
