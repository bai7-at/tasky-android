package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import defpackage.h16;
import defpackage.vs4;
import defpackage.xo8;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l {
    private final vs4 a;
    private final char[] b;
    private final a c = new a(1024);
    private final Typeface d;

    static class a {
        private final SparseArray a;
        private m b;

        private a() {
            this(1);
        }

        a a(int i) {
            SparseArray sparseArray = this.a;
            if (sparseArray == null) {
                return null;
            }
            return (a) sparseArray.get(i);
        }

        final m b() {
            return this.b;
        }

        void c(m mVar, int i, int i2) {
            a a = a(mVar.b(i));
            if (a == null) {
                a = new a();
                this.a.put(mVar.b(i), a);
            }
            if (i2 > i) {
                a.c(mVar, i + 1, i2);
            } else {
                a.b = mVar;
            }
        }

        a(int i) {
            this.a = new SparseArray(i);
        }
    }

    private l(Typeface typeface, vs4 vs4Var) {
        this.d = typeface;
        this.a = vs4Var;
        this.b = new char[vs4Var.k() * 2];
        a(vs4Var);
    }

    private void a(vs4 vs4Var) {
        int k = vs4Var.k();
        for (int i = 0; i < k; i++) {
            m mVar = new m(this, i);
            Character.toChars(mVar.f(), this.b, i * 2);
            h(mVar);
        }
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            xo8.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            xo8.b();
        }
    }

    public char[] c() {
        return this.b;
    }

    public vs4 d() {
        return this.a;
    }

    int e() {
        return this.a.l();
    }

    a f() {
        return this.c;
    }

    Typeface g() {
        return this.d;
    }

    void h(m mVar) {
        h16.h(mVar, "emoji metadata cannot be null");
        h16.b(mVar.c() > 0, "invalid metadata codepoint length");
        this.c.c(mVar, 0, mVar.c() - 1);
    }
}
