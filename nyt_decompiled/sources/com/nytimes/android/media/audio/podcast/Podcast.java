package com.nytimes.android.media.audio.podcast;

import defpackage.et3;
import defpackage.zq3;
import defpackage.zv5;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class Podcast implements zv5 {
    private final zv5 a;
    private final List b;

    public Podcast(zv5 zv5Var, List list) {
        zq3.h(zv5Var, "data");
        zq3.h(list, "episodes");
        this.a = zv5Var;
        this.b = list;
    }

    @Override // defpackage.zv5
    public String a() {
        return this.a.a();
    }

    @Override // defpackage.zv5
    public String b() {
        return this.a.b();
    }

    public final zv5 c() {
        return this.a;
    }

    public final List d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Podcast)) {
            return false;
        }
        Podcast podcast = (Podcast) obj;
        return zq3.c(this.a, podcast.a) && zq3.c(this.b, podcast.b);
    }

    @Override // defpackage.zv5
    public String getDescription() {
        return this.a.getDescription();
    }

    @Override // defpackage.zv5
    public String getId() {
        return this.a.getId();
    }

    @Override // defpackage.zv5
    public String getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.zv5
    public PodcastTypeInfo getType() {
        return this.a.getType();
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Podcast(data=" + this.a + ", episodes=" + this.b + ")";
    }
}
