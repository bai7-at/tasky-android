package okhttp3.internal.concurrent;

import defpackage.qs2;

/* loaded from: classes5.dex */
public final class TaskQueue$schedule$2 extends Task {
    final /* synthetic */ qs2 $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$schedule$2(String str, qs2 qs2Var) {
        super(str, false, 2, null);
        this.$block = qs2Var;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        return ((Number) this.$block.mo865invoke()).longValue();
    }
}
