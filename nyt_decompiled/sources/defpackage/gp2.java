package defpackage;

import android.content.Context;
import android.text.TextUtils;
import okhttp3.internal.http2.Http2;

/* loaded from: classes4.dex */
public abstract class gp2 {
    private static final hd4 a = new a(Http2.INITIAL_MAX_FRAME_SIZE);

    class a extends hd4 {
        a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // defpackage.hd4
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public int j(String str, String str2) {
            return str2.length();
        }
    }

    public static CharSequence a(Context context, int i, Object... objArr) {
        return String.format(context.getResources().getString(i), objArr);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        char[] charArray = str.toCharArray();
        boolean z = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i])) {
                z = true;
            } else if (z) {
                charArray[i] = Character.toTitleCase(charArray[i]);
                z = false;
            }
        }
        return new String(charArray);
    }
}
