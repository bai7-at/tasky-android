package kotlinx.coroutines.flow;

import defpackage.qs2;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class FlowKt__ZipKt$combine$5$1 extends Lambda implements qs2 {
    final /* synthetic */ Flow<T>[] $flows;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combine$5$1(Flow<? extends T>[] flowArr) {
        super(0);
        this.$flows = flowArr;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T[], java.lang.Object[]] */
    @Override // defpackage.qs2
    /* renamed from: invoke */
    public final T[] mo865invoke() {
        int length = this.$flows.length;
        zq3.n(0, "T?");
        return new Object[length];
    }
}
