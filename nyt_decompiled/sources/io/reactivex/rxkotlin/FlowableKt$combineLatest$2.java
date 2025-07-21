package io.reactivex.rxkotlin;

import defpackage.gt2;
import defpackage.wu3;
import defpackage.zq3;
import defpackage.zt6;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReference;

/* loaded from: classes5.dex */
final /* synthetic */ class FlowableKt$combineLatest$2 extends FunctionReference implements gt2 {
    public static final FlowableKt$combineLatest$2 INSTANCE = new FlowableKt$combineLatest$2();

    FlowableKt$combineLatest$2() {
        super(2);
    }

    @Override // kotlin.jvm.internal.CallableReference, defpackage.uu3
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final wu3 getOwner() {
        return zt6.b(Pair.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;)V";
    }

    @Override // defpackage.gt2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((FlowableKt$combineLatest$2) obj, obj2);
    }

    @Override // defpackage.gt2
    public final Pair<T, R> invoke(T t, R r) {
        zq3.i(t, "p1");
        zq3.i(r, "p2");
        return new Pair<>(t, r);
    }
}
