package com.nytimes.xwords.hybrid.bridgecommands.reponse;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.h;
import defpackage.er2;
import defpackage.um8;
import defpackage.xt2;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class GameDataResponseAdapter {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @er2
    public final xt2 fromJson(JsonReader jsonReader) {
        zq3.h(jsonReader, "jsonReader");
        jsonReader.b();
        jsonReader.f0();
        jsonReader.b();
        String nextName = jsonReader.nextName();
        jsonReader.b();
        JsonReader.b a2 = JsonReader.b.a("puzzleID", "analyticsPuzzleID");
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int P = jsonReader.P(a2);
            if (P == -1) {
                jsonReader.f0();
                jsonReader.skipValue();
            } else if (P == 0) {
                str = jsonReader.nextString();
            } else if (P == 1) {
                str2 = jsonReader.nextString();
            }
        }
        jsonReader.h();
        jsonReader.h();
        jsonReader.h();
        zq3.e(nextName);
        zq3.e(str2);
        return new xt2(nextName, str, str2);
    }

    @um8
    public final void toJson(h hVar, xt2 xt2Var) {
        zq3.h(hVar, "jsonWriter");
        zq3.h(xt2Var, "gameDataResponse");
        hVar.d();
        hVar.C("gamesGetGameData");
        hVar.d();
        hVar.C(xt2Var.b());
        hVar.d();
        hVar.C("puzzleID");
        hVar.K0(xt2Var.c());
        hVar.C("analyticsPuzzleID");
        hVar.K0(xt2Var.a());
        hVar.l();
        hVar.l();
        hVar.l();
    }
}
