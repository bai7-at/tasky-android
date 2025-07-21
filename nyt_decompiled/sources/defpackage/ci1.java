package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ci1 implements yr3 {
    private String a;
    private Long b;
    private Map c;
    private String d;

    @Override // defpackage.yr3
    public void b(String str) {
        this.a = str;
    }

    @Override // defpackage.yr3
    public void clear() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.yr3
    public String d() {
        return this.d;
    }

    @Override // defpackage.yr3
    public String f() {
        return this.a;
    }

    @Override // defpackage.yr3
    public void g(Map map) {
        this.c = map;
    }

    @Override // defpackage.yr3
    public void h(Long l) {
        this.b = l;
    }

    @Override // defpackage.yr3
    public Map i() {
        return this.c;
    }
}
