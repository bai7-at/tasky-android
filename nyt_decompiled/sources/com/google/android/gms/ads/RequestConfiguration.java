package com.google.android.gms.ads;

import defpackage.g1f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class RequestConfiguration {
    public static final List f = Arrays.asList("MA", "T", "PG", "G");
    private final int a;
    private final int b;
    private final String c;
    private final List d;
    private final PublisherPrivacyPersonalizationState e;

    public enum PublisherPrivacyPersonalizationState {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);

        private final int zzb;

        PublisherPrivacyPersonalizationState(int i) {
            this.zzb = i;
        }

        public int getValue() {
            return this.zzb;
        }
    }

    public static class a {
        private int a = -1;
        private int b = -1;
        private String c = null;
        private final List d = new ArrayList();
        private PublisherPrivacyPersonalizationState e = PublisherPrivacyPersonalizationState.DEFAULT;

        public RequestConfiguration a() {
            return new RequestConfiguration(this.a, this.b, this.c, this.d, this.e, null);
        }
    }

    /* synthetic */ RequestConfiguration(int i, int i2, String str, List list, PublisherPrivacyPersonalizationState publisherPrivacyPersonalizationState, g1f g1fVar) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = list;
        this.e = publisherPrivacyPersonalizationState;
    }

    public String a() {
        String str = this.c;
        return str == null ? "" : str;
    }

    public PublisherPrivacyPersonalizationState b() {
        return this.e;
    }

    public int c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public List e() {
        return new ArrayList(this.d);
    }
}
