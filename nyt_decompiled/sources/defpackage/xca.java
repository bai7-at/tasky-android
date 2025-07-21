package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class xca implements Iterator {
    private int a = 0;
    final /* synthetic */ eda b;

    xca(eda edaVar) {
        this.b = edaVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i = this.a;
        str = this.b.a;
        return i < str.length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i = this.a;
        eda edaVar = this.b;
        str = edaVar.a;
        if (i >= str.length()) {
            throw new NoSuchElementException();
        }
        str2 = edaVar.a;
        this.a = i + 1;
        return new eda(String.valueOf(str2.charAt(i)));
    }
}
