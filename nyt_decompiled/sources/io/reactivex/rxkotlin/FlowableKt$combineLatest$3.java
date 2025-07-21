package io.reactivex.rxkotlin;

import defpackage.it2;
import defpackage.wu3;
import defpackage.zq3;
import defpackage.zt6;
import kotlin.Triple;
import kotlin.jvm.internal.FunctionReference;

/* loaded from: classes5.dex */
final /* synthetic */ class FlowableKt$combineLatest$3 extends FunctionReference implements it2 {
    public static final FlowableKt$combineLatest$3 INSTANCE = new FlowableKt$combineLatest$3();

    FlowableKt$combineLatest$3() {
        super(3);
    }

    @Override // kotlin.jvm.internal.CallableReference, defpackage.uu3
    public final String getName() {
        return "<init>";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final wu3 getOwner() {
        return zt6.b(Triple.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V";
    }

    @Override // defpackage.it2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowableKt$combineLatest$3) obj, obj2, obj3);
    }

    @Override // defpackage.it2
    public final Triple<T, R, U> invoke(T t, R r, U u) {
        zq3.i(t, "p1");
        zq3.i(r, "p2");
        zq3.i(u, "p3");
        return new Triple<>(t, r, u);
    }
}
