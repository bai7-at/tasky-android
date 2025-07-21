package com.nytimes.android.image.loader.internals;

import defpackage.b22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ImageSource {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ ImageSource[] $VALUES;
    public static final ImageSource MEMORY = new ImageSource("MEMORY", 0);
    public static final ImageSource DISK = new ImageSource("DISK", 1);
    public static final ImageSource NETWORK = new ImageSource("NETWORK", 2);

    private static final /* synthetic */ ImageSource[] $values() {
        return new ImageSource[]{MEMORY, DISK, NETWORK};
    }

    static {
        ImageSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ImageSource(String str, int i) {
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static ImageSource valueOf(String str) {
        return (ImageSource) Enum.valueOf(ImageSource.class, str);
    }

    public static ImageSource[] values() {
        return (ImageSource[]) $VALUES.clone();
    }
}
