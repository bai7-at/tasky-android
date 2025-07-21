package androidx.compose.runtime;

import defpackage.hd;
import defpackage.q33;
import defpackage.yu3;
import defpackage.zs0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
final class c0 implements Iterator, yu3 {
    private final r a;
    private final q33 b;
    private final int c;
    private int d;

    public c0(r rVar, q33 q33Var) {
        this.a = rVar;
        this.c = rVar.v();
    }

    @Override // java.util.Iterator
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public zs0 next() {
        Object obj;
        ArrayList b = this.b.b();
        if (b != null) {
            int i = this.d;
            this.d = i + 1;
            obj = b.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof hd) {
            return new s(this.a, ((hd) obj).a(), this.c);
        }
        if (obj instanceof q33) {
            return new d0(this.a, (q33) obj);
        }
        b.t("Unexpected group information structure");
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        ArrayList b = this.b.b();
        return b != null && this.d < b.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
