package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import defpackage.ao8;
import defpackage.az2;
import defpackage.by0;
import defpackage.eo8;
import defpackage.gh4;
import defpackage.hc1;
import defpackage.lo8;
import defpackage.zn8;
import defpackage.zq3;
import defpackage.zy2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public abstract class TopicsManagerImplCommon extends ao8 {
    private final TopicsManager b;

    public TopicsManagerImplCommon(TopicsManager topicsManager) {
        zq3.h(topicsManager, "mTopicsManager");
        this.b = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object e(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4, defpackage.zy2 r5, defpackage.by0<? super defpackage.az2> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r0 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r4 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon) r4
            kotlin.f.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.f.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r5 = defpackage.jo8.a(r6)
            az2 r4 = r4.d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.e(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, zy2, by0):java.lang.Object");
    }

    private final Object f(GetTopicsRequest getTopicsRequest, by0 by0Var) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(a.d(by0Var), 1);
        cancellableContinuationImpl.initCancellability();
        this.b.getTopics(getTopicsRequest, new gh4(), androidx.core.os.a.a(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == a.h()) {
            hc1.c(by0Var);
        }
        return result;
    }

    @Override // defpackage.ao8
    public Object a(zy2 zy2Var, by0<? super az2> by0Var) {
        return e(this, zy2Var, by0Var);
    }

    public GetTopicsRequest c(zy2 zy2Var) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        zq3.h(zy2Var, "request");
        adsSdkName = eo8.a().setAdsSdkName(zy2Var.a());
        build = adsSdkName.build();
        zq3.g(build, "Builder()\n            .s…ame)\n            .build()");
        return build;
    }

    public final az2 d(GetTopicsResponse getTopicsResponse) {
        List topics;
        long taxonomyVersion;
        long modelVersion;
        int topicId;
        zq3.h(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        topics = getTopicsResponse.getTopics();
        Iterator it2 = topics.iterator();
        while (it2.hasNext()) {
            Topic a = lo8.a(it2.next());
            taxonomyVersion = a.getTaxonomyVersion();
            modelVersion = a.getModelVersion();
            topicId = a.getTopicId();
            arrayList.add(new zn8(taxonomyVersion, modelVersion, topicId));
        }
        return new az2(arrayList);
    }
}
