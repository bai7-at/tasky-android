package com.nytimes.android.saved.persistence;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.saved.SavedAssetIndexList;
import defpackage.at3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ge2;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.persistence.SavedListDiskPersister$saveArticleList$2", f = "SavedListDiskPersister.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedListDiskPersister$saveArticleList$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ SavedAssetIndexList $savedAssetIndexList;
    Object L$0;
    int label;
    final /* synthetic */ SavedListDiskPersister this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedListDiskPersister$saveArticleList$2(SavedListDiskPersister savedListDiskPersister, SavedAssetIndexList savedAssetIndexList, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = savedListDiskPersister;
        this.$savedAssetIndexList = savedAssetIndexList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SavedListDiskPersister$saveArticleList$2(this.this$0, this.$savedAssetIndexList, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ge2 ge2Var;
        Object h;
        ge2 ge2Var2;
        at3 at3Var;
        Object h2 = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            NYTLogger.l("saving article list", new Object[0]);
            ge2Var = this.this$0.a;
            SavedListDiskPersister savedListDiskPersister = this.this$0;
            this.L$0 = ge2Var;
            this.label = 1;
            h = savedListDiskPersister.h(this);
            if (h == h2) {
                return h2;
            }
            ge2Var2 = ge2Var;
            obj = h;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ge2Var2 = (ge2) this.L$0;
            f.b(obj);
        }
        at3Var = this.this$0.d;
        SavedAssetIndexList savedAssetIndexList = this.$savedAssetIndexList;
        at3Var.a();
        ge2Var2.d(SavedAssetIndexList.class, (String) obj, at3Var.b(SavedAssetIndexList.Companion.serializer(), savedAssetIndexList));
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SavedListDiskPersister$saveArticleList$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
