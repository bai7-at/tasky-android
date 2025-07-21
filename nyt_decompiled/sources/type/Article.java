package type;

import defpackage.aq0;
import defpackage.dc5;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Article {
    public static final Companion Companion = new Companion(null);
    private static final aq0 __adTargetingParams_clientAdParams = new aq0.a("clientAdParams").a();

    /* renamed from: type, reason: collision with root package name */
    private static final dc5 f109type = new dc5.a("Article").b(i.o(CreativeWork.Companion.getType(), HasHybridProperties.Companion.getType(), HasPromotionalProperties.Companion.getType(), HasPromotions.Companion.getType(), Linkable.Companion.getType(), Node.Companion.getType(), Published.Companion.getType())).a();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dc5 getType() {
            return Article.f109type;
        }

        public final aq0 get__adTargetingParams_clientAdParams() {
            return Article.__adTargetingParams_clientAdParams;
        }

        private Companion() {
        }
    }
}
