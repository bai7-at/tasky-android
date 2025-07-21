package type;

import defpackage.nk5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class SubscriberOnboardingGamesPreferencesInput {
    private final nk5 connections;
    private final nk5 crossword;
    private final nk5 spellingBee;
    private final nk5 theMini;
    private final nk5 tiles;
    private final nk5 wordle;

    public SubscriberOnboardingGamesPreferencesInput() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SubscriberOnboardingGamesPreferencesInput copy$default(SubscriberOnboardingGamesPreferencesInput subscriberOnboardingGamesPreferencesInput, nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, int i, Object obj) {
        if ((i & 1) != 0) {
            nk5Var = subscriberOnboardingGamesPreferencesInput.connections;
        }
        if ((i & 2) != 0) {
            nk5Var2 = subscriberOnboardingGamesPreferencesInput.crossword;
        }
        nk5 nk5Var7 = nk5Var2;
        if ((i & 4) != 0) {
            nk5Var3 = subscriberOnboardingGamesPreferencesInput.spellingBee;
        }
        nk5 nk5Var8 = nk5Var3;
        if ((i & 8) != 0) {
            nk5Var4 = subscriberOnboardingGamesPreferencesInput.theMini;
        }
        nk5 nk5Var9 = nk5Var4;
        if ((i & 16) != 0) {
            nk5Var5 = subscriberOnboardingGamesPreferencesInput.tiles;
        }
        nk5 nk5Var10 = nk5Var5;
        if ((i & 32) != 0) {
            nk5Var6 = subscriberOnboardingGamesPreferencesInput.wordle;
        }
        return subscriberOnboardingGamesPreferencesInput.copy(nk5Var, nk5Var7, nk5Var8, nk5Var9, nk5Var10, nk5Var6);
    }

    public final nk5 component1() {
        return this.connections;
    }

    public final nk5 component2() {
        return this.crossword;
    }

    public final nk5 component3() {
        return this.spellingBee;
    }

    public final nk5 component4() {
        return this.theMini;
    }

    public final nk5 component5() {
        return this.tiles;
    }

    public final nk5 component6() {
        return this.wordle;
    }

    public final SubscriberOnboardingGamesPreferencesInput copy(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6) {
        zq3.h(nk5Var, "connections");
        zq3.h(nk5Var2, "crossword");
        zq3.h(nk5Var3, "spellingBee");
        zq3.h(nk5Var4, "theMini");
        zq3.h(nk5Var5, "tiles");
        zq3.h(nk5Var6, "wordle");
        return new SubscriberOnboardingGamesPreferencesInput(nk5Var, nk5Var2, nk5Var3, nk5Var4, nk5Var5, nk5Var6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriberOnboardingGamesPreferencesInput)) {
            return false;
        }
        SubscriberOnboardingGamesPreferencesInput subscriberOnboardingGamesPreferencesInput = (SubscriberOnboardingGamesPreferencesInput) obj;
        return zq3.c(this.connections, subscriberOnboardingGamesPreferencesInput.connections) && zq3.c(this.crossword, subscriberOnboardingGamesPreferencesInput.crossword) && zq3.c(this.spellingBee, subscriberOnboardingGamesPreferencesInput.spellingBee) && zq3.c(this.theMini, subscriberOnboardingGamesPreferencesInput.theMini) && zq3.c(this.tiles, subscriberOnboardingGamesPreferencesInput.tiles) && zq3.c(this.wordle, subscriberOnboardingGamesPreferencesInput.wordle);
    }

    public final nk5 getConnections() {
        return this.connections;
    }

    public final nk5 getCrossword() {
        return this.crossword;
    }

    public final nk5 getSpellingBee() {
        return this.spellingBee;
    }

    public final nk5 getTheMini() {
        return this.theMini;
    }

    public final nk5 getTiles() {
        return this.tiles;
    }

    public final nk5 getWordle() {
        return this.wordle;
    }

    public int hashCode() {
        return (((((((((this.connections.hashCode() * 31) + this.crossword.hashCode()) * 31) + this.spellingBee.hashCode()) * 31) + this.theMini.hashCode()) * 31) + this.tiles.hashCode()) * 31) + this.wordle.hashCode();
    }

    public String toString() {
        return "SubscriberOnboardingGamesPreferencesInput(connections=" + this.connections + ", crossword=" + this.crossword + ", spellingBee=" + this.spellingBee + ", theMini=" + this.theMini + ", tiles=" + this.tiles + ", wordle=" + this.wordle + ")";
    }

    public SubscriberOnboardingGamesPreferencesInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6) {
        zq3.h(nk5Var, "connections");
        zq3.h(nk5Var2, "crossword");
        zq3.h(nk5Var3, "spellingBee");
        zq3.h(nk5Var4, "theMini");
        zq3.h(nk5Var5, "tiles");
        zq3.h(nk5Var6, "wordle");
        this.connections = nk5Var;
        this.crossword = nk5Var2;
        this.spellingBee = nk5Var3;
        this.theMini = nk5Var4;
        this.tiles = nk5Var5;
        this.wordle = nk5Var6;
    }

    public /* synthetic */ SubscriberOnboardingGamesPreferencesInput(nk5 nk5Var, nk5 nk5Var2, nk5 nk5Var3, nk5 nk5Var4, nk5 nk5Var5, nk5 nk5Var6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? nk5.a.b : nk5Var, (i & 2) != 0 ? nk5.a.b : nk5Var2, (i & 4) != 0 ? nk5.a.b : nk5Var3, (i & 8) != 0 ? nk5.a.b : nk5Var4, (i & 16) != 0 ? nk5.a.b : nk5Var5, (i & 32) != 0 ? nk5.a.b : nk5Var6);
    }
}
