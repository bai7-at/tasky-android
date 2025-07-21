package com.nytimes.android.resourcedownloader;

import com.nytimes.android.resourcedownloader.data.LegacyResourceStoreMigration;
import com.nytimes.android.resourcedownloader.data.ResourceRepository;
import com.nytimes.android.resourcedownloader.model.GlobalResourceSource;
import com.nytimes.android.resourcedownloader.model.MimeType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.resourcedownloader.ResourceRetrieverImpl$prefetchGlobalResources$2", f = "ResourceRetrieverImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ResourceRetrieverImpl$prefetchGlobalResources$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<String> $urls;
    int label;
    final /* synthetic */ ResourceRetrieverImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResourceRetrieverImpl$prefetchGlobalResources$2(ResourceRetrieverImpl resourceRetrieverImpl, List list, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = resourceRetrieverImpl;
        this.$urls = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new ResourceRetrieverImpl$prefetchGlobalResources$2(this.this$0, this.$urls, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LegacyResourceStoreMigration legacyResourceStoreMigration;
        ResourceRepository resourceRepository;
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        legacyResourceStoreMigration = this.this$0.h;
        legacyResourceStoreMigration.runIfNeeded();
        List<String> list = this.$urls;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String str = (String) obj2;
            if (str.length() > 0 && MimeType.Companion.isCssOrJs(str)) {
                arrayList.add(obj2);
            }
        }
        ResourceRetrieverImpl resourceRetrieverImpl = this.this$0;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            resourceRetrieverImpl.i((String) it2.next(), new GlobalResourceSource(null, 1, null));
        }
        resourceRepository = this.this$0.a;
        resourceRepository.clearGlobalResources(this.$urls);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ResourceRetrieverImpl$prefetchGlobalResources$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
