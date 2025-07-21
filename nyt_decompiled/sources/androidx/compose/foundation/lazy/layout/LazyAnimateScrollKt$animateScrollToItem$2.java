package androidx.compose.foundation.lazy.layout;

import defpackage.by0;
import defpackage.fc1;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.i04;
import defpackage.qc7;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@fc1(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", l = {182, 280}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class LazyAnimateScrollKt$animateScrollToItem$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ fm1 $density;
    final /* synthetic */ int $index;
    final /* synthetic */ int $numOfItemsForTeleport;
    final /* synthetic */ int $scrollOffset;
    final /* synthetic */ i04 $this_animateScrollToItem;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyAnimateScrollKt$animateScrollToItem$2(int i, fm1 fm1Var, i04 i04Var, int i2, int i3, by0 by0Var) {
        super(2, by0Var);
        this.$index = i;
        this.$density = fm1Var;
        this.$this_animateScrollToItem = i04Var;
        this.$scrollOffset = i2;
        this.$numOfItemsForTeleport = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(boolean z, i04 i04Var, int i, int i2) {
        if (z) {
            if (i04Var.c() <= i && (i04Var.c() != i || i04Var.b() <= i2)) {
                return false;
            }
        } else if (i04Var.c() >= i && (i04Var.c() != i || i04Var.b() >= i2)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.gt2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(qc7 qc7Var, by0 by0Var) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) create(qc7Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        LazyAnimateScrollKt$animateScrollToItem$2 lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.$index, this.$density, this.$this_animateScrollToItem, this.$scrollOffset, this.$numOfItemsForTeleport, by0Var);
        lazyAnimateScrollKt$animateScrollToItem$2.L$0 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce A[Catch: ItemFoundInScroll -> 0x01b9, TryCatch #1 {ItemFoundInScroll -> 0x01b9, blocks: (B:20:0x00ca, B:22:0x00ce, B:24:0x00d6, B:29:0x0103, B:32:0x013f, B:35:0x014c), top: B:19:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0197 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0234 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v26, types: [T, fi] */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, fi] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0198 -> B:16:0x01a0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
