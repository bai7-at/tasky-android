package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: classes5.dex */
public abstract class m1 extends AbstractCollection implements Collection, zu3 {
    protected m1() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }
}
