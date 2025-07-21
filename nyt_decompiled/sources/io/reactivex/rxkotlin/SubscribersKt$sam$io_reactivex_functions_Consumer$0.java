package io.reactivex.rxkotlin;

import defpackage.ss2;
import defpackage.zq3;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
final class SubscribersKt$sam$io_reactivex_functions_Consumer$0 implements Consumer {
    private final /* synthetic */ ss2 function;

    SubscribersKt$sam$io_reactivex_functions_Consumer$0(ss2 ss2Var) {
        this.function = ss2Var;
    }

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        zq3.d(this.function.invoke(obj), "invoke(...)");
    }
}
