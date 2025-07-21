package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class c3f implements Iterator, Closeable, pca {
    private static final oca g = new b3f("eof ");
    private static final j3f h = j3f.b(c3f.class);
    protected lca a;
    protected d3f b;
    oca c = null;
    long d = 0;
    long e = 0;
    private final List f = new ArrayList();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.util.Iterator
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final oca next() {
        oca a;
        oca ocaVar = this.c;
        if (ocaVar != null && ocaVar != g) {
            this.c = null;
            return ocaVar;
        }
        d3f d3fVar = this.b;
        if (d3fVar == null || this.d >= this.e) {
            this.c = g;
            throw new NoSuchElementException();
        }
        try {
            synchronized (d3fVar) {
                this.b.f(this.d);
                a = this.a.a(this.b, this);
                this.d = this.b.zzb();
            }
            return a;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        oca ocaVar = this.c;
        if (ocaVar == g) {
            return false;
        }
        if (ocaVar != null) {
            return true;
        }
        try {
            this.c = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.c = g;
            return false;
        }
    }

    public final List i() {
        return (this.b == null || this.c == g) ? this.f : new i3f(this.f, this);
    }

    public final void j(d3f d3fVar, long j, lca lcaVar) {
        this.b = d3fVar;
        this.d = d3fVar.zzb();
        d3fVar.f(d3fVar.zzb() + j);
        this.e = d3fVar.zzb();
        this.a = lcaVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.f.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((oca) this.f.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
