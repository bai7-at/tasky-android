package okhttp3.internal.concurrent;

import defpackage.qs2;

/* loaded from: classes5.dex */
public final class TaskQueue$execute$1 extends Task {
    final /* synthetic */ qs2 $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z, qs2 qs2Var) {
        super(str, z);
        this.$block = qs2Var;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.$block.mo865invoke();
        return -1L;
    }
}
