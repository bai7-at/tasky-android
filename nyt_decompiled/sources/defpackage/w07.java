package defpackage;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
final class w07 extends c1 {
    private final Set a;
    private final Set b;
    private final Set c;
    private final Set d;
    private final Set e;
    private final Set f;
    private final uq0 g;

    private static class a implements h86 {
        private final Set a;
        private final h86 b;

        public a(Set set, h86 h86Var) {
            this.a = set;
            this.b = h86Var;
        }
    }

    w07(nq0 nq0Var, uq0 uq0Var) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (km1 km1Var : nq0Var.e()) {
            if (km1Var.e()) {
                if (km1Var.g()) {
                    hashSet4.add(km1Var.c());
                } else {
                    hashSet.add(km1Var.c());
                }
            } else if (km1Var.d()) {
                hashSet3.add(km1Var.c());
            } else if (km1Var.g()) {
                hashSet5.add(km1Var.c());
            } else {
                hashSet2.add(km1Var.c());
            }
        }
        if (!nq0Var.i().isEmpty()) {
            hashSet.add(h86.class);
        }
        this.a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.d = Collections.unmodifiableSet(hashSet4);
        this.e = Collections.unmodifiableSet(hashSet5);
        this.f = nq0Var.i();
        this.g = uq0Var;
    }

    @Override // defpackage.c1, defpackage.uq0
    public Object a(Class cls) {
        if (!this.a.contains(cls)) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object a2 = this.g.a(cls);
        return !cls.equals(h86.class) ? a2 : new a(this.f, (h86) a2);
    }

    @Override // defpackage.uq0
    public q76 b(Class cls) {
        if (this.e.contains(cls)) {
            return this.g.b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // defpackage.c1, defpackage.uq0
    public Set c(Class cls) {
        if (this.d.contains(cls)) {
            return this.g.c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // defpackage.uq0
    public q76 d(Class cls) {
        if (this.b.contains(cls)) {
            return this.g.d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // defpackage.uq0
    public gl1 e(Class cls) {
        if (this.c.contains(cls)) {
            return this.g.e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
