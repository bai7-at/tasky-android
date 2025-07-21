package type;

import defpackage.aq0;
import defpackage.dc5;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Podcast {
    public static final Companion Companion = new Companion(null);
    private static final aq0 __subscriptionUrls_services = new aq0.a("services").a();
    private static final aq0 __stream_first = new aq0.a("first").a();
    private static final aq0 __stream_streamQuery = new aq0.a("streamQuery").a();

    /* renamed from: type, reason: collision with root package name */
    private static final dc5 f270type = new dc5.a("Podcast").b(i.o(Collection.Companion.getType(), CreativeWork.Companion.getType(), HasPromotionalProperties.Companion.getType(), Node.Companion.getType(), Published.Companion.getType())).a();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dc5 getType() {
            return Podcast.f270type;
        }

        public final aq0 get__stream_first() {
            return Podcast.__stream_first;
        }

        public final aq0 get__stream_streamQuery() {
            return Podcast.__stream_streamQuery;
        }

        public final aq0 get__subscriptionUrls_services() {
            return Podcast.__subscriptionUrls_services;
        }

        private Companion() {
        }
    }
}
