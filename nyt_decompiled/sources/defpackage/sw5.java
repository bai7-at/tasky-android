package defpackage;

import com.apollographql.apollo.api.json.JsonReader;
import defpackage.lw5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.collections.i;
import type.PodcastService;
import type.adapter.PodcastService_ResponseAdapter;

/* loaded from: classes3.dex */
public final class sw5 implements h8 {
    public static final sw5 a = new sw5();
    private static final List b = i.o("__typename", "url", "podcastService");

    private sw5() {
    }

    @Override // defpackage.h8
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public lw5.h fromJson(JsonReader jsonReader, w41 w41Var) {
        zq3.h(jsonReader, "reader");
        zq3.h(w41Var, "customScalarAdapters");
        String str = null;
        String str2 = null;
        PodcastService podcastService = null;
        while (true) {
            int l1 = jsonReader.l1(b);
            if (l1 == 0) {
                str = (String) j8.a.fromJson(jsonReader, w41Var);
            } else if (l1 == 1) {
                str2 = (String) j8.a.fromJson(jsonReader, w41Var);
            } else {
                if (l1 != 2) {
                    break;
                }
                podcastService = PodcastService_ResponseAdapter.INSTANCE.fromJson(jsonReader, w41Var);
            }
        }
        if (str == null) {
            vr.a(jsonReader, "__typename");
            throw new KotlinNothingValueException();
        }
        if (str2 == null) {
            vr.a(jsonReader, "url");
            throw new KotlinNothingValueException();
        }
        if (podcastService != null) {
            return new lw5.h(str, str2, podcastService);
        }
        vr.a(jsonReader, "podcastService");
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.h8
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(lu3 lu3Var, w41 w41Var, lw5.h hVar) {
        zq3.h(lu3Var, "writer");
        zq3.h(w41Var, "customScalarAdapters");
        zq3.h(hVar, "value");
        lu3Var.name("__typename");
        h8 h8Var = j8.a;
        h8Var.toJson(lu3Var, w41Var, hVar.c());
        lu3Var.name("url");
        h8Var.toJson(lu3Var, w41Var, hVar.b());
        lu3Var.name("podcastService");
        PodcastService_ResponseAdapter.INSTANCE.toJson(lu3Var, w41Var, hVar.a());
    }
}
