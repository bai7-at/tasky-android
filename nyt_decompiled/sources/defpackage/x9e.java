package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class x9e {
    private final y8e a;
    private final ArrayList b;

    public x9e(y8e y8eVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = y8eVar;
        arrayList.add(str);
    }

    public final y8e a() {
        return this.a;
    }

    public final ArrayList b() {
        return this.b;
    }

    public final void c(String str) {
        this.b.add(str);
    }
}
