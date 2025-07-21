package com.nytimes.android.saved.persistence;

import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.saved.SavedAssetIndexList;
import defpackage.at3;
import defpackage.by0;
import defpackage.fc1;
import defpackage.ge2;
import defpackage.gt2;
import defpackage.ww8;
import java.util.Map;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.persistence.SavedListDiskPersister$loadSavedAssetIndexList$2", f = "SavedListDiskPersister.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SavedListDiskPersister$loadSavedAssetIndexList$2 extends SuspendLambda implements gt2 {
    Object L$0;
    int label;
    final /* synthetic */ SavedListDiskPersister this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SavedListDiskPersister$loadSavedAssetIndexList$2(SavedListDiskPersister savedListDiskPersister, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = savedListDiskPersister;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SavedListDiskPersister$loadSavedAssetIndexList$2(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ge2 ge2Var;
        Object h;
        ge2 ge2Var2;
        at3 at3Var;
        Object h2 = a.h();
        int i = this.label;
        try {
            if (i == 0) {
                f.b(obj);
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
            String c = ge2Var2.c(SavedAssetIndexList.class, (String) obj);
            if (c != null && c.length() != 0) {
                at3Var = this.this$0.d;
                at3Var.a();
                return (SavedAssetIndexList) at3Var.c(SavedAssetIndexList.Companion.serializer(), c);
            }
            return new SavedAssetIndexList((Map) null, (Map) null, (Map) null, (Map) null, 15, (DefaultConstructorMarker) null);
        } catch (Exception e) {
            NYTLogger.s(e);
            return new SavedAssetIndexList((Map) null, (Map) null, (Map) null, (Map) null, 15, (DefaultConstructorMarker) null);
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SavedListDiskPersister$loadSavedAssetIndexList$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
