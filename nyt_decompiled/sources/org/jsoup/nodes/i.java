package org.jsoup.nodes;

import defpackage.c85;
import defpackage.o48;
import defpackage.u29;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.SerializationException;
import org.jsoup.nodes.Document;

/* loaded from: classes5.dex */
public abstract class i implements Cloneable {
    i a;
    int b;

    private static class a implements c85 {
        private Appendable a;
        private Document.OutputSettings b;

        a(Appendable appendable, Document.OutputSettings outputSettings) {
            this.a = appendable;
            this.b = outputSettings;
            outputSettings.h();
        }

        @Override // defpackage.c85
        public void a(i iVar, int i) {
            if (iVar.v().equals("#text")) {
                return;
            }
            try {
                iVar.A(this.a, i, this.b);
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }

        @Override // defpackage.c85
        public void b(i iVar, int i) {
            try {
                iVar.z(this.a, i, this.b);
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }
    }

    protected i() {
    }

    private void G(int i) {
        List p = p();
        while (i < p.size()) {
            ((i) p.get(i)).Q(i);
            i++;
        }
    }

    abstract void A(Appendable appendable, int i, Document.OutputSettings outputSettings);

    public Document B() {
        i N = N();
        if (N instanceof Document) {
            return (Document) N;
        }
        return null;
    }

    public i D() {
        return this.a;
    }

    public final i E() {
        return this.a;
    }

    public i F() {
        i iVar = this.a;
        if (iVar != null && this.b > 0) {
            return (i) iVar.p().get(this.b - 1);
        }
        return null;
    }

    public void H() {
        u29.i(this.a);
        this.a.I(this);
    }

    protected void I(i iVar) {
        u29.c(iVar.a == this);
        int i = iVar.b;
        p().remove(i);
        G(i);
        iVar.a = null;
    }

    protected void J(i iVar) {
        iVar.P(this);
    }

    protected void K(i iVar, i iVar2) {
        u29.c(iVar.a == this);
        u29.i(iVar2);
        i iVar3 = iVar2.a;
        if (iVar3 != null) {
            iVar3.I(iVar2);
        }
        int i = iVar.b;
        p().set(i, iVar2);
        iVar2.a = this;
        iVar2.Q(i);
        iVar.a = null;
    }

    public void M(i iVar) {
        u29.i(iVar);
        u29.i(this.a);
        this.a.K(this, iVar);
    }

    public i N() {
        while (true) {
            i iVar = this.a;
            if (iVar == null) {
                return this;
            }
            this = iVar;
        }
    }

    public void O(String str) {
        u29.i(str);
        n(str);
    }

    protected void P(i iVar) {
        u29.i(iVar);
        i iVar2 = this.a;
        if (iVar2 != null) {
            iVar2.I(this);
        }
        this.a = iVar;
    }

    protected void Q(int i) {
        this.b = i;
    }

    public int R() {
        return this.b;
    }

    public List S() {
        i iVar = this.a;
        if (iVar == null) {
            return Collections.emptyList();
        }
        List<i> p = iVar.p();
        ArrayList arrayList = new ArrayList(p.size() - 1);
        for (i iVar2 : p) {
            if (iVar2 != this) {
                arrayList.add(iVar2);
            }
        }
        return arrayList;
    }

    public String a(String str) {
        u29.g(str);
        return !q(str) ? "" : o48.n(f(), c(str));
    }

    protected void b(int i, i... iVarArr) {
        u29.i(iVarArr);
        if (iVarArr.length == 0) {
            return;
        }
        List p = p();
        i D = iVarArr[0].D();
        if (D == null || D.i() != iVarArr.length) {
            u29.e(iVarArr);
            for (i iVar : iVarArr) {
                J(iVar);
            }
            p.addAll(i, Arrays.asList(iVarArr));
            G(i);
            return;
        }
        List k = D.k();
        int length = iVarArr.length;
        while (true) {
            int i2 = length - 1;
            if (length <= 0 || iVarArr[i2] != k.get(i2)) {
                break;
            } else {
                length = i2;
            }
        }
        D.o();
        p.addAll(i, Arrays.asList(iVarArr));
        int length2 = iVarArr.length;
        while (true) {
            int i3 = length2 - 1;
            if (length2 <= 0) {
                G(i);
                return;
            } else {
                iVarArr[i3].a = this;
                length2 = i3;
            }
        }
    }

    public String c(String str) {
        u29.i(str);
        if (!r()) {
            return "";
        }
        String v = e().v(str);
        return v.length() > 0 ? v : str.startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public i d(String str, String str2) {
        e().J(j.b(this).c().a(str), str2);
        return this;
    }

    public abstract b e();

    public boolean equals(Object obj) {
        return this == obj;
    }

    public abstract String f();

    public i g(i iVar) {
        u29.i(iVar);
        u29.i(this.a);
        this.a.b(this.b, iVar);
        return this;
    }

    public i h(int i) {
        return (i) p().get(i);
    }

    public abstract int i();

    public List k() {
        return Collections.unmodifiableList(p());
    }

    @Override // 
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public i d0() {
        i m = m(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(m);
        while (!linkedList.isEmpty()) {
            i iVar = (i) linkedList.remove();
            int i = iVar.i();
            for (int i2 = 0; i2 < i; i2++) {
                List p = iVar.p();
                i m2 = ((i) p.get(i2)).m(iVar);
                p.set(i2, m2);
                linkedList.add(m2);
            }
        }
        return m;
    }

    protected i m(i iVar) {
        try {
            i iVar2 = (i) super.clone();
            iVar2.a = iVar;
            iVar2.b = iVar == null ? 0 : this.b;
            return iVar2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract void n(String str);

    public abstract i o();

    protected abstract List p();

    public boolean q(String str) {
        u29.i(str);
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (e().x(substring) && !a(substring).equals("")) {
                return true;
            }
        }
        return e().x(str);
    }

    protected abstract boolean r();

    public boolean s() {
        return this.a != null;
    }

    protected void t(Appendable appendable, int i, Document.OutputSettings outputSettings) {
        appendable.append('\n').append(o48.l(i * outputSettings.f()));
    }

    public String toString() {
        return x();
    }

    public i u() {
        i iVar = this.a;
        if (iVar == null) {
            return null;
        }
        List p = iVar.p();
        int i = this.b + 1;
        if (p.size() > i) {
            return (i) p.get(i);
        }
        return null;
    }

    public abstract String v();

    void w() {
    }

    public String x() {
        StringBuilder b = o48.b();
        y(b);
        return o48.m(b);
    }

    protected void y(Appendable appendable) {
        org.jsoup.select.d.b(new a(appendable, j.a(this)), this);
    }

    abstract void z(Appendable appendable, int i, Document.OutputSettings outputSettings);
}
