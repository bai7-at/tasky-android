package type;

import defpackage.vw8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class InterestData {
    public static final Companion Companion = new Companion(null);

    /* renamed from: type, reason: collision with root package name */
    private static final vw8 f218type = new vw8("InterestData", ColumnInterest.Companion.getType(), NewsletterInterest.Companion.getType(), ShuffleInterest.Companion.getType(), NewsQuizInterest.Companion.getType(), FlashbackQuizInterest.Companion.getType(), MultiStreamInterest.Companion.getType(), FilterInterest.Companion.getType(), AudioInterest.Companion.getType(), BooksInterest.Companion.getType());

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vw8 getType() {
            return InterestData.f218type;
        }

        private Companion() {
        }
    }
}
