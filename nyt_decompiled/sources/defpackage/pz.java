package defpackage;

import com.nytimes.android.ribbon.destinations.audio.AudioHeroData;
import com.nytimes.android.ribbon.destinations.audio.FooterData;
import java.util.List;

/* loaded from: classes4.dex */
public final class pz {
    private final AudioHeroData a;
    private final List b;
    private final FooterData c;

    public pz(AudioHeroData audioHeroData, List list, FooterData footerData) {
        zq3.h(audioHeroData, "hero");
        zq3.h(list, "podcastModules");
        zq3.h(footerData, "viewAllModule");
        this.a = audioHeroData;
        this.b = list;
        this.c = footerData;
    }

    public final AudioHeroData a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public final FooterData c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz)) {
            return false;
        }
        pz pzVar = (pz) obj;
        return zq3.c(this.a, pzVar.a) && zq3.c(this.b, pzVar.b) && zq3.c(this.c, pzVar.c);
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "AudioViewState(hero=" + this.a + ", podcastModules=" + this.b + ", viewAllModule=" + this.c + ")";
    }
}
