package com.nytimes.android.api.config.model;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.l48;
import defpackage.lk7;
import defpackage.mk7;
import defpackage.wv5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.d;

@lk7
/* loaded from: classes3.dex */
public final class RibbonConfigDTO {
    private final String displayName;
    private final boolean enabled;
    private final RibbonTabEndpoint endpoint;
    private final String id;
    private final int position;

    /* renamed from: type, reason: collision with root package name */
    private final RibbonTabType f58type;
    private final String url;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer[] $childSerializers = {null, null, null, RibbonTabType.Companion.serializer(), null, RibbonTabEndpoint.Companion.serializer(), null};
    private static final RibbonConfigDTO TODAY_TAB = new RibbonConfigDTO("today", "Today", 5, RibbonTabType.NEWS, true, RibbonTabEndpoint.PERSONALIZED, "");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RibbonConfigDTO getTODAY_TAB() {
            return RibbonConfigDTO.TODAY_TAB;
        }

        public final KSerializer serializer() {
            return RibbonConfigDTO$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RibbonConfigDTO(int i, String str, String str2, int i2, RibbonTabType ribbonTabType, boolean z, RibbonTabEndpoint ribbonTabEndpoint, String str3, mk7 mk7Var) {
        if (29 != (i & 29)) {
            wv5.a(i, 29, RibbonConfigDTO$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str2;
        }
        this.position = i2;
        this.f58type = ribbonTabType;
        this.enabled = z;
        if ((i & 32) == 0) {
            this.endpoint = RibbonTabEndpoint.GENERIC;
        } else {
            this.endpoint = ribbonTabEndpoint;
        }
        if ((i & 64) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
    }

    public static /* synthetic */ RibbonConfigDTO copy$default(RibbonConfigDTO ribbonConfigDTO, String str, String str2, int i, RibbonTabType ribbonTabType, boolean z, RibbonTabEndpoint ribbonTabEndpoint, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ribbonConfigDTO.id;
        }
        if ((i2 & 2) != 0) {
            str2 = ribbonConfigDTO.displayName;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = ribbonConfigDTO.position;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            ribbonTabType = ribbonConfigDTO.f58type;
        }
        RibbonTabType ribbonTabType2 = ribbonTabType;
        if ((i2 & 16) != 0) {
            z = ribbonConfigDTO.enabled;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            ribbonTabEndpoint = ribbonConfigDTO.endpoint;
        }
        RibbonTabEndpoint ribbonTabEndpoint2 = ribbonTabEndpoint;
        if ((i2 & 64) != 0) {
            str3 = ribbonConfigDTO.url;
        }
        return ribbonConfigDTO.copy(str, str4, i3, ribbonTabType2, z2, ribbonTabEndpoint2, str3);
    }

    public static final /* synthetic */ void write$Self$api_lib_release(RibbonConfigDTO ribbonConfigDTO, d dVar, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = $childSerializers;
        dVar.y(serialDescriptor, 0, ribbonConfigDTO.id);
        if (dVar.A(serialDescriptor, 1) || ribbonConfigDTO.displayName != null) {
            dVar.l(serialDescriptor, 1, l48.a, ribbonConfigDTO.displayName);
        }
        dVar.w(serialDescriptor, 2, ribbonConfigDTO.position);
        dVar.z(serialDescriptor, 3, kSerializerArr[3], ribbonConfigDTO.f58type);
        dVar.x(serialDescriptor, 4, ribbonConfigDTO.enabled);
        if (dVar.A(serialDescriptor, 5) || ribbonConfigDTO.endpoint != RibbonTabEndpoint.GENERIC) {
            dVar.l(serialDescriptor, 5, kSerializerArr[5], ribbonConfigDTO.endpoint);
        }
        if (!dVar.A(serialDescriptor, 6) && ribbonConfigDTO.url == null) {
            return;
        }
        dVar.l(serialDescriptor, 6, l48.a, ribbonConfigDTO.url);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.displayName;
    }

    public final int component3() {
        return this.position;
    }

    public final RibbonTabType component4() {
        return this.f58type;
    }

    public final boolean component5() {
        return this.enabled;
    }

    public final RibbonTabEndpoint component6() {
        return this.endpoint;
    }

    public final String component7() {
        return this.url;
    }

    public final RibbonConfigDTO copy(String str, String str2, int i, RibbonTabType ribbonTabType, boolean z, RibbonTabEndpoint ribbonTabEndpoint, String str3) {
        zq3.h(str, "id");
        zq3.h(ribbonTabType, TransferTable.COLUMN_TYPE);
        return new RibbonConfigDTO(str, str2, i, ribbonTabType, z, ribbonTabEndpoint, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RibbonConfigDTO)) {
            return false;
        }
        RibbonConfigDTO ribbonConfigDTO = (RibbonConfigDTO) obj;
        return zq3.c(this.id, ribbonConfigDTO.id) && zq3.c(this.displayName, ribbonConfigDTO.displayName) && this.position == ribbonConfigDTO.position && this.f58type == ribbonConfigDTO.f58type && this.enabled == ribbonConfigDTO.enabled && this.endpoint == ribbonConfigDTO.endpoint && zq3.c(this.url, ribbonConfigDTO.url);
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final RibbonTabEndpoint getEndpoint() {
        return this.endpoint;
    }

    public final String getId() {
        return this.id;
    }

    public final int getPosition() {
        return this.position;
    }

    public final RibbonTabType getType() {
        return this.f58type;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.displayName;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.position)) * 31) + this.f58type.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31;
        RibbonTabEndpoint ribbonTabEndpoint = this.endpoint;
        int hashCode3 = (hashCode2 + (ribbonTabEndpoint == null ? 0 : ribbonTabEndpoint.hashCode())) * 31;
        String str2 = this.url;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RibbonConfigDTO(id=" + this.id + ", displayName=" + this.displayName + ", position=" + this.position + ", type=" + this.f58type + ", enabled=" + this.enabled + ", endpoint=" + this.endpoint + ", url=" + this.url + ")";
    }

    public RibbonConfigDTO(String str, String str2, int i, RibbonTabType ribbonTabType, boolean z, RibbonTabEndpoint ribbonTabEndpoint, String str3) {
        zq3.h(str, "id");
        zq3.h(ribbonTabType, TransferTable.COLUMN_TYPE);
        this.id = str;
        this.displayName = str2;
        this.position = i;
        this.f58type = ribbonTabType;
        this.enabled = z;
        this.endpoint = ribbonTabEndpoint;
        this.url = str3;
    }

    public /* synthetic */ RibbonConfigDTO(String str, String str2, int i, RibbonTabType ribbonTabType, boolean z, RibbonTabEndpoint ribbonTabEndpoint, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, i, ribbonTabType, z, (i2 & 32) != 0 ? RibbonTabEndpoint.GENERIC : ribbonTabEndpoint, (i2 & 64) != 0 ? null : str3);
    }
}
