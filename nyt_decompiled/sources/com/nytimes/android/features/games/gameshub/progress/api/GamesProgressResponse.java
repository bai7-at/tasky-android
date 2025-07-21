package com.nytimes.android.features.games.gameshub.progress.api;

import androidx.annotation.Keep;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@Keep
@lk7
/* loaded from: classes4.dex */
public final class GamesProgressResponse {
    private final GamesProgressResult gamesProgressResult;
    private final String status;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return GamesProgressResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GamesProgressResponse(int i, String str, GamesProgressResult gamesProgressResult, mk7 mk7Var) {
        if (3 != (i & 3)) {
            wv5.a(i, 3, GamesProgressResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.status = str;
        this.gamesProgressResult = gamesProgressResult;
    }

    public static /* synthetic */ GamesProgressResponse copy$default(GamesProgressResponse gamesProgressResponse, String str, GamesProgressResult gamesProgressResult, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gamesProgressResponse.status;
        }
        if ((i & 2) != 0) {
            gamesProgressResult = gamesProgressResponse.gamesProgressResult;
        }
        return gamesProgressResponse.copy(str, gamesProgressResult);
    }

    public static /* synthetic */ void getGamesProgressResult$annotations() {
    }

    public static final /* synthetic */ void write$Self$games_hub_release(GamesProgressResponse gamesProgressResponse, d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, gamesProgressResponse.status);
        dVar.z(serialDescriptor, 1, GamesProgressResult$$serializer.INSTANCE, gamesProgressResponse.gamesProgressResult);
    }

    public final String component1() {
        return this.status;
    }

    public final GamesProgressResult component2() {
        return this.gamesProgressResult;
    }

    public final GamesProgressResponse copy(String str, GamesProgressResult gamesProgressResult) {
        zq3.h(str, "status");
        zq3.h(gamesProgressResult, "gamesProgressResult");
        return new GamesProgressResponse(str, gamesProgressResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GamesProgressResponse)) {
            return false;
        }
        GamesProgressResponse gamesProgressResponse = (GamesProgressResponse) obj;
        return zq3.c(this.status, gamesProgressResponse.status) && zq3.c(this.gamesProgressResult, gamesProgressResponse.gamesProgressResult);
    }

    public final GamesProgressResult getGamesProgressResult() {
        return this.gamesProgressResult;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.gamesProgressResult.hashCode();
    }

    public String toString() {
        return "GamesProgressResponse(status=" + this.status + ", gamesProgressResult=" + this.gamesProgressResult + ")";
    }

    public GamesProgressResponse(String str, GamesProgressResult gamesProgressResult) {
        zq3.h(str, "status");
        zq3.h(gamesProgressResult, "gamesProgressResult");
        this.status = str;
        this.gamesProgressResult = gamesProgressResult;
    }
}
