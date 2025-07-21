package com.google.common.base;

import defpackage.b16;
import defpackage.qj0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class b {
    private final qj0 a;
    private final boolean b;
    private final c c;
    private final int d;

    class a implements c {
        final /* synthetic */ qj0 a;

        /* renamed from: com.google.common.base.b$a$a, reason: collision with other inner class name */
        class C0207a extends AbstractC0208b {
            C0207a(b bVar, CharSequence charSequence) {
                super(bVar, charSequence);
            }

            @Override // com.google.common.base.b.AbstractC0208b
            int f(int i) {
                return i + 1;
            }

            @Override // com.google.common.base.b.AbstractC0208b
            int g(int i) {
                return a.this.a.c(this.c, i);
            }
        }

        a(qj0 qj0Var) {
            this.a = qj0Var;
        }

        @Override // com.google.common.base.b.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC0208b a(b bVar, CharSequence charSequence) {
            return new C0207a(bVar, charSequence);
        }
    }

    /* renamed from: com.google.common.base.b$b, reason: collision with other inner class name */
    private static abstract class AbstractC0208b extends AbstractIterator {
        final CharSequence c;
        final qj0 d;
        final boolean e;
        int f = 0;
        int g;

        protected AbstractC0208b(b bVar, CharSequence charSequence) {
            this.d = bVar.a;
            this.e = bVar.b;
            this.g = bVar.d;
            this.c = charSequence;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String b() {
            int g;
            int i = this.f;
            while (true) {
                int i2 = this.f;
                if (i2 == -1) {
                    return (String) c();
                }
                g = g(i2);
                if (g == -1) {
                    g = this.c.length();
                    this.f = -1;
                } else {
                    this.f = f(g);
                }
                int i3 = this.f;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.f = i4;
                    if (i4 > this.c.length()) {
                        this.f = -1;
                    }
                } else {
                    while (i < g && this.d.e(this.c.charAt(i))) {
                        i++;
                    }
                    while (g > i && this.d.e(this.c.charAt(g - 1))) {
                        g--;
                    }
                    if (!this.e || i != g) {
                        break;
                    }
                    i = this.f;
                }
            }
            int i5 = this.g;
            if (i5 == 1) {
                g = this.c.length();
                this.f = -1;
                while (g > i && this.d.e(this.c.charAt(g - 1))) {
                    g--;
                }
            } else {
                this.g = i5 - 1;
            }
            return this.c.subSequence(i, g).toString();
        }

        abstract int f(int i);

        abstract int g(int i);
    }

    private interface c {
        Iterator a(b bVar, CharSequence charSequence);
    }

    private b(c cVar) {
        this(cVar, false, qj0.f(), Integer.MAX_VALUE);
    }

    public static b d(char c2) {
        return e(qj0.d(c2));
    }

    public static b e(qj0 qj0Var) {
        b16.k(qj0Var);
        return new b(new a(qj0Var));
    }

    private Iterator g(CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }

    public List f(CharSequence charSequence) {
        b16.k(charSequence);
        Iterator g = g(charSequence);
        ArrayList arrayList = new ArrayList();
        while (g.hasNext()) {
            arrayList.add((String) g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private b(c cVar, boolean z, qj0 qj0Var, int i) {
        this.c = cVar;
        this.b = z;
        this.a = qj0Var;
        this.d = i;
    }
}
