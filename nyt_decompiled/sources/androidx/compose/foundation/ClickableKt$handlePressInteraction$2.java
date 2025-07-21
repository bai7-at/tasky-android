package androidx.compose.foundation;

import androidx.compose.foundation.AbstractClickableNode;
import defpackage.by0;
import defpackage.c26;
import defpackage.dy4;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.qs2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.http.StatusLine;

@fc1(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", f = "Clickable.kt", l = {StatusLine.HTTP_TEMP_REDIRECT, 309, 316, 317, 326}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ qs2 $delayPressInteraction;
    final /* synthetic */ AbstractClickableNode.a $interactionData;
    final /* synthetic */ dy4 $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ c26 $this_handlePressInteraction;
    private /* synthetic */ Object L$0;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickableKt$handlePressInteraction$2(c26 c26Var, long j, dy4 dy4Var, AbstractClickableNode.a aVar, qs2 qs2Var, by0 by0Var) {
        super(2, by0Var);
        this.$this_handlePressInteraction = c26Var;
        this.$pressPoint = j;
        this.$interactionSource = dy4Var;
        this.$interactionData = aVar;
        this.$delayPressInteraction = qs2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.$this_handlePressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, this.$delayPressInteraction, by0Var);
        clickableKt$handlePressInteraction$2.L$0 = obj;
        return clickableKt$handlePressInteraction$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ClickableKt$handlePressInteraction$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ClickableKt$handlePressInteraction$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
