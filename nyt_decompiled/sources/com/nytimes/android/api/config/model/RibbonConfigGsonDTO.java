package com.nytimes.android.api.config.model;

import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.chartbeat.androidsdk.QueryKeys;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes3.dex */
public final class RibbonConfigGsonDTO {
    private final String displayName;
    private final Boolean enabled;
    private final String endpoint;
    private final String id;
    private final Boolean isVisible;
    private final int position;
    private final String title;

    /* renamed from: type, reason: collision with root package name */
    private final String f59type;
    private final String url;

    public RibbonConfigGsonDTO(String str, String str2, String str3, int i, String str4, Boolean bool, Boolean bool2, String str5, String str6) {
        zq3.h(str4, TransferTable.COLUMN_TYPE);
        zq3.h(str5, "endpoint");
        this.id = str;
        this.title = str2;
        this.displayName = str3;
        this.position = i;
        this.f59type = str4;
        this.isVisible = bool;
        this.enabled = bool2;
        this.endpoint = str5;
        this.url = str6;
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.displayName;
    }

    public final int component4() {
        return this.position;
    }

    public final String component5() {
        return this.f59type;
    }

    public final Boolean component6() {
        return this.isVisible;
    }

    public final Boolean component7() {
        return this.enabled;
    }

    public final String component8() {
        return this.endpoint;
    }

    public final String component9() {
        return this.url;
    }

    public final RibbonConfigGsonDTO copy(String str, String str2, String str3, int i, String str4, Boolean bool, Boolean bool2, String str5, String str6) {
        zq3.h(str4, TransferTable.COLUMN_TYPE);
        zq3.h(str5, "endpoint");
        return new RibbonConfigGsonDTO(str, str2, str3, i, str4, bool, bool2, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RibbonConfigGsonDTO)) {
            return false;
        }
        RibbonConfigGsonDTO ribbonConfigGsonDTO = (RibbonConfigGsonDTO) obj;
        return zq3.c(this.id, ribbonConfigGsonDTO.id) && zq3.c(this.title, ribbonConfigGsonDTO.title) && zq3.c(this.displayName, ribbonConfigGsonDTO.displayName) && this.position == ribbonConfigGsonDTO.position && zq3.c(this.f59type, ribbonConfigGsonDTO.f59type) && zq3.c(this.isVisible, ribbonConfigGsonDTO.isVisible) && zq3.c(this.enabled, ribbonConfigGsonDTO.enabled) && zq3.c(this.endpoint, ribbonConfigGsonDTO.endpoint) && zq3.c(this.url, ribbonConfigGsonDTO.url);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final String getId() {
        return this.id;
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.f59type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        int hashCode3 = (((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.position)) * 31) + this.f59type.hashCode()) * 31;
        Boolean bool = this.isVisible;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enabled;
        int hashCode5 = (((hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.endpoint.hashCode()) * 31;
        String str4 = this.url;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final Boolean isVisible() {
        return this.isVisible;
    }

    public final RibbonConfigDTO toRibbonConfigDTO() {
        String str = this.id;
        if (str == null) {
            String str2 = this.title;
            str = str2 != null ? h.F(str2, " ", QueryKeys.END_MARKER, false, 4, null) : null;
            if (str == null) {
                str = DatasetUtils.UNKNOWN_IDENTITY_ID;
            }
        }
        String str3 = str;
        Boolean bool = this.isVisible;
        return new RibbonConfigDTO(str3, this.displayName, this.position, RibbonTabType.Companion.find(this.f59type), (bool == null && (bool = this.enabled) == null) ? false : bool.booleanValue(), RibbonTabEndpoint.Companion.find(this.endpoint), this.url);
    }

    public String toString() {
        return "RibbonConfigGsonDTO(id=" + this.id + ", title=" + this.title + ", displayName=" + this.displayName + ", position=" + this.position + ", type=" + this.f59type + ", isVisible=" + this.isVisible + ", enabled=" + this.enabled + ", endpoint=" + this.endpoint + ", url=" + this.url + ")";
    }

    public /* synthetic */ RibbonConfigGsonDTO(String str, String str2, String str3, int i, String str4, Boolean bool, Boolean bool2, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, i, str4, (i2 & 32) != 0 ? Boolean.FALSE : bool, (i2 & 64) != 0 ? Boolean.FALSE : bool2, str5, (i2 & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str6);
    }
}
