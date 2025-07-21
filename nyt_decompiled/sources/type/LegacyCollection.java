package type;

import defpackage.aq0;
import defpackage.dc5;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class LegacyCollection {
    public static final Companion Companion = new Companion(null);
    private static final aq0 __assets_first = new aq0.a("first").a();
    private static final aq0 __adTargetingParams_clientAdParams = new aq0.a("clientAdParams").a();
    private static final aq0 __stream_first = new aq0.a("first").a();
    private static final aq0 __stream_query = new aq0.a("query").a();
    private static final aq0 __stream_exclusionMode = new aq0.a("exclusionMode").a();

    /* renamed from: type, reason: collision with root package name */
    private static final dc5 f222type = new dc5.a("LegacyCollection").b(i.o(Collection.Companion.getType(), CreativeWork.Companion.getType(), HasPromotionalProperties.Companion.getType(), Linkable.Companion.getType(), Node.Companion.getType(), Published.Companion.getType())).a();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dc5 getType() {
            return LegacyCollection.f222type;
        }

        public final aq0 get__adTargetingParams_clientAdParams() {
            return LegacyCollection.__adTargetingParams_clientAdParams;
        }

        public final aq0 get__assets_first() {
            return LegacyCollection.__assets_first;
        }

        public final aq0 get__stream_exclusionMode() {
            return LegacyCollection.__stream_exclusionMode;
        }

        public final aq0 get__stream_first() {
            return LegacyCollection.__stream_first;
        }

        public final aq0 get__stream_query() {
            return LegacyCollection.__stream_query;
        }

        private Companion() {
        }
    }
}
