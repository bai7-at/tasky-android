package com.nytimes.android.api.cms;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Slideshow {
    private final List<Image> slides;

    public Slideshow(List<Image> list) {
        zq3.h(list, "slides");
        this.slides = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slideshow copy$default(Slideshow slideshow, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = slideshow.slides;
        }
        return slideshow.copy(list);
    }

    public final List<Image> component1() {
        return this.slides;
    }

    public final Slideshow copy(List<Image> list) {
        zq3.h(list, "slides");
        return new Slideshow(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Slideshow) && zq3.c(this.slides, ((Slideshow) obj).slides);
    }

    public final List<Image> getSlides() {
        return this.slides;
    }

    public int hashCode() {
        return this.slides.hashCode();
    }

    public String toString() {
        return "Slideshow(slides=" + this.slides + ")";
    }
}
