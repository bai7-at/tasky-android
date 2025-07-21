package type;

import com.nytimes.android.api.cms.AssetConstants;
import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SubscriberOnboardingProductPreferencesInput {
    private final nk5 athletic;
    private final nk5 audio;
    private final nk5 cooking;
    private final nk5 games;
    private final nk5 news;
    private final nk5 wirecutter;

    public SubscriberOnboardingProductPreferencesInput() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SubscriberOnboardingProductPreferencesInput copy$default(SubscriberOnboardingProductPreferencesInput subscriberOnboardingProductPreferencesInput, nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = subscriberOnboardingProductPreferencesInput.athletic;
        }
        if ((i & 2) != 0) {
            nk5Var2 = subscriberOnboardingProductPreferencesInput.audio;
        }
        nk5 nk5Var7 = nk5Var2;
        if ((i & 4) != 0) {
            nk5Var3 = subscriberOnboardingProductPreferencesInput.cooking;
        }
        nk5 nk5Var8 = nk5Var3;
        if ((i & 8) != 0) {
            nk5Var4 = subscriberOnboardingProductPreferencesInput.games;
        }
        nk5 nk5Var9 = nk5Var4;
        if ((i & 16) != 0) {
            nk5Var5 = subscriberOnboardingProductPreferencesInput.news;
        }
        nk5 nk5Var10 = nk5Var5;
        if ((i & 32) != 0) {
            nk5Var6 = subscriberOnboardingProductPreferencesInput.wirecutter;
        }
        return subscriberOnboardingProductPreferencesInput.copy(nk5Var, nk5Var7, nk5Var8, nk5Var9, nk5Var10, nk5Var6);
    }

    public final nk5 component1() {
        return this.athletic;
    }

    public final nk5 component2() {
        return this.audio;
    }

    public final nk5 component3() {
        return this.cooking;
    }

    public final nk5 component4() {
        return this.games;
    }

    public final nk5 component5() {
        return this.news;
    }

    public final nk5 component6() {
        return this.wirecutter;
    }

    public final SubscriberOnboardingProductPreferencesInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6) {
        zq3.h(nk5Var, "athletic");
        zq3.h(nk5Var2, AssetConstants.AUDIO_TYPE);
        zq3.h(nk5Var3, "cooking");
        zq3.h(nk5Var4, "games");
        zq3.h(nk5Var5, "news");
        zq3.h(nk5Var6, "wirecutter");
        return new SubscriberOnboardingProductPreferencesInput(nk5Var, nk5Var2, nk5Var3, nk5Var4, nk5Var5, nk5Var6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriberOnboardingProductPreferencesInput)) {
            return false;
        }
        SubscriberOnboardingProductPreferencesInput subscriberOnboardingProductPreferencesInput = (SubscriberOnboardingProductPreferencesInput) obj;
        return zq3.c(this.athletic, subscriberOnboardingProductPreferencesInput.athletic) && zq3.c(this.audio, subscriberOnboardingProductPreferencesInput.audio) && zq3.c(this.cooking, subscriberOnboardingProductPreferencesInput.cooking) && zq3.c(this.games, subscriberOnboardingProductPreferencesInput.games) && zq3.c(this.news, subscriberOnboardingProductPreferencesInput.news) && zq3.c(this.wirecutter, subscriberOnboardingProductPreferencesInput.wirecutter);
    }

    public final nk5 getAthletic() {
        return this.athletic;
    }

    public final nk5 getAudio() {
        return this.audio;
    }

    public final nk5 getCooking() {
        return this.cooking;
    }

    public final nk5 getGames() {
        return this.games;
    }

    public final nk5 getNews() {
        return this.news;
    }

    public final nk5 getWirecutter() {
        return this.wirecutter;
    }

    public int hashCode() {
        return (((((((((this.athletic.hashCode() * 31) + this.audio.hashCode()) * 31) + this.cooking.hashCode()) * 31) + this.games.hashCode()) * 31) + this.news.hashCode()) * 31) + this.wirecutter.hashCode();
    }

    public String toString() {
        return "SubscriberOnboardingProductPreferencesInput(athletic=" + this.athletic + ", audio=" + this.audio + ", cooking=" + this.cooking + ", games=" + this.games + ", news=" + this.news + ", wirecutter=" + this.wirecutter + ")";
    }

    public SubscriberOnboardingProductPreferencesInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6) {
        zq3.h(nk5Var, "athletic");
        zq3.h(nk5Var2, AssetConstants.AUDIO_TYPE);
        zq3.h(nk5Var3, "cooking");
        zq3.h(nk5Var4, "games");
        zq3.h(nk5Var5, "news");
        zq3.h(nk5Var6, "wirecutter");
        this.athletic = nk5Var;
        this.audio = nk5Var2;
        this.cooking = nk5Var3;
        this.games = nk5Var4;
        this.news = nk5Var5;
        this.wirecutter = nk5Var6;
    }

    public /* synthetic */ SubscriberOnboardingProductPreferencesInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3, (i & 8) != 0 ? nk5.a.b : nk5Var4, (i & 16) != 0 ? nk5.a.b : nk5Var5, (i & 32) != 0 ? nk5.a.b : nk5Var6);
    }
}
