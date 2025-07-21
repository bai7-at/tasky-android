package defpackage;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.a;
import defpackage.p50;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bt8 implements tv0, p50.b {
    private final String a;
    private final boolean b;
    private final List c = new ArrayList();
    private final ShapeTrimPath.Type d;
    private final p50 e;
    private final p50 f;
    private final p50 g;

    public bt8(a aVar, ShapeTrimPath shapeTrimPath) {
        this.a = shapeTrimPath.c();
        this.b = shapeTrimPath.g();
        this.d = shapeTrimPath.f();
        p50 a = shapeTrimPath.e().a();
        this.e = a;
        p50 a2 = shapeTrimPath.b().a();
        this.f = a2;
        p50 a3 = shapeTrimPath.d().a();
        this.g = a3;
        aVar.i(a);
        aVar.i(a2);
        aVar.i(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // p50.b
    public void a() {
        for (int i = 0; i < this.c.size(); i++) {
            ((p50.b) this.c.get(i)).a();
        }
    }

    @Override // defpackage.tv0
    public void b(List list, List list2) {
    }

    void e(p50.b bVar) {
        this.c.add(bVar);
    }

    public p50 f() {
        return this.f;
    }

    public p50 g() {
        return this.g;
    }

    public p50 i() {
        return this.e;
    }

    ShapeTrimPath.Type j() {
        return this.d;
    }

    public boolean k() {
        return this.b;
    }
}
