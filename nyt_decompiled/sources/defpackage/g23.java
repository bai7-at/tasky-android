package defpackage;

import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.external.store3.base.impl.StalePolicy;
import com.nytimes.android.section.sectionfront.SectionFrontPersister;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class g23 extends pr6 implements eh7 {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final sp4 b() {
            return sp4.a().d(1L).c(TimeUnit.HOURS.toSeconds(24L)).b(TimeUnit.SECONDS).a();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g23(lf7 lf7Var, SectionFrontPersister sectionFrontPersister) {
        super(lf7Var, sectionFrontPersister, new bp5() { // from class: f23
            @Override // defpackage.bp5, io.reactivex.functions.Function
            public final Object apply(Object obj) {
                SectionFront b;
                b = g23.b((SectionFront) obj);
                return b;
            }
        }, Companion.b(), StalePolicy.NETWORK_BEFORE_STALE);
        zq3.h(lf7Var, "fetcher");
        zq3.h(sectionFrontPersister, "persister");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SectionFront b(SectionFront sectionFront) {
        zq3.h(sectionFront, "it");
        return sectionFront;
    }
}
