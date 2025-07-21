package defpackage;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class yuc {
    private final Map a = new ConcurrentHashMap();
    final /* synthetic */ zuc b;

    yuc(zuc zucVar) {
        this.b = zucVar;
    }

    static /* bridge */ /* synthetic */ yuc a(yuc yucVar) {
        yucVar.a.putAll(yucVar.b.c);
        return yucVar;
    }

    public final yuc b(String str, String str2) {
        this.a.put(str, str2);
        return this;
    }

    public final yuc c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.a.put(str, str2);
        }
        return this;
    }

    public final yuc d(v0e v0eVar) {
        this.a.put("aai", v0eVar.x);
        if (((Boolean) pla.c().a(mpa.a7)).booleanValue()) {
            c("rid", v0eVar.o0);
        }
        return this;
    }

    public final yuc e(y0e y0eVar) {
        this.a.put("gqi", y0eVar.b);
        return this;
    }

    public final String f() {
        return this.b.a.b(this.a);
    }

    public final void g() {
        this.b.b.execute(new Runnable() { // from class: wuc
            @Override // java.lang.Runnable
            public final void run() {
                yuc.this.i();
            }
        });
    }

    public final void h() {
        this.b.b.execute(new Runnable() { // from class: xuc
            @Override // java.lang.Runnable
            public final void run() {
                yuc.this.j();
            }
        });
    }

    final /* synthetic */ void i() {
        this.b.a.f(this.a);
    }

    final /* synthetic */ void j() {
        this.b.a.e(this.a);
    }
}
