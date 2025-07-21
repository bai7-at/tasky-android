package defpackage;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class yg1 implements n01 {
    @Override // defpackage.n01
    public CoroutineDispatcher a() {
        return Dispatchers.getIO();
    }

    @Override // defpackage.n01
    public CoroutineDispatcher b() {
        return Dispatchers.getMain();
    }
}
