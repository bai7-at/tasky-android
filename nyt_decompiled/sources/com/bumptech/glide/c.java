package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.a;
import com.bumptech.glide.load.engine.h;
import defpackage.gh3;
import defpackage.py6;
import defpackage.to;
import defpackage.xx2;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class c extends ContextWrapper {
    static final f k = new xx2();
    private final to a;
    private final Registry b;
    private final gh3 c;
    private final a.InterfaceC0146a d;
    private final List e;
    private final Map f;
    private final h g;
    private final boolean h;
    private final int i;
    private py6 j;

    public c(Context context, to toVar, Registry registry, gh3 gh3Var, a.InterfaceC0146a interfaceC0146a, Map map, List list, h hVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.a = toVar;
        this.b = registry;
        this.c = gh3Var;
        this.d = interfaceC0146a;
        this.e = list;
        this.f = map;
        this.g = hVar;
        this.h = z;
        this.i = i;
    }

    public to a() {
        return this.a;
    }

    public List b() {
        return this.e;
    }

    public synchronized py6 c() {
        try {
            if (this.j == null) {
                this.j = (py6) this.d.build().J();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public f d(Class cls) {
        f fVar = (f) this.f.get(cls);
        if (fVar == null) {
            for (Map.Entry entry : this.f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    fVar = (f) entry.getValue();
                }
            }
        }
        return fVar == null ? k : fVar;
    }

    public h e() {
        return this.g;
    }

    public int f() {
        return this.i;
    }

    public Registry g() {
        return this.b;
    }

    public boolean h() {
        return this.h;
    }
}
