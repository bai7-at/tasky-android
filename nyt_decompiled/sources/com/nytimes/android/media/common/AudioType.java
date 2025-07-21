package com.nytimes.android.media.common;

import com.nytimes.android.api.cms.AssetConstants;
import defpackage.b22;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.DebugKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AudioType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ AudioType[] $VALUES;
    public static final a Companion;
    private final String title;
    public static final AudioType PODCAST = new AudioType("PODCAST", 0, "podcast");
    public static final AudioType AUDIO = new AudioType("AUDIO", 1, AssetConstants.AUDIO_TYPE);
    public static final AudioType AUTO = new AudioType("AUTO", 2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AudioType a(String str) {
            AudioType audioType = AudioType.PODCAST;
            if (zq3.c(str, audioType.getTitle())) {
                return audioType;
            }
            AudioType audioType2 = AudioType.AUDIO;
            if (zq3.c(str, audioType2.getTitle())) {
                return audioType2;
            }
            AudioType audioType3 = AudioType.AUTO;
            if (zq3.c(str, audioType3.getTitle())) {
                return audioType3;
            }
            return null;
        }

        private a() {
        }
    }

    private static final /* synthetic */ AudioType[] $values() {
        return new AudioType[]{PODCAST, AUDIO, AUTO};
    }

    static {
        AudioType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private AudioType(String str, int i, String str2) {
        this.title = str2;
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static AudioType valueOf(String str) {
        return (AudioType) Enum.valueOf(AudioType.class, str);
    }

    public static AudioType[] values() {
        return (AudioType[]) $VALUES.clone();
    }

    public String getTitle() {
        return this.title;
    }
}
