package com.nytimes.android.api.config.model;

import com.google.gson.annotations.SerializedName;
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
public final class Channel {
    public static final Companion Companion = new Companion(null);
    private final String iconImageNightURLString;
    private final String iconImageURLString;

    @SerializedName("default")
    private final boolean isDefault;

    @SerializedName("hidden")
    private final boolean isHidden;
    private final String tag;
    private final String tagDescription;
    private final String title;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer serializer() {
            return Channel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Channel(int i, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, mk7 mk7Var) {
        if (28 != (i & 28)) {
            wv5.a(i, 28, Channel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.isDefault = false;
        } else {
            this.isDefault = z;
        }
        if ((i & 2) == 0) {
            this.isHidden = false;
        } else {
            this.isHidden = z2;
        }
        this.tag = str;
        this.tagDescription = str2;
        this.title = str3;
        if ((i & 32) == 0) {
            this.iconImageURLString = null;
        } else {
            this.iconImageURLString = str4;
        }
        if ((i & 64) == 0) {
            this.iconImageNightURLString = null;
        } else {
            this.iconImageNightURLString = str5;
        }
    }

    public static /* synthetic */ Channel copy$default(Channel channel, boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = channel.isDefault;
        }
        if ((i & 2) != 0) {
            z2 = channel.isHidden;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            str = channel.tag;
        }
        String str6 = str;
        if ((i & 8) != 0) {
            str2 = channel.tagDescription;
        }
        String str7 = str2;
        if ((i & 16) != 0) {
            str3 = channel.title;
        }
        String str8 = str3;
        if ((i & 32) != 0) {
            str4 = channel.iconImageURLString;
        }
        String str9 = str4;
        if ((i & 64) != 0) {
            str5 = channel.iconImageNightURLString;
        }
        return channel.copy(z, z3, str6, str7, str8, str9, str5);
    }

    public static final /* synthetic */ void write$Self$api_lib_release(Channel channel, d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.A(serialDescriptor, 0) || channel.isDefault) {
            dVar.x(serialDescriptor, 0, channel.isDefault);
        }
        if (dVar.A(serialDescriptor, 1) || channel.isHidden) {
            dVar.x(serialDescriptor, 1, channel.isHidden);
        }
        dVar.y(serialDescriptor, 2, channel.tag);
        dVar.y(serialDescriptor, 3, channel.tagDescription);
        dVar.y(serialDescriptor, 4, channel.title);
        if (dVar.A(serialDescriptor, 5) || channel.iconImageURLString != null) {
            dVar.l(serialDescriptor, 5, l48.a, channel.iconImageURLString);
        }
        if (!dVar.A(serialDescriptor, 6) && channel.iconImageNightURLString == null) {
            return;
        }
        dVar.l(serialDescriptor, 6, l48.a, channel.iconImageNightURLString);
    }

    public final boolean component1() {
        return this.isDefault;
    }

    public final boolean component2() {
        return this.isHidden;
    }

    public final String component3() {
        return this.tag;
    }

    public final String component4() {
        return this.tagDescription;
    }

    public final String component5() {
        return this.title;
    }

    public final String component6() {
        return this.iconImageURLString;
    }

    public final String component7() {
        return this.iconImageNightURLString;
    }

    public final Channel copy(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5) {
        zq3.h(str, "tag");
        zq3.h(str2, "tagDescription");
        zq3.h(str3, "title");
        return new Channel(z, z2, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) obj;
        return this.isDefault == channel.isDefault && this.isHidden == channel.isHidden && zq3.c(this.tag, channel.tag) && zq3.c(this.tagDescription, channel.tagDescription) && zq3.c(this.title, channel.title) && zq3.c(this.iconImageURLString, channel.iconImageURLString) && zq3.c(this.iconImageNightURLString, channel.iconImageNightURLString);
    }

    public final String getIconImageNightURLString() {
        return this.iconImageNightURLString;
    }

    public final String getIconImageURLString() {
        return this.iconImageURLString;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTagDescription() {
        return this.tagDescription;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((((((Boolean.hashCode(this.isDefault) * 31) + Boolean.hashCode(this.isHidden)) * 31) + this.tag.hashCode()) * 31) + this.tagDescription.hashCode()) * 31) + this.title.hashCode()) * 31;
        String str = this.iconImageURLString;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconImageNightURLString;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final boolean isHidden() {
        return this.isHidden;
    }

    public String toString() {
        return "Channel(isDefault=" + this.isDefault + ", isHidden=" + this.isHidden + ", tag=" + this.tag + ", tagDescription=" + this.tagDescription + ", title=" + this.title + ", iconImageURLString=" + this.iconImageURLString + ", iconImageNightURLString=" + this.iconImageNightURLString + ")";
    }

    public Channel(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5) {
        zq3.h(str, "tag");
        zq3.h(str2, "tagDescription");
        zq3.h(str3, "title");
        this.isDefault = z;
        this.isHidden = z2;
        this.tag = str;
        this.tagDescription = str2;
        this.title = str3;
        this.iconImageURLString = str4;
        this.iconImageNightURLString = str5;
    }

    public /* synthetic */ Channel(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, str, str2, str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
