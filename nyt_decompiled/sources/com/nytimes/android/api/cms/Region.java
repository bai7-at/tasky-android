package com.nytimes.android.api.cms;

import defpackage.b22;
import defpackage.et3;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.List;
import kotlin.enums.a;

@et3(generateAdapter = true)
/* loaded from: classes3.dex */
public final class Region {
    private int contextualMediaCount;
    private final ModuleType moduleType;
    private List<Asset> regionAssets;
    private int sprinkledMediaCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ModuleType {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ ModuleType[] $VALUES;
        private final String value;
        public static final ModuleType Top = new ModuleType("Top", 0, "Top");
        public static final ModuleType Embedded = new ModuleType("Embedded", 1, "Embedded");
        public static final ModuleType Related = new ModuleType("Related", 2, "Related");
        public static final ModuleType Header = new ModuleType("Header", 3, "Header");
        public static final ModuleType Vertical = new ModuleType("Vertical", 4, "Vertical");
        public static final ModuleType Stills = new ModuleType("Stills", 5, "Stills");
        public static final ModuleType SFImages = new ModuleType("SFImages", 6, "SFImages");
        public static final ModuleType sfImages = new ModuleType("sfImages", 7, "sfImages");
        public static final ModuleType slides = new ModuleType("slides", 8, "slides");
        public static final ModuleType related = new ModuleType("related", 9, "related");
        public static final ModuleType underHeadline = new ModuleType("underHeadline", 10, "underHeadline");
        public static final ModuleType intro = new ModuleType("intro", 11, "intro");
        public static final ModuleType bottomLeft = new ModuleType("bottomLeft", 12, "bottomLeft");
        public static final ModuleType bottomRight = new ModuleType("bottomRight", 13, "bottomRight");
        public static final ModuleType aboveHead = new ModuleType("aboveHead", 14, "aboveHead");
        public static final ModuleType blogImages = new ModuleType("blogImages", 15, "blogImages");
        public static final ModuleType relatedImage = new ModuleType("relatedImage", 16, "relatedImage");

        private static final /* synthetic */ ModuleType[] $values() {
            return new ModuleType[]{Top, Embedded, Related, Header, Vertical, Stills, SFImages, sfImages, slides, related, underHeadline, intro, bottomLeft, bottomRight, aboveHead, blogImages, relatedImage};
        }

        static {
            ModuleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private ModuleType(String str, int i, String str2) {
            this.value = str2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static ModuleType valueOf(String str) {
            return (ModuleType) Enum.valueOf(ModuleType.class, str);
        }

        public static ModuleType[] values() {
            return (ModuleType[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public Region(ModuleType moduleType) {
        zq3.h(moduleType, "moduleType");
        this.moduleType = moduleType;
        this.regionAssets = new ArrayList();
    }

    public final void addRegionAsset(Asset asset) {
        zq3.h(asset, "asset");
        this.regionAssets.add(asset);
    }

    public final int getContextualMediaCount() {
        return this.contextualMediaCount;
    }

    public final ModuleType getModuleType() {
        return this.moduleType;
    }

    public final List<Asset> getRegionAssets() {
        return this.regionAssets;
    }

    public final int getSprinkledMediaCount() {
        return this.sprinkledMediaCount;
    }

    public final void setContextualMediaCount(int i) {
        this.contextualMediaCount = i;
    }

    public final void setRegionAssets(List<Asset> list) {
        zq3.h(list, "<set-?>");
        this.regionAssets = list;
    }

    public final void setSprinkledMediaCount(int i) {
        this.sprinkledMediaCount = i;
    }
}
