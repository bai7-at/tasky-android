package com.nytimes.android.resourcedownloader.model;

import defpackage.b22;
import defpackage.zq3;
import kotlin.enums.a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class MimeType {
    private static final /* synthetic */ b22 $ENTRIES;
    private static final /* synthetic */ MimeType[] $VALUES;
    public static final Companion Companion;
    private String contentType;
    public static final MimeType CSS = new MimeType("CSS", 0, "text/css");
    public static final MimeType JAVASCRIPT = new MimeType("JAVASCRIPT", 1, "application/javascript");
    public static final MimeType JPEG = new MimeType("JPEG", 2, "image/jpeg");
    public static final MimeType FONT = new MimeType("FONT", 3, "application/font-woff");
    public static final MimeType UNKNOWN = new MimeType("UNKNOWN", 4, "");

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
        
            return com.nytimes.android.resourcedownloader.model.MimeType.JPEG;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        
            if (r2.equals("wof") == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        
            if (r2.equals("jpg") == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
        
            if (r2.equals("woff") == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
        
            return com.nytimes.android.resourcedownloader.model.MimeType.FONT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        
            if (r2.equals("jpeg") == false) goto L25;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.nytimes.android.resourcedownloader.model.MimeType fromFilename(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r2 = "filename"
                defpackage.zq3.h(r3, r2)
                java.lang.String r2 = "."
                r0 = 0
                r1 = 2
                java.lang.String r2 = kotlin.text.h.U0(r3, r2, r0, r1, r0)
                java.lang.String r3 = "?"
                java.lang.String r2 = kotlin.text.h.Y0(r2, r3, r0, r1, r0)
                java.util.Locale r3 = java.util.Locale.ROOT
                java.lang.String r0 = "ROOT"
                defpackage.zq3.g(r3, r0)
                java.lang.String r2 = r2.toLowerCase(r3)
                java.lang.String r3 = "toLowerCase(...)"
                defpackage.zq3.g(r2, r3)
                int r3 = r2.hashCode()
                switch(r3) {
                    case 3401: goto L61;
                    case 98819: goto L55;
                    case 105441: goto L49;
                    case 117902: goto L3d;
                    case 3268712: goto L34;
                    case 3655064: goto L2b;
                    default: goto L2a;
                }
            L2a:
                goto L69
            L2b:
                java.lang.String r3 = "woff"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L46
                goto L69
            L34:
                java.lang.String r3 = "jpeg"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L52
                goto L69
            L3d:
                java.lang.String r3 = "wof"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L46
                goto L69
            L46:
                com.nytimes.android.resourcedownloader.model.MimeType r2 = com.nytimes.android.resourcedownloader.model.MimeType.FONT
                goto L6e
            L49:
                java.lang.String r3 = "jpg"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L52
                goto L69
            L52:
                com.nytimes.android.resourcedownloader.model.MimeType r2 = com.nytimes.android.resourcedownloader.model.MimeType.JPEG
                goto L6e
            L55:
                java.lang.String r3 = "css"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L5e
                goto L69
            L5e:
                com.nytimes.android.resourcedownloader.model.MimeType r2 = com.nytimes.android.resourcedownloader.model.MimeType.CSS
                goto L6e
            L61:
                java.lang.String r3 = "js"
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L6c
            L69:
                com.nytimes.android.resourcedownloader.model.MimeType r2 = com.nytimes.android.resourcedownloader.model.MimeType.UNKNOWN
                goto L6e
            L6c:
                com.nytimes.android.resourcedownloader.model.MimeType r2 = com.nytimes.android.resourcedownloader.model.MimeType.JAVASCRIPT
            L6e:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.resourcedownloader.model.MimeType.Companion.fromFilename(java.lang.String):com.nytimes.android.resourcedownloader.model.MimeType");
        }

        public final boolean isCssOrJs(String str) {
            zq3.h(str, "filename");
            return fromFilename(str) == MimeType.CSS || fromFilename(str) == MimeType.JAVASCRIPT;
        }

        public final boolean isFont(String str) {
            zq3.h(str, "filename");
            return fromFilename(str) == MimeType.FONT;
        }

        public final boolean isImage(String str) {
            zq3.h(str, "filename");
            return fromFilename(str) == MimeType.JPEG;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MimeType[] $values() {
        return new MimeType[]{CSS, JAVASCRIPT, JPEG, FONT, UNKNOWN};
    }

    static {
        MimeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new Companion(null);
    }

    private MimeType(String str, int i, String str2) {
        this.contentType = str2;
    }

    public static final MimeType fromFilename(String str) {
        return Companion.fromFilename(str);
    }

    public static b22 getEntries() {
        return $ENTRIES;
    }

    public static final boolean isCssOrJs(String str) {
        return Companion.isCssOrJs(str);
    }

    public static final boolean isFont(String str) {
        return Companion.isFont(str);
    }

    public static final boolean isImage(String str) {
        return Companion.isImage(str);
    }

    public static MimeType valueOf(String str) {
        return (MimeType) Enum.valueOf(MimeType.class, str);
    }

    public static MimeType[] values() {
        return (MimeType[]) $VALUES.clone();
    }

    public final String contentType() {
        return this.contentType;
    }
}
