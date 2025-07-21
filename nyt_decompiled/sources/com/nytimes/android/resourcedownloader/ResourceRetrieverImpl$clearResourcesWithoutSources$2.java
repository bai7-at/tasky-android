package com.nytimes.android.resourcedownloader;

import com.nytimes.android.resourcedownloader.data.ResourceRepository;
import com.nytimes.android.resourcedownloader.model.ResourceSource;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ul8;
import defpackage.vu3;
import defpackage.ww8;
import java.util.Set;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.resourcedownloader.ResourceRetrieverImpl$clearResourcesWithoutSources$2", f = "ResourceRetrieverImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ResourceRetrieverImpl$clearResourcesWithoutSources$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Set<ResourceSource> $sourcesToKeep;
    final /* synthetic */ Set<vu3> $types;
    int label;
    final /* synthetic */ ResourceRetrieverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResourceRetrieverImpl$clearResourcesWithoutSources$2(ResourceRetrieverImpl resourceRetrieverImpl, Set set, Set set2, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = resourceRetrieverImpl;
        this.$types = set;
        this.$sourcesToKeep = set2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ResourceRetrieverImpl$clearResourcesWithoutSources$2(this.this$0, this.$types, this.$sourcesToKeep, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ResourceRepository resourceRepository;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        try {
            resourceRepository = this.this$0.a;
            resourceRepository.clearResourcesWithoutSources(this.$types, this.$sourcesToKeep);
        } catch (Throwable th) {
            ul8.a.z("HYBRID").f(th, "Failed to clear resources: " + th.getMessage(), new Object[0]);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ResourceRetrieverImpl$clearResourcesWithoutSources$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
