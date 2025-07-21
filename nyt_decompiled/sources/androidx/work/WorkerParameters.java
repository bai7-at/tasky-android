package androidx.work;

import android.net.Network;
import defpackage.ap2;
import defpackage.rg8;
import defpackage.sk9;
import defpackage.x46;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class WorkerParameters {
    private UUID a;
    private Data b;
    private Set c;
    private a d;
    private int e;
    private Executor f;
    private CoroutineContext g;
    private rg8 h;
    private sk9 i;
    private x46 j;
    private ap2 k;
    private int l;

    public static class a {
        public List a = Collections.emptyList();
        public List b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, Data data, Collection collection, a aVar, int i, int i2, Executor executor, CoroutineContext coroutineContext, rg8 rg8Var, sk9 sk9Var, x46 x46Var, ap2 ap2Var) {
        this.a = uuid;
        this.b = data;
        this.c = new HashSet(collection);
        this.d = aVar;
        this.e = i;
        this.l = i2;
        this.f = executor;
        this.g = coroutineContext;
        this.h = rg8Var;
        this.i = sk9Var;
        this.j = x46Var;
        this.k = ap2Var;
    }

    public Executor a() {
        return this.f;
    }

    public ap2 b() {
        return this.k;
    }

    public UUID c() {
        return this.a;
    }

    public Data d() {
        return this.b;
    }

    public Network e() {
        return this.d.c;
    }

    public x46 f() {
        return this.j;
    }

    public int g() {
        return this.e;
    }

    public Set h() {
        return this.c;
    }

    public rg8 i() {
        return this.h;
    }

    public List j() {
        return this.d.a;
    }

    public List k() {
        return this.d.b;
    }

    public CoroutineContext l() {
        return this.g;
    }

    public sk9 m() {
        return this.i;
    }
}
