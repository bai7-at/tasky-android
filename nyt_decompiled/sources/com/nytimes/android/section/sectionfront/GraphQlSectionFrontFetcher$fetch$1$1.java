package com.nytimes.android.section.sectionfront;

import com.comscore.streaming.ContentType;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.api.cms.SectionQueryData;
import com.nytimes.android.api.cms.SectionQueryType;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.section.sectionfront.GraphQlSectionFrontFetcher$fetch$1$1", f = "GraphQlSectionFrontFetcher.kt", l = {ContentType.USER_GENERATED_SHORT_FORM_ON_DEMAND, ContentType.USER_GENERATED_LIVE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GraphQlSectionFrontFetcher$fetch$1$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ String $legacyCollectionId;
    final /* synthetic */ a $sectionFrontId;
    int label;
    final /* synthetic */ GraphQlSectionFrontFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GraphQlSectionFrontFetcher$fetch$1$1(a aVar, GraphQlSectionFrontFetcher graphQlSectionFrontFetcher, String str, by0 by0Var) {
        super(2, by0Var);
        this.$sectionFrontId = aVar;
        this.this$0 = graphQlSectionFrontFetcher;
        this.$legacyCollectionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new GraphQlSectionFrontFetcher$fetch$1$1(this.$sectionFrontId, this.this$0, this.$legacyCollectionId, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                f.b(obj);
                return (SectionFront) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            return (SectionFront) obj;
        }
        f.b(obj);
        String graphqlIdentifierV2 = this.$sectionFrontId.a().getGraphqlIdentifierV2();
        if (graphqlIdentifierV2 == null) {
            graphqlIdentifierV2 = this.$sectionFrontId.a().getGraphqlIdentifier();
        }
        SectionQueryData queryOverride = this.$sectionFrontId.a().getQueryOverride();
        SectionQueryType queryType = queryOverride != null ? queryOverride.getQueryType() : null;
        if (graphqlIdentifierV2 != null) {
            GraphQlSectionFrontFetcher graphQlSectionFrontFetcher = this.this$0;
            a aVar = this.$sectionFrontId;
            this.label = 1;
            obj = graphQlSectionFrontFetcher.l(queryType, aVar, graphqlIdentifierV2, this);
            if (obj == h) {
                return h;
            }
            return (SectionFront) obj;
        }
        GraphQlSectionFrontFetcher graphQlSectionFrontFetcher2 = this.this$0;
        a aVar2 = this.$sectionFrontId;
        String str = this.$legacyCollectionId;
        this.label = 2;
        obj = graphQlSectionFrontFetcher2.p(aVar2, str, this);
        if (obj == h) {
            return h;
        }
        return (SectionFront) obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((GraphQlSectionFrontFetcher$fetch$1$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
