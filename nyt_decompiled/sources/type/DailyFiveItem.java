package type;

import defpackage.vw8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class DailyFiveItem {
    public static final Companion Companion = new Companion(null);

    /* renamed from: type, reason: collision with root package name */
    private static final vw8 f159type = new vw8("DailyFiveItem", DailyFiveSalutation.Companion.getType(), DailyFiveInterestCollection.Companion.getType(), DailyFiveCompletion.Companion.getType(), DailyFiveNumbered.Companion.getType(), DailyFiveGames.Companion.getType(), DailyFiveTrending.Companion.getType(), DailyFiveSurvey.Companion.getType(), DailyFiveItemGroup.Companion.getType(), DailyFivePushPromo.Companion.getType());

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final vw8 getType() {
            return DailyFiveItem.f159type;
        }

        private Companion() {
        }
    }
}
