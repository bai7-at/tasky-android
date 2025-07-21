package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class qo extends kn0 {
    private final SerialDescriptor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo(KSerializer kSerializer) {
        super(kSerializer);
        zq3.h(kSerializer, "element");
        this.b = new po(kSerializer.getDescriptor());
    }

    @Override // defpackage.in0, kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        zq3.h(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i) {
        zq3.h(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i, Object obj) {
        zq3.h(arrayList, "<this>");
        arrayList.add(i, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(List list) {
        zq3.h(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public List l(ArrayList arrayList) {
        zq3.h(arrayList, "<this>");
        return arrayList;
    }
}
