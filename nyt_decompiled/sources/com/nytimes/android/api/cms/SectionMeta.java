package com.nytimes.android.api.cms;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.AuthenticationTokenClaims;
import com.google.gson.annotations.SerializedName;
import com.nytimes.android.api.cms.SectionMeta;
import defpackage.ss2;
import defpackage.zq3;
import java.util.Comparator;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class SectionMeta {
    public static final Companion Companion = new Companion(null);
    private static final Comparator<SectionMeta> comparatorUS = new Comparator() { // from class: oh7
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int comparatorUS$lambda$0;
            comparatorUS$lambda$0 = SectionMeta.comparatorUS$lambda$0((SectionMeta) obj, (SectionMeta) obj2);
            return comparatorUS$lambda$0;
        }
    };

    @SerializedName("graphqlIdentifier")
    private final String graphqlIdentifier;

    @SerializedName("graphqlIdentifierV2")
    private final String graphqlIdentifierV2;

    @SerializedName("sectionHash")
    private final String hash;
    private final String iconUrl;

    @SerializedName("sectionName")
    private final String name;

    @SerializedName("fullfeed")
    private final String path;
    private final Date pubDate;
    private final String queryId;
    private final SectionQueryData queryOverride;
    private SectionConfigEntry sectionConfig;
    private final String title;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int compareTo(SectionMeta sectionMeta, SectionMeta sectionMeta2) {
            Integer rank = sectionMeta.getRank();
            Integer rank2 = sectionMeta2.getRank();
            if (rank == rank2) {
                return 0;
            }
            if (rank == null) {
                return 1;
            }
            if (rank2 == null) {
                return -1;
            }
            return zq3.j(rank.intValue(), rank2.intValue());
        }

        public final Comparator<SectionMeta> comparator() {
            return SectionMeta.comparatorUS;
        }

        public final ss2 named(final String str) {
            return new ss2() { // from class: com.nytimes.android.api.cms.SectionMeta$Companion$named$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                public final Boolean invoke(SectionMeta sectionMeta) {
                    zq3.h(sectionMeta, "section");
                    String str2 = str;
                    return Boolean.valueOf(str2 != null ? str2.equals(sectionMeta.getName()) : false);
                }
            };
        }

        private Companion() {
        }
    }

    public SectionMeta(String str, String str2, String str3, String str4, SectionQueryData sectionQueryData, String str5, String str6, Date date, SectionConfigEntry sectionConfigEntry, String str7, String str8) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "title");
        this.name = str;
        this.title = str2;
        this.path = str3;
        this.queryId = str4;
        this.queryOverride = sectionQueryData;
        this.hash = str5;
        this.iconUrl = str6;
        this.pubDate = date;
        this.sectionConfig = sectionConfigEntry;
        this.graphqlIdentifier = str7;
        this.graphqlIdentifierV2 = str8;
    }

    public static final Comparator<SectionMeta> comparator() {
        return Companion.comparator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int comparatorUS$lambda$0(SectionMeta sectionMeta, SectionMeta sectionMeta2) {
        Companion companion = Companion;
        zq3.e(sectionMeta);
        zq3.e(sectionMeta2);
        return companion.compareTo(sectionMeta, sectionMeta2);
    }

    public static final ss2 named(String str) {
        return Companion.named(str);
    }

    public final String component1() {
        return this.name;
    }

    public final String component10() {
        return this.graphqlIdentifier;
    }

    public final String component11() {
        return this.graphqlIdentifierV2;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.path;
    }

    public final String component4() {
        return this.queryId;
    }

    public final SectionQueryData component5() {
        return this.queryOverride;
    }

    public final String component6() {
        return this.hash;
    }

    public final String component7() {
        return this.iconUrl;
    }

    public final Date component8() {
        return this.pubDate;
    }

    public final SectionConfigEntry component9() {
        return this.sectionConfig;
    }

    public final SectionMeta copy(String str, String str2, String str3, String str4, SectionQueryData sectionQueryData, String str5, String str6, Date date, SectionConfigEntry sectionConfigEntry, String str7, String str8) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(str2, "title");
        return new SectionMeta(str, str2, str3, str4, sectionQueryData, str5, str6, date, sectionConfigEntry, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionMeta)) {
            return false;
        }
        SectionMeta sectionMeta = (SectionMeta) obj;
        return zq3.c(this.name, sectionMeta.name) && zq3.c(this.title, sectionMeta.title) && zq3.c(this.path, sectionMeta.path) && zq3.c(this.queryId, sectionMeta.queryId) && zq3.c(this.queryOverride, sectionMeta.queryOverride) && zq3.c(this.hash, sectionMeta.hash) && zq3.c(this.iconUrl, sectionMeta.iconUrl) && zq3.c(this.pubDate, sectionMeta.pubDate) && zq3.c(this.sectionConfig, sectionMeta.sectionConfig) && zq3.c(this.graphqlIdentifier, sectionMeta.graphqlIdentifier) && zq3.c(this.graphqlIdentifierV2, sectionMeta.graphqlIdentifierV2);
    }

    public final String getGraphqlIdentifier() {
        return this.graphqlIdentifier;
    }

    public final String getGraphqlIdentifierV2() {
        return this.graphqlIdentifierV2;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final Date getPubDate() {
        return this.pubDate;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final SectionQueryData getQueryOverride() {
        return this.queryOverride;
    }

    public final Integer getRank() {
        SectionConfigEntry sectionConfigEntry = this.sectionConfig;
        if (sectionConfigEntry != null) {
            return sectionConfigEntry.getRank();
        }
        return null;
    }

    public final SectionConfigEntry getSectionConfig() {
        return this.sectionConfig;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.path;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.queryId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SectionQueryData sectionQueryData = this.queryOverride;
        int hashCode4 = (hashCode3 + (sectionQueryData == null ? 0 : sectionQueryData.hashCode())) * 31;
        String str3 = this.hash;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Date date = this.pubDate;
        int hashCode7 = (hashCode6 + (date == null ? 0 : date.hashCode())) * 31;
        SectionConfigEntry sectionConfigEntry = this.sectionConfig;
        int hashCode8 = (hashCode7 + (sectionConfigEntry == null ? 0 : sectionConfigEntry.hashCode())) * 31;
        String str5 = this.graphqlIdentifier;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.graphqlIdentifierV2;
        return hashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isAlwaysDefault() {
        SectionConfigEntry sectionConfigEntry = this.sectionConfig;
        if (sectionConfigEntry != null) {
            return sectionConfigEntry.isAlwaysDefault();
        }
        return false;
    }

    public final boolean isDefault() {
        SectionConfigEntry sectionConfigEntry = this.sectionConfig;
        if (sectionConfigEntry != null) {
            return sectionConfigEntry.isDefaultSection();
        }
        return false;
    }

    public final boolean isPremier() {
        SectionConfigEntry sectionConfigEntry = this.sectionConfig;
        if (sectionConfigEntry != null) {
            return sectionConfigEntry.isPremier();
        }
        return false;
    }

    public final void setSectionConfig(SectionConfigEntry sectionConfigEntry) {
        this.sectionConfig = sectionConfigEntry;
    }

    public String toString() {
        return "SectionMeta(name=" + this.name + ", title=" + this.title + ", path=" + this.path + ", queryId=" + this.queryId + ", queryOverride=" + this.queryOverride + ", hash=" + this.hash + ", iconUrl=" + this.iconUrl + ", pubDate=" + this.pubDate + ", sectionConfig=" + this.sectionConfig + ", graphqlIdentifier=" + this.graphqlIdentifier + ", graphqlIdentifierV2=" + this.graphqlIdentifierV2 + ")";
    }

    public /* synthetic */ SectionMeta(String str, String str2, String str3, String str4, SectionQueryData sectionQueryData, String str5, String str6, Date date, SectionConfigEntry sectionConfigEntry, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : sectionQueryData, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : date, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : sectionConfigEntry, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8);
    }
}
