package io.reactivex.rxkotlin;

import defpackage.yu3;
import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class ObservableKt$toIterable$1<T> implements Iterable<T>, yu3 {
    final /* synthetic */ Iterator $this_toIterable;

    ObservableKt$toIterable$1(Iterator<? extends T> it2) {
        this.$this_toIterable = it2;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.$this_toIterable;
    }
}
