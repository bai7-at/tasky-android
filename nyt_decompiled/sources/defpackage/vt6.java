package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes5.dex */
public final class vt6 extends in0 {
    private final vu3 b;
    private final SerialDescriptor c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt6(vu3 vu3Var, KSerializer kSerializer) {
        super(kSerializer, null);
        zq3.h(vu3Var, "kClass");
        zq3.h(kSerializer, "eSerializer");
        this.b = vu3Var;
        this.c = new io(kSerializer.getDescriptor());
    }

    @Override // defpackage.in0, kotlinx.serialization.KSerializer, defpackage.nk7, defpackage.ym1
    public SerialDescriptor getDescriptor() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        zq3.h(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i) {
        zq3.h(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Iterator d(Object[] objArr) {
        zq3.h(objArr, "<this>");
        return no.a(objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public int e(Object[] objArr) {
        zq3.h(objArr, "<this>");
        return objArr.length;
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
    public ArrayList k(Object[] objArr) {
        zq3.h(objArr, "<this>");
        return new ArrayList(d.e(objArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object[] l(ArrayList arrayList) {
        zq3.h(arrayList, "<this>");
        return nu5.m(arrayList, this.b);
    }
}
