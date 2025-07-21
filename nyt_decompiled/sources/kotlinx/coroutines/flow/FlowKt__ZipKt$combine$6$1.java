package kotlinx.coroutines.flow;

import defpackage.qs2;
import defpackage.zq3;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
final class FlowKt__ZipKt$combine$6$1 extends Lambda implements qs2 {
    final /* synthetic */ Flow<T>[] $flowArray;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$6$1(Flow<T>[] flowArr) {
        super(0);
        this.$flowArray = flowArr;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T[], java.lang.Object[]] */
    @Override // defpackage.qs2
    /* renamed from: invoke */
    public final T[] mo865invoke() {
        int length = this.$flowArray.length;
        zq3.n(0, "T?");
        return new Object[length];
    }
}
