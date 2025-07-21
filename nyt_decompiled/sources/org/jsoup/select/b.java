package org.jsoup.select;

import defpackage.o48;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.jsoup.nodes.Element;

/* loaded from: classes5.dex */
abstract class b extends c {
    final ArrayList a;
    int b;

    static final class a extends b {
        a(Collection collection) {
            super(collection);
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            for (int i = 0; i < this.b; i++) {
                if (!((c) this.a.get(i)).a(element, element2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return o48.j(this.a, " ");
        }

        a(c... cVarArr) {
            this(Arrays.asList(cVarArr));
        }
    }

    b() {
        this.b = 0;
        this.a = new ArrayList();
    }

    void b(c cVar) {
        this.a.set(this.b - 1, cVar);
    }

    c c() {
        int i = this.b;
        if (i > 0) {
            return (c) this.a.get(i - 1);
        }
        return null;
    }

    void d() {
        this.b = this.a.size();
    }

    b(Collection collection) {
        this();
        this.a.addAll(collection);
        d();
    }

    /* renamed from: org.jsoup.select.b$b, reason: collision with other inner class name */
    static final class C0510b extends b {
        C0510b(Collection collection) {
            if (this.b > 1) {
                this.a.add(new a(collection));
            } else {
                this.a.addAll(collection);
            }
            d();
        }

        @Override // org.jsoup.select.c
        public boolean a(Element element, Element element2) {
            for (int i = 0; i < this.b; i++) {
                if (((c) this.a.get(i)).a(element, element2)) {
                    return true;
                }
            }
            return false;
        }

        public void e(c cVar) {
            this.a.add(cVar);
            d();
        }

        public String toString() {
            return o48.j(this.a, ", ");
        }

        C0510b(c... cVarArr) {
            this(Arrays.asList(cVarArr));
        }

        C0510b() {
        }
    }
}
