package com.nytimes.android.media.audio.podcast;

import com.nytimes.android.utils.TimeDuration;
import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Episode {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final TimeDuration g;
    private final List h;

    public Episode(String str, String str2, String str3, String str4, String str5, String str6, TimeDuration timeDuration, List list) {
        zq3.h(str, "title");
        zq3.h(str2, "description");
        zq3.h(str4, "webLink");
        zq3.h(str5, "mediaUrl");
        zq3.h(str6, "section");
        zq3.h(timeDuration, "duration");
        zq3.h(list, "subscriptions");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = timeDuration;
        this.h = list;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final TimeDuration c() {
        return this.g;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode) obj;
        return zq3.c(this.a, episode.a) && zq3.c(this.b, episode.b) && zq3.c(this.c, episode.c) && zq3.c(this.d, episode.d) && zq3.c(this.e, episode.e) && zq3.c(this.f, episode.f) && zq3.c(this.g, episode.g) && zq3.c(this.h, episode.h);
    }

    public final List f() {
        return this.h;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        return ((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "Episode(title=" + this.a + ", description=" + this.b + ", date=" + this.c + ", webLink=" + this.d + ", mediaUrl=" + this.e + ", section=" + this.f + ", duration=" + this.g + ", subscriptions=" + this.h + ")";
    }
}
