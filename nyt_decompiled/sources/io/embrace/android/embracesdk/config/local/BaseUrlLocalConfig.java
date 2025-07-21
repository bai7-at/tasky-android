package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class BaseUrlLocalConfig {
    private final String config;
    private final String data;
    private final String dataDev;
    private final String images;

    public BaseUrlLocalConfig() {
        this(null, null, null, null, 15, null);
    }

    public final String getConfig() {
        return this.config;
    }

    public final String getData() {
        return this.data;
    }

    public final String getDataDev() {
        return this.dataDev;
    }

    public final String getImages() {
        return this.images;
    }

    public BaseUrlLocalConfig(@bt3(name = "config") String str, @bt3(name = "data") String str2, @bt3(name = "data_dev") String str3, @bt3(name = "images") String str4) {
        this.config = str;
        this.data = str2;
        this.dataDev = str3;
        this.images = str4;
    }

    public /* synthetic */ BaseUrlLocalConfig(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
