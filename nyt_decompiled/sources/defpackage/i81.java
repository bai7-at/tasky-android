package defpackage;

import com.nytimes.android.dailyfive.domain.ChannelCategory;
import com.nytimes.android.dailyfive.domain.DailyFiveArticle;
import com.nytimes.android.dailyfive.domain.DailyFiveCompletion;
import com.nytimes.android.dailyfive.domain.DailyFiveGames;
import com.nytimes.android.dailyfive.domain.DailyFivePack;
import com.nytimes.android.dailyfive.domain.DailyFiveSalutation;
import com.nytimes.android.dailyfive.domain.DailyFiveTrending;
import com.nytimes.android.dailyfive.domain.FollowStatus;
import com.nytimes.android.dailyfive.domain.GamesNode;
import com.nytimes.android.dailyfive.domain.NumberedArticleTrendingNode;
import com.nytimes.android.dailyfive.domain.NumberedGuideTrendingNode;
import com.nytimes.android.dailyfive.domain.NumberedInteractiveTrendingNode;
import com.nytimes.android.dailyfive.domain.a;
import com.nytimes.android.dailyfive.domain.b;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;

/* loaded from: classes4.dex */
public final class i81 {
    public static final i81 a = new i81();
    private static final i b;
    private static final JsonAdapter c;
    private static final JsonAdapter d;
    private static final JsonAdapter e;
    public static final int f;

    static {
        i.b bVar = new i.b();
        PolymorphicJsonAdapterFactory a2 = PolymorphicJsonAdapterFactory.a(a.class, "_json_type_");
        zq3.g(a2, "of(...)");
        PolymorphicJsonAdapterFactory b2 = a2.b(DailyFiveSalutation.class, "Salutation");
        zq3.g(b2, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b3 = b2.b(DailyFiveCompletion.class, "Completion");
        zq3.g(b3, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b4 = b3.b(DailyFiveArticle.class, "Article");
        zq3.g(b4, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b5 = b4.b(DailyFivePack.class, "Pack");
        zq3.g(b5, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b6 = b5.b(DailyFiveGames.class, "Games");
        zq3.g(b6, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b7 = b6.b(DailyFiveTrending.class, "Trending");
        zq3.g(b7, "withSubtype(...)");
        i.b a3 = bVar.a(b7);
        PolymorphicJsonAdapterFactory a4 = PolymorphicJsonAdapterFactory.a(b.class, "_json_type_");
        zq3.g(a4, "of(...)");
        PolymorphicJsonAdapterFactory b8 = a4.b(GamesNode.class, "GamesNode");
        zq3.g(b8, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b9 = b8.b(NumberedArticleTrendingNode.class, "NumberedArticleTrendingNode");
        zq3.g(b9, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b10 = b9.b(NumberedInteractiveTrendingNode.class, "NumberedInteractiveTrendingNode");
        zq3.g(b10, "withSubtype(...)");
        PolymorphicJsonAdapterFactory b11 = b10.b(NumberedGuideTrendingNode.class, "NumberedGuideTrendingNode");
        zq3.g(b11, "withSubtype(...)");
        i d2 = a3.a(b11).d();
        zq3.g(d2, "build(...)");
        b = d2;
        JsonAdapter d3 = d2.d(j.j(List.class, a.class));
        zq3.g(d3, "adapter(...)");
        c = d3;
        JsonAdapter d4 = d2.d(j.j(List.class, FollowStatus.class));
        zq3.g(d4, "adapter(...)");
        d = d4;
        JsonAdapter d5 = d2.d(j.j(List.class, ChannelCategory.class));
        zq3.g(d5, "adapter(...)");
        e = d5;
        f = 8;
    }

    private i81() {
    }

    public final JsonAdapter a() {
        return d;
    }

    public final JsonAdapter b() {
        return c;
    }
}
