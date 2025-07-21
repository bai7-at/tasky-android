package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vs9 {
    private vq9 a;
    private vq9 b;
    private final List c;

    public vs9() {
        this.a = new vq9("", 0L, null);
        this.b = new vq9("", 0L, null);
        this.c = new ArrayList();
    }

    public final vq9 a() {
        return this.a;
    }

    public final vq9 b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        vs9 vs9Var = new vs9(this.a.clone());
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            vs9Var.c.add(((vq9) it2.next()).clone());
        }
        return vs9Var;
    }

    public final void d(vq9 vq9Var) {
        this.a = vq9Var;
        this.b = vq9Var.clone();
        this.c.clear();
    }

    public final void e(String str, long j, Map map) {
        this.c.add(new vq9(str, j, map));
    }

    public final void f(vq9 vq9Var) {
        this.b = vq9Var;
    }

    public vs9(vq9 vq9Var) {
        this.a = vq9Var;
        this.b = vq9Var.clone();
        this.c = new ArrayList();
    }
}
