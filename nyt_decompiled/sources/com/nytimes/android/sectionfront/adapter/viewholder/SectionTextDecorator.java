package com.nytimes.android.sectionfront.adapter.viewholder;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import defpackage.b22;
import defpackage.bd6;
import defpackage.mx0;
import defpackage.qd6;
import defpackage.um6;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SectionTextDecorator {
    public static final SectionTextDecorator a = new SectionTextDecorator();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Text {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ Text[] $VALUES;
        private final String text;
        public static final Text NONE = new Text("NONE", 0, "NONE");
        public static final Text HEADLINE = new Text("HEADLINE", 1, "HDL");
        public static final Text SUMMARY = new Text("SUMMARY", 2, "SMRY");
        public static final Text KICKER = new Text("KICKER", 3, "KCKR");

        private static final /* synthetic */ Text[] $values() {
            return new Text[]{NONE, HEADLINE, SUMMARY, KICKER};
        }

        static {
            Text[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Text(String str, int i, String str2) {
            this.text = str2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static Text valueOf(String str) {
            return (Text) Enum.valueOf(Text.class, str);
        }

        public static Text[] values() {
            return (Text[]) $VALUES.clone();
        }

        public final String getText$section_front_ui_release() {
            return this.text;
        }
    }

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Text.values().length];
            try {
                iArr[Text.HEADLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Text.SUMMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Text.KICKER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    private SectionTextDecorator() {
    }

    public static final void a(Context context, Text text, TextView textView, boolean z) {
        zq3.h(context, "context");
        zq3.h(text, "text");
        zq3.h(textView, "textView");
        ToneDecorator.b(context, um6.News_Standard_Standard_Headline, textView);
        textView.setTextColor(a.c(context, text, z));
    }

    private final int b(Context context, Text text) {
        if (context == null || text == null) {
            return Color.parseColor("#808080");
        }
        int i = a.a[text.ordinal()];
        if (i == 1) {
            return mx0.c(context, bd6.headline_text_read);
        }
        if (i == 2) {
            return mx0.c(context, bd6.summary_text_read);
        }
        if (i != 3) {
            return e(context.getResources().getConfiguration().uiMode) ? mx0.c(context, bd6.headline_text_read) : mx0.c(context, qd6.ds_gray88);
        }
        return mx0.c(context, bd6.kicker_text_read);
    }

    private final int c(Context context, Text text, boolean z) {
        return z ? b(context, text) : d(context, text);
    }

    private final int d(Context context, Text text) {
        if (context == null || text == null) {
            return -16777216;
        }
        if (text == Text.HEADLINE) {
            return mx0.c(context, bd6.headline_text);
        }
        if (text == Text.KICKER) {
            return mx0.c(context, bd6.kicker_text);
        }
        if (text == Text.SUMMARY) {
            return mx0.c(context, bd6.summary_text);
        }
        return e(context.getResources().getConfiguration().uiMode) ? mx0.c(context, bd6.headline_text) : mx0.c(context, qd6.ds_times_black);
    }

    private final boolean e(int i) {
        return (i & 48) == 32;
    }
}
