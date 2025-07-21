package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public abstract class kn0 extends in0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn0(KSerializer kSerializer) {
        super(kSerializer, null);
        zq3.h(kSerializer, "element");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Iterator d(Collection collection) {
        zq3.h(collection, "<this>");
        return collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int e(Collection collection) {
        zq3.h(collection, "<this>");
        return collection.size();
    }
}
