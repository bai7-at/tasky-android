package type;

import defpackage.aq0;
import defpackage.dc5;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class Query {
    public static final Companion Companion = new Companion(null);
    private static final aq0 __onsiteMessaging_data = new aq0.a("data").a();
    private static final aq0 __node_id = new aq0.a("id").a();
    private static final aq0 __bestsellers_date = new aq0.a("date").a();
    private static final aq0 __contentSearch_q = new aq0.a("q").a();
    private static final aq0 __contentSearch_fq = new aq0.a("fq").a();
    private static final aq0 __contentSearch_sort = new aq0.a("sort").a();
    private static final aq0 __contentSearch_types = new aq0.a("types").a();
    private static final aq0 __dailyFive_version = new aq0.a("version").a();
    private static final aq0 __dailyFive_first = new aq0.a("first").a();
    private static final aq0 __followStatus_includeBulletin = new aq0.a("includeBulletin").a();
    private static final aq0 __categoriesOfChannels_includeBulletin = new aq0.a("includeBulletin").a();
    private static final aq0 __newsletterConfig_slug = new aq0.a("slug").a();
    private static final aq0 __home_id = new aq0.a("id").a();
    private static final aq0 __program_beta_id = new aq0.a("id").a();
    private static final aq0 __legacyCollection_id = new aq0.a("id").a();
    private static final aq0 __playlist_id = new aq0.a("id").a();
    private static final aq0 __anyWork_id = new aq0.a("id").a();
    private static final aq0 __anyWorks_ids = new aq0.a("ids").a();
    private static final aq0 __user_identifier = new aq0.a("identifier").a();

    /* renamed from: type, reason: collision with root package name */
    private static final dc5 f280type = new dc5.a("Query").b(i.e(RelayGraph.Companion.getType())).a();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dc5 getType() {
            return Query.f280type;
        }

        public final aq0 get__anyWork_id() {
            return Query.__anyWork_id;
        }

        public final aq0 get__anyWorks_ids() {
            return Query.__anyWorks_ids;
        }

        public final aq0 get__bestsellers_date() {
            return Query.__bestsellers_date;
        }

        public final aq0 get__categoriesOfChannels_includeBulletin() {
            return Query.__categoriesOfChannels_includeBulletin;
        }

        public final aq0 get__contentSearch_fq() {
            return Query.__contentSearch_fq;
        }

        public final aq0 get__contentSearch_q() {
            return Query.__contentSearch_q;
        }

        public final aq0 get__contentSearch_sort() {
            return Query.__contentSearch_sort;
        }

        public final aq0 get__contentSearch_types() {
            return Query.__contentSearch_types;
        }

        public final aq0 get__dailyFive_first() {
            return Query.__dailyFive_first;
        }

        public final aq0 get__dailyFive_version() {
            return Query.__dailyFive_version;
        }

        public final aq0 get__followStatus_includeBulletin() {
            return Query.__followStatus_includeBulletin;
        }

        public final aq0 get__home_id() {
            return Query.__home_id;
        }

        public final aq0 get__legacyCollection_id() {
            return Query.__legacyCollection_id;
        }

        public final aq0 get__newsletterConfig_slug() {
            return Query.__newsletterConfig_slug;
        }

        public final aq0 get__node_id() {
            return Query.__node_id;
        }

        public final aq0 get__onsiteMessaging_data() {
            return Query.__onsiteMessaging_data;
        }

        public final aq0 get__playlist_id() {
            return Query.__playlist_id;
        }

        public final aq0 get__program_beta_id() {
            return Query.__program_beta_id;
        }

        public final aq0 get__user_identifier() {
            return Query.__user_identifier;
        }

        private Companion() {
        }
    }
}
