package com.nytimes.android.notification.parsing;

import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.saved.SavedManager;
import defpackage.by0;
import defpackage.d87;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s87;
import defpackage.w87;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.notification.parsing.SaveIntentParser$onSaveAsset$1", f = "SaveIntentParser.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SaveIntentParser$onSaveAsset$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Asset $asset;
    int label;
    final /* synthetic */ SaveIntentParser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveIntentParser$onSaveAsset$1(SaveIntentParser saveIntentParser, Asset asset, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = saveIntentParser;
        this.$asset = asset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SaveIntentParser$onSaveAsset$1(this.this$0, this.$asset, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SavedManager savedManager;
        w87 w87Var;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            savedManager = this.this$0.d;
            s87 a = d87.a(this.$asset);
            this.label = 1;
            if (savedManager.add(a, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        w87Var = this.this$0.f;
        w87Var.b(d87.a(this.$asset), this.$asset.getSectionContentName(), true);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SaveIntentParser$onSaveAsset$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
