package com.nytimes.android.saved;

import com.nytimes.android.api.cms.Asset;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.s87;
import defpackage.zq3;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes4.dex */
public final class SavedAssetIndex implements Comparable<SavedAssetIndex>, s87 {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String DATE_FMT = "yyyy-MM-dd'T'HH:mm:ssZ";
    private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FMT, Locale.US);
    private final String savedDate;
    private final String uri;
    private final String url;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SavedAssetIndex a(Asset asset, String str) {
            zq3.h(asset, "asset");
            String urlOrEmpty = asset.getUrlOrEmpty();
            if (str == null) {
                str = SavedAssetIndex.simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
            }
            zq3.e(str);
            return new SavedAssetIndex(urlOrEmpty, str, asset.getSafeUri());
        }

        public final SavedAssetIndex b(s87 s87Var) {
            zq3.h(s87Var, "saveable");
            String url = s87Var.getUrl();
            String format = SavedAssetIndex.simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
            zq3.g(format, "format(...)");
            return new SavedAssetIndex(url, format, s87Var.getUri());
        }

        public final KSerializer serializer() {
            return SavedAssetIndex$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SavedAssetIndex() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SavedAssetIndex copy$default(SavedAssetIndex savedAssetIndex, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = savedAssetIndex.url;
        }
        if ((i & 2) != 0) {
            str2 = savedAssetIndex.savedDate;
        }
        if ((i & 4) != 0) {
            str3 = savedAssetIndex.uri;
        }
        return savedAssetIndex.copy(str, str2, str3);
    }

    public static /* synthetic */ void getSavedDate$annotations() {
    }

    public static /* synthetic */ void getUri$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$saved_manager_release(SavedAssetIndex savedAssetIndex, d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.A(serialDescriptor, 0) || !zq3.c(savedAssetIndex.getUrl(), "")) {
            dVar.y(serialDescriptor, 0, savedAssetIndex.getUrl());
        }
        if (dVar.A(serialDescriptor, 1) || !zq3.c(savedAssetIndex.savedDate, "")) {
            dVar.y(serialDescriptor, 1, savedAssetIndex.savedDate);
        }
        if (!dVar.A(serialDescriptor, 2) && zq3.c(savedAssetIndex.getUri(), "")) {
            return;
        }
        dVar.y(serialDescriptor, 2, savedAssetIndex.getUri());
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.savedDate;
    }

    public final String component3() {
        return this.uri;
    }

    public final SavedAssetIndex copy(String str, String str2, String str3) {
        zq3.h(str, "url");
        zq3.h(str2, "savedDate");
        zq3.h(str3, "uri");
        return new SavedAssetIndex(str, str2, str3);
    }

    public boolean equals(Object obj) {
        return obj instanceof SavedAssetIndex ? zq3.c(((SavedAssetIndex) obj).getUrl(), getUrl()) : super.equals(obj);
    }

    public final String getSavedDate() {
        return this.savedDate;
    }

    @Override // defpackage.s87
    public String getUri() {
        return this.uri;
    }

    @Override // defpackage.s87
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return getUrl().hashCode();
    }

    public String toString() {
        return getUrl() + " " + this.savedDate;
    }

    public final SavedAssetIndex withTimestamp(long j) {
        String format = simpleDateFormat.format(Long.valueOf(j));
        zq3.g(format, "format(...)");
        return copy$default(this, null, format, null, 5, null);
    }

    public /* synthetic */ SavedAssetIndex(int i, String str, String str2, String str3, mk7 mk7Var) {
        if ((i & 1) == 0) {
            this.url = "";
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.savedDate = "";
        } else {
            this.savedDate = str2;
        }
        if ((i & 4) == 0) {
            this.uri = "";
        } else {
            this.uri = str3;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(SavedAssetIndex savedAssetIndex) {
        zq3.h(savedAssetIndex, "other");
        return savedAssetIndex.savedDate.compareTo(this.savedDate);
    }

    public SavedAssetIndex(String str, String str2, String str3) {
        zq3.h(str, "url");
        zq3.h(str2, "savedDate");
        zq3.h(str3, "uri");
        this.url = str;
        this.savedDate = str2;
        this.uri = str3;
    }

    public /* synthetic */ SavedAssetIndex(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
