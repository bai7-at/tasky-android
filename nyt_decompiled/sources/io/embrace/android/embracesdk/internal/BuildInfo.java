package io.embrace.android.embracesdk.internal;

import android.content.res.Resources;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class BuildInfo {
    public static final String BUILD_INFO_BUILD_FLAVOR = "emb_build_flavor";
    public static final String BUILD_INFO_BUILD_ID = "emb_build_id";
    public static final String BUILD_INFO_BUILD_TYPE = "emb_build_type";
    public static final Companion Companion = new Companion(null);
    private static final String RES_TYPE_STRING = "string";
    private final String buildFlavor;
    private final String buildId;
    private final String buildType;

    public static final class Companion {
        private Companion() {
        }

        public final BuildInfo fromResources(AndroidResourcesService androidResourcesService, String str) {
            zq3.h(androidResourcesService, "resources");
            zq3.h(str, "packageName");
            return new BuildInfo(getBuildResource(androidResourcesService, str, BuildInfo.BUILD_INFO_BUILD_ID), getBuildResource(androidResourcesService, str, BuildInfo.BUILD_INFO_BUILD_TYPE), getBuildResource(androidResourcesService, str, BuildInfo.BUILD_INFO_BUILD_FLAVOR));
        }

        public final String getBuildResource(AndroidResourcesService androidResourcesService, String str, String str2) {
            zq3.h(androidResourcesService, "resources");
            zq3.h(str, "packageName");
            zq3.h(str2, "buildProperty");
            try {
                int identifier = androidResourcesService.getIdentifier(str2, BuildInfo.RES_TYPE_STRING, str);
                if (zq3.c(str2, BuildInfo.BUILD_INFO_BUILD_FLAVOR) && identifier == 0) {
                    return null;
                }
                return androidResourcesService.getString(identifier);
            } catch (Resources.NotFoundException e) {
                throw new IllegalArgumentException("No resource found for " + str2 + " property. Failed to create build info.", e);
            } catch (NullPointerException e2) {
                throw new IllegalArgumentException("No resource found for " + str2 + " property. Failed to create build info.", e2);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BuildInfo(String str, String str2, String str3) {
        this.buildId = str;
        this.buildType = str2;
        this.buildFlavor = str3;
    }

    public static final BuildInfo fromResources(AndroidResourcesService androidResourcesService, String str) {
        return Companion.fromResources(androidResourcesService, str);
    }

    public final String getBuildFlavor() {
        return this.buildFlavor;
    }

    public final String getBuildId() {
        return this.buildId;
    }

    public final String getBuildType() {
        return this.buildType;
    }
}
